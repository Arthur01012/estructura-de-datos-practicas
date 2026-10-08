package com.uthh.edd.unidad1.tda;

public class tdaHora {

    private int hora;
    private int minuto;
    private int segundo;

    private final int MINUTOS_HORA = 60;
    private final int SEGUNDOS_MINUTO = 60;
    private final int HORA_DIA = 24;

    public tdaHora() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public tdaHora(int hora, int minuto, int segundo) {
        hora = (hora >= 0 && hora <= HORA_DIA) ? hora : 0;
        minuto = (minuto >= 0 && minuto < MINUTOS_HORA) ? minuto : 0;
        segundo = (segundo >= 0 && segundo < SEGUNDOS_MINUTO) ? segundo : 0;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
