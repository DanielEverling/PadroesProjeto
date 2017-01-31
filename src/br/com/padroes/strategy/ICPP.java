package br.com.padroes.strategy;

import br.com.padroes.templatemethod.TemplateDeImpostoCondicional;

public class ICPP extends TemplateDeImpostoCondicional {

  @Override
  protected Double minimaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.05;
  }

  @Override
  protected Double maximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.1;
  }

  @Override
  protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() > 500;
  }

}
