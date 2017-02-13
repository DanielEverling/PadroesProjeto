package br.com.padroes.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaNotasMusicais {

  Map<String, Nota> notasMusicais;

  public FabricaNotasMusicais() {
    notasMusicais = new HashMap<>();
    notasMusicais.put(Do.class.getSimpleName(), new Do());
    notasMusicais.put(Re.class.getSimpleName(), new Re());
    notasMusicais.put(Mi.class.getSimpleName(), new Mi());
    notasMusicais.put(Fa.class.getSimpleName(), new Fa());
    notasMusicais.put(Sol.class.getSimpleName(), new Sol());
    notasMusicais.put(La.class.getSimpleName(), new La());
    notasMusicais.put(Si.class.getSimpleName(), new Si());
  }

  public Nota getNotaPorNome(String nome) {
    return notasMusicais.get(nome);
  }

}
