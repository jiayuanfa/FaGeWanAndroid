package com.example.fagewanandroid.mvp.model

import com.example.fagewanandroid.base.BaseModel
import com.example.fagewanandroid.constant.CommonContract
import com.example.fagewanandroid.http.RetrofitHelper
import com.example.fagewanandroid.mvp.bean.HttpResult
import io.reactivex.Observable

open class CommonModel: BaseModel(), CommonContract.Model {
    override fun addCollectArticle(id: Int): Observable<HttpResult<Any>> {
        return RetrofitHelper.service.addCollectArticle(id)
    }

    override fun cancelCollectArticle(id: Int): Observable<HttpResult<Any>> {
        return RetrofitHelper.service.cancelCollectArticle(id)
    }
}