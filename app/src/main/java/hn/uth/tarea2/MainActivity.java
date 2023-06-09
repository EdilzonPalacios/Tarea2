package hn.uth.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txnombre, txapellido, txedad, txcorreo;
    Button btnenviar;
    String nombre, apellido, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txnombre=findViewById(R.id.txnombre);
        txapellido=findViewById(R.id.txapellido);
        txedad=findViewById(R.id.txedad);
        txcorreo=findViewById(R.id.txcorreo);
        btnenviar=(Button) findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nombre = txnombre.getText().toString();
                apellido = txapellido.getText().toString();
                edad = txedad.getText().toString();
                correo = txcorreo.getText().toString();

                Intent intent = new Intent(MainActivity.this, ActivityInformacion.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("edad", edad);
                intent.putExtra("apellido", apellido);
                intent.putExtra("correo", correo);
                startActivity(intent);


            }
        });


    }
}