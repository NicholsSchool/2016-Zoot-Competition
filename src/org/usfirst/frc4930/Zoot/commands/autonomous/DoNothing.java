package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.command.Command;

/**
 * DoNothing Auto
 * Autonomous - lasts 15 seconds
 */
public class DoNothing extends Command {

  public DoNothing() {}

  protected void initialize() {}

  protected void execute() {}

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
