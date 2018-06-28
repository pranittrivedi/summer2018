package frc.team3683.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3683.robot.utils.BNO055;
import frc.team3683.robot.utils.PID;
import frc.team3683.robot.configs.Config;

public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private VictorSPX mLeft1;
    private VictorSPX mLeft2;
    private VictorSPX mRight1;
    private VictorSPX mRight2;
    private Encoder mEncoderLeft;
    private Encoder mEncoderRight;
    private BNO055 mGyro;
    private DoubleSolenoid mShifter;
    private double gyroOffset, encOffset;
    private PID drivePID, gyroPID;

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void driveStraight(){
        //TODO
    }

    public void runMotors(double left, double right){
        mLeft1.set(ControlMode.PercentOutput, left);
        mLeft2.set(ControlMode.PercentOutput, left);
        mRight1.set(ControlMode.PercentOutput, right);
        mRight2.set(ControlMode.PercentOutput, right);
    }

    public void driveStraightAtAngle(double angle){
        //TODO
    }

    public void turnToAngle(double angle){
        //TODO
    }

    public void zeroEncoders(){
        mEncoderLeft.reset();
        mEncoderRight.reset();
    }

    public void zeroGyro({
        gyroOffset=mGyro.getHeading();
    }

    public void shift(){
        //TODO
    }

    public double getHeading(){
        return mGyro.getHeading()-gyroOffset;
    }

    public double getDistance(){
        return (mEncoderLeft.getDistance()+mEncoderRight.getDistance())/2;
    }

    public double getSpeed(){
        //TODO
    }

    public DriveTrain(Config config){
        mLeft1 = config.getDriveVictorLeft1();
        mLeft2 = config.getDriveVictorLeft2();
        mRight1 = config.getDriveVictorRight1();
        mRight2 = config.getDriveVictorRight2();

        mEncoderLeft = config.getDriveEncoderLeft();
        mEncoderRight = config.getDriveEncoderRight();
        mGyro = config.getDriveGyro();

        drivePID = new PID(config.getDriveP(), config.getDriveI(), config.getDriveD());
        gyroPID = new PID(config.getGyroP(), config.getGyroI(), config.getGyroD());
    }
}

