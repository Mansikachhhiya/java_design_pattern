package io.tntra.java_designpatterns.creationalPattern.exwheelFactoryPattern;

public abstract class wheelAbstrect implements wheel{
private float diameter;
private float weight;

  public wheelAbstrect(float diameter, float weight) {
    this.diameter = diameter;
    this.weight = weight;
  }

  @Override
  public float getDiameter() {
    return diameter;
  }

  public void setDiameter(float diameter) {
    this.diameter = diameter;
  }

  @Override
  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }
  @Override
  public String toString(){
    return "Diameter= "+ String.valueOf(this.getDiameter())+"\nWeight= "+String.valueOf(this.getWeight());
  }
}
