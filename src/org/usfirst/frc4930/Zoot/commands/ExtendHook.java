package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * ExtendHook - controls the length of the hook arm
 */
public class ExtendHook extends Command {

  boolean onlyOnce = true;

  protected void initialize() {}

  protected void execute() {
    Robot.hookExtender.moveUp(-1.0);
    if (onlyOnce) {
      Robot.driveTrain.brakeMode(true);
      onlyOnce = false;
    }
  }

  protected boolean isFinished() {
    if (!Robot.limitSwitch.hookExtended()) {
      return true;
    } else {
      return false;
    }
  }

  protected void end() {
    Robot.driveTrain.brakeMode(false);
    Robot.hookExtender.stop();
  }

  protected void interrupted() {
    end();
  }
}
