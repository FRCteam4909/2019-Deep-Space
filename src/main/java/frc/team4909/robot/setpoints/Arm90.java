package frc.team4909.robot.setpoints;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4909.robot.Robot;
import frc.team4909.robot.RobotConstants;


public class Arm90 extends Command {
    public Arm90(){
        requires(Robot.elevatorArmSubsystem);
    }

    @Override
    protected void initialize() {
        Robot.elevatorArmSubsystem.setPosition(RobotConstants.elevatorArmSetpointHatch);
        setTimeout(1.5);
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
    @Override
    protected void end() {
        Robot.elevatorArmSubsystem.holdingPosition = Robot.elevatorArmSubsystem.getPosition();

    }

}