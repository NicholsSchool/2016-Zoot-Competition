package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Pneumatics
 */
public class Pneumatics extends Subsystem {

	public DoubleSolenoid doubleSolenoid = new DoubleSolenoid(50, 0, 1);
	public Compressor c = new Compressor(50);

	public void initDefaultCommand() {
	}
	
//	public void enableHighGear() {
//		doubleSolenoid.set(DoubleSolenoid.Value.kForward);
//		
//	}
//	
//	public void enableLowGear() {
//		doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
//	}
	
	public void changeGear() {
		if (Robot.gearShift) {
			doubleSolenoid.set(DoubleSolenoid.Value.kForward);
			Robot.gearShift=false;	
		}
		else {
			doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
			Robot.gearShift=true;
		}
	}

	public void startCompressing() {
		c.setClosedLoopControl(true);
	}
	
	public void endCompressing() {
		c.setClosedLoopControl(false);
	}
	
	public void stop() {
		
	}
}
