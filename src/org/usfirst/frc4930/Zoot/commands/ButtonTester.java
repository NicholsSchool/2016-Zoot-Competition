package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ButtonTester extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		System.out.println("executed");
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		System.out.println("isFinished");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		System.out.println("end");
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		System.out.println("interrupted");
		// TODO Auto-generated method stub

	}

}
