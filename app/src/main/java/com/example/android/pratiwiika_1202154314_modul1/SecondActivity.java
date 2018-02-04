package com.example.android.pratiwiika_1202154314_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView tempat, harga, porsi, menu ;
    private int money = 65000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tempat = findViewById(R.id.idTempat);
        harga = findViewById(R.id.idPrice);
        porsi= findViewById(R.id.idJumlah);
        menu = findViewById(R.id.idMakanan);
        Intent intent = getIntent();
        String xTempat = intent.getStringExtra("idTempat");
        tempat.setText(xTempat);
        String xHarga = intent.getStringExtra("idPrice");
        String xPorsi = intent.getStringExtra("idJumlah");
        porsi.setText(xPorsi);
        String xMenu = intent.getStringExtra("idMakanan");
        menu.setText(xMenu);
        int totalPrice = Integer.valueOf(xHarga)*Integer.valueOf(xPorsi);
        harga.setText(String.valueOf(totalPrice));
        if (totalPrice <= money) {
            Toast.makeText(this,"Makan Malam Kamu disini saja", 1).show();
        } else {
            Toast.makeText(this, "Jangan Makan disini, Uang kamu tidak cukup", 1).show();
        }
    }
}
