package br.com.padroes.command;

public class PagarPedido implements ComandosProcessamentoPedido {

  private Pedido pedido;

  public PagarPedido(Pedido pedido) {
    this.pedido = pedido;
  }
  
  @Override
  public void executar() {
    this.pedido.pagar();
  }

}
