package vip.qsos.share

import android.os.Bundle
import android.os.Handler
import com.alibaba.android.arouter.launcher.ARouter
import qsos.lib.base.base.activity.BaseActivity

/**
 * @author : 华清松
 * TODO 类说明，描述此类的类型和用途
 */
class SplashActivity : BaseActivity() {
    override val layoutId: Int?
        get() = R.layout.activity_splash
    override val reload: Boolean
        get() = false

    override fun getData() {

    }

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun initView() {
        Handler().postDelayed({
            ARouter.getInstance().build("/app/main").navigation()
        }, 1500L)
    }
}