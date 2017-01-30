package br.com.padroes.chainofresponsability;

import br.com.padroes.strategy.Orcamento;

public class DescontoOrcamentoMaiorQuinhentosReais implements Desconto {

  private Desconto proximo;

  @Override
  public Double aplicarDesconto(Orcamento orcamento) {
    if (orcamento.getValor() > 500) {
      return orcamento.getValor() * 0.1;
    }
    return this.proximo.aplicarDesconto(orcamento);
  }

  @Override
  public void setProximo(Desconto desconto) {
    this.proximo = desconto;
  }

}