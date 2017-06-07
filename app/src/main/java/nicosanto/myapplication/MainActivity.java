package nicosanto.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;  //Importo la libreria Alt+Enter
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMostrar;

    //private Button btnAceptar;
    //TODO: falta validacion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mostrarCalculo();  //LLamo al metodo
        btnMostrar = (Button)findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {  //Alt+Enter
            //Alguien escribio como quiere la interfaz, llamo creo el metodo
            @Override
            public void onClick(View v) {
                mostrarActividad();
            }
        });

    }

    public void mostrarCalculo(){ //View view
        int a=5;
        int b=10;
        int c=20;
        int mayor;

        if (a>b) {
            mayor = a;
        }
        else{
            mayor=b;
        }

        if(c>mayor){
            mayor=c;
        }

        Toast.makeText(this,"El mayor es: "+mayor, Toast.LENGTH_SHORT).show(); //Mostrar por pantalla
    }

    private void mostrarActividad(){
        Intent intent = new Intent(this, SegundaActivity.class); //Donde estoy, a donde quiero ir.

        //Paso parametros
        intent.putExtra("KEY_NOMBRE","Nico Santomartino");
        intent.putExtra("KEY_EMAIL","nico.santomartino@gmail.com");

        startActivity(intent);
    }

}
