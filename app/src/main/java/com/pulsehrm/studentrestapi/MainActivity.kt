package com.pulsehrm.studentrestapi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.pulsehrm.studentrestapi.Beans.EmployeeInfoBean
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://apex.oracle.com/").build()

        var api = r.create(EmployeeInfoAPI::class.java)

        show.setOnClickListener {

             var call = api.read()

            call.enqueue(object : Callback<EmployeeInfoBean> {
                override fun onFailure(call: Call<EmployeeInfoBean>?, t: Throwable?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onResponse(call: Call<EmployeeInfoBean>?, response: Response<EmployeeInfoBean>?) {


                    var bean = response!!.body()

                    var list = mutableListOf<String>()

                    var item = bean!!.items

                    for (i in item!!){
                        list.add("empno :"+i.empno)
                        list.add("ename :"+i.ename)
                        list.add("mgr :"+i.mgr)
                        list.add("hiredate :"+i.hiredate)
                        list.add("sal :"+i.sal)
                        list.add("comm :"+i.comm)
                        list.add("deptno :"+i.deptno)
                    }

                    var myadapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_single_choice)
                    lview.adapter = myadapter
                }

            })
        }

    }

}
