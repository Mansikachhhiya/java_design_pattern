package io.tntra.java_designpatterns.creationalPattern.insurencex;

public interface insurance {
 VehicleInterface getVehicleIns(InsuranceTerm insuranceTerm);
 HealthInterface getHealthIns(InsuranceTerm insuranceTerm);
}

class VehicleIns implements insurance{

 @Override
 public VehicleInterface getVehicleIns(InsuranceTerm insuranceTerm) {
  switch (insuranceTerm){
   case LONGTERM:
    return new VehicleInterfaceLongTerm();
   case SHORTTERM:
    return new VehicleInterfaceShortTerm();
  }
  return null;
 }

 @Override
 public HealthInterface getHealthIns(InsuranceTerm insuranceTerm) {
  return null;
 }
}
class HealthIns implements insurance{

 @Override
 public VehicleInterface getVehicleIns(InsuranceTerm insuranceTerm) {
  return null;
 }

 @Override
 public HealthInterface getHealthIns(InsuranceTerm insuranceTerm) {
  switch (insuranceTerm){
   case LONGTERM:
    return new HealthInterfaceLongTerm();
   case SHORTTERM:
    return new HealthInterfaceShortTerm();
  }
  return null;
 }
}


