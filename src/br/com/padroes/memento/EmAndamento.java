package br.com.padroes.memento;

public class EmAndamento implements TipoContrato {

  @Override
  public void avancar(Contrato contrato) {
    contrato.tipoContrato = new Concluido();
  }

  @Override
  public String getDescricao() {
    return getClass().getSimpleName();
  }
  
}
