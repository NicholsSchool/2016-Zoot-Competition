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
  public static SendableChooser autoChooser;

  // subsystems
  public static ArmLifter armLifter;
  public static Cameras cameras;
  public static DriveTrain driveTrain;
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
    hookExtender = new HookExtender();
    intakeMotors = new IntakeMotors();
    limitSwitch = new LimitSwitch();
    roller = new Roller();
    autonomous1 = new Autonomous1();
    try {
      cameras = new Cameras();
    } catch (Exception e) {
      System.out.println(e.toString());
    }

    // OI must be instantiated after subsystems
    oi = new OI();

    // autonomous must be instantiated after OI

//    autonomous2 = new Autonomous2();
//    autonomous3 = new Autonomous3();
//    autoChooser = new SendableChooser();

//    autoChooser.addDefault("Autonomous 1", autonomous1);
//    autoChooser.addObject("Autonomous 2", autonomous2);
//    autoChooser.addObject("Autonomous 3", autonomous3);
//    SmartDashboard.putData("Auto Chooser", autoChooser);
  }

  public void disabledInit() {}

  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  public void autonomousInit() {
//    autoCommand = (Command) autoChooser.getSelected();
//    autoCommand.start();
	    
	    autonomous1.start();
  }

  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  public void teleopInit() {
	  if( autonomous1 != null){
		  autonomous1.cancel();
	  }
	  
	  try {
      cameras.initialize();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putNumber("Arm Pot", RobotMap.armPot.get());
    SmartDashboard.putBoolean("Limit Switch Value", RobotMap.hookHighExtremeSwitch.get());
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
