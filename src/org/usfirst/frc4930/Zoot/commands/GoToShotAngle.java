package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class GoToShotAngle extends Command{

	public GoToShotAngle(){
		requires(Robot.moveArmToShotAngle);
		requires(Robot.armLifter);
	}
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		while(RobotMap.armPot.get() < 0.75){
			Robot.armLifter.move(0.5);
		}
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		
	}

}
