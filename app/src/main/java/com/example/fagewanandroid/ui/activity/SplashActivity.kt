package com.example.fagewanandroid.ui.activity

import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import com.example.fagewanandroid.R
import com.example.fagewanandroid.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity (){

    private var alphaAnimation : AlphaAnimation ?  = null

    override fun attachLayoutRes(): Int  = R.layout.activity_splash

    override fun initData() {
    }

    override fun initView() {
        alphaAnimation = AlphaAnimation(0.3F, 1.0F)
        alphaAnimation?.run {
            duration = 2000
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationRepeat(animation: Animation?) {
                }

                override fun onAnimationEnd(animation: Animation?) {
                }

                override fun onAnimationStart(animation: Animation?) {
                }

            })
        }
        layout_splash.startAnimation(alphaAnimation)
    }

    override fun start() {
    }
}