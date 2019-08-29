package com.example.fagewanandroid.ui.activity

import com.example.fagewanandroid.R
import com.example.fagewanandroid.base.BaseMvpActivity
import com.example.fagewanandroid.mvp.MainContract
import com.example.fagewanandroid.mvp.Presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * 使用MVP模式  VC中负责初始化 展示
 */
class MainActivity : BaseMvpActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {
    override fun createPresenter(): MainContract.Presenter = MainPresenter()

    override fun showLogoutSuccess(success: Boolean) {
    }

    override fun attachLayoutRes(): Int = R.layout.activity_main

    override fun initData() {
    }

    override fun initView() {

        toolbar.run {
            title = getString(R.string.app_name)
            setSupportActionBar(this)
        }

        bottom_navigation.run {
            // 以前使用 BottomNavigationViewHelper.disableShiftMode(this) 方法来设置底部图标和字体都显示并去掉点击动画
            // 升级到 28.0.0 之后，官方重构了 BottomNavigationView ，目前可以使用 labelVisibilityMode = 1 来替代
            // BottomNavigationViewHelper.disableShiftMode(this)
            labelVisibilityMode = 1
        }
    }

    override fun start() {
    }
}
