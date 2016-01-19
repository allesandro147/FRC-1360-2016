package org.usfirst.frc.team1360.robot.commands;

import org.usfirst.frc.team1360.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousDriveCommand extends Command {
    public double turn;
    public double speed;
    public float time;
    public AutonomousDriveCommand(double turn, double speed, float time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	requires(Robot.driveSubsystem);
	this.turn = turn;
	this.speed = speed;
	this.time = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
	Robot.driveSubsystem.arcadeDrive(speed, turn);
	Timer.delay(time);
	
	/**
	 * Does everything thats already started before the timer started, doesn't start anything else in that thread until timer ends
	 */
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
