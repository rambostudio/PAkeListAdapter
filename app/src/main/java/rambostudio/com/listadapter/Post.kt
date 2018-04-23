package rambostudio.com.listadapter

import java.util.*

class Post(
        var name: String,
        var id: String = UUID.randomUUID().toString()
)