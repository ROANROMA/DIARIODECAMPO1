package rodrigo.diariodecampo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class PANTALLA2 extends AppCompatActivity {
    Spinner ACTIVIDADES;
    String [] DATOS1 ={"Contacto con Vecinos","Recorrido","Contacto con Obra","Capacitación","Visita Institucional"};

    Spinner EVENTO;
    String [] DATOS2 ={"Peticion","Queja","Reclamo","Recorrido"};

    Spinner PROYECTOS;
    String [] DATOS ={"BUGA","CAJAMARCA","SIETE24"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        Intent intent = getIntent();
        String extra = intent.getStringExtra("diario");
        Toast.makeText(this,"este es el dato " + extra, Toast.LENGTH_LONG ).show();

        ACTIVIDADES = (Spinner) findViewById(R.id.ACTIVIDAD);
        ArrayAdapter <String> ACTIVIDAD = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,DATOS1);
        ACTIVIDADES.setAdapter(ACTIVIDAD);

        EVENTO = (Spinner) findViewById(R.id.EVENTO);
        ArrayAdapter <String> EVENTOS = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,DATOS2);
        EVENTO.setAdapter(EVENTOS);


        PROYECTOS = (Spinner) findViewById(R.id.PROYECTO);
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,DATOS);
        PROYECTOS.setAdapter(adaptador);
    }
    public void  ANTERIOR (View ANTERIOR) {
        Intent intent = new Intent(this, PANTALLA1.class);
        intent.putExtra("diario", "VA PARA ATRAS");
        startActivity(intent);
    }




    }

