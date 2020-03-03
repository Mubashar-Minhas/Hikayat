package com.example.hikayatapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder



class CustomAdapter(data: ArrayList<DataModel>) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    private val dataSet: ArrayList<DataModel> = data

    class MyViewHolder(itemView: View) :
        ViewHolder(itemView) {
        var textViewName: TextView
        var textViewVersion: TextView
        var textViewAuthor:TextView
        lateinit var textViewDescription:TextView

     //   var imageViewIcon: ImageView

        init {
//            imageViewIcon =
            textViewName =
                itemView.findViewById<View>(R.id.textViewName) as TextView
            textViewAuthor=
               itemView.findViewById(R.id.textViewAuthor)as TextView
            textViewDescription =
                itemView.findViewById<View>(R.id.textViewDescription) as TextView
            textViewVersion =
                itemView.findViewById<View>(R.id.textViewVersion) as TextView
//                itemView.findViewById<View>(R.id.imageView) as ImageView
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder
    {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.cards_layout, parent, false)
        //view.setOnClickListener(MainActivity.myOnClickListener)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(
        holder: MyViewHolder,
        listPosition: Int
    )
    {
        val textViewName = holder.textViewName
       val textViewAuthor = holder.textViewAuthor
        val textViewDescription = holder.textViewDescription
        val textViewVersion = holder.textViewVersion


        textViewName.text = dataSet[listPosition].name
        textViewAuthor.text = dataSet[listPosition].author
        textViewDescription.text = dataSet[listPosition].description
        textViewVersion.text = dataSet[listPosition].version


       // textViewVersion.setText(dataSet[listPosition].getVersion())
       // imageView.setImageResource(dataSet[listPosition].getImage())
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}