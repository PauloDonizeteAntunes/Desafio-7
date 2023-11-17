// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class IrPraFrente extends CommandBase {
  
  private final DriveTrain drivetrain;
  private final Timer timer = new Timer();
  private final double duration = 3;


  public IrPraFrente(DriveTrain driveTrain) {
    addRequirements(driveTrain);
    this.drivetrain = driveTrain;
  }

  @Override
  public void initialize() {
    timer.restart();
  }

  @Override
  public void execute() {
   drivetrain.vel(1.0);
   timer.start();
  }


  @Override
  public void end(boolean interrupted) {
    timer.stop();
  }

  @Override
  public boolean isFinished() {
    return timer.get() >= this.duration;
  }
}
