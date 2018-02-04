package com.example.android.pratiwiika_1202154314_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText bMenu, bPorsi;
    Button cEatbus, cAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bMenu = findViewById(R.id.editText);
        bPorsi=findViewById(R.id.editText2);

        cEatbus= findViewById(R.id.button);
        cAbnormal= findViewById(R.id.button2);
    }
    public void launchEatbus(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("idTempat", cEatbus.getText().toString());
        intent.putExtra("idMakanan", bMenu.getText().toString());
        intent.putExtra("idJumlah", bPorsi.getText().toString());
        intent.putExtra("idPrice", "50000");
        startActivity(intent);
    }
    public void launchAbnormal(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("idTempat", cAbnormal.getText().toString());
        intent.putExtra("idMakanan", bMenu.getText().toString());
        intent.putExtra("idJumlah", bPorsi.getText().toString());
        intent.putExtra("idPrice", "30000");
        startActivity(intent);
    }
}
