package com.lct;
import javax.persistence.*;

@Entity
@DiscriminatorValue("regularstuff")
public class Regular_Stuff extends Stuff{

  @Column(name="salary")
  private float salary;

  @Column(name="bonus")
  private int bonus;

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }
}