package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4930.Zoot.commands.Autonomous1;
import org.usfirst.frc4930.Zoot.commands.Autonomous2;
import org.usfirst.frc4930.Zoot.commands.Autonomous3;
import org.usfirst.frc4930.Zoot.commands.Autonomous4;
import org.usfirst.frc4930.Zoot.subsystems.*;

/**
 * RoboRIO automatically fires a method corresponding to the current game mode. Init() fires only
 * once. Then periodic() fires in succession.
 */
public class Robot extends IterativeRobot {

  public static OI oi;
  public static boolean orientation;

  // commands
  public static Command autoCommand;
  public static Command autonomous1;
  public static Command autonomous2;
  public static Command autonomous3;
  public static Command autonomous4;
  public static SendableChooser autoChooser;

  // subsystems
  public static ArmLifter armLifter;
  public static Cameras cameras;
  public static DriveTrain driveTrain;
  public static HookExtender hookExtender;
  public static IntakeMotors intakeMotors;
  public static LimitSwitch limitSwitch;
  public static Potentiometer Potentiometer;
  public static Roller roller;

  public void robotInit() {
    RobotMap.init();

    orientation = true;

    // subsystems
    armLifter = new ArmLifter();
    driveTrain = new DriveTrain();
    hookExtender = new HookExtender();
    intakeMotors = new IntakeMotors();
    limitSwitch = new LimitSwitch();
    roller = new Roller();

    try {
      cameras = new Cameras();
    } catch (Exception e) {
      System.out.println(e.toString());
    }

    // OI must be instantiated after subsystems
    oi = new OI();

    // autonomous must be instantiated after OI
    autonomous1 = new Autonomous1();
    autonomous2 = new Autonomous2();
    autonomous3 = new Autonomous3();
    autoChooser = new SendableChooser();
    
    autoChooser.addDefault("driveOverDefenseWithArmUp", autonomous1);
    autoChooser.addObject("lowBarAutoNoShot", autonomous2);
    autoChooser.addObject("spyAuto", autonomous3);
    autoChooser.addObject("lowBarWithoutPotWithLowShot", autonomous4);
    SmartDashboard.putData("Auto Chooser", autoChooser);

    SmartDashboard.putBoolean("boulderInPosition", Robot.limitSwitch.boulderInPosition());
    SmartDashboard.putBoolean("armDown", Robot.limitSwitch.armDown());
    SmartDashboard.putBoolean("armUp", Robot.limitSwitch.armUp());
    SmartDashboard.putBoolean("hookRetracted", Robot.limitSwitch.hookRetracted());
    SmartDashboard.putBoolean("hookExtended", Robot.limitSwitch.hookExtended());
    
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
    SmartDashboard.putNumber("Arm Pot", Math.round(RobotMap.armPot.get()));
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
