package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * RetractHook - retracts the hook
 */
public class RetractHook extends Command {

  protected void initialize() {}

  protected void execute() {
    Robot.hookExtender.moveDown(1.0);
  }

  protected boolean isFinished() {
    if (!Robot.limitSwitch.hookRetracted()) {
      return true;
    } else {
      return false;
    }
  }

  protected void end() {
    Robot.hookExtender.stop();
  }

  protected void interrupted() {
    Robot.hookExtender.stop();
  }
}
