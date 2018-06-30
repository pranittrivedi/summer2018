package frc.team3683.robot.configs.java;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import frc.team3683.robot.utils.BNO055;

/**
 * Config
 */
public interface Config {

   //drivetrain configs

   public VictorSPX getDriveVictorLeft1();
   public VictorSPX getDriveVictorLeft2();
   public VictorSPX getDriveVictorRight1();
   public VictorSPX getDriveVictorRight2();
   public DoubleSolenoid getDriveSolenoid();

   public Encoder getDriveEncoderLeft();
   public Encoder getDriveEncoderRight();
   public BNO055 getDriveGyro();

   public double getDriveP();
   public double getDriveI();
   public double getDriveD();
   public double getGyroP();
   public double getGyroI();
   public double getGyroD();
}