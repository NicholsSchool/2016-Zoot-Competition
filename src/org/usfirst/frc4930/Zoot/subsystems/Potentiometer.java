package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Potentiometer
 */
public class Potentiometer extends Subsystem{

  private final static double OUTERWORKS_SHOT_ANGLE = 48.000;


  public double getValue() {
    return RobotMap.armPot.get();
  }

  public static double getShotAngle() {
    return OUTERWORKS_SHOT_ANGLE;
  }


  protected void initDefaultCommand() {
	
  }

}
