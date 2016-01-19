package org.usfirst.frc.team1360.robot.subsystems;

import org.usfirst.frc.team1360.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Talon left1 = new Talon(RobotMap.left1);
	Talon left2 = new Talon(RobotMap.left2);
	Talon right1 = new Talon(RobotMap.right1);
	Talon right2 = new Talon(RobotMap.right2);
	DoubleSolenoid sol1 = new DoubleSolenoid(1, 2);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double left, double right)
    {
    	left1.set(left);
    	left2.set(left);
    	right1.set(-right);
    	right2.set(-right);
    }
    
    public void arcadeDrive(double speed, double turn)
    {
    	tankDrive((-speed)-turn, (-speed)+turn);
    }
    
}

