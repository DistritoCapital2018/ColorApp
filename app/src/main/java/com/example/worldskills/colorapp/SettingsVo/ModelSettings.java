package com.example.worldskills.colorapp.SettingsVo;

import java.io.Serializable;

public class ModelSettings implements Serializable {

    private int id;
    private int tiempoPalabra;
    private int tiempoPartida;
    private int tipoJuego;

    public ModelSettings() {
    }

    public ModelSettings(int id, int tiempoPalabra, int tiempoPartida, int tipoJuego) {
        this.id = id;
        this.tiempoPalabra = tiempoPalabra;
        this.tiempoPartida = tiempoPartida;
        this.tipoJuego = tipoJuego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiempoPalabra() {
        return tiempoPalabra;
    }

    public void setTiempoPalabra(int tiempoPalabra) {
        this.tiempoPalabra = tiempoPalabra;
    }

    public int getTiempoPartida() {
        return tiempoPartida;
    }

    public void setTiempoPartida(int tiempoPartida) {
        this.tiempoPartida = tiempoPartida;
    }

    public int getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(int tipoJuego) {
        this.tipoJuego = tipoJuego;
    }
}
