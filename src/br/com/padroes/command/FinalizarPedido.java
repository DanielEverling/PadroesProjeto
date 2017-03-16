package br.com.padroes.command;

public class FinalizarPedido implements ComandosProcessamentoPedido {

  private Pedido pedido;

  public FinalizarPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public void executar() {
    this.pedido.finalizar();
  }

}
