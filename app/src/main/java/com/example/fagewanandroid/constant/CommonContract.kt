package com.example.fagewanandroid.constant

import com.example.fagewanandroid.base.IModel
import com.example.fagewanandroid.base.IPresenter
import com.example.fagewanandroid.base.IView
import com.example.fagewanandroid.mvp.bean.HttpResult
import io.reactivex.Observable

interface CommonContract {
    interface View : IView {

        fun showCollectSuccess(success: Boolean)

        fun showCancelCollectSuccess(success: Boolean)
    }

    interface Presenter<in V : View> : IPresenter<V> {

        fun addCollectArticle(id: Int)

        fun cancelCollectArticle(id: Int)

    }

    interface Model : IModel {

        fun addCollectArticle(id: Int): Observable<HttpResult<Any>>

        fun cancelCollectArticle(id: Int): Observable<HttpResult<Any>>

    }
}