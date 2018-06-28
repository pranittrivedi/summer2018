package frc.team3683.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private XboxController xboxController;
    private static OI instance;

    private OI(){
        xboxController = new XboxController(0);
    }

    public static OI getInstance(){
        if (instance == null){
            instance = new OI();
        }
        return instance;
    }
    public double getLeftY() {
        return xboxController.getRawAxis(1);
    }

    public double getRightX(){
        return xboxController.getRawAxis(4);
    }
}
