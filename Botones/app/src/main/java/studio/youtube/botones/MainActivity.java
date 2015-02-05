package studio.youtube.botones;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button btnAceptar;

    private Button btn1,btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Metodo 1
        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Aceptar", Toast.LENGTH_SHORT).show();
            }
        });

        //Metodo3
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    //Metodo 2
    public void ClickCancelar(View boton){
        Toast.makeText(getApplicationContext(), "Cancelar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View boton) {
        switch (boton.getId()){
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "Boton 1", Toast.LENGTH_SHORT).show();
            break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "Boton 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "Boton 3", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
