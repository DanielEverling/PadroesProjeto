package br.com.padroes.strategy;

import br.com.padroes.chainofresponsability.Item;
import br.com.padroes.templatemethod.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional {

  @Override
  protected Double minimaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.06;
  }

  @Override
  protected Double maximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.10;
  }

  @Override
  protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() > 500 && temItemComValorMaiorQueCemReais(orcamento);
  }

  private boolean temItemComValorMaiorQueCemReais(Orcamento orcamento) {
    for (Item item : orcamento.getItens()) {
      if (item.getValor() > 100) {
        return true;
      }
    }
    return false;
  }

}
