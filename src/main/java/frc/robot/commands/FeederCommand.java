package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.Command;







public class FeederCommand extends Command {
 
  Intake m_feeder;
  double f_speed;

  public FeederCommand(Intake feeder, double dspeed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_feeder = feeder;
    this.f_speed = dspeed;
    addRequirements(m_feeder);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_feeder.setIntake(f_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_feeder.mIntakeMotor.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}