package io.tntra.java_designpatterns.creationalPattern.insurencex;

public interface HealthInterface{

  void getInsurance();
}

class HealthInterfaceShortTerm implements HealthInterface {

  @Override
  public void getInsurance() {
    System.out.println("Health short term insurance.");
  }
}
class HealthInterfaceLongTerm implements HealthInterface {

  @Override
  public void getInsurance() {
    System.out.println("Health Long term insurance.");
  }
}
