package com.example.saravanamurali.farmersgen.retrofitclient;

import com.example.saravanamurali.farmersgen.apiInterfaces.ApiInterface;
import com.example.saravanamurali.farmersgen.baseurl.BaseUrl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClientToLogin {

    public static Retrofit retrofit=null;

    private static Retrofit getAPIClientToLogin(){

        if(retrofit==null) {

            retrofit = new Retrofit.Builder().baseUrl(BaseUrl.ROOT_URL_FOR_LOGIN).addConverterFactory(GsonConverterFactory.create()).build();

        }

        return retrofit;
    }

    public static ApiInterface getApiInterfaceToLogin() {

        ApiInterface api = APIClientToLogin.getAPIClientToLogin().create(ApiInterface.class);

        return api;

    }
}
