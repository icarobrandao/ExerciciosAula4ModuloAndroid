package com.example.icarobrandao.exercicioaula4.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.icarobrandao.exercicioaula4.R;
import com.example.icarobrandao.exercicioaula4.models.User;
import com.example.icarobrandao.exercicioaula4.utils.Constants;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by icarobrandao on 06/05/16.
 */
public class MainActivity extends AppCompatActivity{
    @Bind(R.id.edit_text_nome)
    EditText edit_text_nome;
    @Bind(R.id.edit_text_cargo)
    EditText edit_text_cargo;
    @Bind(R.id.edit_text_salario)
    EditText edit_text_salario;

    @Bind(R.id.button_open_activity_b)
    Button button_open_activity_b;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        button_open_activity_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BActivity.class);
                User user = new User();

                if (edit_text_nome.getText().toString()!=""|| edit_text_cargo.getText().toString()!=""||edit_text_salario.getText().toString()!="") {
                    user.setNome(edit_text_nome.getText().toString());
                    user.setCargo(edit_text_cargo.getText().toString());
                    Double aux = Double.parseDouble(edit_text_salario.getText().toString());
                    aux = 0.9 * aux;
                    user.setSalario(aux);
                    i.putExtra(Constants.EXTRA_FOR_B, user);
                    startActivity(i);
                }else{
                    i.putExtra(Constants.EXTRA_FOR_INVALIDO,true);
                    startActivity(i);
                }
            }
        });





    }


}
