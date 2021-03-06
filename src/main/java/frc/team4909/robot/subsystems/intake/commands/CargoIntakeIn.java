package frc.team4909.robot.subsystems.intake.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4909.robot.Robot;
import frc.team4909.robot.RobotConstants;

public class CargoIntakeIn extends Command {
    public CargoIntakeIn() {
        requires(Robot.intakeSubsystem);
    }

    @Override
    protected void initialize() {
        Robot.intakeSubsystem.setCargoIntakeSpeed(RobotConstants.cargoIntakeInSpeed);
    }

    @Override
    protected boolean isFinished() {
        return Robot.intakeSubsystem.hasCargo();
    }

}