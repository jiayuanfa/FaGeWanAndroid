package com.example.fagewanandroid.ui.fragment

import com.example.fagewanandroid.base.BaseMvpFragment
import com.example.fagewanandroid.mvp.bean.ArticleResponseBody
import com.example.fagewanandroid.mvp.bean.Banner
import com.example.fagewanandroid.mvp.contract.HomeContract

class HomeFragment : BaseMvpFragment<HomeContract.View, HomeContract.Presenter>(), HomeContract.View {

    companion object {
        fun getInstance(): HomeFragment = HomeFragment()
    }

    override fun createPresenter(): HomeContract.Presenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attachLayoutRes(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lazyLoad() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun scrollToTop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBanner(banners: List<Banner>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setArticles(articles: ArticleResponseBody) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showCollectSuccess(success: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showCancelCollectSuccess(success: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}