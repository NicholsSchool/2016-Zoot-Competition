package org.usfirst.frc4930.Zoot.commands.autonomous;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class RockwallWithHighShot extends Command{

	public RockwallWithHighShot(){
	    requires(Robot.driveTrain);
	    requires(Robot.armLifter);
	    requires(Robot.intakeMotors);
	    requires(Robot.roller);	
	}
	
	protected void initialize() {
	 RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);	
	}
	
	protected void execute() {
	    Robot.driveTrain.move(-0.8, -0.8);
	    Timer.delay(1.8);
	    Robot.driveTrain.stop();
	    // START Inserted from Shoot Command
	    Robot.armLifter.move(0.0);
	    Timer.delay(0.0);
	    Robot.armLifter.stop();
	    Robot.intakeMotors.move(-1.0);
	    Timer.delay(0.75);
	    Robot.roller.move(1.0);
	    Timer.delay(0.1);
	    Robot.roller.stop();
	    Robot.intakeMotors.stop();
	    // END Inserted from Shoot Command
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
	    Robot.driveTrain.stop();
	    Robot.armLifter.stop();
	    Robot.roller.stop();
	    Robot.intakeMotors.stop();
	}

	protected void interrupted() {
		end();
	}

}
