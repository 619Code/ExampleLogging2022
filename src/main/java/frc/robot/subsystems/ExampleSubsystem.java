// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import io.github.oblarg.oblog.Loggable;
import io.github.oblarg.oblog.annotations.Log;

public class ExampleSubsystem extends SubsystemBase implements Loggable {

  @Log
  private int output;
  private Timer timer;
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    timer = new Timer();
    timer.start();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    if (timer.hasElapsed(1))
    {
      this.output = this.output + 1;
      this.timer.reset();
      this.timer.start();
      System.out.println(this.output);
    }
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
    // This method will be called once per scheduler run
    if (timer.hasElapsed(1))
    {
      this.output = this.output + 1;
      this.timer.reset();
      this.timer.start();
      System.out.println(this.output);
    }
  }
}
