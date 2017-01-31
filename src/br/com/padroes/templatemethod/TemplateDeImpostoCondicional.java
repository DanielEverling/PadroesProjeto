package br.com.padroes.templatemethod;

import br.com.padroes.strategy.Imposto;
import br.com.padroes.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

  @Override
  public Double calcular(Orcamento orcamento) {
    if (deveUsarMaximaTaxacao(orcamento)) {
      return maximaTaxacao(orcamento);
    } else {
      return minimaTaxacao(orcamento);
    }
  }

  protected abstract Double minimaTaxacao(Orcamento orcamento);

  protected abstract Double maximaTaxacao(Orcamento orcamento);

  protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
