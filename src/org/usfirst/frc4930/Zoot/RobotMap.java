package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;
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
  public static CANTalon hookDartScrew;
  public static CANTalon hookDartWinch;

  public static CANTalon roller;
  public static CANTalon intakeMotorsLeft;
  public static CANTalon intakeMotorsRight;

  public static DigitalInput boulderIntakeSwitch;
  public static DigitalInput armLowExtremeSwitch;
  public static DigitalInput hookLowExtremeSwitch;
  public static DigitalInput hookHighExtremeSwitch;

  public static ZeroablePotentiometer armPot;

  public static void init() {

    // DIO Sensors
    hookHighExtremeSwitch = new DigitalInput(0);
    boulderIntakeSwitch = new DigitalInput(1);
    hookLowExtremeSwitch = new DigitalInput(2);
    armLowExtremeSwitch = new DigitalInput(4);

    // Analog Sensors
    armPot = new ZeroablePotentiometer(2, 360);

    // Motor Controllers
    hookDartWinch = new CANTalon(9);
    roller = new CANTalon(10);
    driveTrainRightMaster = new CANTalon(11);
    driveTrainRightSlave1 = new CANTalon(12);
    driveTrainRightSlave2 = new CANTalon(13);
    hookDartScrew = new CANTalon(14);
    intakeMotorsLeft = new CANTalon(15);
    intakeMotorsRight = new CANTalon(16);
    armDart = new CANTalon(17);
    driveTrainLeftMaster = new CANTalon(18);
    driveTrainLeftSlave1 = new CANTalon(19);
    driveTrainLeftSlave2 = new CANTalon(20);

    // Setup Slave Motors
    driveTrainLeftSlave1.changeControlMode(TalonControlMode.Follower);
    driveTrainLeftSlave1.set(driveTrainLeftMaster.getDeviceID());
    driveTrainLeftSlave2.changeControlMode(TalonControlMode.Follower);
    driveTrainLeftSlave2.set(driveTrainLeftMaster.getDeviceID());
    driveTrainRightSlave1.changeControlMode(TalonControlMode.Follower);
    driveTrainRightSlave1.set(driveTrainRightMaster.getDeviceID());
    driveTrainRightSlave2.changeControlMode(TalonControlMode.Follower);
    driveTrainRightSlave2.set(driveTrainRightMaster.getDeviceID());

    driveTrainMasterMotors = new RobotDrive(driveTrainLeftMaster, driveTrainRightMaster);

    // @todo determine if this is really necessary
    driveTrainMasterMotors.setSafetyEnabled(true);
    driveTrainMasterMotors.setExpiration(0.1);
    driveTrainMasterMotors.setSensitivity(0.6);
    driveTrainMasterMotors.setMaxOutput(1.0);

   // Robot.driveTrain.brakeMode(false);
  }

  public static class ZeroablePotentiometer extends AnalogPotentiometer {

    private int invert = 1;
    private boolean hasReset = false;
    private double offset = 0.0;

    public ZeroablePotentiometer(int channel) {
      super(channel);
    }

    public ZeroablePotentiometer(int channel, double scale) {
      super(channel, scale);
    }

    public double get() {
      return (super.get() - offset) * invert;
    }

    public void reset() {
      offset = super.get();
      hasReset = true;
    }

    public boolean isReset() {
      return hasReset;
    }

    public void setInverted(boolean invert) {
      if (invert) {
        this.invert = -1;
      } else {
        this.invert = 1;
      }
    }

    public boolean isInverted() {
      return this.invert == -1;
    }
  }
}
