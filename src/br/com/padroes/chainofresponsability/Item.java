package br.com.padroes.chainofresponsability;

public class Item {

  private String descricao;

  private Double valor;

  public Item(String descricao, Double valor) {
    this.descricao = descricao;
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public Double getValor() {
    return valor;
  }

}
