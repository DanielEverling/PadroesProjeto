package br.com.padroes.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.padroes.chainofresponsability.Item;

public class Orcamento {

  private Double valor;

  private final List<Item> itens;

  public Orcamento(Double valor) {
    this.valor = valor;
    this.itens = new ArrayList<>();
  }

  public Double getValor() {
    return valor;
  }

  public void adicionarItem(Item item) {
    this.itens.add(item);
  }

  public List<Item> getItens() {
    return Collections.unmodifiableList(itens);
  }

}