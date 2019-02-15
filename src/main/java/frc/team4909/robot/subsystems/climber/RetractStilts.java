package frc.team4909.robot.subsystems.climber;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4909.robot.Robot;
import frc.team4909.robot.RobotConstants;

public class RetractStilts extends Command {
    public void RetractStilts() {
        requires(Robot.climberSubsystem);
    }

    protected void execute() {
        Robot.climberSubsystem.retractStilts();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}