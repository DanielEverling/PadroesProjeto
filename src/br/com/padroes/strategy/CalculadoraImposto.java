package br.com.padroes.strategy;

public class CalculadoraImposto {

  private Imposto imposto;

  public CalculadoraImposto(Imposto imposto) {
    this.imposto = imposto;
  }

  public Double calcular(Orcamento orcamento) {
    return imposto.calcular(orcamento);
  }
  
  public void setImposto(Imposto imposto) {
    this.imposto = imposto;
  }
  
}
