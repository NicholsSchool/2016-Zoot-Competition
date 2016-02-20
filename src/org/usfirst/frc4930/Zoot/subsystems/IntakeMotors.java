package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * IntakeMotors
 */
public class IntakeMotors extends Subsystem {

	public void initDefaultCommand() {
		setDefaultCommand(new Intake());
	}

	public void intake() {
		RobotMap.intakeMotorsMaster.set(.9);
		RobotMap.roller.set(.9);
	}

	public void shoot() {
		RobotMap.intakeMotorsMaster.set(-.9);
		Timer.delay(2.0);
		RobotMap.roller.set(.8);
		// @todo do the motors stop afterwards?
	}

	public void drop() {
		RobotMap.intakeMotorsMaster.set(-.5);
		RobotMap.roller.set(-.5);
	}

	public void stop() {
		RobotMap.intakeMotorsMaster.set(0.0);
	}
}
