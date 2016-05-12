package rodrigo.diariodecampo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class PANTALLA1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
    }
    public void  SIGUIENTE (View SIGUIENTE) {
        Intent intent = new Intent(this, PANTALLA2.class);
        intent.putExtra("diario","si paso este dato");
        startActivity(intent);
    }
    public void  ANTERIOR (View ANTERIOR) {
        Intent intent = new Intent(this, PANTALLA1.class);
        intent.putExtra("ANTERIOR","si paso este datoANTE");
        startActivity(intent);


    }
}
