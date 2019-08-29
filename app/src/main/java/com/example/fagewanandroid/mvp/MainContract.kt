package com.example.fagewanandroid.mvp

import com.example.fagewanandroid.base.IModel
import com.example.fagewanandroid.base.IPresenter
import com.example.fagewanandroid.base.IView
import com.example.fagewanandroid.mvp.bean.HttpResult
import io.reactivex.Observable

interface MainContract {

    interface View : IView {
        fun showLogoutSuccess(success: Boolean)
    }
    interface Presenter : IPresenter<View> {

        fun logout()

    }

    interface Model : IModel {

        fun logout(): Observable<HttpResult<Any>>

    }
}