package com.armando.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    public Button bDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bDatos = (Button)findViewById(R.id.BtnDatos);
       bDatos.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               //creando las variables  que resiven  el texto
               String nom = TxNombre.getText().toString();
               String ape = TxApellido.getText().toString();

               //salida utilizando toast
               Toast.makeText(getApplicationContext(),"tu nombre es: "+nom+" "+ape,Toast.LENGTH_LONG).show();

           }
       });



 }
    // Crear objetos que enlazan con los componente
    final EditText TxNombre = (EditText) this.findViewById(R.id.TxNombre);
    final EditText TxApellido = (EditText) this.findViewById(R.id.TxApellido);
    final Button BtnDatos = (Button) this.findViewById(R.id.BtnDatos);
//pruebaaa
}