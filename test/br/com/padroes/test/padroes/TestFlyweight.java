package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.padroes.flyweight.Do;
import br.com.padroes.flyweight.Fa;
import br.com.padroes.flyweight.FabricaNotasMusicais;
import br.com.padroes.flyweight.La;
import br.com.padroes.flyweight.Mi;
import br.com.padroes.flyweight.Re;
import br.com.padroes.flyweight.Si;
import br.com.padroes.flyweight.Sol;

public class TestFlyweight {

  private FabricaNotasMusicais fabricaNota;
  
  @Before
  public void init() {
    fabricaNota = new FabricaNotasMusicais();
  }
  
  @Test
  public void testMesmaInstanciaDeDo() {
    Do notaPrimaria = (Do) fabricaNota.getNotaPorNome(Do.class.getSimpleName());
    Do notaSegundarra = (Do) fabricaNota.getNotaPorNome(Do.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }

  @Test
  public void testMesmaInstanciaDeRe() {
    Re notaPrimaria = (Re) fabricaNota.getNotaPorNome(Re.class.getSimpleName());
    Re notaSegundarra = (Re) fabricaNota.getNotaPorNome(Re.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }
  
  @Test
  public void testMesmaInstanciaDeMi() {
    Mi notaPrimaria = (Mi) fabricaNota.getNotaPorNome(Mi.class.getSimpleName());
    Mi notaSegundarra = (Mi) fabricaNota.getNotaPorNome(Mi.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }

  @Test
  public void testMesmaInstanciaDeFa() {
    Fa notaPrimaria = (Fa) fabricaNota.getNotaPorNome(Fa.class.getSimpleName());
    Fa notaSegundarra = (Fa) fabricaNota.getNotaPorNome(Fa.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }
  
  @Test
  public void testMesmaInstanciaDeSol() {
    Sol notaPrimaria = (Sol) fabricaNota.getNotaPorNome(Sol.class.getSimpleName());
    Sol notaSegundarra = (Sol) fabricaNota.getNotaPorNome(Sol.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }
  
  @Test
  public void testMesmaInstanciaDeLa() {
    La notaPrimaria = (La) fabricaNota.getNotaPorNome(La.class.getSimpleName());
    La notaSegundarra = (La) fabricaNota.getNotaPorNome(La.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }
  
  @Test
  public void testMesmaInstanciaDeSi() {
    Si notaPrimaria = (Si) fabricaNota.getNotaPorNome(Si.class.getSimpleName());
    Si notaSegundarra = (Si) fabricaNota.getNotaPorNome(Si.class.getSimpleName());
    Assert.assertEquals(notaPrimaria, notaSegundarra);
  }
  
}
