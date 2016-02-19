package org.usfirst.frc4930.Zoot;

import org.usfirst.frc4930.Zoot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

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

    public OI() {

    	joystick0 = new Joystick(0);
    	joystick1 = new Joystick(1);
        joystick2 = new Joystick(2);
        
        joystick0Button1 = new JoystickButton(joystick0, 1);
        joystick0Button1.whenReleased(new ShiftUp());
                
        joystick1Button1 = new JoystickButton(joystick1, 1);
        joystick1Button1.whenReleased(new ShiftDown());
        
        joystick1Button2 = new JoystickButton(joystick1, 2);
        joystick1Button2.whenReleased(new Intake());
        
        joystick1Button3 = new JoystickButton(joystick0, 3);
        joystick1Button3.whenReleased(new OrientationChange());
        
        joystick2Button1 = new JoystickButton(joystick2, 1);
        joystick2Button1.whenReleased(new Shoot());
       
        joystick2Button3 = new JoystickButton(joystick2, 3);
        joystick2Button3.whenReleased(new Drop());
        
        joystick2Button6 = new JoystickButton(joystick2, 6);
        joystick2Button6.whileHeld(new ExtendHook());
        
        joystick2Button7 = new JoystickButton(joystick2, 7);
        joystick2Button7.whileHeld(new RetractHook());    
        
        joystick2Button9 = new JoystickButton(joystick2, 9);
        joystick2Button9.whileHeld(new CompressorOn());
         
    }

    public Joystick getJoystick0() {
        return joystick0;
    }

    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }

}

