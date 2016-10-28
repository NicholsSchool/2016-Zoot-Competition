package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Drop - slowly drop boulder
 */
public class Drop extends CommandGroup {

	public Drop() {
	    addParallel(new SpinUpShooter(-0.3,0.5));
	    addParallel(new SpinUpRoller(0.3,0.5));
	}
	
}
