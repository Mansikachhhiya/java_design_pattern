package io.tntra.java_designpatterns.creationalPattern.insurencex;

public interface VehicleInterface{
  void getInsurance();
}


class VehicleInterfaceShortTerm implements VehicleInterface {

  @Override
  public void getInsurance() {
    System.out.println("vehicle short term insurance.");
  }
}
class VehicleInterfaceLongTerm implements VehicleInterface {

  @Override
  public void getInsurance() {
    System.out.println("vehicle Long term insurance.");
  }
}