package com.example.fagewanandroid.mvp.contract

import com.example.fagewanandroid.constant.CommonContract
import com.example.fagewanandroid.mvp.bean.Article
import com.example.fagewanandroid.mvp.bean.ArticleResponseBody
import com.example.fagewanandroid.mvp.bean.Banner
import com.example.fagewanandroid.mvp.bean.HttpResult
import io.reactivex.Observable

interface HomeContract {

    interface View : CommonContract.View {

        fun scrollToTop()

        fun setBanner(banners: List<Banner>)

        fun setArticles(articles: ArticleResponseBody)

    }

    interface Presenter : CommonContract.Presenter<View> {

        fun requestBanner()

        fun requestHomeData()

        fun requestArticles(num: Int)

    }

    interface Model : CommonContract.Model {

        fun requestBanner(): Observable<HttpResult<List<Banner>>>

        fun requestTopArticles(): Observable<HttpResult<MutableList<Article>>>

        fun requestArticles(num: Int): Observable<HttpResult<ArticleResponseBody>>
    }

}