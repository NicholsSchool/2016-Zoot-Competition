package org.usfirst.frc4930.Zoot.subsystems.sensors;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * LimitSwitch
 */
public class LimitSwitch extends Subsystem {

  public void initDefaultCommand() {}

  public boolean boulderInPosition() {
    return RobotMap.boulderIntakeSwitch.get();
  }
  
  public boolean armDown() {
    return RobotMap.armLowExtremeSwitch.get();
  }

  public boolean hookExtended() {
    return RobotMap.hookHighExtremeSwitch.get();
  }

  public boolean hookRetracted() {
    return RobotMap.hookLowExtremeSwitch.get();
  }
  
  public static void zeroPotentiometer(){
	  if(!RobotMap.armLowExtremeSwitch.get()){
		  RobotMap.armPot.reset();
	  }
  }
}
