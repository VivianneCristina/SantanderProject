package com.viviannecristina.santanderproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.viviannecristina.santanderproject.fragment.ContatoFragment;
import com.viviannecristina.santanderproject.fragment.InvestimentoFragment;
import com.viviannecristina.santanderproject.utils.PageAnimation;

public class MainActivity extends AppCompatActivity {

    private Button btnInvest, btnContato;

    private InvestimentoFragment investimentoFragment;
    private ContatoFragment contatoFragment;

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInvest = findViewById(R.id.btn_left);
        btnContato = findViewById(R.id.btn_right);


        fragmentManager = getSupportFragmentManager();


        investimentoFragment = new InvestimentoFragment();
        contatoFragment = new ContatoFragment();

        changeFragment(investimentoFragment, null);

        btnInvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              changeFragment(investimentoFragment, PageAnimation.SLIDE_LEFT_TO_RIGHT);
            }
        });

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(contatoFragment, PageAnimation.SLIDE_RIGHT_TO_LEFT);
            }
        });
    }

    private void changeFragment(Fragment fragment, PageAnimation pageAnimation){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if(null != pageAnimation) {
            int enter = pageAnimation.getInTransition();
            int exit = pageAnimation.getOutTransition();
            if (enter > 0 && exit > 0) {
                fragmentTransaction.setCustomAnimations(enter, exit);
            }
        }

        fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
    }

}
