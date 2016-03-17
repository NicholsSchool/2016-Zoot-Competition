package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous1 extends Command {

	public Autonomous1(){
		requires(Robot.driveTrain);
	}

  protected void initialize() {}

  protected void execute() {
	  RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
	  while(RobotMap.armPot.get() > 301.0){
		  Robot.armLifter.move(-0.8);
		  }
	  Timer.delay(0.5);
	  RobotMap.driveTrainMasterMotors.tankDrive(-0.7,- 0.7);
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
	  
	  //System Check
	  
//	    RobotMap.driveTrainLeftMaster.set(0.5);//FORWARD
//	    Timer.delay(0.5);
//	    RobotMap.driveTrainLeftMaster.set(0.0);
//	    Timer.delay(0.5);
//	    RobotMap.driveTrainRightMaster.set(0.5);//FORWARD
//	    Timer.delay(0.5);
//	    RobotMap.driveTrainRightMaster.set(0.0);
//	    Timer.delay(0.5);
//	    RobotMap.intakeMotorsLeft.set(0.5);//IN
//	    Timer.delay(0.5);
//	    RobotMap.intakeMotorsLeft.set(0.0);
//	    Timer.delay(0.5);
//	    RobotMap.intakeMotorsRight.set(0.5);//IN
//	    Timer.delay(0.5);
//	    RobotMap.intakeMotorsRight.set(0.0);
//	    Timer.delay(0.5);
//	    RobotMap.roller.set(0.5);//IN
//	    Timer.delay(0.5);
//	    RobotMap.roller.set(0.0);
//	    Timer.delay(0.5);
//	    RobotMap.armDart.set(0.5);//UP
//	    Timer.delay(0.5);
//	    RobotMap.armDart.set(0.0);
//	    Timer.delay(0.5);
//	    RobotMap.hookDart.set(-0.5);//UP
//	    Timer.delay(0.5);
//	    RobotMap.hookDart.set(0.0);
	  
	  
	  
//	  Timer.delay(2.0);
//	  Robot.driveTrain.stop();
	  //    Robot.armLifter.move(0.7);
//    Timer.delay(0.5);
//    Robot.driveTrain.move(0.3, 0.3);
//    Timer.delay(2);
    // Robot.driveTrain.stop();
    // Robot.armLifter.move(0.5);
    // Timer.delay(1);
    // Robot.armLifter.stop();
    // Robot.driveTrain.move(0.2, -0.2);
    // Timer.delay(0.5);
    // Robot.driveTrain.stop();
    // Robot.driveTrain.move(0.3, 0.3);
    // Timer.delay(1.0);
    // Robot.driveTrain.stop();
    // Robot.intakeMotors.moveLeft(1.0);
    // Robot.intakeMotors.moveRight(1.0);
    // Timer.delay(2.0);
    // Robot.roller.move(1.0);
    // Timer.delay(0.5);
    // Robot.intakeMotors.stop();
    // Robot.roller.stop();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    // every subsystem used in execute() should be stopped here
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
  }

  protected void interrupted() {
    // this needs to be the same as end()
    Robot.driveTrain.stop();
    Robot.armLifter.stop();
  }
}
