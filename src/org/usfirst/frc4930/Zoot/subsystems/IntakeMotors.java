package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * IntakeMotors
 */
public class IntakeMotors extends Subsystem {

    public void initDefaultCommand() {
 
    }
    public void intake(){
    	RobotMap.intakeMotorsMaster.set(.9);
    }
    public void shoot(){
    	RobotMap.intakeMotorsMaster.set(1.0);
    }
    public void drop(){
    	RobotMap.intakeMotorsMaster.set(.5);
    }
}

