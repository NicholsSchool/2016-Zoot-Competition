package org.usfirst.frc4930.Zoot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * FlashLight
 */
public class FlashLight extends Subsystem {

  Relay spike;
  public boolean enabled = false;

  protected void initDefaultCommand() {}

  public FlashLight() {
    spike = new Relay(0);
  }

  public void enableFlashlight() {
    spike.set(Relay.Value.kForward);
    enabled = true;
  }

  public void disableFlashlight() {
    spike.set(Relay.Value.kOff);
    enabled = false;
  }
}
