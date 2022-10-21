/*package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainPersegi extends AppCompatActivity {
    //Button btnLuasP, btnKelilingP;
    EditText inputPanjang,inputLebar;
    TextView txtPanjang,txtLebar,txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_persegi);

        txtPanjang = findViewById(R.id.txtPanjang);
        txtLebar = findViewById(R.id.txtLebar);
        txtLuas = findViewById(R.id.txtLuas);
        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
    }
    public void luasP(View view){
        double panjang = Double.parseDouble(inputPanjang.getText().toString());
        double lebar = Double.parseDouble(inputLebar.getText().toString());
        double luas = panjang*lebar;

        txtPanjang.setText("Panjang = " + panjang + " m");
        txtLebar.setText("Lebar = " +lebar+" m");
        txtLuas.setText("Luas = "+luas+" m");
    }
}

 */