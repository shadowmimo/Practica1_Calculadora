package edu.cecyt9.ipn.practica1_calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    Double numero1,numero2,resultado,resultado2;
    int a,b,c;
    String operador;

    public void onClickButtonUno(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickButtonDos(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickButtonTres(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickButtonCuatro(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickButtonCinco(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickButtonSeis(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickButtonSiete(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickButtonOcho(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickButtonNueve(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickButtonCero(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "0");
    }

    public void onClickButtonPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("0");
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplica(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickFactorial(View miView)
    {
        operador="!";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickModulo(View miView)
    {
        operador="%";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickRaiz(View miView)
    {
        operador="√";
        onClickOperacionCapturaNumero1(miView);
        onClickIgual(miView);

    }
    public void onClickSumatoria(View miView)
    {
        operador="Σ";
        onClickOperacionCapturaNumero1(miView);
        onClickIgual(miView);
    }
    public void onClickCombina(View miView)
    {
        operador="C";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operador.equals("+")) {
                resultado = new Double(numero1 + numero2);
            } else if (operador.equals("-")) {
                resultado = new Double(numero1 - numero2);
            } else if (operador.equals("*")) {
                resultado = new Double(numero1 * numero2);
            } else if (operador.equals("/")) {
                resultado = new Double(numero1 / numero2);
            }else if (operador.equals("!")) {
                resultado = numero1;
                a=1;
                for(int i=2;i<=resultado;i++){
                    a= a*i;
                }
                resultado = new Double(a);
            }
            else if (operador.equals("C")) {
                resultado = numero1;
                resultado2=new Double(numero1-numero2);
                a=1;
                for(int i=2;i<=resultado;i++){
                    a= a*i;
                }
                b=1;
                for(int i=2;i<=resultado2;i++){
                    b= b*i;
                }
                c=1;
                for(int i=2;i<=numero2;i++){
                    c= c*i;
                }
                resultado = new Double(a/(c*b));
            }
            else if (operador.equals("√")) {
                resultado = new Double(Math.sqrt(numero1));
            }
            else if (operador.equals("%")) {
                resultado = new Double(numero1 % numero2);
            }
            else if (operador.equals("Σ")) {
                resultado = new Double(numero1*(numero1+1)/2);
            }
            tv.setText(resultado.toString());

        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }
    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText("");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
