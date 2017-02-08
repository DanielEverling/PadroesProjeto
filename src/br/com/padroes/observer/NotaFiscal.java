package br.com.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

  private String fornecedor;

  private Double valorTotal;

  private NotaFiscal() {
  }

  public String getFornecedor() {
    return fornecedor;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  public static class NotaFiscalBuilder implements AlvoAcaoRegistroNota {

    private List<AcaoAposCriarNotaFiscal> acoesAposCriarNotaFiscal;

    private NotaFiscal notaFiscal;

    public NotaFiscalBuilder() {
      notaFiscal = new NotaFiscal();
      acoesAposCriarNotaFiscal = new ArrayList<>();
    }

    @Override
    public void adicionarAcoes(AcaoAposCriarNotaFiscal acoesAposCriarNotaFiscal) {
      this.acoesAposCriarNotaFiscal.add(acoesAposCriarNotaFiscal);
    }

    public NotaFiscalBuilder doFornecedor(String fornecedor) {
      notaFiscal.fornecedor = fornecedor;
      return this;
    }

    public NotaFiscalBuilder comValorTotal(Double valorTotal) {
      notaFiscal.valorTotal = valorTotal;
      return this;
    }

    public NotaFiscal build() {
      for (AcaoAposCriarNotaFiscal acao : acoesAposCriarNotaFiscal) {
        acao.executar(notaFiscal);
      }
      return notaFiscal;
    }

  }

}
