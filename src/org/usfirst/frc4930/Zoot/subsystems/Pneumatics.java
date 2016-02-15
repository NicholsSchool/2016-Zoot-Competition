package org.usfirst.frc4930.Zoot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * Pneumatics
 */
public class Pneumatics extends Subsystem {
     
	public static DoubleSolenoid doubleSolenoid = new DoubleSolenoid(0, 1);
	
    public void initDefaultCommand() {

    }
}

