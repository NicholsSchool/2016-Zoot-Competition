package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.subsystems.sensors.Cameras;

/**
 * OrientationChange - switches orientation of drive train and cameras
 */
public class OrientationChange extends Command {

  protected void initialize() {}

  protected void execute() {
    if (Robot.orientation) {
      Cameras.changeCam(Cameras.backCam);
      Robot.orientation = false;
    } else {
      Cameras.changeCam(Cameras.frontCam);
      Robot.orientation = true;
    }
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {}
}
