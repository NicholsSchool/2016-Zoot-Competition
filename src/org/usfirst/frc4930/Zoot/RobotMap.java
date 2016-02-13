// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4930.Zoot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainLeftMaster;
    public static CANTalon driveTrainRightMaster;
    public static RobotDrive driveTrainMasterMotors;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMaster = new CANTalon(0);
        LiveWindow.addActuator("DriveTrain", "LeftMaster", driveTrainLeftMaster);
        
        driveTrainRightMaster = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "RightMaster", driveTrainRightMaster);
        
        driveTrainMasterMotors = new RobotDrive(driveTrainLeftMaster, driveTrainRightMaster);
        
        driveTrainMasterMotors.setSafetyEnabled(true);
        driveTrainMasterMotors.setExpiration(0.1);
        driveTrainMasterMotors.setSensitivity(0.5);
        driveTrainMasterMotors.setMaxOutput(1.0);


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
