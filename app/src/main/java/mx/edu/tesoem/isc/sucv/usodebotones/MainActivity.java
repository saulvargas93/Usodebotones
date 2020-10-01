package mx.edu.tesoem.isc.sucv.usodebotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



         EditText vNombre,vEdad,vTelefono,vCorreo; //CREAN VARIABLES GLOBALES
         TextView eNombre,eEdad,eTelefono,eCorreo;

    @Override
    public void takeKeyEvents(boolean get) {
        super.takeKeyEvents(get);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SE MANDAN A LLAMAR LOS OBJETOS

        vNombre = FindViewById(R.id.txtNombre);
        vEdad = FindViewById(R.id.txtEdad);
        vTelefono = FindViewById(R.id.txtTelefonos);
        vCorreo = FindViewById(R.id.txtMail);

        eNombre = FindViewById(R.id.lblNombre);
        eEdad = FindViewById(R.id.lblEdad);
        eTelefono = FindViewById(R.id.lblTelefono);
        eCorreo = FindViewById(R.id.lblMail);



    }

    public void MProcesa (View v){

        eNombre.setText(vNombre.getText());
        eEdad.setText(vEdad.getText());
        eTelefono.setText(vTelefono.getText());
        eCorreo.setText(vCorreo.getText());



    }





}