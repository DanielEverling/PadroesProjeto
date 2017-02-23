package br.com.padroes.memento;

import java.util.ArrayList;
import java.util.List;

class HistoricoContrato {

  private List<Contrato> contratos;

  private int estadoAtual;

  protected HistoricoContrato() {
    contratos = new ArrayList<>();
  }

  public void adicionarEstado(Contrato contrato) {
    contratos.add(contrato);
    estadoAtual = (contratos.size() - 1);
  }

  public Contrato estadoAnterior() {
    Contrato anterior = contratos.get(estadoAtual - 1);
    estadoAtual--;
    return anterior;
  }

}