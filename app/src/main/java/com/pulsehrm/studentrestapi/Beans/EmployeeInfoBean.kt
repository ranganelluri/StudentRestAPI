package com.pulsehrm.studentrestapi.Beans

import com.google.gson.annotations.SerializedName

data class EmployeeInfoBean(@SerializedName("items")
                            val items: List<ItemsItem>?,
                            @SerializedName("first")
                            val first: First)