package com.efs.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtFirstNumber;
    private EditText editTxtSecondNumber;
    private TextView txtConclusion;
    private String firstNumber;
    private String secondNumber;
    private int n1;
    private int n2;
    private int c;
    private Conclusion conclusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtFirstNumber = (EditText) findViewById(R.id.txtFirstNumber);
        editTxtSecondNumber = (EditText) findViewById(R.id.txtSecondNumber);
        txtConclusion = (TextView) findViewById(R.id.txtViewConclusion);

    }
    public void btnConclusion(View v) {
        firstNumber = editTxtFirstNumber.getText().toString();
        secondNumber = editTxtSecondNumber.getText().toString();

        if (!TextUtils.isEmpty(firstNumber) && !TextUtils.isEmpty(secondNumber)) {
            n1 = Integer.valueOf(firstNumber);
            n2 = Integer.valueOf(secondNumber);
            conclusion = new Conclusion(n1, n2);

            if (v.getId() == R.id.btnPlus) {
                c = conclusion.Plus();
            } else if (v.getId() == R.id.btnMinus) {
                c = conclusion.Minus();
            } else if (v.getId() == R.id.btnMultiply) {
                c = conclusion.Multiply();
            } else if (v.getId() == R.id.btnDivide) {
                c = conclusion.Divide();
            }

            txtConclusion.setText("conclusion: " + c);
        } else {
            txtConclusion.setText("Entered values cannot be empty");
        }
    }

}