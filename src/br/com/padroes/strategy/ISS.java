package br.com.padroes.strategy;

public class ISS implements Imposto {

  @Override
  public Double calcular(Orcamento orcamento) {
    return orcamento.getValor() * 0.06;
  }

}
