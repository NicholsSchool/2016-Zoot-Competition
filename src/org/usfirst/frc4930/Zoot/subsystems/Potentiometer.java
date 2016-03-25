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
    double angleDiff = angle - this.getValue();
    // check if limit switch reset pot zero
    if (RobotMap.armPot.isReset()) {
      // check direction needed to go, up
      if (this.getValue() < angle) {
        // need to move motor up until close enough
        while (this.getValue() < angle) {
          // go fast
          if (angleDiff > 5) {
            Robot.armLifter.move(1.0);
            // go slower
          } else {
            Robot.armLifter.move(0.2);
          }
        }
        // check direction needed to go, down
      } else {
        // need to move motor down until close enough
        while (this.getValue() > angle) {
          // go fast
          if (angleDiff < -5) {
            Robot.armLifter.move(-1.0);
            // go slow
          } else {
            Robot.armLifter.move(-0.2);
          }
        }
      }
      Robot.armLifter.stop();
    } else {
      while (RobotMap.armLowExtremeSwitch.get()) {
        Robot.armLifter.move(-0.8);
      }
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
