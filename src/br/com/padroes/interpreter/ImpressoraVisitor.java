package br.com.padroes.interpreter;

public class ImpressoraVisitor {

  public String visitaSoma(Soma soma) {
    StringBuilder impressa = new StringBuilder();
    impressa.append(" ( ");
    impressa.append(soma.getEsquerda().aceitar(this));
    impressa.append(" + ");
    impressa.append(soma.getDireita().aceitar(this));
    impressa.append(" ) ");
    return impressa.toString();
  }

  public String visitaSubstracao(Subtracao subtracao) {
    StringBuilder impressa = new StringBuilder();
    impressa.append(" ( ");
    impressa.append(subtracao.getEsquerda().aceitar(this));
    impressa.append(" - ");
    impressa.append(subtracao.getDireita().aceitar(this));
    impressa.append(" ) ");
    return impressa.toString();
  }

  public String visitaNumero(Numero numero) {
    return "" + numero.avaliar();
  }

}
