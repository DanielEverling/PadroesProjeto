package br.com.padroes.observer;

public class EnviaNotaPorEmail implements AcaoAposCriarNotaFiscal {

  private AlvoAcaoRegistroNota alvoAcaoRegistroNota;

  public EnviaNotaPorEmail(AlvoAcaoRegistroNota alvoAcaoRegistroNota) {
    this.alvoAcaoRegistroNota = alvoAcaoRegistroNota;
  }

  @Override
  public void executar(NotaFiscal notaFiscal) {
    System.out.println("Enviando nota fiscal por email...");
  }

  @Override
  public void registrarAcao() {
    this.alvoAcaoRegistroNota.adicionarAcoes(this);
  }

}
