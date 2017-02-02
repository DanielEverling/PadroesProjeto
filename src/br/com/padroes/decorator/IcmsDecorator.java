package br.com.padroes.decorator;

import br.com.padroes.strategy.Orcamento;

public class IcmsDecorator extends ImpostoDecorator {

  public IcmsDecorator() {
  }

  public IcmsDecorator(ImpostoDecorator imposto) {
    super(imposto);
  }

  @Override
  public Double calcular(Orcamento orcamento) {
    return orcamento.getValor() * 0.1 + calcularProximoImposto(orcamento);
  }

}
