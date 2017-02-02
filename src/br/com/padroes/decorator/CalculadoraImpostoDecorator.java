package br.com.padroes.decorator;

import br.com.padroes.strategy.Orcamento;

public class CalculadoraImpostoDecorator {

  private ImpostoDecorator imposto;
  
  public CalculadoraImpostoDecorator(ImpostoDecorator imposto) {
    this.imposto = imposto;
  }

  public Double calcular(Orcamento orcamento) {
    return imposto.calcular(orcamento);
  }
  
}
