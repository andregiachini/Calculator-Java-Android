package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis, numeroSete,
                   numeroOito, numeroNove, ponto, soma, subtracao, multiplicacao, divisao, igual, botao_limpar;

    private TextView txtExpressao, txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();

        numeroZero.setOnClickListener(this);
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        divisao.setOnClickListener(this);

        botao_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpressao.setText("");
                txtResultado.setText("");
            }
        });
    }



    private void iniciarComponentes(){
        numeroZero = findViewById(R.id.numero_zero);
        numeroUm = findViewById(R.id.numero_um);
        numeroDois = findViewById(R.id.numero_dois);
        numeroTres = findViewById(R.id.numero_tres);
        numeroQuatro = findViewById(R.id.numero_quatro);
        numeroCinco = findViewById(R.id.numero_cinco);
        numeroSeis = findViewById(R.id.numero_seis);
        numeroSete = findViewById(R.id.numero_sete);
        numeroOito = findViewById(R.id.numero_oito);
        numeroNove = findViewById(R.id.numero_nove);
        ponto = findViewById(R.id.bt_ponto);
        soma = findViewById(R.id.bt_soma);
        subtracao = findViewById(R.id.bt_subtrai);
        multiplicacao = findViewById(R.id.bt_multiplica);
        divisao = findViewById(R.id.bt_divisao);
        igual = findViewById(R.id.bt_igual);
        botao_limpar = findViewById(R.id.bt_limpar);
        txtExpressao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
    }


    public void acrescentarExpressao(String string, boolean limparDados){
        if (txtResultado.getText().equals("")){
            txtExpressao.setText("");
        }

        if (limparDados){
            txtResultado.setText("");
            txtExpressao.append(string);
        }else {
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_zero:
                acrescentarExpressao("0", true);
                break;

            case R.id.numero_um:
                acrescentarExpressao("1", true);
                break;
            case R.id.numero_dois:
                acrescentarExpressao("2", true);
                break;
            case R.id.numero_tres:
                acrescentarExpressao("3", true);
                break;
            case R.id.numero_quatro:
                acrescentarExpressao("4", true);
                break;
            case R.id.numero_cinco:
                acrescentarExpressao("5", true);
                break;
            case R.id.numero_seis:
                acrescentarExpressao("6", true);
                break;
            case R.id.numero_sete:
                acrescentarExpressao("7", true);
                break;
            case R.id.numero_oito:
                acrescentarExpressao("8", true);
                break;
            case R.id.numero_nove:
                acrescentarExpressao("9", true);
                break;
            case R.id.bt_ponto:
                acrescentarExpressao(".", true);
                break;
            case R.id.bt_soma:
                acrescentarExpressao("+", false);
                break;
            case R.id.bt_subtrai:
                acrescentarExpressao("-", false);
                break;
            case R.id.bt_multiplica:
                acrescentarExpressao("*", false);
                break;
            case R.id.bt_divisao:
                acrescentarExpressao("/", false);
                break;



        }
    }
}