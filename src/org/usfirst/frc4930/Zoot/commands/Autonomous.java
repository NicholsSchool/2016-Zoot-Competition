package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous extends Command {

  public Autonomous() {
    requires(Robot.driveTrain);
  }

  protected void initialize() {
    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
  }

  protected void execute() {
    this.Auto1();
    // this.Auto2();
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

  protected void Auto1() {
    Robot.armLifter.move(-0.8);
    Timer.delay(2);
    Robot.armLifter.stop();
    Robot.driveTrain.move(0.3, 0.3);
    Timer.delay(2.5);
    Robot.driveTrain.stop();
  }

  protected void Auto2() {
    while (RobotMap.armPot.get() > 341) {
      Robot.armLifter.move(-0.8);
    }
    Timer.delay(0.5);
    RobotMap.driveTrainMasterMotors.tankDrive(-0.7, -0.7);
    Timer.delay(3.2);
    RobotMap.driveTrainMasterMotors.stopMotor();
    Timer.delay(0.3);
    RobotMap.driveTrainMasterMotors.tankDrive(-0.7, 0.4);
    Timer.delay(2.15);
    RobotMap.driveTrainMasterMotors.stopMotor();
    Robot.armLifter.moveToShotAngle();
    Timer.delay(0.5);
    RobotMap.driveTrainMasterMotors.tankDrive(-0.5, -0.5);
    Timer.delay(2.0);
    RobotMap.driveTrainMasterMotors.stopMotor();
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
    RobotMap.hookDart.set(-0.5);// UP
    Timer.delay(0.5);
    RobotMap.hookDart.set(0.0);
  }
}
