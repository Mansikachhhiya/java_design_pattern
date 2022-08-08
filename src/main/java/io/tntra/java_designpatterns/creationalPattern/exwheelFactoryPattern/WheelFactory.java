package io.tntra.java_designpatterns.creationalPattern.exwheelFactoryPattern;

public class WheelFactory {
  public static wheel getWheel(String typeOfWheel, float diameter, float weight) {
    switch (typeOfWheel) {
      case "carWheel":
        return new carWheel(diameter, weight);
      case "BikeWheel":
        return new BikeWheel(diameter, weight);
    }
    return null;
  }
}