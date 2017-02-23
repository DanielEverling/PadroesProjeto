package br.com.padroes.memento;

import java.util.Calendar;

public class Contrato {

  private String cliente;

  private Calendar dataCriacao;

  protected TipoContrato tipoContrato;

  private HistoricoContrato historico;

  public Contrato(String cliente) {
    this.cliente = cliente;
    this.dataCriacao = Calendar.getInstance();
    this.tipoContrato = new Novo();
    this.historico = new HistoricoContrato();
    salvarEstado();
  }

  protected Contrato(String cliente, Calendar dataCriacao, TipoContrato tipoContrato) {
    this.cliente = cliente;
    this.dataCriacao = dataCriacao;
    this.tipoContrato = tipoContrato;
  }

  public String getCliente() {
    return cliente;
  }

  public Calendar getDataCriacao() {
    return dataCriacao;
  }

  public TipoContrato getTipoContrato() {
    return tipoContrato;
  }

  public void avancar() {
    tipoContrato.avancar(this);
    salvarEstado();
  }

  public Contrato estadoAnterior() {
    return historico.estadoAnterior();
  }

  private void salvarEstado() {
    historico.adicionarEstado(new Contrato(this.cliente, this.dataCriacao, this.tipoContrato));
  }

}
