package vip.qsos.share

import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.alibaba.android.arouter.facade.annotation.Route
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import qsos.lib.base.base.activity.BaseActivity

/**
 * @author : 华清松
 * TODO 类说明，描述此类的类型和用途
 */
@Route(group = "app", path = "/app/main")
class MainActivity : BaseActivity() {
    override val layoutId: Int?
        get() = R.layout.activity_main
    override val reload: Boolean
        get() = false

    private lateinit var mAdapter: FragmentPagerAdapter

    override fun getData() {}

    override fun initData(savedInstanceState: Bundle?) {}

    override fun initView() {
        mAdapter = FragmentPagerAdapter(supportFragmentManager)
        mAdapter.data.add(CollectFragment())
        mAdapter.data.add(CollectFragment())
        mAdapter.data.add(CollectFragment())
        mAdapter.data.add(CollectFragment())
        act_main_pager.adapter = mAdapter
        act_main_pager.addOnPageChangeListener(mOnPageChangeListener)
        act_main_nav.setOnNavigationItemSelectedListener(mNavigationItemSelectedListener)
    }

    private val mOnPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {}

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
        }

        override fun onPageSelected(position: Int) {
            when (position) {
                0 -> act_main_nav.selectedItemId = R.id.bottom_navigation_blue
                1 -> act_main_nav.selectedItemId = R.id.bottom_navigation_green
                2 -> act_main_nav.selectedItemId = R.id.bottom_navigation_yellow
                3 -> act_main_nav.selectedItemId = R.id.bottom_navigation_red
            }
        }
    }

    private val mNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_navigation_blue -> {
                    act_main_pager.currentItem = 0
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bottom_navigation_green -> {
                    act_main_pager.currentItem = 1
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bottom_navigation_yellow -> {
                    act_main_pager.currentItem = 2
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bottom_navigation_red -> {
                    act_main_pager.currentItem = 3
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
}