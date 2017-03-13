package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.interpreter.Expressao;
import br.com.padroes.interpreter.Numero;
import br.com.padroes.interpreter.Soma;
import br.com.padroes.interpreter.Subtracao;

public class TestInterpreter {

  @Test
  public void deveTestarInterpreter() {
    Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
    Expressao direita = new Soma(new Numero(2), new Numero(10));
    Expressao resultado = new Soma(esquerda, direita);
    Assert.assertEquals(17, resultado.avaliar());
  }

}
