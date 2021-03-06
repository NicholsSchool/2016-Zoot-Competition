package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.MoveArm;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * ArmLifter
 */
public class ArmLifter extends Subsystem {

  public void initDefaultCommand() {
    // @todo test if this is necessary
    setDefaultCommand(new MoveArm());
  }

  public void move(double yAxis) {
    RobotMap.armDart.set(yAxis);
  }

  public void stop() {
    RobotMap.armDart.set(0.0);
  }
}
