package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.MoveArm;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * ArmLifter
 */
public class ArmLifter extends Subsystem {
	
	private final double HIGH_POT_EXTREME = 1.0;
	private final double LOW_POT_EXTREME = 0.0;
	
	public void initDefaultCommand() {
		setDefaultCommand(new MoveArm());
	}

	public void move(double yAxis) {
		double armPotVal = RobotMap.armPot.get();
		if ((armPotVal >= LOW_POT_EXTREME) && (armPotVal <= HIGH_POT_EXTREME)) {
			RobotMap.armDart.set(yAxis);
		}		
	}

	public void stop() {
		RobotMap.armDart.set(0.0);
	}
}