package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.command.FilaComandosProcessamentoPedido;
import br.com.padroes.command.FinalizarPedido;
import br.com.padroes.command.PagarPedido;
import br.com.padroes.command.Pedido;
import br.com.padroes.command.Pedido.Status;

public class TestCommand {

  @Test
  public void deveTestarImplementacaoCommand() {
    Pedido pedidoDoJose = new Pedido("JOSE", 500);
    Pedido pedidoDoJoao = new Pedido("JOAO", 700);
    Pedido pedidoDoRibamar = new Pedido("RIBAMAR", 900);
    
    Assert.assertEquals(Status.NOVO, pedidoDoJose.getStatus());
    Assert.assertEquals(Status.NOVO, pedidoDoJoao.getStatus());
    Assert.assertEquals(Status.NOVO, pedidoDoRibamar.getStatus());
    
    FilaComandosProcessamentoPedido comandosSeremExecutados = new FilaComandosProcessamentoPedido();
    comandosSeremExecutados.adicionarComando(new PagarPedido(pedidoDoJose));
    comandosSeremExecutados.adicionarComando(new PagarPedido(pedidoDoJoao));
    comandosSeremExecutados.adicionarComando(new PagarPedido(pedidoDoRibamar));
    
    comandosSeremExecutados.adicionarComando(new FinalizarPedido(pedidoDoRibamar));
    comandosSeremExecutados.processarComandos();
    
    Assert.assertEquals(Status.PAGO, pedidoDoJose.getStatus());
    Assert.assertEquals(Status.PAGO, pedidoDoJoao.getStatus());
    Assert.assertEquals(Status.FINALIZADO, pedidoDoRibamar.getStatus());
    
  }

}

