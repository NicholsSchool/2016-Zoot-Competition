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

import org.usfirst.frc4930.Zoot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4930.Zoot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public JoystickButton joystick0Button1;
    public JoystickButton joystick0Button3;
    public Joystick joystick0;
    public JoystickButton joystick1Button1;
    public JoystickButton joystick1Button3;
    public Joystick joystick1;
    public JoystickButton joystick2Button1;
    public JoystickButton joystick2Button2;
    public JoystickButton joystick2Button3;
    public JoystickButton joystick2Button6;
    public JoystickButton joystick2Button7;
    public Joystick joystick2;
 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick2 = new Joystick(2);
        
        joystick2Button7 = new JoystickButton(joystick2, 7);
        joystick2Button7.whileHeld(new RetractArm());
        joystick2Button6 = new JoystickButton(joystick2, 6);
        joystick2Button6.whileHeld(new ExtendArm());
        joystick2Button3 = new JoystickButton(joystick2, 3);
        joystick2Button3.whenReleased(new Drop());
        joystick2Button2 = new JoystickButton(joystick2, 2);
        joystick2Button2.whenReleased(new Intake());
        joystick2Button1 = new JoystickButton(joystick2, 1);
        joystick2Button1.whenReleased(new Shoot());
        joystick1 = new Joystick(1);
        
        joystick1Button3 = new JoystickButton(joystick1, 3);
        joystick1Button3.whenReleased(new OrientationChange());
        joystick1Button1 = new JoystickButton(joystick1, 1);
        joystick1Button1.whenReleased(new ShiftDown());
        joystick0 = new Joystick(0);
        
        joystick0Button1 = new JoystickButton(joystick0, 1);
        joystick0Button1.whenReleased(new ShiftUp());
        joystick0Button3 = new JoystickButton(joystick0, 3);
        joystick0Button3.whenPressed(new SwitchCams());
        
        


        // SmartDashboard Buttons
//        SmartDashboard.putData("Autonomous", new Autonomous());
//        SmartDashboard.putData("TankDrive", new TankDrive());
//        SmartDashboard.putData("MoveArm", new MoveArm());
//        SmartDashboard.putData("Intake", new Intake());
//        SmartDashboard.putData("Shoot", new Shoot());
//        SmartDashboard.putData("ExtendArm", new ExtendArm());
//        SmartDashboard.putData("RetractArm", new RetractArm());
//        SmartDashboard.putData("OrientationChange", new OrientationChange());
//        SmartDashboard.putData("ShiftUp", new ShiftUp());
//        SmartDashboard.putData("ShiftDown", new ShiftDown());
//        SmartDashboard.putData("Drop", new Drop());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick0() {
        return joystick0;
    }

    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }

}

