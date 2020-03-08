package vip.qsos.share

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * @author : 华清松
 *
 * 片段 适配器
 */
class FragmentPagerAdapter(fm: FragmentManager, var data: ArrayList<Fragment> = arrayListOf()) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return data[position]
    }

    override fun getCount(): Int {
        return data.size
    }

}
