package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Shoot - shoots the boulder
 */
public class SpinUpShooter extends Command {
  double endTime;
  double spd;
  double spinTime;
  protected SpinUpShooter(double newSpd, double newSpinTime)
  {
	  spd = newSpd;
	  spinTime = newSpinTime;
  }
  protected void initialize() {
  	endTime =Timer.getFPGATimestamp()+spinTime;
  	
  }

  protected void execute() {
    Robot.intakeMotors.move(spd);
  }

  protected boolean isFinished() {
	  return (Timer.getFPGATimestamp() >= endTime);  
  }

  protected void end() {
      Robot.intakeMotors.move(spd);
  }

  protected void interrupted() {
      Robot.intakeMotors.stop();
  }
}
