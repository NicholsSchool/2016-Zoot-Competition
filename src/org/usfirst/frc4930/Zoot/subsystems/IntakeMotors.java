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
		RobotMap.intakeMotorsMaster.set(0.9);
		RobotMap.roller.set(0.9);
	}

	public void shoot() {
		RobotMap.intakeMotorsMaster.set(-0.9);
		Timer.delay(2.0);
		RobotMap.roller.set(0.8);
	}

	public void drop() {
		RobotMap.intakeMotorsMaster.set(-0.5);
		RobotMap.roller.set(-0.5);
	}

	public void stop() {
		RobotMap.intakeMotorsMaster.set(0.0);
		RobotMap.roller.set(0.0);
	}
}
