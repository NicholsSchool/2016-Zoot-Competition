package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class GoToShotAngle extends Command{

	public GoToShotAngle(){
		requires(Robot.armLifter);
	}

	protected void initialize() {	
	}

	protected void execute() {
		Robot.armLifter.moveToShotAngle();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		Robot.armLifter.stop();
	}

	protected void interrupted() {
		Robot.armLifter.stop();
	}

}
