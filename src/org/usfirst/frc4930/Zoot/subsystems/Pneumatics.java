package org.usfirst.frc4930.Zoot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Pneumatics
 */
public class Pneumatics extends Subsystem {

	public DoubleSolenoid doubleSolenoid = new DoubleSolenoid(0, 1);
	public Compressor c = new Compressor(0);

	public void initDefaultCommand() {
	}

	public void stop() {
	}
}
