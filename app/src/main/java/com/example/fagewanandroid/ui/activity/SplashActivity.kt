package com.example.fagewanandroid.ui.activity

import android.content.Intent
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
                    jumpToMain()
                }

                override fun onAnimationStart(animation: Animation?) {
                }

            })
        }
        layout_splash.startAnimation(alphaAnimation)
    }

    override fun start() {
    }

    fun jumpToMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

        // 切换到主视图过渡动画
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}