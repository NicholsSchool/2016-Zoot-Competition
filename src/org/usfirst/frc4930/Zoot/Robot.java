package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4930.Zoot.commands.Autonomous;
import org.usfirst.frc4930.Zoot.subsystems.*;

/**
 * RoboRIO automatically fires a method corresponding to the current game mode.
 * Init() fires only once. Then periodic() fires in succession.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static boolean zoot;
	public static boolean orientation;

	// commands
	public static Command autonomous;

	// subsystems
	public static ArmLifter armLifter;
	public static Cameras cameras;
	public static DriveTrain driveTrain;
	public static HookExtender hookExtender;
	public static IntakeMotors intakeMotors;
	public static LimitSwitch limitSwitch;
	public static MoveArmToShotAngle moveArmToShotAngle;
	public static Roller roller;

	public void robotInit() {
		RobotMap.init();

		// true = Zoo && false = Tooz
		zoot = false;
		orientation = true;

		// subsystems
		armLifter = new ArmLifter();
		cameras = new Cameras();
		driveTrain = new DriveTrain();
		hookExtender = new HookExtender();
		intakeMotors = new IntakeMotors();
		limitSwitch = new LimitSwitch();
		moveArmToShotAngle = new MoveArmToShotAngle();
		roller = new Roller();

		// OI must be instantiated after subsystems
		oi = new OI();

		// autonomous must be instantiated after OI
		autonomous = new Autonomous();
	}

	public void disabledInit() {
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		if (autonomous != null) {
			autonomous.start();
		}
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		if (autonomous != null) {
			autonomous.cancel();
		}
		try {
			cameras.initialize();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		try {
			cameras.execute();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		SmartDashboard.putData("Arm Pot", RobotMap.armPot);
	}

	public void testPeriodic() {
		LiveWindow.run();
	}
}
