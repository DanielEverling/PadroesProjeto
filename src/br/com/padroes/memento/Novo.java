package br.com.padroes.memento;

public class Novo implements TipoContrato {

  @Override
  public void avancar(Contrato contrato) {
    contrato.tipoContrato = new EmAndamento();
  }

  @Override
  public String getDescricao() {
    return getClass().getSimpleName();
  }
  
}
