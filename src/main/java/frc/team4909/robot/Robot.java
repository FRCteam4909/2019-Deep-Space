package frc.team4909.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team4909.robot.commands.Linefollow;
import frc.team4909.robot.commands.CargoIntakeIn;
import frc.team4909.robot.commands.CargoIntakeOut;
import frc.team4909.robot.commands.HatchPanelIntakeOpen;
import frc.team4909.robot.commands.HatchPanelIntakeClose;
import frc.team4909.robot.operator.controllers.BionicF310;
import frc.team4909.robot.subsystems.drivetrain.DriveTrainSubsystem;
import frc.team4909.robot.subsystems.intake.IntakeSubsystem;

/**
 * The VM is configured to automatically run this class, and to call thex
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  // Operator Input
  public static BionicF310 driverGamepad;

  // Subsystems
  public static DriveTrainSubsystem drivetrainSubsystem;
  public static IntakeSubsystem intakeSubsystem;

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
    // Subsystems
    drivetrainSubsystem = new DriveTrainSubsystem();
    intakeSubsystem = new IntakeSubsystem();

    // Operator Input
    driverGamepad = new BionicF310(0, 0, 0.6);
    driverGamepad.buttonPressed(BionicF310.A, new Linefollow());
    driverGamepad.buttonPressed(BionicF310.X, new CargoIntakeIn());
    driverGamepad.buttonPressed(BionicF310.Y, new CargoIntakeOut());
    driverGamepad.buttonPressed(BionicF310.LB, new HatchPanelIntakeOpen());
    driverGamepad.buttonPressed(BionicF310.RB, new HatchPanelIntakeClose());
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for
   * items like diagnostics that you want ran during disabled, autonomous,
   * teleoperated and test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable chooser
   * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
   * remove all of the chooser code and uncomment the getString line to get the
   * auto name from the text box below the Gyro
   *
   * <p>
   * You can add additional auto modes by adding additional comparisons to the
   * switch structure below with additional strings. If using the SendableChooser
   * make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
