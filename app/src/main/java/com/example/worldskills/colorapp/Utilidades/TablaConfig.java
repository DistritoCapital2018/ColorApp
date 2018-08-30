package com.example.worldskills.colorapp.Utilidades;

public class TablaConfig {

    //Constantes Tabla Config.
    public static final String TABLA_CONFIG="configuracion";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_TIEMPO_PALABRAS="tiempo_palabras";
    public static final String CAMPO_TIEMPO_INTENTOS="tiempo_intentos";
    public static final String CAMPO_TIEMPO_PARTIDA="tiempo_partida";
    public static final String CAMPO_TIPO_JUEGO="tipo_juego";


    public static final String CREAR_TABLA_CONFIGURACION = "CREATE TABLE "+TABLA_CONFIG+" ("+CAMPO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_TIEMPO_PALABRAS+" INTEGER, "+CAMPO_TIEMPO_INTENTOS+" INTEGER, "+CAMPO_TIEMPO_PARTIDA+" INTEGER, "+CAMPO_TIPO_JUEGO+" INTEGER)";

    //Constantes Tabla Puntaje

    public static final String TABLA_PUNTAJE="puntaje";
    public static final String CAMPO_ID_PUNTAJE="id";
    public static final String CAMPO_PUNTAJE="campo_puntaje";


    public static final String CREAR_TABLA_PUNTAJE = "CREATE TABLE "+TABLA_PUNTAJE+" ("+CAMPO_ID_PUNTAJE+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_PUNTAJE+" INTEGER)";

}
