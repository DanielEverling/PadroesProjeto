package br.com.padroes.flyweight;

public class Fa implements Nota {

  protected Fa() {}
  
  @Override
  public String simbolo() {
    return "F";
  }

}