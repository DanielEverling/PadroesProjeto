package br.com.padroes.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.padroes.chainofresponsability.Item;

public class Orcamento {

  protected Double valor;

  private final List<Item> itens;

  protected DescontoExtraOrcamento estadoOrcamento;

  public Orcamento(Double valor) {
    this.valor = valor;
    this.itens = new ArrayList<>();
    this.estadoOrcamento = new EmAprovacao();
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

  public void aplicarDescontoExtra() {
    estadoOrcamento.aplicarDescontoExtra(this);
  }

  public void aprovar() {
    estadoOrcamento.aprovar(this);
  }

  public void reprovar() {
    estadoOrcamento.reprovar(this);
  }

  public void finalizar() {
    estadoOrcamento.finalizar(this);
  }
}