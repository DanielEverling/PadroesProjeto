package br.com.padroes.strategy;

public interface DescontoExtraOrcamento {

  public void aplicarDescontoExtra(Orcamento orcamento);
  
  public void aprovar(Orcamento orcamento);
  
  public void reprovar(Orcamento orcamento);
  
  public void finalizar(Orcamento orcamento);
  
}