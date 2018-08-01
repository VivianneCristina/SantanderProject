package com.viviannecristina.santanderproject.config;

import com.viviannecristina.santanderproject.domain.SubScreen;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Routers {

    @GET("fund.json")
    Call<SubScreen> getSubScreen();
}
