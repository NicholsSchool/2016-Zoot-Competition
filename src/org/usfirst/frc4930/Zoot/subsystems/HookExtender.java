package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * HookExtender
 */
public class HookExtender extends Subsystem {

  public void initDefaultCommand() {}

  public void move(double x) {
    RobotMap.hookDart.set(x);
  }

  public void stop() {
    RobotMap.hookDart.set(0.0);
  }
}
