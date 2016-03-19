package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;
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
    if (RobotMap.armLowExtremeSwitch.get()) {
      RobotMap.armDart.set(yAxis);
    } else {
      Robot.armLifter.stop();
    }
  }

  public void stop() {
    RobotMap.armDart.set(0.0);
  }
}
