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
    Robot.hookExtender.move(-1.0);

    if (onlyOnce) {
      RobotMap.driveTrainLeftMaster.enableBrakeMode(true);
      RobotMap.driveTrainLeftSlave1.enableBrakeMode(true);
      RobotMap.driveTrainLeftSlave2.enableBrakeMode(true);
      RobotMap.driveTrainRightMaster.enableBrakeMode(true);
      RobotMap.driveTrainRightSlave1.enableBrakeMode(true);
      RobotMap.driveTrainRightSlave2.enableBrakeMode(true);
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
    Robot.hookExtender.stop();
  }

  protected void interrupted() {
    Robot.hookExtender.stop();
  }
}
