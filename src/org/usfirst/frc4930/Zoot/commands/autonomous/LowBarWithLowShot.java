package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * LowBarWithLowShot Auto
 * Autonomous - lasts 15 seconds
 */
public class LowBarWithLowShot extends Command {

  public LowBarWithLowShot() {
    requires(Robot.driveTrain);
    requires(Robot.armLifter);
  }

  protected void initialize() {
    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
  }

  protected void execute() {
    Robot.armLifter.move(-0.8);
    Timer.delay(2);
    Robot.armLifter.stop();
    Robot.driveTrain.move(-0.7, -0.7);
    Timer.delay(1.5);
    Robot.driveTrain.stop();
    Robot.driveTrain.move(-0.7, 0.4);
    Timer.delay(2);
    Robot.driveTrain.move(-0.7, -0.7);
    Timer.delay(1.0);
    Robot.driveTrain.stop();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
  }

  protected void interrupted() {
    end();
  }
}
