package com.example.icarobrandao.exercicioaula4.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.icarobrandao.exercicioaula4.R;
import com.example.icarobrandao.exercicioaula4.models.User;
import com.example.icarobrandao.exercicioaula4.utils.Constants;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by icarobrandao on 06/05/16.
 */
public class BActivity  extends AppCompatActivity {
    @Bind(R.id.title_activity_b)
    TextView title_activity_b;
    @Bind(R.id.button_back_to_activity_main)
    Button button_back_to_activity_main;

    private User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.bind(this);

        if (getIntent().getExtras() !=null) {
            if (getIntent().getExtras().containsKey(Constants.EXTRA_FOR_B)) {
                user = (User) getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
            }
        }else{
            if(getIntent().getExtras().getBoolean(Constants.EXTRA_FOR_INVALIDO, false)){
                title_activity_b.setText("USUÁRIO INVÁLIDO!");
            }
        }

        if (user != null) {
            title_activity_b.setText(String.format("%s\n%s\n%s", user.getNome(), user.getCargo(), user.getSalario()));
        }




        button_back_to_activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
