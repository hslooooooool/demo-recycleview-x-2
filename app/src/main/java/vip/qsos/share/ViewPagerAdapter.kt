package vip.qsos.share

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

/**
 * @author : 华清松
 * TODO 类说明，描述此类的类型和用途
 */
class ViewPagerAdapter(var data: ArrayList<View> = arrayListOf()) : PagerAdapter() {

    override fun getCount(): Int {
        return data.size
    }

    override fun isViewFromObject(view: View, value: Any): Boolean {
        return view == value
    }

    override fun destroyItem(container: ViewGroup, position: Int, value: Any) {
        container.removeView(data[position])
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        container.addView(data[position])
        return data[position]
    }

}