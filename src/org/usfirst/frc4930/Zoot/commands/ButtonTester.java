package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ButtonTester extends Command {

	protected void initialize() {

	}

	protected void execute() {
		System.out.println("executed");
	}

	protected boolean isFinished() {
		System.out.println("isFinished");
		return true;
	}

	protected void end() {
		System.out.println("end");
	}

	protected void interrupted() {
		System.out.println("interrupted");
	}

}
