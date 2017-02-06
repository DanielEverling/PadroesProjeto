package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.strategy.Orcamento;

public class TestState {

  @Test
  public void testAplicacaoDescontoConformeEstadoAprovado() {
    Orcamento reforma = new Orcamento(500.00);
    Assert.assertEquals(new Double(500.00), reforma.getValor());
    reforma.aplicarDescontoExtra();
    reforma.aprovar();
    Assert.assertEquals(new Double(475.00), reforma.getValor());
  }

  @Test
  public void testAplicacaoDescontoConformeEstadoReprovado() {
    Orcamento reforma = new Orcamento(500.00);
    Assert.assertEquals(new Double(500.00), reforma.getValor());
    reforma.aplicarDescontoExtra();
    reforma.reprovar();
    Assert.assertEquals(new Double(475.00), reforma.getValor());
  }

  @Test(expected = RuntimeException.class)
  public void testMudancaDeEstadoReprovadoParaAprovado() {
    Orcamento reforma = new Orcamento(500.00);
    reforma.reprovar();
    reforma.aprovar();
  }

  @Test
  public void testAplicacaoDescontoConformeEstadoFinalizado() {
    Orcamento reforma = new Orcamento(500.00);
    Assert.assertEquals(new Double(500.00), reforma.getValor());
    reforma.aplicarDescontoExtra();
    reforma.aprovar();
    Assert.assertEquals(new Double(475.00), reforma.getValor());
    reforma.aplicarDescontoExtra();
    reforma.finalizar();
    Assert.assertEquals(new Double(465.50), reforma.getValor());
  }

  @Test(expected = RuntimeException.class)
  public void testMudancaDeEstadoFinalizadoParaAprovado() {
    Orcamento reforma = new Orcamento(500.00);
    reforma.finalizar();
    reforma.aprovar();
  }

  @Test(expected = RuntimeException.class)
  public void testMudancaDeEstadoFinalizadoParaReprovado() {
    Orcamento reforma = new Orcamento(500.00);
    reforma.finalizar();
    reforma.reprovar();
  }

  @Test(expected = RuntimeException.class)
  public void testMudancaDeEstadoFinalizadoParaFinalizado() {
    Orcamento reforma = new Orcamento(500.00);
    reforma.finalizar();
    reforma.finalizar();
  }

}
