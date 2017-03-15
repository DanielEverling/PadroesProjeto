package br.com.padroes.test.padroes;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.adapter.Relogio;
import br.com.padroes.adapter.RelogioComCalendar;

public class TestAdapter {

  @Test 
  public void deveTestarInterfaceRelogioRetornandoUmCalendar() {
    Relogio relogio = new RelogioComCalendar();
    Calendar hoje = relogio.hoje();
    Assert.assertNotNull(hoje);
  }
  
}