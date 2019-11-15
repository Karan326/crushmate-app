package com.crushmateapp.crushmate.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crushmateapp.crushmate.R
import com.crushmateapp.crushmate.util.Chat
import com.squareup.picasso.Picasso

class ChatAdapter( private var chatlist: ArrayList<Chat>) : RecyclerView.Adapter<ChatAdapter.myviewHolder>() {

    fun addElement(chat: Chat) {
        chatlist.add(chat)
        notifyDataSetChanged()
    }

    class myviewHolder( val view: View): RecyclerView.ViewHolder(view)



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int):myviewHolder {

        var li=parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view=li.inflate(R.layout.chatfriendlist,parent,false)
        return myviewHolder(view)


    }

    override fun getItemCount() = chatlist.size

    override fun onBindViewHolder(holder: myviewHolder, position: Int) {
        val item1=this.chatlist[position]

         var layout = holder.view.findViewById<View>(R.id.chatLayout)
         var image = holder.view.findViewById<ImageView>(R.id.chatPictureIV)
         var name = holder.view.findViewById<TextView>(R.id.chatNameTV)

        name.text=item1.name
        if(image!=null){
            Picasso.get().load(item1.imageUrl).into(image)
        }
        layout.setOnClickListener{

        }


    }

}