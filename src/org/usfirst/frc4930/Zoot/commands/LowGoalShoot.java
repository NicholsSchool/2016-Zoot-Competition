package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 * LowGoalShoot - shots the boulder
 */
public class LowGoalShoot extends CommandGroup {
	public LowGoalShoot() {
    	addSequential(new SpinUpShooter(-0.75,0.1));
    	addSequential(new SpinUpRoller(1.0,0.1));
	}
}
/*Robot.intakeMotors.move(-0.75);
Timer.delay(0.1);
Robot.roller.move(1.0);
Timer.delay(0.1);*/