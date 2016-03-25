package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.subsystems.Potentiometer;

import edu.wpi.first.wpilibj.command.Command;

public class GoToShotAngle extends Command {

  public GoToShotAngle() {}

  protected void initialize() {}

  protected void execute() {
	  while(!Robot.limitSwitch.armDown()){
		  Robot.armLifter.move(-0.8);
	  }
	  while(Potentiometer.getShotAngle() > RobotMap.armPot.get()){
		   Robot.armLifter.move(0.8);
      }
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.armLifter.stop();
  }

  protected void interrupted() {
    Robot.armLifter.stop();
  }
}
