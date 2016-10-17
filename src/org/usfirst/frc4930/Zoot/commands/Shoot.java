package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Shoot extends CommandGroup {
    
    public  Shoot() {
    	addSequential(new SpinUpShooter());
    	addSequential(new SpinUpRoller());
    }
}
