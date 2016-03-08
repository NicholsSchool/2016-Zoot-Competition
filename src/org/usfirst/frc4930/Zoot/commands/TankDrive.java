package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * TankDrive - driving command during tele-op
 */
public class TankDrive extends Command {

  public TankDrive() {
    requires(Robot.driveTrain);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.driveTrain.move(Robot.oi.getJoystick0(), Robot.oi.getJoystick1());
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
    Robot.driveTrain.stop();
  }

  protected void interrupted() {
    Robot.driveTrain.stop();
  }
}
