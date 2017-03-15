package br.com.padroes.bridge;

import java.net.URL;

public class GoogleMaps implements Mapa {

  @Override
  public URL mapa(String rua) {
    try {
      return  new URL("https://maps.google.com.br/maps?q=" + rua);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
