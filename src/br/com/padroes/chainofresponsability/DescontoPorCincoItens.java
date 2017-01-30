package br.com.padroes.chainofresponsability;

import br.com.padroes.strategy.Orcamento;

public class DescontoPorCincoItens implements Desconto {

  private Desconto proximo;

  @Override
  public Double aplicarDesconto(Orcamento orcamento) {
    if (orcamento.getItens().size() > 5) {
      return orcamento.getValor() * 0.07;
    }
    return this.proximo.aplicarDesconto(orcamento);
  }

  @Override
  public void setProximo(Desconto desconto) {
    this.proximo = desconto;
  }

}