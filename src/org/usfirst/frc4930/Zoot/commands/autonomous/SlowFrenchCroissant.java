package org.usfirst.frc4930.Zoot.commands.autonomous;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * FrenchCroissant Auto
 * Autonomous - lasts 15 seconds
 */
public class SlowFrenchCroissant extends Command {

  public SlowFrenchCroissant() {
    requires(Robot.driveTrain);
    requires(Robot.armLifter);
  }

  protected void initialize() {
    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
    Robot.driveTrain.brakeMode(true);
  }

  protected void execute() {
    Robot.driveTrain.move(-0.3, -0.3);
    Timer.delay(3.5);
    Robot.driveTrain.move(-0.1, -0.1);
    Robot.armLifter.move(-0.87);
    Timer.delay(1.5);
    Robot.armLifter.stop();
    Robot.driveTrain.move(-0.8, -0.8);
    Robot.armLifter.move(1.0);
    Timer.delay(1.25);
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.driveTrain.brakeMode(false);
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
  }

  protected void interrupted() {
    end();
  }
}
