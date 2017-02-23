package br.com.padroes.memento;

public interface TipoContrato {

  void avancar(Contrato contrato);
  
  String getDescricao();
  
}