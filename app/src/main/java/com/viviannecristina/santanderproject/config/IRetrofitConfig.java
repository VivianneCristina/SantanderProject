package com.viviannecristina.santanderproject.config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface IRetrofitConfig {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://floating-mountain-50292.herokuapp.com/fund.json")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
