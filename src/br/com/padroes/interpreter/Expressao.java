package br.com.padroes.interpreter;

public interface Expressao {

  int avaliar();

  String aceitar(ImpressoraVisitor impressora);

}
