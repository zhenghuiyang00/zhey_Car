package com.bwei.zhey_car.api;


import com.bwei.zhey_car.model.Cartentity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Api {
    @GET("small/order/verify/v1/findShoppingCart")
    Observable<Cartentity> getCartData(@Header("userId") int userId,@Header("sessionId") String sessionId);
}
