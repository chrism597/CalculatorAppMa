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

    @SuppressLint("MissingInflatedId")
    @Override
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
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "1");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "2");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "3");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "4");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "5");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "6");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "7");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "8");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "9");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "9");
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + "0");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + "0");
                }
            }
        });
        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (firstOperand.hasFocus()) {
                    firstOperand.setText(firstOperand.getText().toString() + ".");
                } else {
                    secondOperand.setText(secondOperand.getText().toString() + ".");
                }
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = ADDITION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " + ");
                    } else {
                        firstOperand.setText((int) op1 + " + ");
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = SUBTRACTION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " - ");
                    } else {
                        firstOperand.setText((int) op1 + " - ");
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = MULTIPLICATION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " x ");
                    } else {
                        firstOperand.setText((int) op1 + " x ");
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = DIVISION;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    firstOperand.setText(op1 + " / ");
                } else {
                    output.setText("Error");
                }

            }
        });
        bPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = EXPONENT;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    firstOperand.setText(op1 + " ^ ");
                } else {
                    output.setText("Error");
                }

            }
        });
        bRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = ROOT;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    firstOperand.setText(" √ " + op1);
                } else {
                    output.setText("Error");
                }

            }
        });
        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() == 0) {
                    OPERATOR = LOG;
                    firstOperand.setText("Log ");
                } else {
                    output.setText("Error");
                }

            }
        });
        bLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() == 0) {
                    OPERATOR = LN;
                    firstOperand.setText("Ln ");
                } else {
                    output.setText("Error");
                }

            }
        });
        bMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstOperand.getText().length() > 0 && !operatorSelected(firstOperand.getText().toString())) {
                    OPERATOR = MOD;
                    op1 = Double.parseDouble(firstOperand.getText().toString());
                    if (!isDecimal(op1)) {
                        firstOperand.setText(op1 + " % ");
                    } else {
                        firstOperand.setText((int) op1 + " % ");
                    }
                } else {
                    output.setText("Error");
                }

            }
        });
        bNegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (firstOperand.hasFocus()) {
                    if(firstOperand.length() > 0 && !operatorSelected(firstOperand.getText().toString())){
                        if(!firstOperand.getText().toString().contains("-")) {
                            firstOperand.setText("-" + firstOperand.getText().toString());
                            op1 = Double.parseDouble(firstOperand.getText().toString());
                        }
                    }
                } else {
                    if(secondOperand.length() > 0 && !operatorSelected(firstOperand.getText().toString())){
                        if(!secondOperand.getText().toString().contains("-")) {
                            secondOperand.setText("-" + secondOperand.getText().toString());
                            op2 = Double.parseDouble(secondOperand.getText().toString());
                        }
                    }

                }
            }
        });
        bEqualsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (secondOperand.getText().length() > 0) {
                    //OPERATOR = EQUALTO;
                    op2 = Double.parseDouble(secondOperand.getText().toString());
                    if (!isDecimal(op2)) {
                        secondOperand.setText(String.valueOf(op2));
                    } else {
                        secondOperand.setText(String.valueOf((int) op2));
                    }
                } else {
                    output.setText("Error");
                }
                operation();
                firstOperand.requestFocus();
            }
        });
        bAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstOperand.setText("");
                secondOperand.setText("");
                output.setText("");
            }

        });
        bDeleteOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempStr = "";
                if(firstOperand.hasFocus() && firstOperand.length() > 0) {
                    tempStr = firstOperand.getText().toString().substring(0,firstOperand.getText().toString().length()-1);
                    firstOperand.setText(tempStr);
                } else if(secondOperand.hasFocus() && secondOperand.length() > 0){
                    tempStr = secondOperand.getText().toString().substring(0,secondOperand.getText().toString().length()-1);
                    secondOperand.setText(tempStr);
                }
            }

        });

    }
    private void ifErrorOnOutput() {
        if (output.getText().toString().equals("Error")) {
            output.setText("");
        }
    }
    private void exceedLength() {
        if (firstOperand.getText().toString().length() > 16) {
            firstOperand.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
        }
    }
    private boolean isDecimal(double value) {
        return value == (int) value;
    }

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