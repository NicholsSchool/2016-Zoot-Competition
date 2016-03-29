package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * SystemsCheck Auto
 * Autonomous - use in the pits with the robot on blocks
 */
public class SystemsCheck extends Command {

  public SystemsCheck() {
    requires(Robot.driveTrain);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.driveTrain.move(0.0, 0.5);
    Timer.delay(0.5);
    Robot.driveTrain.stop();
    Timer.delay(0.5);
    Robot.driveTrain.move(0.0, -0.5);
    Timer.delay(0.5);
    Robot.driveTrain.stop();
    Timer.delay(0.5);
    Robot.driveTrain.move(0.5, 0.0);
    Timer.delay(0.5);
    Robot.driveTrain.stop();
    Timer.delay(0.5);
    Robot.driveTrain.move(-0.5, 0.0);
    Timer.delay(0.5);
    Robot.driveTrain.stop();
    Timer.delay(0.5);
    Robot.intakeMotors.move(0.5);
    Timer.delay(0.5);
    Robot.intakeMotors.stop();
    Timer.delay(0.5);
    Robot.intakeMotors.move(-0.5);
    Timer.delay(0.5);
    Robot.intakeMotors.stop();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.driveTrain.stop();
    Robot.intakeMotors.stop();
  }

  protected void interrupted() {
    end();
  }
}
