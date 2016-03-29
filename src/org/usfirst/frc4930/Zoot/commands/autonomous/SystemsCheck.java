package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * SystemsCheck Auto
 * Autonomous - lasts 15 seconds
 */
public class SystemsCheck extends Command {

  public SystemsCheck() {
    requires(Robot.driveTrain);
  }

  protected void initialize() {}

  protected void execute() {
    RobotMap.driveTrainLeftMaster.set(0.5); // FORWARD
    Timer.delay(0.5);
    RobotMap.driveTrainLeftMaster.set(0.0);
    Timer.delay(0.5);
    RobotMap.driveTrainRightMaster.set(0.5); // FORWARD
    Timer.delay(0.5);
    RobotMap.driveTrainRightMaster.set(0.0);
    Timer.delay(0.5);
    RobotMap.intakeMotorsLeft.set(0.5); // IN
    Timer.delay(0.5);
    RobotMap.intakeMotorsLeft.set(0.0);
    Timer.delay(0.5);
    RobotMap.intakeMotorsRight.set(0.5); // IN
    Timer.delay(0.5);
    RobotMap.intakeMotorsRight.set(0.0);
    Timer.delay(0.5);
    RobotMap.roller.set(0.5); // IN
    Timer.delay(0.5);
    RobotMap.roller.set(0.0);
    Timer.delay(0.5);
    RobotMap.armDart.set(0.5); // UP
    Timer.delay(0.5);
    RobotMap.armDart.set(0.0);
    Timer.delay(0.5);
    RobotMap.hookDartScrew.set(-0.5);// UP
    Timer.delay(0.5);
    RobotMap.hookDartScrew.set(0.0);
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
