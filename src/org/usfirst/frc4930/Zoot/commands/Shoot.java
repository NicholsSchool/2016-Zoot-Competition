package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Shoot - shoots the boulder
 */
public class Shoot extends Command {

  protected void initialize() {}

  protected void execute() {
    Robot.intakeMotors.move(-1.0);
    Timer.delay(0.75);
    Robot.roller.move(1.0);
    Timer.delay(0.1);
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.intakeMotors.stop();
    Robot.roller.stop();
  }

  protected void interrupted() {
    Robot.intakeMotors.stop();
    Robot.roller.stop();
  }
}
