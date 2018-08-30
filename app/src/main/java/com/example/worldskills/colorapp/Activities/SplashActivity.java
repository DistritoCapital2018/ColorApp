package com.example.worldskills.colorapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.worldskills.colorapp.Activities.MainActivity;
import com.example.worldskills.colorapp.R;

public class SplashActivity extends AppCompatActivity {

    //Se instancian los componentes

    ImageView imgLogoWs, imgLogo;
    //Instancio la animación
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Asigno los componentes junto con el xml

        imgLogoWs = findViewById(R.id.imgLogoWs);
        imgLogo = findViewById(R.id.imgLogo);

        //Creo una nueva animación y le asigno la que cree en la carpeta anim
        animation = AnimationUtils.loadAnimation(this, R.anim.anim_splash);
        //Le asigno la animación a las imagenes
        imgLogoWs.setAnimation(animation);
        imgLogo.setAnimation(animation);

        //Creo un nuevo hilo, el cual contendra el metodo run para correr la animación.

        Thread hilo = new Thread() {
            //Traigo el metodo run
            @Override
            public void run() {
                super.run();
                //Asigno el tiempo del hilo
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Una vez terminado el tiempo, asigno una intención a la activity principal y finalizo el splash.
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        };
          hilo.start();

    }
}
