package com.example.top10downloader

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewParent
import android.widget.ArrayAdapter
import android.widget.TextView

class ViewHolder(v: View){
    val tvName:TextView=v.findViewById(R.id.tvName)
    val tvArtist:TextView=v.findViewById(R.id.tvArtist)
    val tvSummary:TextView=v.findViewById(R.id.tvSummary)
}
class FeedAdapter(context: Context,private val resource:Int,private val applications:List<FeedAdapter>)
    :ArrayAdapter<FeedEntry>(context,resource){
  //  private val TAG = "FeedAdapter"
    private val inflater=LayoutInflater.from(context)

    override fun getView(position:Int,convertView: View?,parent: ViewParent?):View{
        //Log.d(TAG,"getViewcalled")
        val view:View
        val viewHolder:ViewHolder

        if (convertView==null){
         //   Log.d(TAG,"getView called with null convertView")
            view=inflater.inflate(resource,parent,false)

        }
    }
}
