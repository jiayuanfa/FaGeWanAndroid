package com.example.fagewanandroid.mvp.bean

import com.squareup.moshi.Json

data class HttpResult<T>(
    @Json(name = "data") val data: T
) : BaseBean()