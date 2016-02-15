package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4930.Zoot.commands.*;
import org.usfirst.frc4930.Zoot.subsystems.*;

/**
 * RoboRIO automatically fires a method corresponding to the current game mode.
 * Init() fires only once. Then periodic() fires in succession.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	
	//commands
    public static Command autonomous;
    
    //subsystems
    public static ArmLifter armLifter;
    public static Cameras cameras;
    public static DriveTrain driveTrain;
    public static HookExtender hookExtender;
    public static IntakeMotors intakeMotors;
    public static Pneumatics pneumatics;
    
    public void robotInit() {
   
    	RobotMap.init();
 
    	// subsystems
        armLifter = new ArmLifter();
        cameras = new Cameras();
        driveTrain = new DriveTrain();
        hookExtender = new HookExtender();
        intakeMotors = new IntakeMotors();
        pneumatics = new Pneumatics();
        
        // OI must be instantiated after subsystems
        oi = new OI();
        
        // autonomous must be instantiated after OI
        autonomous = new Autonomous();

    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {

        if (autonomous != null) autonomous.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
    }

    public void teleopInit() {
    	// forces autonomous command to cancel when teleop begins
        if (autonomous != null) {
        	autonomous.cancel();
        }
        cameras.initialize();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        cameras.execute();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
