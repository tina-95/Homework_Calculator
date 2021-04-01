package com.example.homework_calculator.logic;

import com.example.homework_calculator.R;

public class CalculatorLogics {
    private float argOne;
    private float argTwo;
    private int signSelected;
    private CalculatorLogic calc;

    StringBuilder inputStr = new StringBuilder();

    private enum CalculatorLogic {
        INPUT_ARG_ONE,
        INPUT_SIGN,
        INPUT_ARG_TWO,
        RESULT
    }

    public CalculatorLogics() {
        calc = CalculatorLogic.INPUT_ARG_ONE;
    }


    public void onNumberClick(int buttonId) {

        if (calc == CalculatorLogic.RESULT) {
            calc = CalculatorLogic.INPUT_ARG_ONE;
            inputStr.setLength(0);
        }

        if (calc == CalculatorLogic.INPUT_SIGN) {
            calc = CalculatorLogic.INPUT_ARG_TWO;
            inputStr.setLength(0);
        }

        if (inputStr.length() < 9) {
            switch (buttonId) {
                case R.id.button_1:
                    inputStr.append("1");
                    break;
                case R.id.button_2:
                    inputStr.append("2");
                    break;
                case R.id.button_3:
                    inputStr.append("3");
                    break;
                case R.id.button_4:
                    inputStr.append("4");
                    break;
                case R.id.button_5:
                    inputStr.append("5");
                    break;
                case R.id.button_6:
                    inputStr.append("6");
                    break;
                case R.id.button_7:
                    inputStr.append("7");
                    break;
                case R.id.button_8:
                    inputStr.append("8");
                    break;
                case R.id.button_9:
                    inputStr.append("9");
                    break;
                case R.id.button_0:
                    inputStr.append("0");
                    break;
            }
        }

    }

    public void onSignClick(int signId) {
        if (signId == R.id.button_c) {
            argOne = 0;
            argTwo = 0;
            inputStr.setLength(0);

        } else if (signId == R.id.button_equall && calc == CalculatorLogic.INPUT_ARG_TWO) {
            argTwo = Integer.parseInt(inputStr.toString());
            calc = CalculatorLogic.RESULT;
            inputStr.setLength(0);
            switch (signId) {
                case R.id.button_dev:
                    inputStr.append(argOne / argTwo);
                    break;
                case R.id.button_min:
                    inputStr.append(argOne - argTwo);
                    break;
                case R.id.button_mul:
                    inputStr.append(argOne * argTwo);
                    break;
                case R.id.button_pls:
                    inputStr.append(argOne + argTwo);
                    break;

            }
        } else if (calc == CalculatorLogic.INPUT_ARG_ONE) {
            argOne = Integer.parseInt(inputStr.toString());
            calc = CalculatorLogic.INPUT_SIGN;
            signSelected = signId;
        }
    }

    public String getText() {
        return inputStr.toString();
    }
}