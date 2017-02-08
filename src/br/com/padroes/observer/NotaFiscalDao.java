package br.com.padroes.observer;

public class NotaFiscalDao implements AcaoAposCriarNotaFiscal {

  private AlvoAcaoRegistroNota alvoAcaoRegistroNota;

  public NotaFiscalDao(AlvoAcaoRegistroNota alvoAcaoRegistroNota) {
    this.alvoAcaoRegistroNota = alvoAcaoRegistroNota;
  }

  @Override
  public void executar(NotaFiscal notaFiscal) {
    System.out.println("Salvando nota no banco....");
  }

  @Override
  public void registrarAcao() {
    this.alvoAcaoRegistroNota.adicionarAcoes(this);
  }

}
