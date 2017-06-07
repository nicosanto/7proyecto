package nicosanto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundaActivity extends AppCompatActivity {

    private String nombre;
    private String email;
    TextView txtNombre;
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extras = getIntent().getExtras();  //Tipo de dato algo asi    mapa  guardados en el objeto extras. Intent
        // TODO EJ:Validad parametros no vacios
        nombre = extras.getString("KEY_NOMBRE");  //Recuperar el dato en base a la clave
        email = extras.getString("KEY_EMAIL");

        //Asigno Controles
        txtEmail = (TextView)findViewById(R.id.txtEmail);
        txtNombre = (TextView)findViewById(R.id.txtNombre);

        //Asigno valores de parametros  a controles
        txtEmail.setText(email);
        txtNombre.setText(nombre);
    }
}
