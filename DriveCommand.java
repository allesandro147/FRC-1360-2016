package org.usfirst.frc.team1360.robot.commands;

import org.usfirst.frc.team1360.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1360.robot.OI;
import org.usfirst.frc.team1360.robot.Robot;
import org.usfirst.frc.team1360.robot.*;
import org.usfirst.frc.team1360.robot.OI;

public class DriveCommand extends Command {
    public DriveCommand() {
    	requires(Robot.driveSubsystem);
    }
    protected void initialize() {
    }
	protected void execute() {
		Robot.driveSubsystem.arcadeDrive( -OI.getLeftTrigger(),OI.getL());
		Robot.driveSubsystem.arcadeDrive( OI.getRightTrigger(),OI.getL());
		
	}
    protected boolean isFinished() {
    	return false;
    }
	protected void end() {
	}
	protected void interrupted() {
		
	}
}

