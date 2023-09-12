package com.example.calculatorappma;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText firstOperand;
    EditText secondOperand;
    EditText output;
    Button b1;
    Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bDecimal;
    private Button bSubtract;
    private Button bAdd;
    private Button bMultiply;
    private Button bDivide;
    private Button bNegate;
    private Button bPower;
    private Button bRoot;
    private Button bAllClear;
    private Button bDeleteOne;
    private Button bEqualsTo;
    private Button bLog;
    private Button bLn;
    private Button bMod;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = 'x';
    private final char DIVISION = '/';
    private final char EQUALTO = '=';
    private final char ROOT = '√';
    private final char EXPONENT = '^';
    private final char LOG = 'L';
    private final char LN = 'N';
    private final char MOD = '%';
    private final char DECIMALPOINT = '.';
    private final char DELETE = '<';
    private final char ALLCLEAR = 'C';
    private final char NEGATE = '¬';
    private char OPERATOR;
    private double op1 = Double.NaN;
    private double op2 = Double.NaN;
    private double result = Double.NaN;
    private boolean calculated = false;

    @SuppressLint("MissingInflatedId")
    @Override
    /**
     * This method initializes all of the variables made above
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstOperand = (EditText) findViewById(R.id.firstInput);
        secondOperand = (EditText) findViewById(R.id.secondInput);
        output = (EditText) findViewById(R.id.calcOutput);
        b1 = (Button) findViewById(R.id.calc1);
        b2 = (Button) findViewById(R.id.calc2);
        b3 = (Button) findViewById(R.id.calc3);
        b4 = (Button) findViewById(R.id.calc4);
        b5 = (Button) findViewById(R.id.calc5);
        b6 = (Button) findViewById(R.id.calc6);
        b7 = (Button) findViewById(R.id.calc7);
        b8 = (Button) findViewById(R.id.calc8);
        b9 = (Button) findViewById(R.id.calc9);
        b0 = (Button) findViewById(R.id.calc0);
        bDecimal = (Button) findViewById(R.id.calcDecimal);
        bSubtract = (Button) findViewById(R.id.calcSubtraction);
        bAdd = (Button) findViewById(R.id.calcAddition);
        bMultiply = (Button) findViewById(R.id.calcMultiply);
        bDivide = (Button) findViewById(R.id.calcDivision);
        bNegate = (Button) findViewById(R.id.calcNegative);
        bAllClear = (Button) findViewById(R.id.calcAllClear);
        bPower = (Button) findViewById(R.id.calcExponent);
        bRoot = (Button) findViewById(R.id.calcSquareRoot);
        bEqualsTo = (Button) findViewById(R.id.calcEqualsTo);
        bLog = (Button) findViewById(R.id.calcLog);
        bLn = (Button) findViewById(R.id.calcLn);
        bMod = (Button) findViewById(R.id.calcMod);
        bDeleteOne = (Button) findViewById(R.id.calcDelete);

        firstOperand.requestFocus();
        firstOperand.setText("");
        firstOperand.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            /**
             * This method changes the focus from the first input field to the second automatically if the user has entered a number and a operator
             * in the first field.
             * @param s
             * @param start
             * @param before
             * @param count
             */
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(operatorSelected(firstOperand.getText().toString())) {
                    secondOperand.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        /**
         * This method is used to input the number 1 on the calculator screen
         */
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (!calculated){
                    if (firstOperand.hasFocus()) {
                        firstOperand.setText(firstOperand.getText().toString() + "1");
                        firstOperand.setSelection(firstOperand.getText().length());
                    } else {
                        secondOperand.setText(secondOperand.getText().toString() + "1");
                        secondOperand.setSelection(secondOperand.getText().length());
                    }
                }

            }
        });
        /**
         * This method is used to input the number 2 on the calculator screen
         */
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "2");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "2");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 3 on the calculator screen
         */
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "3");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "3");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 5 on the calculator screen
         */
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "4");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "4");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 5 on the calculator screen
         */
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "5");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "5");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 6 on the calculator screen
         */
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "6");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "6");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 7 on the calculator screen
         */
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "7");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "7");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 8 on the calculator screen
         */
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "8");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "8");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 9 on the calculator screen
         */
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "9");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "9");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the number 0 on the calculator screen
         */
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "0");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "0");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the decimal point for a floating point number.
         */
        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                reset();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + ".");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + ".");
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }
        });
        /**
         * This method is used to input the operator + on the calculator screen and trigger the ADDITION operation.
         */
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = ADDITION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " + ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    } else {
                        firstOperand.setText((int) op1 + " + ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator - on the calculator screen and trigger the SUBTRACTION operation.
         */
        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = SUBTRACTION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " - ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    } else {
                        firstOperand.setText((int) op1 + " - ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator x on the calculator screen and trigger the MULTIPLICATION operation.
         */
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = MULTIPLICATION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " x ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    } else {
                        firstOperand.setText((int) op1 + " x ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator / on the calculator screen and trigger the DIVISION operation.
         */
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = DIVISION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    firstOperand.setText(op1 + " / ");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator ^ on the calculator screen and trigger the EXPONENTIAL operation
         */
        bPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = EXPONENT;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    firstOperand.setText(op1 + " ^ ");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator √ on the calculator screen and trigger the GENERIC ROOT operation
         */
        bRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = ROOT;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    firstOperand.setText(" √ " + op1);
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator log on the calculator screen and trigger the LOGARITHM operation
         */
        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() == 0) {
                    OPERATOR = LOG;
                    firstOperand.setText("Log ");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator ln on the calculator screen and trigger the NATURAL LOG operation
         */
        bLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() == 0) {
                    OPERATOR = LN;
                    firstOperand.setText("Ln ");
                    firstOperand.setSelection(firstOperand.getText().length());
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method is used to input the operator % on the calculator screen and trigger the MOD operation
         */
        bMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = MOD;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " % ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    } else {
                        firstOperand.setText((int) op1 + " % ");
                        firstOperand.setSelection(firstOperand.getText().length());
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        /**
         * This method changes the current number to a negative number when the NEGATE button is clicked.
         */
        bNegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
                if (firstOperand.hasFocus()) {
                    if(firstOperand.length() > 0 && !operatorSelected(firstOperand.getText().toString())){
                        if(!firstOperand.getText().toString().contains("-")) {
                            firstOperand.setText("-" + firstOperand.getText().toString());
                            firstOperand.setSelection(firstOperand.getText().length());
                            op1 = Double.parseDouble(firstOperand.getText().toString());
                        }
                    }
                } else {
                    if(secondOperand.length() > 0 && !operatorSelected(firstOperand.getText().toString())){
                        if(!secondOperand.getText().toString().contains("-")) {
                            secondOperand.setText("-" + secondOperand.getText().toString());
                            secondOperand.setSelection(secondOperand.getText().length());
                            op2 = Double.parseDouble(secondOperand.getText().toString());
                        }
                    }

                }
            }
        });
        /**
         * This method is used to trigger the operation() method to perform the required calculations.
         */
        bEqualsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (secondOperand.getText().length() > 0) {
                    //OPERATOR = EQUALTO;
                    op2 = Double.parseDouble(secondOperand.getText().toString());
                    if (!isDecimal(op2)) {
                        secondOperand.setText(String.valueOf(op2));
                        secondOperand.setSelection(secondOperand.getText().length());
                    } else {
                        secondOperand.setText(String.valueOf((int) op2));
                        secondOperand.setSelection(secondOperand.getText().length());
                    }
                } else {
                    output.setText("Error");
                }
                operation();
                firstOperand.requestFocus();
                calculated = true;
            }
        });
        /**
         * This method is used by the AC button and resets all of the input boxes to their original state.
         */
        bAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstOperand.setText("");
                secondOperand.setText("");
                output.setText("");
            }

        });
        /**
         * This method is used for the Del button, it will remove the rightmost character from the current text field.
         */
        bDeleteOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempStr = "";
                reset();
                if(firstOperand.hasFocus() && firstOperand.length() > 0) {
                    tempStr = firstOperand.getText().toString().substring(0,firstOperand.getText().toString().length()-1);
                    firstOperand.setText(tempStr);
                    firstOperand.setSelection(firstOperand.getText().length());
                } else if(secondOperand.hasFocus() && secondOperand.length() > 0){
                    tempStr = secondOperand.getText().toString().substring(0,secondOperand.getText().toString().length()-1);
                    secondOperand.setText(tempStr);
                    secondOperand.setSelection(secondOperand.getText().length());
                }
            }

        });

    }

    /**
     * This method will clear the error message in the output field.
     */
    private void ifErrorOnOutput() {
        if (output.getText().toString().equals("Error")) {
            output.setText("");
        }
    }

    /**
     * This method will automatically adjust the text size if the value exceeds a certain length.
     */
    private void exceedLength() {
        if (firstOperand.getText().toString().length() > 16) {
            firstOperand.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
        }
    }

    /**
     * This method will check if the inputed value is a decimal number or not.
     * @param value
     * @return true if the number has a decimal point, otherwise false
     */
    private boolean isDecimal(double value) {
        return value == (int) value;
    }

    /**
     * This method is where all of the calculations happen.
     */
    private void operation() {
        if (!Double.isNaN(op1)||!Double.isNaN(op2)) {
            switch (OPERATOR) {
                case ADDITION:
                    result = op1 + op2;
                    break;
                case SUBTRACTION:
                    result = op1 - op2;
                    break;
                case MULTIPLICATION:
                    result = op1 * op2;
                    break;
                case DIVISION:
                    if(op2 == 0.0){
                        result = Double.NaN;
                    } else {
                        result = op1 / op2;
                    }
                    break;
                case EXPONENT:
                    result = Math.pow(op1, op2);
                    break;
                case ROOT:
                    if(op1 < 0){
                        if(op2 % 2 == 0){
                            result = Double.NaN;
                        } else {
                            op1 = (-1) * op1;
                            result = Math.pow(op1, 1/op2);
                            result = (-1) * result;
                        }
                    } else {
                    result = Math.pow(op1, 1/op2);
                    }
                    break;
                case LOG:
                    result = Math.log10(op2);
                    break;
                case LN:
                    result = Math.log(op2);
                    break;
                case MOD:
                    result = (int)op1 % (int)op2;
                case EQUALTO:
                    break;
            }
            if(Double.isNaN(result)){
                output.setText("Error");
            } else {
                output.setText(String.valueOf(result));
            }
        } else {
            output.setText("Error");
        }

    }
    private void reset() {
        if(calculated) {
            firstOperand.setText("");
            secondOperand.setText("");
            output.setText("");
            calculated = false;
        }
    }

    /**
     * This method checks if the first text field has a selected mathematical operator.
     * @param firstOp - the String value of the first text field
     * @return true if it contains an operator or false otherwise
     */
    private boolean operatorSelected(String firstOp){
        return firstOp.contains("+")
                ||firstOp.contains("-")
                ||firstOp.contains("x")
                ||firstOp.contains("/")
                ||firstOp.contains("^")
                ||firstOp.contains("√")
                ||firstOp.contains("+")
                ||firstOp.contains("Log")
                ||firstOp.contains("Ln")
                ||firstOp.contains("%");

        }
}