package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.subsystems.Cameras;

import edu.wpi.first.wpilibj.command.Command;

public class ChangeToShotCam extends Command {

	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Cameras.changeToShotCam();
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
