package frc.team3683.robot.configs

import com.ctre.phoenix.motorcontrol.can.VictorSPX
import edu.wpi.first.wpilibj.*
import frc.team3683.robot.utils.BNO055
import frc.team3683.robot.utils.TCS34725

object Comp : Config {
    override val holoflexDown: DigitalInput = DigitalInput(7)
    override val holoflexUp: DigitalInput = DigitalInput(6)
    //drivebase
    override val driveEncoderLeft: Encoder = Encoder(0, 1)
    override val driveEncoderRight: Encoder = Encoder(2, 3)


    override val driveVictorLeft1: VictorSPX = VictorSPX(0)
    override val driveVictorLeft2: VictorSPX = VictorSPX(1)
    override val driveVictorRight1: VictorSPX = VictorSPX(2)
    override val driveVictorRight2: VictorSPX = VictorSPX(3)
    override val driveSolenoid: DoubleSolenoid = DoubleSolenoid(2, 5)
    //make 7 or 0 do someothing like on or we leak like a leak.

    override val driveTicksPerInchLeft: Double = 394.9 * 1.05
    override val driveTicksPerInchRight: Double = -395.6 * 1.05
    override val driveGyro: BNO055 = BNO055.getInstance(BNO055.opmode_t.OPERATION_MODE_IMUPLUS,
            BNO055.vector_type_t.VECTOR_EULER,
            I2C.Port.kOnboard,
            BNO055.BNO055_ADDRESS_A)

    override val colorSensor: TCS34725 = TCS34725(
            TCS34725.tcs34725IntegrationTime_t.TCS34725_INTEGRATIONTIME_24MS,
            TCS34725.tcs34725Gain_t.TCS34725_GAIN_1X,
            I2C.Port.kOnboard,
            TCS34725.TCS34725_ADDRESS_A)

    override val driveP: Double = 0.10
    override val driveI: Double = 0.000
    override val driveD: Double = 0.024
    override val gyroP: Double = 0.048
    override val gyroI: Double = 0.000012
    override val gyroD: Double = 0.0050

    //bezier
    override val xMultiplier: Double = 6.0
    override val yMultiplier: Double = 4.0

    //intake
    override val intakeVictorLeft: Victor = Victor(2)
    override val intakeVictorRight: Victor = Victor(7)
    override val wristVictor1: Victor = Victor(0)
    override val wristVictor2: Victor = Victor(1)
    //override val intakeSolenoidRight: DoubleSolenoid = DoubleSolenoid(9, 10)
    override val intakeP: Double = 0.4//4
    override val intakeI: Double = 0.0
    override val intakeD: Double = 0.08//.08
    override val Pot: AnalogPotentiometer = AnalogPotentiometer(0)
    override val LightSensor: AnalogInput = AnalogInput(1)

    override val ticksPerDegree: Double = 1/620.68
    override val zeroDegreeTicks: Double = 0.44
    //override val intakeSolenoidLeft: DoubleSolenoid = DoubleSolenoid(0, 7)
    override val LEDLeft: Solenoid = Solenoid(3)
    override val LEDRight: Solenoid = Solenoid(6)



    //elevator
    override val elevatorVictor1: Victor = Victor(3)
    override val elevatorVictor2: Victor = Victor(4)
    override val elevatorVictor3: Victor = Victor(5)
    override val elevatorVictor4: Victor = Victor(6)
    override val elevatorVictor5: Victor = Victor(8)

    override val elevatorEncoder: Encoder = Encoder(8, 9)
    override val elevatorP: Double = 0.1

    override val elevatorI: Double = 0.0000
    override val elevatorD: Double = 0.00
    override val ticksPerInch: Double = -55.0
    override val elevatorTolerance: Double = 0.5
    //override val ratchetSolenoid: DoubleSolenoid = DoubleSolenoid(1, 4)

}