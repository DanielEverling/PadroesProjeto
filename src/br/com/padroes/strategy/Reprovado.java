package br.com.padroes.strategy;

public class Reprovado implements DescontoExtraOrcamento {

  @Override
  public void aplicarDescontoExtra(Orcamento orcamento) {
    throw new RuntimeException("Orcamento reprovado não podem ter desconto extra!!");
  }

  @Override
  public void aprovar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento reprovado nao pode ser aprovado!");
  }

  @Override
  public void reprovar(Orcamento orcamento) {
    throw new RuntimeException("Orcamento ja esta reprovado!");    
  }

  @Override
  public void finalizar(Orcamento orcamento) {
    orcamento.estadoOrcamento = new Finalizado();
  }

}
