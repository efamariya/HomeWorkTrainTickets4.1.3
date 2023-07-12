package com.example.homeworktraintickets413;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // поля
    private EditText id, mestoOtpravleniya, vremyaOtpravleniya, mestoPribitiya, vremyaPribitiya;
    private TextView stoimost;
    private Button button;
    // создание буферного поля
    private int idIn;
    private int stoimos = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.id);
        mestoOtpravleniya = findViewById(R.id.mestoOtpravleniya);
        vremyaOtpravleniya = findViewById(R.id.vremyaOtpravleniya);
        mestoPribitiya = findViewById(R.id.mestoPribitiya);
        vremyaPribitiya = findViewById(R.id.vremyaPribitiya);
        stoimost = findViewById(R.id.stoimost);
        button = findViewById(R.id.button);

        stoimost.setText("Стоимость билета " + stoimos + " рублей.");

        button.setOnClickListener(listener);
    }
    // слушатель
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            idIn = Integer.parseInt(id.getText().toString());// проинициализировать буф.поля
            //stoimos = Integer.parseInt(stoimost.getText().toString());// проинициализировать буф.поля

            Tickets tickets = new Tickets(idIn,mestoOtpravleniya.getText().toString(),
                    vremyaOtpravleniya.getText().toString(),mestoPribitiya.getText().toString(),
                    vremyaPribitiya.getText().toString(),stoimos);

            // создание намерения переключения экрана
            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(Tickets.class.getSimpleName(),tickets); // Tickets.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активности и передачи данных
            startActivity(intent);
        }
    };
}