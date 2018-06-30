package frc.team3683.robot.configs.java;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.*;
import frc.team3683.robot.utils.BNO055;

/**
 * Config
 */

/**
 * Comp
 */
public class Comp implements Config {


    public Comp() {
    
    }

	@Override
	public VictorSPX getDriveVictorLeft1() {
		return new VictorSPX(0);
	}

	@Override
	public VictorSPX getDriveVictorLeft2() {
		return new VictorSPX(1);
	}

	@Override
	public VictorSPX getDriveVictorRight1() {
		return new VictorSPX(2);
	}

	@Override
	public VictorSPX getDriveVictorRight2() {
		return new VictorSPX(3);
	}

    @Override
	public DoubleSolenoid getDriveSolenoid() {
		return new DoubleSolenoid(2, 5);
    }
    
	@Override
	public Encoder getDriveEncoderLeft() {
		return new Encoder(0, 1);
	}

	@Override
	public Encoder getDriveEncoderRight() {
		return new Encoder(2, 3);
	}

	@Override
	public BNO055 getDriveGyro() {
		return BNO055.getInstance(BNO055.opmode_t.OPERATION_MODE_IMUPLUS,
        BNO055.vector_type_t.VECTOR_EULER,
        I2C.Port.kOnboard,
        BNO055.BNO055_ADDRESS_A);
	}

	@Override
	public double getDriveP() {
		return 0;
	}

	@Override
	public double getDriveI() {
		return 0;
	}

	@Override
	public double getDriveD() {
		return 0;
	}

	@Override
	public double getGyroP() {
		return 0;
	}

	@Override
	public double getGyroI() {
		return 0;
	}

	@Override
	public double getGyroD() {
		return 0;
	}
}