package com.renanrhoden.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesDoSignoActivity extends AppCompatActivity {

    private TextView nomeDoSigno;
    private TextView detalheDoSigno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_do_signo);

        nomeDoSigno = (TextView) findViewById(R.id.nomeDoSignoID);
        detalheDoSigno = (TextView) findViewById(R.id.detalhesDoSignoID);

        nomeDoSigno.setText(getIntent().getStringExtra("signo"));
        detalheDoSigno.setText(getIntent().getStringExtra("detalhes"));


    }
}
