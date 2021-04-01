package com.example.homework_calculator.ui;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.homework_calculator.R;
import com.example.homework_calculator.logic.CalculatorLogics;
import com.google.android.material.radiobutton.MaterialRadioButton;

public class MainActivity extends BaseActivity {


    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }


    private CalculatorLogics calc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_calculator);

        initThemeChooser();

        Button buttonC = findViewById(R.id.button_c);
        Button buttonDev = findViewById(R.id.button_dev);
        Button buttonMul = findViewById(R.id.button_mul);
        Button buttonMin = findViewById(R.id.button_min);
        Button buttonOne = findViewById(R.id.button_1);
        Button buttonTwo = findViewById(R.id.button_2);
        Button buttonThree = findViewById(R.id.button_3);
        Button buttonFour = findViewById(R.id.button_4);
        Button buttonPls = findViewById(R.id.button_pls);
        Button buttonFive = findViewById(R.id.button_5);
        Button buttonSix = findViewById(R.id.button_6);
        Button buttonEquall = findViewById(R.id.button_equall);
        Button buttonSeven = findViewById(R.id.button_7);
        Button buttonEight = findViewById(R.id.button_8);
        Button buttonNine = findViewById(R.id.button_9);
        Button buttonZero = findViewById(R.id.button_0);
        TextView fieldResult = findViewById(R.id.field_result);


        calc = new CalculatorLogics();


        View.OnClickListener numClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onNumberClick(v.getId());

            }
        };

        View.OnClickListener signClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onSignClick(v.getId());
                fieldResult.setText(calc.getText());

            }
        };

        buttonOne.setOnClickListener(numClickListener);
        buttonTwo.setOnClickListener(numClickListener);
        buttonThree.setOnClickListener(numClickListener);
        buttonFour.setOnClickListener(numClickListener);
        buttonFive.setOnClickListener(numClickListener);
        buttonSix.setOnClickListener(numClickListener);
        buttonSeven.setOnClickListener(numClickListener);
        buttonEight.setOnClickListener(numClickListener);
        buttonNine.setOnClickListener(numClickListener);
        buttonZero.setOnClickListener(numClickListener);
        buttonC.setOnClickListener(signClickListener);
        buttonDev.setOnClickListener(signClickListener);
        buttonMin.setOnClickListener(signClickListener);
        buttonMul.setOnClickListener(signClickListener);
        buttonEquall.setOnClickListener(signClickListener);
        buttonPls.setOnClickListener(signClickListener);


    }
    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radio1),
                MyCoolCodeStyle);
        initRadioButton(findViewById(R.id.radio2),
                OriginalStyle);

        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton)rg.getChildAt(getCodeStyle(MyCoolCodeStyle))).setChecked(true);
    }
    private void initRadioButton(View button, final int codeStyle){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });
    }



}
