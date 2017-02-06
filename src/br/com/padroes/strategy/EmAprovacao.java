package br.com.padroes.strategy;

public class EmAprovacao implements DescontoExtraOrcamento {

  @Override
  public void aplicarDescontoExtra(Orcamento orcamento) {
    orcamento.valor -= orcamento.valor * 0.05;
  }

  @Override
  public void aprovar(Orcamento orcamento) {
    orcamento.estadoOrcamento = new Aprovado();
  }

  @Override
  public void reprovar(Orcamento orcamento) {
    orcamento.estadoOrcamento = new Reprovado();
  }

  @Override
  public void finalizar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento em aprovacao nao podem ir direto para finalizado!");
  }

}
