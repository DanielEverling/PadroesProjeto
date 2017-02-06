package br.com.padroes.strategy;

public class Finalizado implements DescontoExtraOrcamento {

  @Override
  public void aplicarDescontoExtra(Orcamento orcamento) {
    throw new RuntimeException("Orcamento finalizado não podem ter desconto extra!!");
  }

  @Override
  public void aprovar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento ja esta finalizado");
  }

  @Override
  public void reprovar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento ja esta finalizado");
  }

  @Override
  public void finalizar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento ja esta finalizado");
  }

}
