package br.com.padroes.decorator;

import br.com.padroes.strategy.Orcamento;

public abstract class ImpostoDecorator {

  protected ImpostoDecorator outroImposto;

  public ImpostoDecorator() {
  }

  public ImpostoDecorator(ImpostoDecorator outroImposto) {
    this.outroImposto = outroImposto;
  }

  public Double calcularProximoImposto(Orcamento orcamento) {
    if (outroImposto == null) {
      return 0.0;
    }
    return outroImposto.calcular(orcamento);
  }

  protected abstract Double calcular(Orcamento orcamento);
  
}