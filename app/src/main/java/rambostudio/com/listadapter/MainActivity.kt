package rambostudio.com.listadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mAdapter: PostAdapter
    var postList :MutableList<Post> = mutableListOf()
    init {
        initData()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAdapter = PostAdapter()
        updatePostList(postList)

        rvPost.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = mAdapter
        }

        Handler().postDelayed({
            postList.removeAt(2)
            mAdapter.submitList(postList)
            rvPost.adapter  = mAdapter
        },5000)
    }

    private fun initData() {
        postList.add(Post("A"))
        postList.add(Post("B"))
        postList.add(Post("C"))
        postList.add(Post("D"))
        postList.add(Post("E"))
    }

    private fun updatePostList(newPostList: List<Post>) {
        mAdapter.submitList(newPostList)
    }
}
