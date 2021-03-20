package com.example.homework_calculator;

public class CalculatorLogics {
    private float argOne;
    private float argTwo;
    private CalculatorLogics calc;

    StringBuilder inputStr = new StringBuilder();

    private enum CalculatorLogics {
        inputArgOne,
        inputSign,
        inputArgTwo,
        result
    }

    public CalculatorLogics() {
        CalculatorLogics calc = CalculatorLogics.inputArgOne;
    }


    public void onNumberClick(int buttonId) {


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

    public void onNumberClick(int buttonId) {

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
            case R.id.button_point:
                inputStr.append(".");
                break;
        }

    }

    public void onSignClick(int signId) {
        if (signId == R.id.button_c) {
            argOne = 0;
            argTwo = 0;
            inputStr.setLength(0);

        } else if (signId == R.id.button_equall && calc == CalculatorLogics.inputArgTwo) {
            argTwo = Integer.parseInt(inputStr.toString());
            calc = CalculatorLogics.result;
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
        }
        else if (calc == CalculatorLogics.inputArgOne) {
            argOne = Integer.parseInt(inputStr.toString());
            calc = CalculatorLogics.inputSign;
            selectedSign = signId;
        }
    }

    public String getText() {
        return inputStr.toString();
    }
}
