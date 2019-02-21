package org.vpitac.fragmentosok;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentosOk extends AppCompatActivity {
    boolean mostrar=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos_ok);
    }

    /*public void okay (View v){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        Fragmento1 mifragmento=new Fragmento1();
        mitransaccion.add(R.id.contenedor,mifragmento);
        mitransaccion.commit();
    }*/

    public void okay (View v){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        if(mostrar==false){
            Fragmento1 mifragmento=new Fragmento1();
            mitransaccion.replace(R.id.contenedor,mifragmento);
            mitransaccion.commit();
            mostrar=true;
        }else{
            Fragmento2 mifragmento=new Fragmento2();
            mitransaccion.replace(R.id.contenedor,mifragmento);
            mitransaccion.commit();
            mostrar=false;
        }

    }
}
