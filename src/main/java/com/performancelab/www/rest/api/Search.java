package com.performancelab.www.rest.api;

import com.performancelab.www.rest.model.response.Full;
import com.performancelab.www.rest.model.response.baseResponse.BaseItemResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Search {

    @GET(ApiMethods.SEARCH)
    Call<Full<BaseItemResponse>> get(@Query("order") String order,
                                     @Query("sort") String sort,
                                     @Query("intitle") String intitle,
                                     @Query("site") String site
                                     );
}
