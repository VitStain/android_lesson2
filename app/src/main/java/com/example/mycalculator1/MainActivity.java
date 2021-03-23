package com.example.mycalculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;

    EditText etNum1;
    EditText etNum2;

    Button btnPercent;
    Button btnClearAll;
    Button btnClearPart;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    Button btnNegative;
    Button btnComma;
    Button btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        // находим элементы
        tvResult = findViewById(R.id.tvResult);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);

        btnPercent = findViewById(R.id.btnPercent);
        btnClearAll = findViewById(R.id.btnClearAll);
        btnClearPart = findViewById(R.id.btnClearPart);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);

        btnNegative = findViewById(R.id.btnNegative);
        btnComma = findViewById(R.id.btnComma);
        btnEqual = findViewById(R.id.btnEqual);

    }
//Далее в следующем домашнем задании напишу код обработки кнопок))..

}