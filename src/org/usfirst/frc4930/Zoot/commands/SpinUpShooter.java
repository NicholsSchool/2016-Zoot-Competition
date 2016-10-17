package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Shoot - shoots the boulder
 */
public class SpinUpShooter extends Command {
  double endTime;
  protected void initialize() {
  	endTime =Timer.getFPGATimestamp()+.75;
  }

  protected void execute() {
    Robot.intakeMotors.move(-1.0);
  }

  protected boolean isFinished() {
	  return (Timer.getFPGATimestamp() >= endTime);  
  }

  protected void end() {
      Robot.intakeMotors.move(-1.0);
  }

  protected void interrupted() {
      Robot.intakeMotors.stop();
  }
}
