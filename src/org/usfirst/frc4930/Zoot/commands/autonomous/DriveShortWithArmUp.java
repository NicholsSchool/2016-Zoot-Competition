package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * DriveShortWithArmUp Class
 * Autonomous - lasts 15 seconds
 */
public class DriveShortWithArmUp extends Command {

  public DriveShortWithArmUp() {
    requires(Robot.driveTrain);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.driveTrain.move(-0.8, -0.8);
    Timer.delay(1.8);
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.driveTrain.stop();
  }

  protected void interrupted() {
    end();
  }
}
