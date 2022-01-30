package wesley.souza.aplicationimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView titletxt;
    EditText editPeso;
    EditText editAltura;
    Button calcularBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void calcularIMC (View v) {


        editPeso = findViewById(R.id.pesoEDT);
        editAltura = findViewById(R.id.alturaEDT);
        titletxt = findViewById(R.id.titletxt);

        if (editPeso.getText() != null && editAltura != null) {

            double peso = Double.parseDouble(String.valueOf(editPeso.getText()));
            double altura = Double.parseDouble(String.valueOf(editAltura.getText()));

            double valorTotal = peso/ (altura*altura);

            DecimalFormat fmt = new DecimalFormat("0.00");
             String string = fmt.format(valorTotal);

            titletxt.setText(string);

        }

    }

    }
