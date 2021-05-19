// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Cannon extends SubsystemBase {
  private Relay m_relay;

  /** Creates a new Cannon. */
  public Cannon(Relay relay) {
    m_relay = relay;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void openValve() {
    m_relay.set(Value.kForward);
  }

  public void closeValve() {
    m_relay.set(Value.kReverse);
  }
}
