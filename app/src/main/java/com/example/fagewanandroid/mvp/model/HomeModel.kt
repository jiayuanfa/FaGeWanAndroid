package com.example.fagewanandroid.mvp.model

import com.example.fagewanandroid.http.RetrofitHelper
import com.example.fagewanandroid.mvp.bean.Article
import com.example.fagewanandroid.mvp.bean.ArticleResponseBody
import com.example.fagewanandroid.mvp.bean.Banner
import com.example.fagewanandroid.mvp.bean.HttpResult
import com.example.fagewanandroid.mvp.contract.HomeContract
import io.reactivex.Observable

class HomeModel: CommonModel(), HomeContract.Model {
    override fun requestBanner(): Observable<HttpResult<List<Banner>>> {
        return RetrofitHelper.service.getBanners()
    }

    override fun requestTopArticles(): Observable<HttpResult<MutableList<Article>>> {
        return RetrofitHelper.service.getTopArticles()
    }

    override fun requestArticles(num: Int): Observable<HttpResult<ArticleResponseBody>> {
        return RetrofitHelper.service.getArticles(num)
    }

}