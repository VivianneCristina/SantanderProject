package com.viviannecristina.santanderproject.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.viviannecristina.santanderproject.R;
import com.viviannecristina.santanderproject.domain.SubScreen;
import com.viviannecristina.santanderproject.config.IRetrofitConfig;
import com.viviannecristina.santanderproject.config.Routers;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InvestimentoFragment extends Fragment {

    private Toolbar toolbarInvest;

    private TextView title, fundName, whatIs, definition, riskTitle, infoTitle;
    private Button button;
    private View view1, view2, view3, view4, view5;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_investimento, container, false);
        toolbarInvest = view.findViewById(R.id.toolbar_invest);

        toolbarInvest.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        title =  view.findViewById(R.id.tv_title);
        whatIs = view.findViewById(R.id.tv_what_is);
        fundName = view.findViewById(R.id.tv_fund_name);
        definition = view.findViewById(R.id.tv_definition);
        riskTitle = view.findViewById(R.id.tv_risk_title);
        infoTitle = view.findViewById(R.id.tv_info_title);
        view1 = view.findViewById(R.id.View1);
        //view2 = view.findViewById(R.id.View2);
        view3 = view.findViewById(R.id.View3);
        view4 = view.findViewById(R.id.View4);
        view5 = view.findViewById(R.id.View5);


        init();

        return view;
    }
    private void init(){

        Routers routers = IRetrofitConfig.retrofit.create(Routers.class);

        final Call<SubScreen> subScreen = routers.getSubScreen();

        subScreen.enqueue(new Callback<SubScreen>() {
            @Override
            public void onResponse(Call<SubScreen> call, Response<SubScreen> response) {

                SubScreen subScreenReturn = response.body();

                title.setText(subScreenReturn.getScreen().getTitle());
                fundName.setText(subScreenReturn.getScreen().getFundName());
                whatIs.setText(subScreenReturn.getScreen().getWhatIs());
                definition.setText(subScreenReturn.getScreen().getDefinition());
                riskTitle.setText(subScreenReturn.getScreen().getRiskTitle());
                infoTitle.setText(subScreenReturn.getScreen().getTitle());

                switch(subScreenReturn.getScreen().getRisk()){
                    case LOW:
                        ViewGroup.LayoutParams layoutParams = view1.getLayoutParams();
                        layoutParams.height = 5;
                        view1.setLayoutParams(layoutParams);
                        break;
                    case LOW_MEDIUM:
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        layoutParams2.height = 5;
                        view2.setLayoutParams(layoutParams2);
                        break;
                    case MEDIUM:
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        layoutParams3.height = 5;
                        view3.setLayoutParams(layoutParams3);
                        break;
                    case MEDIUM_HIGH:
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        layoutParams4.height = 5;
                        view4.setLayoutParams(layoutParams4);
                        break;
                    case HIGH:
                        ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                        layoutParams5.height = 5;
                        view5.setLayoutParams(layoutParams5);
                        break;
                }
            }

            @Override
            public void onFailure(Call<SubScreen> call, Throwable t) {

            }
        });
    }

}
