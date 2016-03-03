package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.MoveArm;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * ArmLifter
 */
public class ArmLifter extends Subsystem {
	
	public void initDefaultCommand() {
		setDefaultCommand(new MoveArm());
	}

	public void move(double yAxis) {
		RobotMap.armDart.set(yAxis);
	}
	
	public void moveToShotAngle(){
		while(RobotMap.armPot.get() < 0.75){  
			RobotMap.armDart.set(0.5);
		}
	}

	public void stop() {
		RobotMap.armDart.set(0.0);
	}

}


