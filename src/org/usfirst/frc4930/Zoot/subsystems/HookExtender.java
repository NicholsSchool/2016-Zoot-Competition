package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

// @todo add comments generally

/**
 * HookExtender
 */
public class HookExtender extends Subsystem {

	public void initDefaultCommand() {
	}

	// @todo remove params, use limit switch to detect end
	public void extend(double extendVoltage) {
		RobotMap.hookDart.set(extendVoltage);

	}

	// @todo remove param, use limit switch to detect end
	public void retract(double retractVoltage) {
		RobotMap.hookDart.set(retractVoltage);

	}

	public void move(double extenderVoltage) {
		RobotMap.hookDart.set(extenderVoltage);
	}
}
