package br.com.padroes.test.padroes;



import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.strategy.CalculadoraImposto;
import br.com.padroes.strategy.ISS;
import br.com.padroes.strategy.Icms;
import br.com.padroes.strategy.Orcamento;

public class TestStrategy {

  @Test
  public void testaCalculadoraImposto() {
    CalculadoraImposto calculaImpostoIcms = new CalculadoraImposto(new Icms());
    Double impostoIcms = calculaImpostoIcms.calcular(new Orcamento(500.00));
    Assert.assertEquals(new Double(50), impostoIcms);
  
    CalculadoraImposto calculaImpostoISS = new CalculadoraImposto(new ISS());
    Double impostoISS = calculaImpostoISS.calcular(new Orcamento(500.00));
    Assert.assertEquals(new Double(30), impostoISS);
  }

}