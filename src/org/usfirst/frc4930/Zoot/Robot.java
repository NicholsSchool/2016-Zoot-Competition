package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4930.Zoot.commands.autonomous.*;
import org.usfirst.frc4930.Zoot.subsystems.*;
import org.usfirst.frc4930.Zoot.subsystems.sensors.Cameras;
import org.usfirst.frc4930.Zoot.subsystems.sensors.LimitSwitch;

/**
 * RoboRIO automatically fires a method corresponding to the current game mode.
 * Init() fires only once. Periodic() fires approximately every 20ms.
 */
public class Robot extends IterativeRobot {

  public static OI oi;
  public static boolean orientation;

  // commands
  public static Command autoCommand;
  public static Command autonomous1A;
  public static Command autonomous1B;
  public static Command autonomous2;
  public static Command autonomous3;
  public static Command autonomous4;
  public static Command autonomous5;
  public static SendableChooser autoChooser;

  // subsystems
  public static ArmLifter armLifter;
  public static Cameras cameras;
  public static DriveTrain driveTrain;
  public static FlashLight flashLight;
  public static HookExtender hookExtender;
  public static IntakeMotors intakeMotors;
  public static LimitSwitch limitSwitch;
  public static Roller roller;

  public void robotInit() {
    RobotMap.init();

    orientation = true;

    // subsystems
    armLifter = new ArmLifter();
    driveTrain = new DriveTrain();
    flashLight = new FlashLight();
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
    autonomous1A = new DriveOverDefenseWithArmUp();
    autonomous1B = new Autonomous1B();
    autonomous2 = new Autonomous2();
    autonomous3 = new Autonomous3();
    autonomous4 = new Autonomous4();
    autonomous5 = new Autonomous5();
    autoChooser = new SendableChooser();

    autoChooser.addDefault("Drive over A Defense (Not Ramparts)", autonomous1A);
    autoChooser.addDefault("Drive over Ramparts", autonomous1B);
    autoChooser.addObject("Low Bar And No Shot", autonomous2);
    autoChooser.addObject("spyAuto", autonomous3);
    autoChooser.addObject("Low Bar And Low Shot", autonomous4);
    autoChooser.addObject("Driving over The Cheval-De_Frise", autonomous5);
    SmartDashboard.putData("Auto Chooser", autoChooser);

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
    SmartDashboard.putNumber("Arm Pot", Math.round(RobotMap.armPot.get()));
    SmartDashboard.putBoolean("boulderInPosition", Robot.limitSwitch.boulderInPosition());
    SmartDashboard.putBoolean("hookRetracted", Robot.limitSwitch.hookRetracted());
    SmartDashboard.putBoolean("hookExtended", Robot.limitSwitch.hookExtended());
    SmartDashboard.putBoolean("armDown", Robot.limitSwitch.armDown());
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
