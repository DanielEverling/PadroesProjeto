package br.com.padroes.chainofresponsability;

import br.com.padroes.strategy.Orcamento;

public class SemDesconto implements Desconto {

  @Override
  public Double aplicarDesconto(Orcamento orcamento) {
    return 0.0;
  }

  @Override
  public void setProximo(Desconto proximo) {
    
  }

}