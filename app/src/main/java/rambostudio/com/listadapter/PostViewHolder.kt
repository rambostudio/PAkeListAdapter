package rambostudio.com.listadapter

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_post.view.*

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(item: Post,  listener: ((item: Post) -> Unit)?) = with(itemView){
        itemView.tvName.text = item.name
        setOnClickListener { listener?.invoke(item) }
    }
}
