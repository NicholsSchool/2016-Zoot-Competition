package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * ToggleFlashlight - turns flashlight on/off
 */
public class ToggleFlashlight extends Command {

  protected void initialize() {
    if (Robot.flashLight.enabled) {
      Robot.flashLight.off();
    } else {
      Robot.flashLight.on();
    }
  }

  protected void execute() {}

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
