package com.performancelab.www.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static final String STACKOVERFLOW_BASE_URL = "http://api.stackexchange.com/2.2/";

    private Retrofit mRetrofit;

    public RestClient() {

        mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(STACKOVERFLOW_BASE_URL)
                .build();
    }

    public <S> S createService(Class<S> serviceClass) {
        return mRetrofit.create(serviceClass);
    }
}
