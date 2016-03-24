package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.Shoot;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous1 extends Command {

  public Autonomous1() {
    requires(Robot.driveTrain);
    requires(Robot.armLifter);
  }

  protected void initialize() {
    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
  }

  protected void execute() {

    this.driveOverDefenseWithArmUp();
    // this.lowBarAutoNoShot();
    // this.lowBarWithoutPotWithLowShot();
    // this.spyAuto();
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

  protected void lowBarAutoNoShot() {
    Robot.armLifter.move(-0.8);
    Timer.delay(2);
    Robot.armLifter.stop();
    Robot.driveTrain.move(-0.7, -0.7);
    Timer.delay(1.5);
    Robot.driveTrain.stop();
  }

  protected void lowBarWithoutPotWithLowShot() {
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
    new Shoot();
  }

  protected void spyAuto() {
    Robot.driveTrain.move(-0.5, -0.5);
    Timer.delay(1.5);
    Robot.driveTrain.stop();
    new Shoot();
    Timer.delay(0.5);
    Robot.driveTrain.move(0.8, 0.1);
    Timer.delay(1.75);
    Robot.driveTrain.move(0.7, 0.7);
    Timer.delay(1.0);
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
