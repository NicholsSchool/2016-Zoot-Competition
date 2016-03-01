package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.GoToShotAngle;

import edu.wpi.first.wpilibj.command.Subsystem;

public class MoveArmToShotAngle extends Subsystem{
	
	protected void initDefaultCommand() {
		setDefaultCommand(new GoToShotAngle());
	}
	
	public void execute(){
		while(RobotMap.armPot.get() < 0.75){
			RobotMap.armDart.set(0.5);
		}
	}

}
