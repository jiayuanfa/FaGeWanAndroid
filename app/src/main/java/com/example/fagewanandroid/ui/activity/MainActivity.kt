package com.example.fagewanandroid.ui.activity

import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction
import com.example.fagewanandroid.R
import com.example.fagewanandroid.base.BaseMvpActivity
import com.example.fagewanandroid.mvp.MainContract
import com.example.fagewanandroid.mvp.Presenter.MainPresenter
import com.example.fagewanandroid.ui.fragment.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * 使用MVP模式  VC中负责初始化 展示
 */
class MainActivity : BaseMvpActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {

    private val FRAGMENT_HOME = 0x01
    private val FRAGMENT_KNOWLEDGE = 0x02
    private val FRAGMENT_NAVIGATION = 0x03
    private val FRAGMENT_PROJECT = 0x04
    private val FRAGMENT_WECHAT = 0x05

    private var mIndex = FRAGMENT_HOME

    private var mHomeFragment: HomeFragment? = null
    private var mKnowledgeTreeFragment: KnowledgeTreeFragment? = null
    private var mNavigationFragment: NavigationFragment? = null
    private var mProjectFragment: ProjectFragment? = null
    private var mWeChatFragment: WeChatFragment? = null

    override fun createPresenter(): MainContract.Presenter = MainPresenter()

    override fun showLogoutSuccess(success: Boolean) {
    }

    override fun attachLayoutRes(): Int = R.layout.activity_main

    override fun initData() {
    }

    override fun initView() {

        toolbar.run {
            title = getString(R.string.app_name)
            setSupportActionBar(this as Toolbar?)
        }

        bottom_navigation.run {
            // 以前使用 BottomNavigationViewHelper.disableShiftMode(this) 方法来设置底部图标和字体都显示并去掉点击动画
            // 升级到 28.0.0 之后，官方重构了 BottomNavigationView ，目前可以使用 labelVisibilityMode = 1 来替代
            // BottomNavigationViewHelper.disableShiftMode(this)
        }

        showFragment(mIndex)
    }

    override fun start() {
    }

    /**
     * 展示Fragment
     */
    private fun showFragment(index: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        hideFragment(transaction)
        mIndex = index
        when(index) {
            FRAGMENT_HOME // 首页
            -> {
                toolbar.title = getString(R.string.app_name)
                if (mHomeFragment == null) {
                    mHomeFragment = HomeFragment.getInstance()
                    transaction.add(R.id.container, mHomeFragment!!, "home")
                } else {
                    transaction.show(mHomeFragment!!)
                }
            }
        }
        transaction.commit()
    }

    /**
     * 隐藏所有的Fragment
     */
    private fun hideFragment(transation: FragmentTransaction) {
        mHomeFragment?.let { transation.hide(it) }
    }
}
