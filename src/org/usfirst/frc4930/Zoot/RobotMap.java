package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * Maps the ports on sensors and motor controllers to variable names.
 */
public class RobotMap {

  public static RobotDrive driveTrainMasterMotors;

  public static CANTalon driveTrainLeftMaster;
  public static CANTalon driveTrainLeftSlave1;
  public static CANTalon driveTrainLeftSlave2;

  public static CANTalon driveTrainRightMaster;
  public static CANTalon driveTrainRightSlave1;
  public static CANTalon driveTrainRightSlave2;

  public static CANTalon armDart;
  public static CANTalon hookDart;

  public static CANTalon roller;
  public static CANTalon intakeMotorsLeft;
  public static CANTalon intakeMotorsRight;

  public static DigitalInput boulderIntakeSwitch;
  public static AnalogPotentiometer armPot;
  public static DigitalInput armLowExtremeSwitch;
  public static DigitalInput armHighExtremeSwitch;
  public static DigitalInput hookLowExtremeSwitch;
  public static DigitalInput hookHighExtremeSwitch;

  public static void init() {

    // DIO Sensors
    hookHighExtremeSwitch = new DigitalInput(0);
    boulderIntakeSwitch = new DigitalInput(1);
    hookLowExtremeSwitch = new DigitalInput(2);
    armHighExtremeSwitch = new DigitalInput(3);
    armLowExtremeSwitch = new DigitalInput(4);

    armPot = new AnalogPotentiometer(2, 360, 0);

    // Motor Controllers
    roller = new CANTalon(10);
    driveTrainRightMaster = new CANTalon(11);
    driveTrainRightSlave1 = new CANTalon(12);
    driveTrainRightSlave2 = new CANTalon(13);
    hookDart = new CANTalon(14);
    intakeMotorsLeft = new CANTalon(15);
    intakeMotorsRight = new CANTalon(16);
    armDart = new CANTalon(17);
    driveTrainLeftMaster = new CANTalon(18);
    driveTrainLeftSlave1 = new CANTalon(19);
    driveTrainLeftSlave2 = new CANTalon(20);

    // Setup Slaves and Masters
    driveTrainLeftSlave1.changeControlMode(TalonControlMode.Follower);
    driveTrainLeftSlave1.set(driveTrainLeftMaster.getDeviceID());

    driveTrainLeftSlave2.changeControlMode(TalonControlMode.Follower);
    driveTrainLeftSlave2.set(driveTrainLeftMaster.getDeviceID());

    driveTrainRightSlave1.changeControlMode(TalonControlMode.Follower);
    driveTrainRightSlave1.set(driveTrainRightMaster.getDeviceID());

    driveTrainRightSlave2.changeControlMode(TalonControlMode.Follower);
    driveTrainRightSlave2.set(driveTrainRightMaster.getDeviceID());

    driveTrainMasterMotors = new RobotDrive(driveTrainLeftMaster, driveTrainRightMaster);

    driveTrainMasterMotors.setSafetyEnabled(true);
    driveTrainMasterMotors.setExpiration(0.1);
    driveTrainMasterMotors.setSensitivity(0.6);
    driveTrainMasterMotors.setMaxOutput(1.0);

    driveTrainLeftMaster.enableBrakeMode(false);
    driveTrainLeftSlave1.enableBrakeMode(false);
    driveTrainLeftSlave2.enableBrakeMode(false);
    driveTrainRightMaster.enableBrakeMode(false);
    driveTrainRightSlave1.enableBrakeMode(false);
    driveTrainRightSlave2.enableBrakeMode(false);
  }
}
