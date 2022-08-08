package io.tntra.java_designpatterns.creationalPattern.insurencex;

public class InsuranceFectory {
  public static insurance getInsByType(InsuranceType insuranceType){
    switch (insuranceType){
      case HEALTH:
        return new HealthIns();
      case VEHICLE:
        return new VehicleIns();
    }
    return null;
  }

}
