package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.MoveArm;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * ArmLifter
 */
public class ArmLifter extends Subsystem {
//	
//	private static double highPotVal = 0.75;
//	private static double lowPotVal = 0.25;
//	private static double armPotVal;
//	
    public void initDefaultCommand() {
    	setDefaultCommand(new MoveArm());
    }
    
//    public void up( double yAxis ) {
//    	RobotMap.armDart.set( yAxis );
//    	
//    	armPotVal = this.getPotVal();    	
//    }
//    
//    public void down( double yAxis ) {
//    	RobotMap.armDart.set( yAxis );
//    }
    
    public static void move(double yAxis ) {
    	RobotMap.armDart.set( yAxis );
    }
    
    public void stop() {
    	RobotMap.armDart.set(0.0);
    }
    
//    public double getPotVal() {
//    	return RobotMap.armPot.get();
//    }
//       
}