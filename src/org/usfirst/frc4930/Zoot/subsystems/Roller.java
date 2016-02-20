package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Roller - Subsystem that controls the Roller Motor
 */


public class Roller extends Subsystem{

	protected void initDefaultCommand() {
	}

	public void intake() {
		RobotMap.roller.set(0.9);
	}
	
	public void shoot() {
		Timer.delay(2.0);
		RobotMap.roller.set(0.8);
	}
	
	public void drop() {
		RobotMap.roller.set(-0.5);
	}
	
	public void stop() {
		RobotMap.roller.set(0.0);
	}
}
