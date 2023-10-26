package br.ulbra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editNumero1, editNumero2;
    TextView txtResultado;
    Button btnSoma, btnSub, btnDiv, btnMult, btnLimp;
    double v1, v2, soma, sub, div, mult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumero1 = (EditText) findViewById(R.id.editNumero1);
        editNumero2 = (EditText) findViewById(R.id.editNumero2);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnLimp = (Button) findViewById(R.id.btnLimp);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: "+soma);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                sub = v1 - v2;
                txtResultado.setText("Resultado: "+sub);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                if(v1 == 0 || v2 == 0){
                    txtResultado.setText("Resultado: Tentativa Inválida");
                }else{
                    div = v1 / v2;
                    txtResultado.setText("Resultado:"+div);
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                mult = v1 * v2;
                txtResultado.setText("Resultado: "+mult);
            }
        });
        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("Resultado: ");
            }
        });
    }
}
