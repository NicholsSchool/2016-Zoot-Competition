package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.commands.GoToShotAngle;

import edu.wpi.first.wpilibj.command.Subsystem;

public class MoveArmToShotAngle extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new GoToShotAngle());
	}

}
