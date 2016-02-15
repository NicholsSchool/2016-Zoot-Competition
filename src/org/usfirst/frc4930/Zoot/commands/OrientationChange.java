package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.OI;
import org.usfirst.frc4930.Zoot.subsystems.Cameras;
import org.usfirst.frc4930.Zoot.subsystems.DriveTrain;

/**
 * OrientationChange - switches orientation of drive train and cameras
 */
public class OrientationChange extends Command {

    public OrientationChange() {  	
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	takeJoystickInputs(OI.joystick0, OI.joystick1);
    }

    protected boolean isFinished() {
        return false;
    }

   //Needs to be Tested!!!!
    public void takeJoystickInputs(Joystick joystick0, Joystick joystick1){
    	if(Cameras._cam0){
    		DriveTrain.masterMotors.tankDrive(joystick0.getY(), joystick1.getY());
    	}
    	else if(Cameras._cam0 == false){
    		DriveTrain.masterMotors.tankDrive(-joystick0.getY(), -joystick1.getY());
    	}
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
