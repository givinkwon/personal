package com.example.kotlin.activity.view.Mypage.My

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.activity.data.dataclass.Feed.Feed
import com.example.myapplication.R


class MypageMyRecyclerViewAdapter(private val context: Context): RecyclerView.Adapter<MypageMyRecyclerViewAdapter.ViewHolder>() {
    private var userList = mutableListOf<Feed>()

    // data init
    fun setListData(data:MutableList<Feed>){
        userList = data
    }

    // 뷰 홀더 만들기 => recycler_view_item.xml과 연결하여 view로 변환
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent, false)
        return ViewHolder(view)
    }

    // 데이터를 바인딩하여 뷰에 뿌려질 수 있도록
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user : Feed = userList[position]
        Log.d("NO..", "${position}")
        holder.name.text = user.content
        holder.age.text = user.title
        holder.region.text = user.title


    }

    // 화면에 가져올 아이템 개수 세기
    override fun getItemCount(): Int {
        return userList.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.home_name)
        val age : TextView = itemView.findViewById(R.id.home_profile_image)
        val region : TextView = itemView.findViewById(R.id.home_value)


    }

}