package com.pulsehrm.studentrestapi.Beans

import com.google.gson.annotations.SerializedName

data class ItemsItem(@SerializedName("ename")
                     val ename: String = "",
                     @SerializedName("comm")
                     val comm: String = "Null",
                     @SerializedName("mgr")
                     val mgr: String = "Null",
                     @SerializedName("empno")
                     val empno: Int = 0,
                     @SerializedName("job")
                     val job: String = "",
                     @SerializedName("hiredate")
                     val hiredate: String = "",
                     @SerializedName("deptno")
                     val deptno: Int = 0,
                     @SerializedName("sal")
                     val sal: Int = 0)