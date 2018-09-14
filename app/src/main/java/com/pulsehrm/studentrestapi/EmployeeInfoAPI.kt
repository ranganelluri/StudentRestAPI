package com.pulsehrm.studentrestapi

import com.pulsehrm.studentrestapi.Beans.EmployeeInfoBean
import retrofit2.Call
import retrofit2.http.GET

interface EmployeeInfoAPI {

    @GET("pls/apex/ranga_apex/hr/empinfo/")
    fun read ():Call<EmployeeInfoBean>
}