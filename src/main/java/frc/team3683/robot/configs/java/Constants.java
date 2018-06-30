package frc.team3683.robot.configs.java;

/**
 * Constants
 */
public class Constants {

    private double SwitchHeight = 27.0;
    private double lowScale = 56.0;
    private double neutralScale = 62.0;
    private double highScale = 66.0; //64.0
    private double bottom = 0.0; //Caitlin's code
    private double ClimbPos = 12.0;
    private double up = 64.0;
    private double potUp = 45.0; //60 comp 40.0
    private double potMid = -27.0; //-18 comp -5.0
    private double potDown = -35.0; //-27 comp -42.0
    private double potClimb = -120.0; //-50
    private double potDanny = 100.0; //30
    private double autoWaitTime = 5.0;
    private boolean readPot = false;
    //make this true to diable the wrist
	/**
	 * @return the switchHeight
	 */
	public double getSwitchHeight() {
		return SwitchHeight;
	}
	/**
	 * @return the readPot
	 */
	public boolean isReadPot() {
		return readPot;
	}
	/**
	 * @return the autoWaitTime
	 */
	public double getAutoWaitTime() {
		return autoWaitTime;
	}
	/**
	 * @return the potDanny
	 */
	public double getPotDanny() {
		return potDanny;
	}
	/**
	 * @return the potClimb
	 */
	public double getPotClimb() {
		return potClimb;
	}
	/**
	 * @return the potDown
	 */
	public double getPotDown() {
		return potDown;
	}
	/**
	 * @return the potMid
	 */
	public double getPotMid() {
		return potMid;
	}
	/**
	 * @return the potUp
	 */
	public double getPotUp() {
		return potUp;
	}
	/**
	 * @return the up
	 */
	public double getUp() {
		return up;
	}
	/**
	 * @return the climbPos
	 */
	public double getClimbPos() {
		return ClimbPos;
	}
	/**
	 * @return the bottom
	 */
	public double getBottom() {
		return bottom;
	}
	/**
	 * @return the highScale
	 */
	public double getHighScale() {
		return highScale;
	}
	/**
	 * @return the neutralScale
	 */
	public double getNeutralScale() {
		return neutralScale;
	}
	/**
	 * @return the lowScale
	 */
	public double getLowScale() {
		return lowScale;
	}
}