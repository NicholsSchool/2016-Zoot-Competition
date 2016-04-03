package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Intake - intakes the boulder
 */
public class Intake extends Command {

  protected void initialize() {}

  protected void execute() {
    Robot.intakeMotors.move(1.0);
    Robot.roller.move(-1.0);
  }

  protected boolean isFinished() {
    if (Robot.limitSwitch.boulderInPosition()) {
      return false;
    } else {
      return true;
    }
  }

  protected void end() {
    Robot.intakeMotors.stop();
    Robot.roller.stop();
  }

  protected void interrupted() {
    end();
  }
}
