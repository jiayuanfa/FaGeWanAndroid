package com.example.fagewanandroid.mvp.Presenter

import com.example.fagewanandroid.base.BasePresenter
import com.example.fagewanandroid.constant.CommonContract
import com.example.fagewanandroid.ext.ss

open class CommonPresenter<M : CommonContract.Model, V : CommonContract.View> : BasePresenter<M, V>(), CommonContract.Presenter<V>{
    override fun addCollectArticle(id: Int) {
        mModel?.addCollectArticle(id)?.ss(mModel, mView) {
            mView?.showCollectSuccess(true)
        }
    }

    override fun cancelCollectArticle(id: Int) {
        mModel?.cancelCollectArticle(id)?.ss(mModel, mView) {
            mView?.showCancelCollectSuccess(true)
        }
    }
}