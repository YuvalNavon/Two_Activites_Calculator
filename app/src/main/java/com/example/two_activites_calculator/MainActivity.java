package com.example.two_activites_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    String text;
    char lastPressed;
    String S_lastPressed;
    int signIndex;
    boolean firstPress;
    int secondNum;
    int result;
    int recentResult;
    boolean Syntax;
    Intent cred;
    Intent fromcred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextNumber);
        cred = new Intent(this, Credits_Screen.class);
        fromcred = getIntent();
        recentResult = fromcred.getIntExtra("sameresult",0);
        if (recentResult==0) et.setText("");
        else et.setText(Integer.toString(recentResult));
        Syntax = false;
        firstPress = true;

    }

    public void plus(View view) {
        text = et.getText().toString();
        if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/") )
        {
            Syntax = true;
            et.setText(Integer.toString(result) + lastPressed + "+");
        }
        if (Syntax == false)
        {
            if (firstPress == false)
            {
                signIndex = text.indexOf(lastPressed);
                result = Integer.parseInt(text.substring(0,signIndex));
                secondNum = Integer.parseInt(text.substring(signIndex+1));
                if (lastPressed == '+')
                {
                    result = result + secondNum;
                }
                if (lastPressed == '-')
                {
                    result = result - secondNum;
                }
                if (lastPressed == '*')
                {
                    result = result * secondNum;
                }
                if (lastPressed == '/')
                {
                    result = result / secondNum;
                }


                et.setText( Integer.toString(result)+ "+"  );
            }
            else
            {
                firstPress = false;
                result = Integer.parseInt(text.substring(0));
                et.setText( Integer.toString(result)+ "+");
            }
        }

        lastPressed = '+';
        S_lastPressed = String.valueOf(lastPressed);
        }





    public void minus(View view) {
        text = et.getText().toString();
        if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/") )
        {
            Syntax = true;
            et.setText(Integer.toString(result) + lastPressed + "-");
        }
        if (Syntax == false)
        {
            if (firstPress == false)
            {
                signIndex = text.indexOf(lastPressed);
                result = Integer.parseInt(text.substring(0,signIndex));
                secondNum = Integer.parseInt(text.substring(signIndex+1));
                if (lastPressed == '+')
                {
                    result = result + secondNum;
                }
                if (lastPressed == '-')
                {
                    result = result - secondNum;
                }
                if (lastPressed == '*')
                {
                    result = result * secondNum;
                }
                if (lastPressed == '/')
                {
                    result = result / secondNum;
                }


                et.setText( Integer.toString(result)+ "-"  );
            }
            else
            {
                firstPress = false;
                result = Integer.parseInt(text.substring(0));
                et.setText( Integer.toString(result)+ "-");
            }
        }

        lastPressed = '-';
        S_lastPressed = String.valueOf(lastPressed);
    }


    public void multiply(View view) {
        text = et.getText().toString();
        if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/") )
        {
            Syntax = true;
            et.setText(Integer.toString(result) + lastPressed + "*");
        }
        if (Syntax == false)
        {
            if (firstPress == false)
            {
                signIndex = text.indexOf(lastPressed);
                result = Integer.parseInt(text.substring(0,signIndex));
                secondNum = Integer.parseInt(text.substring(signIndex+1));
                if (lastPressed == '+')
                {
                    result = result + secondNum;
                }
                if (lastPressed == '-')
                {
                    result = result - secondNum;
                }
                if (lastPressed == '*')
                {
                    result = result * secondNum;
                }
                if (lastPressed == '/')
                {
                    result = result / secondNum;
                }


                et.setText( Integer.toString(result)+ "*"  );
            }
            else
            {
                firstPress = false;
                result = Integer.parseInt(text.substring(0));
                et.setText( Integer.toString(result)+ "*");
            }
        }

        lastPressed = '*';
        S_lastPressed = String.valueOf(lastPressed);
    }


    public void divide(View view) {
        text = et.getText().toString();
        if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/") )
        {
            Syntax = true;
            et.setText(Integer.toString(result) + lastPressed + "/");
        }
        if (Syntax == false)
        {
            if (firstPress == false)
            {
                signIndex = text.indexOf(lastPressed);
                result = Integer.parseInt(text.substring(0,signIndex));
                secondNum = Integer.parseInt(text.substring(signIndex+1));
                if (lastPressed == '+')
                {
                    result = result + secondNum;
                }
                if (lastPressed == '-')
                {
                    result = result - secondNum;
                }
                if (lastPressed == '*')
                {
                    result = result + secondNum;
                }
                if (lastPressed == '/')
                {
                    result = result - secondNum;
                }


                et.setText( Integer.toString(result)+ "+"  );
            }
            else
            {
                firstPress = false;
                result = Integer.parseInt(text.substring(0));
                et.setText( Integer.toString(result)+ "/");
            }
        }

        lastPressed = '/';
        S_lastPressed = String.valueOf(lastPressed);
    }


    public void AC(View view) {
        et.setText("");
        Syntax = false;
        firstPress = true;
    }

    public void equal(View view) {
        text = et.getText().toString();
        if (Syntax == true)
        {
            et.setText("Syntax Error");
        }
        else {
            if (firstPress == false)
            {
                signIndex = text.indexOf(lastPressed);
                result = Integer.parseInt(text.substring(0,signIndex));
                if ( text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/"))
                {
                    et.setText(Integer.toString(result));
                    firstPress = true;
                }
                else
                    {
                        secondNum = Integer.parseInt(text.substring(signIndex+1));
                        if (lastPressed == '+')
                        {
                            result = result + secondNum;
                        }
                        if (lastPressed == '-')
                        {
                            result = result - secondNum;
                        }
                        if (lastPressed == '*')
                        {
                            result = result * secondNum;
                        }
                        if (lastPressed == '/')
                        {
                            result = result / secondNum;
                        }
                        et.setText(Integer.toString(result));

                    }


            }







        }
        Syntax = false;

    }

    public void credits(View view) {
        cred.putExtra("finalresult", result);
        startActivity(cred);
    }
}