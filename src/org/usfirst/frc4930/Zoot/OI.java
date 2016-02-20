package org.usfirst.frc4930.Zoot;

import org.usfirst.frc4930.Zoot.commands.CompressorOn;
import org.usfirst.frc4930.Zoot.commands.Drop;
import org.usfirst.frc4930.Zoot.commands.ExtendHook;
import org.usfirst.frc4930.Zoot.commands.Intake;
import org.usfirst.frc4930.Zoot.commands.OrientationChange;
import org.usfirst.frc4930.Zoot.commands.RetractHook;
import org.usfirst.frc4930.Zoot.commands.ShiftDown;
import org.usfirst.frc4930.Zoot.commands.ShiftUp;
import org.usfirst.frc4930.Zoot.commands.Shoot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Binds operator interface controls to commands.
 */
public class OI {

	public static Joystick joystick0;
	public static Joystick joystick1;
	public static Joystick joystick2;

	public JoystickButton joystick0Button1;
	public JoystickButton joystick0Button3;

	public JoystickButton joystick1Button1;
	public JoystickButton joystick1Button2;
	public JoystickButton joystick1Button3;

	public JoystickButton joystick2Button1;
	public JoystickButton joystick2Button3;
	public JoystickButton joystick2Button6;
	public JoystickButton joystick2Button7;
	public JoystickButton joystick2Button9;

	public JoystickButton joystick2Button8;
	public JoystickButton joystick2Button10;
	public JoystickButton joystick2Button11;

	public OI() {
		joystick0 = new Joystick(0);
		joystick1 = new Joystick(1);
		joystick2 = new Joystick(2);

		joystick0Button1 = new JoystickButton(joystick0, 1);
		joystick0Button1.whenReleased(new ShiftUp());

		joystick0Button3 = new JoystickButton(joystick0, 3);
		joystick0Button3.whenReleased(new OrientationChange());

		joystick1Button1 = new JoystickButton(joystick1, 1);
		joystick1Button1.whenReleased(new ShiftDown());

		joystick1Button2 = new JoystickButton(joystick1, 2);
		joystick1Button2.whileHeld(new Intake());

		joystick2Button1 = new JoystickButton(joystick2, 1);
		joystick2Button1.whenPressed(new Shoot());

		joystick2Button3 = new JoystickButton(joystick2, 3);
		joystick2Button3.whenReleased(new Drop());

		joystick2Button6 = new JoystickButton(joystick2, 6);
		joystick2Button6.whileHeld(new ExtendHook());

		joystick2Button7 = new JoystickButton(joystick2, 7);
		joystick2Button7.whileHeld(new RetractHook());

		joystick2Button9 = new JoystickButton(joystick2, 9);
		joystick2Button9.whileHeld(new CompressorOn());
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
