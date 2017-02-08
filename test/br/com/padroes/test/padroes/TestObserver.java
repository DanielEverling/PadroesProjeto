package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.observer.EnviaNotaPorEmail;
import br.com.padroes.observer.NotaFiscal;
import br.com.padroes.observer.NotaFiscal.NotaFiscalBuilder;
import br.com.padroes.observer.NotaFiscalDao;

public class TestObserver {

  @Test
  public void testaDesacoplamentoObserserNotaFiscal() {
    NotaFiscalBuilder builder = new NotaFiscalBuilder();
    builder.adicionarAcoes(new EnviaNotaPorEmail(builder));
    builder.adicionarAcoes(new NotaFiscalDao(builder));
    
    NotaFiscal notaFiscal = builder.comValorTotal(500.00)
                                   .doFornecedor("Fornecedor da Nota")
                                   .build();
    
    Assert.assertEquals(new Double(500), notaFiscal.getValorTotal());
  }


}