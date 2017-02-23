package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.memento.Concluido;
import br.com.padroes.memento.Contrato;
import br.com.padroes.memento.EmAndamento;
import br.com.padroes.memento.Novo;

public class TestMemento {

  @Test
  public void deveTestarEstadoInicialDoContrato() {
    Contrato residencial = new Contrato("Celso Juares Roth");
    Assert.assertEquals(new Novo().getDescricao(), residencial.getTipoContrato().getDescricao());
  }

  @Test
  public void deveTestarAvancoDoEstadolDoContrato() {
    Contrato residencial = new Contrato("Celso Juares Roth");
    residencial.avancar();
    Assert.assertEquals(new EmAndamento().getDescricao(), residencial.getTipoContrato().getDescricao());
  }

  @Test
  public void deveSalvarEstadoAnteriorDoContratoAposAvanco() {
    Contrato residencial = new Contrato("Celso Juares Roth");
    Assert.assertEquals(new Novo().getDescricao(), residencial.getTipoContrato().getDescricao());
    residencial.avancar();
    Assert.assertEquals(new EmAndamento().getDescricao(), residencial.getTipoContrato().getDescricao());
    residencial.avancar();
    Assert.assertEquals(new Concluido().getDescricao(), residencial.getTipoContrato().getDescricao());
    
    Assert.assertEquals(new EmAndamento().getDescricao(), residencial.estadoAnterior().getTipoContrato().getDescricao());
    Assert.assertEquals(new Novo().getDescricao(), residencial.estadoAnterior().getTipoContrato().getDescricao());
  }

}