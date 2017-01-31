package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.chainofresponsability.Item;
import br.com.padroes.strategy.CalculadoraImposto;
import br.com.padroes.strategy.ICPP;
import br.com.padroes.strategy.IKCV;
import br.com.padroes.strategy.Orcamento;

public class TestTemplateMethod {

  @Test
  public void testaCalculadoraImpostoICPPComValorQuinhentosReais() {
    CalculadoraImposto calculaImpostoIcms = new CalculadoraImposto(new ICPP());
    Double impostoIcms = calculaImpostoIcms.calcular(new Orcamento(500.00));
    Assert.assertEquals(new Double(25), impostoIcms);
  }

  @Test
  public void testaCalculadoraImpostoICPPComValorMaiorQueQuinhentosReais() {
    CalculadoraImposto calculaImpostoIcms = new CalculadoraImposto(new ICPP());
    Double impostoIcms = calculaImpostoIcms.calcular(new Orcamento(600.00));
    Assert.assertEquals(new Double(60), impostoIcms);
  }

  @Test
  public void testaCalculadoraImpostoIKCVSemItens() {
    CalculadoraImposto calculaImpostoIcms = new CalculadoraImposto(new IKCV());
    Double impostoIcms = calculaImpostoIcms.calcular(new Orcamento(500.00));
    Assert.assertEquals(new Double(30), impostoIcms);
  }

  @Test
  public void testaCalculadoraImpostoIKCVComItens() {
    CalculadoraImposto calculaImpostoIcms = new CalculadoraImposto(new IKCV());
    Orcamento orcamento = new Orcamento(600.00);
    orcamento.adicionarItem(new Item("ITEM 01", 125D));
    Double impostoIcms = calculaImpostoIcms.calcular(orcamento);
    Assert.assertEquals(new Double(60), impostoIcms);
  }

}