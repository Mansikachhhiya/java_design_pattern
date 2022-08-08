package io.tntra.java_designpatterns.creationalPattern.insurencex;

public class mainInsurance {
  public static void main(String[] args) {
    insurance insurance = InsuranceFectory.getInsByType(InsuranceType.HEALTH);
    HealthInterface healthInterface= insurance.getHealthIns(InsuranceTerm.LONGTERM);
    healthInterface.getInsurance();

  }
}
