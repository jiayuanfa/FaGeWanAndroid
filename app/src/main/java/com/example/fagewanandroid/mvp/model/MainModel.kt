package com.example.fagewanandroid.mvp.model

import com.example.fagewanandroid.base.BaseModel
import com.example.fagewanandroid.http.RetrofitHelper
import com.example.fagewanandroid.mvp.MainContract
import com.example.fagewanandroid.mvp.bean.HttpResult
import io.reactivex.Observable

class MainModel : BaseModel(), MainContract.Model {

    override fun logout(): Observable<HttpResult<Any>> {
        return RetrofitHelper.service.logout()
    }

}