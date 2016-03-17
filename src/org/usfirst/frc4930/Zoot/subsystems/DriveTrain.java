package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.TankDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * DriveTrain
 */
public class DriveTrain extends Subsystem {

  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
  }

  public void move(double left, double right) {
    if (Robot.orientation) {
      RobotMap.driveTrainMasterMotors.tankDrive(left, right);
    } else {
      RobotMap.driveTrainMasterMotors.tankDrive(-right, -left);
    }
  }

  public void controlledMove(double left, double right) {

    // double talonCurrent = RobotMap.driveTrainLeftMaster.getOutputCurrent();

    double multiplier = 1.0;
    if ((left < -0.7 && right < -0.7) || (left > 0.7 && right > 0.7)) {
      multiplier = 0.8;
    }
    if (Robot.orientation) {
      RobotMap.driveTrainMasterMotors.tankDrive(left * multiplier, right * multiplier);
    } else {
      RobotMap.driveTrainMasterMotors.tankDrive(-right * multiplier, -left * multiplier);
    }
  }

  public void moveAuto(double autoleft, double autoright) {
    RobotMap.driveTrainMasterMotors.tankDrive(autoleft, autoright);
  }

  public void stop() {
    RobotMap.driveTrainMasterMotors.stopMotor();
  }
}
