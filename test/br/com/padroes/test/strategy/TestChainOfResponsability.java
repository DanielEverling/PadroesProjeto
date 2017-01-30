package br.com.padroes.test.strategy;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.padroes.chainofresponsability.Desconto;
import br.com.padroes.chainofresponsability.DescontoOrcamentoMaiorQuinhentosReais;
import br.com.padroes.chainofresponsability.DescontoPorCincoItens;
import br.com.padroes.chainofresponsability.Item;
import br.com.padroes.chainofresponsability.SemDesconto;
import br.com.padroes.strategy.Orcamento;

public class TestChainOfResponsability {

  private Desconto descontoOrcamentoMaiorQuinhentosReais;
  private Desconto descontoCincoItens;
  private Desconto semDesconto;
  @Before
  public void init() {
    descontoOrcamentoMaiorQuinhentosReais = new DescontoOrcamentoMaiorQuinhentosReais();
    descontoCincoItens = new DescontoPorCincoItens();
    semDesconto = new SemDesconto();
    
    descontoOrcamentoMaiorQuinhentosReais.setProximo(descontoCincoItens);
    descontoCincoItens.setProximo(semDesconto);
  }
  
  @Test
  public void testaAplicacaoDescontoMaisQuinentosReais() {
      Orcamento orcamento = new Orcamento(600.00);
      Double desconto = descontoOrcamentoMaiorQuinhentosReais.aplicarDesconto(orcamento);
      Assert.assertEquals(new Double(60), desconto);
  }

  @Test
  public void testaSemDescontoPorQuinhentosReais() {
      Orcamento orcamento = new Orcamento(500.00);
      Double desconto = descontoOrcamentoMaiorQuinhentosReais.aplicarDesconto(orcamento);
      Assert.assertEquals(new Double(0), desconto);
  }
  
  @Test
  public void testaAplicacaoDescontoMaisCincoItens() {
      Orcamento orcamento = new Orcamento(500.00);
      orcamento.adicionarItem(new Item("ITEM 01", 1.00));
      orcamento.adicionarItem(new Item("ITEM 02", 2.00));
      orcamento.adicionarItem(new Item("ITEM 03", 3.00));
      orcamento.adicionarItem(new Item("ITEM 04", 4.00));
      orcamento.adicionarItem(new Item("ITEM 05", 5.00));
      orcamento.adicionarItem(new Item("ITEM 06", 6.00));
      Double desconto = descontoOrcamentoMaiorQuinhentosReais.aplicarDesconto(orcamento);
      Assert.assertEquals(new Double(35), desconto);
  }
  
  @Test
  public void testaSemDescontoMenosCincoItens() {
      Orcamento orcamento = new Orcamento(500.00);
      orcamento.adicionarItem(new Item("ITEM 01", 1.00));
      orcamento.adicionarItem(new Item("ITEM 02", 2.00));
      orcamento.adicionarItem(new Item("ITEM 03", 3.00));
      orcamento.adicionarItem(new Item("ITEM 04", 4.00));
      Double desconto = descontoOrcamentoMaiorQuinhentosReais.aplicarDesconto(orcamento);
      Assert.assertEquals(new Double(0), desconto);
  }
  
}