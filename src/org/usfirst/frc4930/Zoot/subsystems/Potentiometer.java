package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Potentiometer
 */
public class Potentiometer {

  private final double SHOT_ANGLE = 60.0;
  private final double HIGH_EXTREME = 100;

  public void goToAngle(double angle) {
    if (RobotMap.armPot.isReset()) {
      if (RobotMap.armPot.get() < angle) {
        while (RobotMap.armPot.get() < angle) {
          Robot.armLifter.move(1.0);
        }
      } else {
        while (RobotMap.armPot.get() > angle) {
          Robot.armLifter.move(-1.0);
        }
      }
    } else {
      Robot.armLifter.move(-0.8);
    }
  }

  public double getValue() {
    return RobotMap.armPot.get();
  }

  public double getShotAngle() {
    return SHOT_ANGLE;
  }

  public double getHighExtreme() {
    return HIGH_EXTREME;
  }
}
