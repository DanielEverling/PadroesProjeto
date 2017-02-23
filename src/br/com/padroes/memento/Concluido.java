package br.com.padroes.memento;

public class Concluido implements TipoContrato {

  @Override
  public void avancar(Contrato contrato) {
    throw new RuntimeException("Contratos concluidos n�o podem ser modificados.");
  }

  @Override
  public String getDescricao() {
    return getClass().getSimpleName();
  }

}