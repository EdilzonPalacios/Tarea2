package hn.uth.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityInformacion extends AppCompatActivity {

    TextView tvnombre, tvedad, tvcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        Intent intent = getIntent();
        String obtnombre = intent.getStringExtra("nombre");
        String obtapellido = intent.getStringExtra("apellido");
        String obtedad = intent.getStringExtra("edad");
        String obtcorreo = intent.getStringExtra("correo");

        tvnombre=findViewById(R.id.tvnombre);
        tvedad=findViewById(R.id.tvedad);
        tvcorreo=findViewById(R.id.tvcorreo);

        tvnombre.setText("Nombre Completo: "+obtnombre+" "+obtapellido);
        tvedad.setText("Edad Actual: "+obtedad);
        tvcorreo.setText("Contacto de Email: "+obtcorreo);




    }
}