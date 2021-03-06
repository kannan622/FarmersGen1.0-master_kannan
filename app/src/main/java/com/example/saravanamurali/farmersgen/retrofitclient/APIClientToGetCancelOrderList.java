package com.example.saravanamurali.farmersgen.retrofitclient;

import com.example.saravanamurali.farmersgen.apiInterfaces.ApiInterface;
import com.example.saravanamurali.farmersgen.baseurl.BaseUrl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClientToGetCancelOrderList implements BaseUrl {

    static Retrofit retrofit=null;

    private static  Retrofit getAPIClientToGetCancelOrderList(){

        if(retrofit==null){

            retrofit =new Retrofit.Builder().baseUrl(BaseUrl.ROOT_URL_TO_GET_CANCEL_ORDER_LIST).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }

    public static ApiInterface getApiInterfaceToGetCancelOrderList(){

        ApiInterface apiInterface=APIClientToGetCancelOrderList.getAPIClientToGetCancelOrderList().create(ApiInterface.class);

        return apiInterface;
    }
}
