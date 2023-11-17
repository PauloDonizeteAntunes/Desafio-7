// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  
  public static final String IrPraFrente = null;
  private WPI_TalonSRX leftMaster = new WPI_TalonSRX(1);
  private VictorSPX leftSlave = new VictorSPX(2);
  private WPI_TalonSRX rightMaster = new WPI_TalonSRX(3);
  private VictorSPX rightSlave = new VictorSPX(4);


  public void vel(double velocidade) {
    leftMaster.set(velocidade);
    rightMaster.set(velocidade);
   
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightMaster);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
