package rodrigo.diariodecampo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PANTALLA3 extends AppCompatActivity {
    Spinner COMUNICACION;
    String [] DATOS1 ={"Visita","Telefonico","E-mail","Carata (Comunicacion Escrita)","Otras"};

    Spinner ESTADO;
    String [] DATOS2 ={"Abierto","Cerrado","Seguimiento","Otras"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        Intent intent = getIntent();
        String extra = intent.getStringExtra("diario");
        Toast.makeText(this, "este es el dato " + extra, Toast.LENGTH_LONG).show();
        findViewById(R.id.SIGUIENTE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PANTALLA3.this, PANTAFOTO.class));
            }
        });

        //  COMUNICACION = (Spinner) findViewById(R.id.COMUNICACION);
        // ArrayAdapter <String> COMUNICA = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,DATOS1);
        // COMUNICACION.setAdapter(COMUNICA);

        //  ESTADO = (Spinner) findViewById(R.id.ACTIVIDAD);
        //  ArrayAdapter <String> ESTAD = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,DATOS2);
        //  ESTADO.setAdapter(ESTAD);


    }





    }

