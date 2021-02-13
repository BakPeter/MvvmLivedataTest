package com.bpapps.mvvmlivedatatest.network;

import com.bpapps.mvvmlivedatatest.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("volley_array.json")
    Call<List<MovieModel>> getMovieList();
}
