package io.tntra.java_designpatterns.creationalPattern.FactoryPattern;

public class AbstractDocuFectory {
  protected static documents CreateDoc(String varient){
     switch (varient){
       case "Zip":
         return new Zip();
       case "rar":
          return new rar();
       case "jar":
         return new jar();
     }
     return null;
  }
  public static documents callCreate(String varient){
    return CreateDoc(varient);
  }
}
