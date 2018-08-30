package com.example.worldskills.colorapp.SQLiteHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.worldskills.colorapp.Utilidades.TablaConfig;

public class SQLiteDatabaseHelper extends SQLiteOpenHelper {

    public SQLiteDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TablaConfig.CREAR_TABLA_CONFIGURACION);
        db.execSQL(TablaConfig.CREAR_TABLA_PUNTAJE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS "+TablaConfig.TABLA_CONFIG);
        db.execSQL("DROP TABLE IF EXISTS "+TablaConfig.TABLA_PUNTAJE);
        db.close();
    }
}
