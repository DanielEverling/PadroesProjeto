package br.com.padroes.test.padroes;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.bridge.GoogleMaps;
import br.com.padroes.bridge.Mapa;

public class TestBrigde {

  @Test 
  public void deveTestarUrl() {
    Mapa googleMaps = new GoogleMaps();
    Assert.assertNotNull(googleMaps);
  }
  
}