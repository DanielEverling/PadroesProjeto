package br.com.padroes.chainofresponsability;

import br.com.padroes.strategy.Orcamento;

public interface Desconto {

  Double aplicarDesconto(Orcamento orcamento);

  void setProximo(Desconto proximo);
  
}