package com.bagicode.jadwalsholatku.api;

import com.bagicode.jadwalsholatku.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("bengkulu.json")
    Call<ModelJadwal> getJadwal();

}
