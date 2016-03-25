package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Potentiometer
 */
public class Potentiometer {

  private final double SHOT_ANGLE = 48.000;

  public void goToAngle(double angle) {
     while(!Robot.limitSwitch.armDown()){
   	  Robot.armLifter.move(-0.8);
     }
     while(angle > RobotMap.armPot.get()){
    	 Robot.armLifter.move(0.8);
     }
  }

  public double getValue() {
    return RobotMap.armPot.get();
  }

  public double getShotAngle() {
    return SHOT_ANGLE;
  }
}
