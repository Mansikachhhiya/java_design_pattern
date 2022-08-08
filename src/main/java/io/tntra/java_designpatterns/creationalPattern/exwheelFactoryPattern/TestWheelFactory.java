package io.tntra.java_designpatterns.creationalPattern.exwheelFactoryPattern;

public class TestWheelFactory {
  public static void main(String[] args){
     wheel wheel = WheelFactory.getWheel("carWheel",15,78.78f);
     wheel wheel1 = WheelFactory.getWheel("BikeWheel",19, 19.34f);
     System.out.println("car info :\n"+wheel);
     wheel.toString();
     System.out.println("bike info:\n"+wheel1);
     wheel1.toString();
  }
}
