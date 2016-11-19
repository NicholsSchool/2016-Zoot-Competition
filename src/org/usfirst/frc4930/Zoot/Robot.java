package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4930.Zoot.commands.autonomous.*;
import org.usfirst.frc4930.Zoot.subsystems.*;
import org.usfirst.frc4930.Zoot.subsystems.sensors.*;

/**
 * RoboRIO automatically fires the method corresponding to the current game mode.
 * Init() fires only once. Periodic() fires approximately every 20ms.
 */

public class Robot extends IterativeRobot {

  public static OI oi;
  public static boolean orientation = true;

  // commands
  public static Command autoCommand;
  public static Command autoDoNothing;
  public static Command autoDriveShortWithArmUp;
  public static Command autoDriveLongWithArmUp;
  public static Command autoLowBarNoShot;
  public static Command autoLowBarWithLowShot;
  public static Command autoRockwallWithHighShot;
  public static Command autoSpyBotWithHighShotAndMoveTowardsDefense;
  public static Command autoFrenchCroissant;
  public static Command autoSlowFrenchCroissant;
  public static Command autoSpyBotWithOnlyHighShot;
  public static Command autoSystemsCheck;
  public static SendableChooser autoChooser;

  // subsystems
  public static ArmLifter armLifter;
  public static DriveTrain driveTrain;
  public static FlashLight flashLight;
  public static HookExtender hookExtender;
  public static IntakeMotors intakeMotors;
  public static Roller roller;

  // sensors
  public static Cameras cameras;
  public static LimitSwitch limitSwitch;
  
  // encoders
  public static Encoder DrivebaseRight;
  public static Encoder DrivebaseLeft;

  public void robotInit() {

    RobotMap.init();
    oi = new OI();

    // instantiate subsystems
    armLifter = new ArmLifter();
    driveTrain = new DriveTrain();
    flashLight = new FlashLight();
    hookExtender = new HookExtender();
    intakeMotors = new IntakeMotors();
    roller = new Roller();
    
    Robot.driveTrain.brakeMode(false);

    // instantiate sensors
    limitSwitch = new LimitSwitch();
    try {
      cameras = new Cameras();
    } catch (Exception e) {
      System.out.println(e.toString());
    }

    // instantiate autonomous modes
    autoDoNothing = new DoNothing();
    autoDriveShortWithArmUp = new DriveShortWithArmUp();
    autoDriveLongWithArmUp = new DriveLongWithArmUp();
    autoLowBarNoShot = new LowBarNoShot();
    autoLowBarWithLowShot = new LowBarWithLowShot();
    autoRockwallWithHighShot = new RockwallWithHighShot();
    autoFrenchCroissant = new FrenchCroissant();
    autoSlowFrenchCroissant = new SlowFrenchCroissant();
    autoSpyBotWithHighShotAndMoveTowardsDefense = new SpyBotWithHighShotAndMoveTowardsDefense();
    autoSpyBotWithOnlyHighShot = new SpyBotWithOnlyHighShot();
    autoSystemsCheck = new SystemsCheck();
    autoChooser = new SendableChooser();

    // setup autoChooser options
    autoChooser.addDefault("Do Nothing (literally)", autoDoNothing);
    autoChooser.addObject("Drive Short With Arm Up (Not Ramparts)", autoDriveShortWithArmUp);
    autoChooser.addObject("Drive Long With Arm Up (Ramparts)", autoDriveLongWithArmUp);
    autoChooser.addObject("Rockwall With High Shot", autoRockwallWithHighShot);
    autoChooser.addObject("Low Bar No Shot", autoLowBarNoShot);
    autoChooser.addObject("Low Bar With Low Shot", autoLowBarWithLowShot);
    autoChooser.addObject("French Croissant", autoFrenchCroissant);
    autoChooser.addObject("Slower French Croissant", autoSlowFrenchCroissant);
    autoChooser.addObject("Spy Bot With High Shot", autoSpyBotWithHighShotAndMoveTowardsDefense);
    autoChooser.addObject("Spy Bot Auto With Only High Shot", autoSpyBotWithOnlyHighShot);
    autoChooser.addObject("Systems Check (diagnostic)", autoSystemsCheck);
    SmartDashboard.putData("Auto Chooser", autoChooser);
    
    // instantiate encoders, not sure about the ports
	DrivebaseRight = new Encoder(6,7, false, Encoder.EncodingType.k4X);
	DrivebaseLeft = new Encoder(8,9, false, Encoder.EncodingType.k4X);
  }

  public void disabledInit() {}

  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  public void autonomousInit() {
    autoCommand = (Command) autoChooser.getSelected();
    autoCommand.start();
  }

  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  public void teleopInit() {
    if (autoCommand != null) {
      autoCommand.cancel();
    }
    try {
      cameras.initialize();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    LimitSwitch.zeroPotentiometer();
    SmartDashboard.putNumber("armPot", Math.round(RobotMap.armPot.get()));
    SmartDashboard.putBoolean("armDown", Robot.limitSwitch.armDown());
    SmartDashboard.putBoolean("boulderInPosition", Robot.limitSwitch.boulderInPosition());
    SmartDashboard.putBoolean("hookRetracted", Robot.limitSwitch.hookRetracted());
    SmartDashboard.putBoolean("hookExtended", Robot.limitSwitch.hookExtended());
    
    // output data for Encoder DrivebaseRight
    SmartDashboard.putNumber("Encoder DrivebaseRight: count", DrivebaseRight.get());
    SmartDashboard.putNumber("Encoder DrivebaseRight: rawDistance", DrivebaseRight.getRaw());
    SmartDashboard.putNumber("Encoder DrivebaseRight: distance", DrivebaseRight.getDistance());
    SmartDashboard.putNumber("Encoder DrivebaseRight: period", DrivebaseRight.getPeriod());
    SmartDashboard.putNumber("Encoder DrivebaseRight: rate", DrivebaseRight.getRate());
    SmartDashboard.putBoolean("Encoder DrivebaseRight: direction", DrivebaseRight.getDirection());
    SmartDashboard.putBoolean("Encoder DrivebaseRight: stopped", DrivebaseRight.getStopped());
    
    // output data for Encoder DrivebaseLeft
    SmartDashboard.putNumber("Encoder DrivebaseLeft: count", DrivebaseLeft.get());
    SmartDashboard.putNumber("Encoder DrivebaseLeft: rawDistance", DrivebaseLeft.getRaw());
    SmartDashboard.putNumber("Encoder DrivebaseLeft: distance", DrivebaseLeft.getDistance());
    SmartDashboard.putNumber("Encoder DrivebaseLeft: period", DrivebaseLeft.getPeriod());
    SmartDashboard.putNumber("Encoder DrivebaseLeft: rate", DrivebaseLeft.getRate());
    SmartDashboard.putBoolean("Encoder DrivebaseLeft: direction", DrivebaseLeft.getDirection());
    SmartDashboard.putBoolean("Encoder DrivebaseLeft: stopped", DrivebaseLeft.getStopped());
    
    try {
      cameras.execute();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public void testPeriodic() {
    LiveWindow.run();
  }
}
