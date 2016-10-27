package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Shoot extends CommandGroup {
    
    public  Shoot() {
    	addSequential(new SpinUpShooter(-1.0,0.75));
    	addSequential(new SpinUpRoller(1.0,1.0));
    }
}
