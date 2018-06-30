package frc.team3683.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team3683.robot.subsystems.DriveTrain;

public class Robot extends IterativeRobot {

    private static DriveTrain mDriveTrain;

    @Override
    public void robotInit() { }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() { }

    @Override
    public void testPeriodic() { }

    public static DriveTrain getmDriveTrain() {
        return mDriveTrain;
    }
}