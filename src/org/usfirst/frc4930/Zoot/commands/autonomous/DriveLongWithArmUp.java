package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * DriveLongWithArmUp Auto
 * Autonomous - lasts 15 seconds
 */
public class DriveLongWithArmUp extends Command {

  public DriveLongWithArmUp() {
    requires(Robot.driveTrain);
  }

  protected void initialize() {
	  RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
  }

  protected void execute() {
    // @todo avoid using timer in this manor, needs some thought
    Robot.driveTrain.move(-0.8, -0.8);
    Timer.delay(2.6);
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
