package com.example.worldskills.colorapp.Activities;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.worldskills.colorapp.R;
import com.example.worldskills.colorapp.SQLiteHelper.SQLiteDatabaseHelper;
import com.example.worldskills.colorapp.SettingsVo.ModelSettings;
import com.example.worldskills.colorapp.Utilidades.TablaConfig;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    //Instancio los componentes
    RadioButton rbDefectoS, rbPersonalizadoS, rbTiempoS, rbIntentosS;
    TextView tvTiempoS, tvIntentosS, tvPalabraS;
    EditText etTiempoS, etIntentosS, etPalabrasS;
    Button btnGuardarS;
    SQLiteDatabaseHelper conn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Adjunto los componentes instanciados con el xml.

        //RadioButtons
        rbDefectoS = findViewById(R.id.rbDefectoS);
        rbPersonalizadoS = findViewById(R.id.rbPersonalizadoS);
        rbTiempoS = findViewById(R.id.rbTiempoS);
        rbIntentosS = findViewById(R.id.rbIntentosS);

        //TextView
        tvTiempoS = findViewById(R.id.tvTiempoS);
        tvIntentosS = findViewById(R.id.tvIntentosS);
        tvPalabraS = findViewById(R.id.tvPalabraS);

        //EditText
        etTiempoS = findViewById(R.id.etTiempoS);
        etIntentosS = findViewById(R.id.etIntentoS);
        etPalabrasS = findViewById(R.id.etPalabrasS);

        //Button
        btnGuardarS = findViewById(R.id.btnGuardarS);

        //Creo la base de datos
        conn = new SQLiteDatabaseHelper(getApplicationContext(), TablaConfig.TABLA_CONFIG, null, 1);

        //Se agrega el onClickListener a los radio button, para poder interactuar con ellos.

        rbDefectoS.setOnClickListener(this);
        rbPersonalizadoS.setOnClickListener(this);
        rbTiempoS.setOnClickListener(this);
        rbIntentosS.setOnClickListener(this);


    }

    //Evento onClick
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rbDefectoS:


        }

    }


}
