package br.com.padroes.command;

public class Pedido {

  private String nome;

  private double valor;

  private Status status;

  public Pedido(String nome, double valor) {
    this.nome = nome;
    this.valor = valor;
    this.status = Status.NOVO;
  }

  public enum Status
  {
   PAGO,
   NOVO,
   FINALIZADO;
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }

  public Status getStatus() {
    return status;
  }

  public void pagar() {
    this.status = Status.PAGO;
  }

  public void finalizar() {
    this.status = Status.FINALIZADO;
  }

}