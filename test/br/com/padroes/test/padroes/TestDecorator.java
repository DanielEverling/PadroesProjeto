package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.decorator.CalculadoraImpostoDecorator;
import br.com.padroes.decorator.ISSDecorator;
import br.com.padroes.decorator.IcmsDecorator;
import br.com.padroes.strategy.Orcamento;

public class TestDecorator {

  @Test
  public void testaCalculadoraImpostoISSDecorator() {
    CalculadoraImpostoDecorator calculaImpostoIss = new CalculadoraImpostoDecorator(new ISSDecorator(new IcmsDecorator()));
    Double impostoIss = calculaImpostoIss.calcular(new Orcamento(500.00));
    Assert.assertEquals(new Double(80), impostoIss);
  }

  @Test
  public void testaCalculadoraImpostoIcmsDecorator() {
    CalculadoraImpostoDecorator calculaImpostoIcms = new CalculadoraImpostoDecorator(new IcmsDecorator(new ISSDecorator()));
    Double impostoIcms = calculaImpostoIcms.calcular(new Orcamento(500.00));
    Assert.assertEquals(new Double(80), impostoIcms);
  }

}