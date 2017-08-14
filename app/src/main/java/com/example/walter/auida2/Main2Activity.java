package com.example.walter.auida2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Integer[] imgId = {
            R.drawable.ic_1,
            R.drawable.ic_2,
            R.drawable.ic_3,
            R.drawable.ic_4,
            R.drawable.ic_5
    };

    String[] test = {"1. ¿Qué indica la siguiente señal?","2. ¿Qué indica la siguiente señal?","3. ¿Qué indica la siguiente señal?","4. ¿Cuál de las siguientes imágenes muestra una bicisenda?","5. ¿Qué indica la siguiente señal?"};
    String[] res1 = {"Prioridad de ciclomotores","Curva comun","Estrechamiento en dos manos","Opcion 1","Zona montañosa"};
    String[] res2 = {"Prohibido adelantarse", "Curva en S","Estrechamiento de una mano","Opcion 2","Perfil irregular"};
    String[] res3 = {"Prohibido circulacion de bicicletas","Calsada dividida","Puente angosto", "Opcion 3","Cruce ferroviario"};

    ImageView img;
    TextView cont, preg;
    RadioButton radiob1, radiob2, radiob3;
    RadioGroup group;
    Button boton1,boton2;

    int contador=1,Correctos = 0, Incorrecto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = (ImageView)findViewById(R.id.image);
        preg = (TextView)findViewById(R.id.pregunta);
        cont = (TextView)findViewById(R.id.contador);
        radiob1 = (RadioButton)findViewById(R.id.rb1);
        radiob2 = (RadioButton)findViewById(R.id.rb2);
        radiob3 = (RadioButton)findViewById(R.id.rb3);
        group = (RadioGroup)findViewById(R.id.respuesta);
        boton1 = (Button)findViewById(R.id.button);
        boton2 = (Button)findViewById(R.id.button2);

        img.setImageResource(imgId[0]);
        cont.setText("Pagina: "+contador+"/5");
        preg.setText(test[0]);
        radiob1.setText(res1[0]);
        radiob2.setText(res2[0]);
        radiob3.setText(res3[0]);

    }

    public void bt(View view) {
        if (preg.getText().equals(test[0])){
            if (radiob3.isChecked()){
                Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                Correctos=Correctos+1;
                contador=contador+1;
                img.setImageResource(imgId[1]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[1]);
                radiob1.setText(res1[1]);
                radiob2.setText(res2[1]);
                radiob3.setText(res3[1]);
                group.clearCheck();
            }else {
                Toast.makeText(this,"Incorrecto",Toast.LENGTH_SHORT).show();
                Incorrecto=Incorrecto+1;
                contador=contador+1;
                img.setImageResource(imgId[1]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[1]);
                radiob1.setText(res1[1]);
                radiob2.setText(res2[1]);
                radiob3.setText(res3[1]);
                group.clearCheck();
            }
        }else if (preg.getText().equals(test[1])){
            if (radiob2.isChecked()){
                Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                Correctos=Correctos+1;
                contador=contador+1;
                img.setImageResource(imgId[2]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[2]);
                radiob1.setText(res1[2]);
                radiob2.setText(res2[2]);
                radiob3.setText(res3[2]);
                group.clearCheck();
            }else {
                Toast.makeText(this,"Incorrecto",Toast.LENGTH_SHORT).show();
                Incorrecto=Incorrecto+1;
                contador=contador+1;
                img.setImageResource(imgId[2]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[2]);
                radiob1.setText(res1[2]);
                radiob2.setText(res2[2]);
                radiob3.setText(res3[2]);
                group.clearCheck();
            }
        }else if (preg.getText().equals(test[2])){
            if (radiob2.isChecked()){
                Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                Correctos=Correctos+1;
                contador=contador+1;
                img.setImageResource(imgId[3]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[3]);
                radiob1.setText(res1[3]);
                radiob2.setText(res2[3]);
                radiob3.setText(res3[3]);
                group.clearCheck();
            }else {
                Toast.makeText(this,"Incorrecto",Toast.LENGTH_SHORT).show();
                Incorrecto=Incorrecto+1;
                contador=contador+1;
                img.setImageResource(imgId[3]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[3]);
                radiob1.setText(res1[3]);
                radiob2.setText(res2[3]);
                radiob3.setText(res3[3]);
                group.clearCheck();
            }
        }else if (preg.getText().equals(test[3])){
            if (radiob2.isChecked()){
                Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                Correctos=Correctos+1;
                contador=contador+1;
                img.setImageResource(imgId[4]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[4]);
                radiob1.setText(res1[4]);
                radiob2.setText(res2[4]);
                radiob3.setText(res3[4]);
                group.clearCheck();
            }else {
                Toast.makeText(this,"Incorrecto",Toast.LENGTH_SHORT).show();
                Incorrecto=Incorrecto+1;
                contador=contador+1;
                img.setImageResource(imgId[4]);
                cont.setText("Pagina: "+contador+"/5");
                preg.setText(test[4]);
                radiob1.setText(res1[4]);
                radiob2.setText(res2[4]);
                radiob3.setText(res3[4]);
                group.clearCheck();
            }
        }else if (preg.getText().equals(test[4])){
            if (radiob2.isChecked()){
                Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                Correctos=Correctos+1;
                group.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
                boton1.setVisibility(View.INVISIBLE);
                boton2.setVisibility(View.VISIBLE);
                cont.setText("Finalizaste el test");
                preg.setText("Correctos: "+Correctos+"/5 Incorrectos: "+Incorrecto+"/5");
            }else {
                Toast.makeText(this,"Incorrecto",Toast.LENGTH_SHORT).show();
                Incorrecto=Incorrecto+1;
                group.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
                boton1.setVisibility(View.INVISIBLE);
                boton2.setVisibility(View.VISIBLE);
                cont.setText("Finalizaste el test");
                preg.setText("Correctos: "+Correctos+"/5 Incorrectos: "+Incorrecto+"/5");
            }
        }
    }
    public void bt2(View view){
        finish();
    }
}
