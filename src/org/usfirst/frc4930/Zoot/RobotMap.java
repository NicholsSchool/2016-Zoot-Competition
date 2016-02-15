package org.usfirst.frc4930.Zoot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

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

    public static CANTalon intakeMotorsMaster;
    public static CANTalon intakeMotorsSlave;
    
    
    public static void init() {
       
        driveTrainRightMaster = new CANTalon(11);
        driveTrainRightSlave1 = new CANTalon(12);   
        driveTrainRightSlave2 = new CANTalon(13);
        hookDart = new CANTalon(14);
        intakeMotorsSlave = new CANTalon(15);
        intakeMotorsMaster = new CANTalon(16);
        armDart = new CANTalon(17);
        driveTrainLeftMaster = new CANTalon(18);
        driveTrainLeftSlave1 = new CANTalon(19);
        driveTrainLeftSlave2 = new CANTalon(20);
        
        // setup slaves and masters
        driveTrainLeftSlave1.changeControlMode(TalonControlMode.Follower);
        driveTrainLeftSlave1.set(driveTrainLeftMaster.getDeviceID());
        
        driveTrainLeftSlave2.changeControlMode(TalonControlMode.Follower);
        driveTrainLeftSlave2.set(driveTrainLeftMaster.getDeviceID());
        
        driveTrainRightSlave1.changeControlMode(TalonControlMode.Follower);
        driveTrainRightSlave1.set(driveTrainRightMaster.getDeviceID());
        
        driveTrainRightSlave2.changeControlMode(TalonControlMode.Follower);
        driveTrainRightSlave2.set(driveTrainRightMaster.getDeviceID());
        
        intakeMotorsMaster.reverseOutput(true);
        intakeMotorsSlave.changeControlMode(TalonControlMode.Follower);
        intakeMotorsSlave.set(intakeMotorsMaster.getDeviceID());
        
        // specific preset robot drive settings (do not change)
        driveTrainMasterMotors = new RobotDrive(driveTrainLeftMaster, driveTrainRightMaster);
        
        driveTrainMasterMotors.setSafetyEnabled(true);
        driveTrainMasterMotors.setExpiration(0.1);
        driveTrainMasterMotors.setSensitivity(0.5);
        driveTrainMasterMotors.setMaxOutput(1.0);
    }
}
