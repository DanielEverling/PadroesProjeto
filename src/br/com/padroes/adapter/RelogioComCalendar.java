package br.com.padroes.adapter;

import java.util.Calendar;

public class RelogioComCalendar implements Relogio {

  @Override
  public Calendar hoje() {
    return Calendar.getInstance();
  }

}