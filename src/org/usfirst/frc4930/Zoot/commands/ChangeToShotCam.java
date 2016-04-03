package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.subsystems.sensors.Cameras;
import edu.wpi.first.wpilibj.command.Command;

/**
 * ChangeToShotCam - switch cameras
 */
public class ChangeToShotCam extends Command {

  protected void initialize() {}

  protected void execute() {
    Cameras.changeToShotCam();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
