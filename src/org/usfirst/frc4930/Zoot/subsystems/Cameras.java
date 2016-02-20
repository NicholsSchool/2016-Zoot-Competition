package org.usfirst.frc4930.Zoot.subsystems;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import edu.wpi.first.wpilibj.CameraServer;

/**
 * Cameras
 */
public class Cameras {

	static public int frontCam;
	static public int backCam;
	private static int curCam;
	private Image frame;
	private CameraServer server;

	public Cameras() {
		frontCam = NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		backCam = NIVision.IMAQdxOpenCamera("cam1", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		curCam = frontCam;
		frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		server = CameraServer.getInstance();
		server.setQuality(50);
	}

	public static void changeCam(int newId) {
		NIVision.IMAQdxStopAcquisition(curCam);
		curCam = newId;
		NIVision.IMAQdxConfigureGrab(newId);
		NIVision.IMAQdxStartAcquisition(newId);
	}

	public void updateCam() {
		NIVision.IMAQdxGrab(curCam, frame, 1);
		server.setImage(frame);
	}

	public void initialize() {
		NIVision.IMAQdxStartAcquisition(curCam);
		changeCam(frontCam);
	}

	public void execute() {
		updateCam();
	}
}
