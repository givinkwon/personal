package com.example.kotlin.activity.data.dataclass.Feed

import com.example.kotlin.activity.data.dataclass.time

class FeedLike (
    val feedid:String = "글_피드ID",
    val user:String = "좋아요한 사람",
    val createdAt: java.util.Date = time.getTime() as java.util.Date,
)