package io.tntra.java_designpatterns.creationalPattern.FactoryPattern;

public class documentClient {
  public static void main(String[] args){
    documents documents= AbstractDocuFectory.callCreate("Zip");
    documents.create();

  }
}
