package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous1A extends Command {

  public Autonomous1A() {
    requires(Robot.driveTrain);
    requires(Robot.armLifter);
  }

  protected void initialize() {
    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
  }

  protected void execute() {

    this.driveOverDefenseWithArmUp();
    // this.sysCheck();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
  }

  protected void interrupted() {
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
  }

  protected void driveOverDefenseWithArmUp() {
    Robot.driveTrain.move(-0.8, -0.8);
    Timer.delay(1.8);
    Robot.driveTrain.stop();
  }

  protected void sysCheck() {
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
}
