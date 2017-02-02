package br.com.padroes.decorator;

import br.com.padroes.strategy.Orcamento;

public class ISSDecorator extends ImpostoDecorator {

  public ISSDecorator() {
  }
  
  public ISSDecorator(ImpostoDecorator imposto) {
    super(imposto);
  }
  
  @Override
  public Double calcular(Orcamento orcamento) {
    return orcamento.getValor() * 0.06 + calcularProximoImposto(orcamento);
  }

}