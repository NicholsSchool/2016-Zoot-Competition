package org.usfirst.frc4930.Zoot;

import org.usfirst.frc4930.Zoot.commands.Drop;
import org.usfirst.frc4930.Zoot.commands.ExtendHook;
import org.usfirst.frc4930.Zoot.commands.GoToShotAngle;
import org.usfirst.frc4930.Zoot.commands.Intake;
import org.usfirst.frc4930.Zoot.commands.OrientationChange;
import org.usfirst.frc4930.Zoot.commands.RetractHook;
import org.usfirst.frc4930.Zoot.commands.Shoot;
import org.usfirst.frc4930.Zoot.commands.ChangeToShotCam;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Binds operator interface controls to commands.
 */
public class OI {

	public static Joystick joystick0;
	public static Joystick joystick1;
	public static Joystick joystick2;

	public JoystickButton joystick0Button3;

	public JoystickButton joystick1Button2;

	public JoystickButton joystick2Button1;
	public JoystickButton joystick2Button2;
	public JoystickButton joystick2Button3;
	public JoystickButton joystick2Button6;
	public JoystickButton joystick2Button7;
	public JoystickButton joystick2Button10;

	public OI() {
		joystick0 = new Joystick(0);
		joystick1 = new Joystick(1);
		joystick2 = new Joystick(2);

		joystick0Button3 = new JoystickButton(joystick0, 3);
		joystick0Button3.whenPressed(new OrientationChange());

		joystick1Button2 = new JoystickButton(joystick1, 2);
		joystick1Button2.whileHeld(new Intake());

		joystick2Button1 = new JoystickButton(joystick2, 1);
		joystick2Button1.whenPressed(new Shoot());

		joystick2Button2 = new JoystickButton(joystick2, 2);
		joystick2Button2.whenPressed(new GoToShotAngle());

		joystick2Button3 = new JoystickButton(joystick2, 3);
		joystick2Button3.whenPressed(new Drop());

		joystick2Button6 = new JoystickButton(joystick2, 6);
		joystick2Button6.whileHeld(new ExtendHook());

		joystick2Button7 = new JoystickButton(joystick2, 7);
		joystick2Button7.whileHeld(new RetractHook());

		joystick2Button10 = new JoystickButton(joystick2, 10);
		joystick2Button10.whenPressed(new ChangeToShotCam());
	}

	public double getJoystick0() {
		return joystick0.getY();
	}

	public double getJoystick1() {
		return joystick1.getY();
	}

	public double getJoystick2() {
		return joystick2.getY();
	}
}
