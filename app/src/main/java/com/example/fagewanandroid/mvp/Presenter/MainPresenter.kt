package com.example.fagewanandroid.mvp.Presenter

import com.example.fagewanandroid.base.BasePresenter
import com.example.fagewanandroid.ext.ss
import com.example.fagewanandroid.mvp.MainContract
import com.example.fagewanandroid.mvp.model.MainModel

class MainPresenter : BasePresenter<MainContract.Model, MainContract.View>(), MainContract.Presenter {

    override fun createModel(): MainContract.Model? = MainModel()

    override fun logout() {
        mModel?.logout()?.ss(mModel, mView) {
            mView?.showLogoutSuccess(success = true)
        }
    }
}