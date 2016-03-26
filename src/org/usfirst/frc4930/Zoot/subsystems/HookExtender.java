package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * HookExtender
 */
public class HookExtender extends Subsystem {

  public void initDefaultCommand() {}

  public void moveUp(double x) {
    RobotMap.hookDartScrew.set(x);
  }
  
  public void moveDown(double x) {
	  RobotMap.hookDartWinch.set(x);
	  RobotMap.hookDartScrew.set(x);
  }

  public void stop() {
    RobotMap.hookDartWinch.set(0.0);
	RobotMap.hookDartScrew.set(0.0);
  }
}
