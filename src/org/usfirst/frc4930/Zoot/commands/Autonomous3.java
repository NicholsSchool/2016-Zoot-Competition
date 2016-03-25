package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous3 extends Command {

  public Autonomous3() {
    requires(Robot.driveTrain);
    requires(Robot.armLifter);
    requires(Robot.intakeMotors);
    requires(Robot.roller);
  }

  protected void initialize() {
    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
  }

  protected void execute() {
     this.spyAuto();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
    Robot.roller.stop();
    Robot.intakeMotors.stop();
  }

  protected void interrupted() {
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
    Robot.roller.stop();
    Robot.intakeMotors.stop();
  }

  protected void spyAuto() {
    Robot.driveTrain.move(-0.5, -0.5);
    Timer.delay(1.5);
    Robot.driveTrain.stop();
    //START Inserted from Shoot Command
    Robot.intakeMotors.move(-1.0);
    Timer.delay(0.75);
    Robot.roller.move(1.0);
    Timer.delay(0.1);
    Robot.roller.stop();
    Robot.intakeMotors.stop();
    //END Inserted from Shoot Command
    Timer.delay(0.5);
    Robot.driveTrain.move(0.8, 0.1);
    Timer.delay(1.75);
    Robot.driveTrain.move(0.7, 0.7);
    Timer.delay(1.0);
    Robot.driveTrain.stop();
  }
}
