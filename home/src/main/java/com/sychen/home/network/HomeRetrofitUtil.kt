package com.sychen.home.network

import com.sychen.basic.RetrofitUtil

object HomeRetrofitUtil {
    val api: API = RetrofitUtil.create(API::class.java)
}