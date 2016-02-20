package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

// @todo we need to figure this out better

/**
 * Pneumatics
 */
public class Pneumatics extends Subsystem {

	public static DoubleSolenoid doubleSolenoid = new DoubleSolenoid(0, 1);
	public static Compressor c = new Compressor(0);

	public void initDefaultCommand() {

	}

	public void stop() {
		Robot.gearShift = false;
	}
}
