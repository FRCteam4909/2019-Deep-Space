package frc.team4909.robot.subsystems.intake;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.team4909.robot.Robot;

public class CargoIntakeOut extends InstantCommand {

    public void CargoIntakeOut() {
        requires(Robot.intakeSubsystem);
    }

    protected void initialize() {
        Robot.intakeSubsystem.setCargoIntakeSpeed(-1.0);
    }

}