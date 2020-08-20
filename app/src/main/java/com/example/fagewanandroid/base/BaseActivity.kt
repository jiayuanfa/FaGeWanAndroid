package com.example.fagewanandroid.base

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.*

abstract class BaseActivity : AppCompatActivity() {

    /**
     * 布局文件id
     */
    protected abstract fun attachLayoutRes(): Int

    /**
     * 初始化数据
     */
    abstract fun initData()

    /**
     * 初始化 View
     */
    abstract fun initView()

    /**
     * 开始请求
     */
    abstract fun start()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(attachLayoutRes())
        initData()
        initView()
        start()
    }

    /**
     * 隐藏底部菜单栏
     */
    @SuppressLint("ObsoleteSdkInt")
    private fun hideBottomUIMenu() {
        val v = window.decorView
        if (Build.VERSION.SDK_INT in 12..18) {
            v.systemUiVisibility = View.GONE
        } else if (Build.VERSION.SDK_INT >= 19) {
            val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_FULLSCREEN)
            v.systemUiVisibility = uiOptions
        }
    }
}