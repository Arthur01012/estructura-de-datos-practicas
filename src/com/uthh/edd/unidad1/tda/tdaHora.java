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
        this.hora = (hora >= 0 && hora < HORA_DIA) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto < MINUTOS_HORA) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < SEGUNDOS_MINUTO) ? segundo : 0;
    }

    public tdaHora(tdaHora x) {
        this.minuto = x.minuto;
        this.hora = x.hora;
        this.segundo = x.segundo;
    }

    // getters y setters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        hora = (esHoraValida(hora) == true) ? hora : 0;
    }

    public void setMinuto(int minuto) {
        minuto = (esMinutoValido(minuto) == true) ? minuto : 0;
    }

    public void setSegundo(int segundo) {
        segundo = (esSegundoValido(segundo) == true) ? segundo : 0;
    }

    // metodos logicos
    public boolean esHoraValida(int hora) {
        if (hora >= 0 && hora <= HORA_DIA) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esMinutoValido(int minuto) {
        if (minuto >= 0 && minuto < MINUTOS_HORA) {
            return true;
        }
        return false;
    }

    public boolean esSegundoValido(int segundo) {
        if (segundo >= 0 && segundo <= SEGUNDOS_MINUTO)
            return true;
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        res = (hora < 10) ? "0" + hora + ":" : hora + ":";
        res += (minuto < 10) ? res + "0" + minuto + ":" : res + minuto + ":";
        res += (segundo < 10) ? res + "0" + segundo : res + segundo;
        return res;
    }

    public boolean esIgual(tdaHora x) {
        if (hora == x.hora && minuto == x.minuto && segundo == x.segundo) 
            return true;
        return false;
    }
    public void sumarSegundos(int segundos) {
        /* 
        *se usa un ciclo while para sumar los segundos y si se pasa de 60 se suma un minuto y si se pasa de 60 minutos se suma una hora y si se pasa de 24 horas se reinicia a 0
        while (segundos > 0) {
            segundo++;
            if (segundo >= SEGUNDOS_MINUTO) {
                segundo = 0;
                minuto++;
                if (minuto >= MINUTOS_HORA) {
                    minuto = 0;
                    hora++;
                    if (hora >= HORA_DIA) {
                        hora = 0;
                    }
                }
            }
            segundos--;
        }*/
       //*Sumando los segundos y calculando el nuevo valor de hora, minuto y segundo
        int totalSegundos = hora * 3600 + minuto * 60 + segundo + segundos;
        totalSegundos = totalSegundos % (HORA_DIA * 3600); // reinicia a 0 si se pasa de 24 horas
        hora = totalSegundos / 3600;
        minuto = (totalSegundos % 3600) / 60;
        segundo = totalSegundos % 60;
    }
}