package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * MoveArm - lifts the arm
 */
public class MoveArm extends Command {

  public MoveArm() {
    requires(Robot.armLifter);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.armLifter.move(Robot.oi.getJoystick2());
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
    Robot.armLifter.stop();
  }

  protected void interrupted() {
    end();
  }
}
