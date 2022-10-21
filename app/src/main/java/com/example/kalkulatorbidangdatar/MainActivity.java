package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputPAD,inputLT;
    TextView txtPAD,txtLT,txtLuas,txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPAD = findViewById(R.id.inputPAD);
        inputLT = findViewById(R.id.inputLT);
        txtLT = findViewById(R.id.txtLT);
        txtPAD = findViewById(R.id.txtPAD);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);

    }
    public void persegi(View view){
        double panjang = Double.parseDouble(inputPAD.getText().toString());
        double lebar = Double.parseDouble(inputLT.getText().toString());
        double luas = panjang * lebar;
        double keliling = 2*(panjang+lebar);

        txtPAD.setText("Panjang = " + panjang + " m");
        txtLT.setText("Lebar = " + lebar + " m");
        txtLuas.setText("Luas = "+luas+" m");
        txtKeliling.setText("Keliling = "+keliling+" m");
    }
    public void segitiga(View view){
        double alas = Double.parseDouble(inputPAD.getText().toString());
        double tinggi = Double.parseDouble(inputLT.getText().toString());
        double luas = (alas*tinggi)/2;
        double sisi3 = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        double keliling = alas + tinggi + sisi3;

        txtPAD.setText("Alas = " + alas + " m");
        txtLT.setText("Tinggi = " + tinggi + " m");
        txtLuas.setText("Luas = "+luas+" m");
        txtKeliling.setText("Keliling = "+keliling+" m");

    }
    public void lingkaran(View view){
        double diameter = Double.parseDouble(inputPAD.getText().toString());
        double luas = Math.PI * Math.pow((diameter/2),2);
        double keliling = Math.PI * diameter;

        txtPAD.setText("Diameter = " + diameter + " m");
        txtLuas.setText("Luas = "+luas+" m");
        txtKeliling.setText("Keliling = "+keliling+" m");

    }
}