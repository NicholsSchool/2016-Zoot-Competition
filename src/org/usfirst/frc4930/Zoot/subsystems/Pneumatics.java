package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Pneumatics
 */
public class Pneumatics extends Subsystem {

	public void initDefaultCommand() {
	}

	public void enableHighGear() {
		RobotMap.doubleSolenoid.set(DoubleSolenoid.Value.kForward);
		Timer.delay(2.0);
		RobotMap.doubleSolenoid.set(DoubleSolenoid.Value.kOff);
	}

	public void enableLowGear() {
		RobotMap.doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
		Timer.delay(2.0);
		RobotMap.doubleSolenoid.set(DoubleSolenoid.Value.kOff);
	}

	public void startCompressing() {
		RobotMap.compressor.setClosedLoopControl(true);
	}

	public void endCompressing() {
		RobotMap.compressor.setClosedLoopControl(false);
	}
}
