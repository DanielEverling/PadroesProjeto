package br.com.padroes.command;

import java.util.LinkedList;
import java.util.List;

public class FilaComandosProcessamentoPedido {

  List<ComandosProcessamentoPedido> comandos;

  public FilaComandosProcessamentoPedido() {
    this.comandos = new LinkedList<>();
  }

  public void adicionarComando(ComandosProcessamentoPedido comandos) {
    this.comandos.add(comandos);
  }

  public void processarComandos() {
    for (ComandosProcessamentoPedido comando : comandos) {
      comando.executar();
    }
  }
  
}