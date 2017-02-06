package br.com.padroes.strategy;

public class Aprovado implements DescontoExtraOrcamento {

  @Override
  public void aplicarDescontoExtra(Orcamento orcamento) {
    orcamento.valor -= orcamento.valor * 0.02;
  }

  @Override
  public void aprovar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento ja aprovado!");
  }

  @Override
  public void reprovar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento aprovado nao pode ser reprovado!");
  }

  @Override
  public void finalizar(Orcamento orcamento) {
    orcamento.estadoOrcamento = new Finalizado();
  }

}
