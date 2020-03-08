package vip.qsos.share

import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.frag_main_collect.*
import kotlinx.android.synthetic.main.item_collect.view.*
import kotlinx.android.synthetic.main.item_collect_list.view.*
import qsos.lib.base.base.adapter.BaseNormalAdapter
import qsos.lib.base.base.fragment.BaseFragment

/**
 * @author : 华清松
 * TODO 类说明，描述此类的类型和用途
 */
class CollectFragment : BaseFragment() {
    override val layoutId: Int?
        get() = R.layout.frag_main_collect
    override val reload: Boolean
        get() = false

    override fun getData() {}

    override fun initData(savedInstanceState: Bundle?) {}

    override fun initView(view: View) {
        item_main_collect_list.layoutManager = LinearLayoutManager(activity)
        item_main_collect_list.adapter = BaseNormalAdapter(
            layoutId = R.layout.item_collect_list,
            list = arrayListOf(
                "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST",
                "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST",
                "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST",
                "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST",
                "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST",
                "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST", "TEST"
            ),
            setHolder = { holder, data, position ->
                val layoutManager = LinearLayoutManager(holder.itemView.context)
                layoutManager.orientation = LinearLayoutManager.HORIZONTAL
                holder.itemView.item_collect_list.layoutManager = layoutManager
                holder.itemView.item_collect_title.text = data

                holder.itemView.item_collect_list.adapter = BaseNormalAdapter(
                    layoutId = R.layout.item_collect,
                    list = arrayListOf(
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher),
                        ItemData("ic_launcher", R.drawable.ic_launcher)
                    ),
                    setHolder = { holder1, data1, _ ->
                        holder1.itemView.item_collect_name.text = data1.name
                        holder1.itemView.item_collect_icon.setImageDrawable(
                            ContextCompat.getDrawable(
                                activity!!, data1.icon
                            )
                        )
                    }
                )
            }
        )
    }

    data class ItemData(val name: String, @DrawableRes val icon: Int)
}