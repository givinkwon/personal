package com.example.kotlin.activity.data.dataclass.Fan

import com.example.kotlin.activity.data.dataclass.time

class FanReply (
    val fanid:String = "글_팬ID",
    val user:String = "댓글 쓴 사람",
    val content: String = "댓글 내용",
    val createdAt: java.util.Date = time.getTime() as java.util.Date,
)