package com.example.modul4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.data.Data
import com.example.modul4.data.Subject
import com.example.modul4.fragment.ListFragment
import com.example.modul4.fragment.ListFragmentDirections

class ListAdapter(private val context: Context, private val itemId: String): RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val btn: Button = view.findViewById(R.id.btn_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataItem = data[position]
        holder.btn.text = dataItem.name
        holder.btn.setOnClickListener {
            val bundle = ListFragmentDirections.actionListFragmentToDetailFragment(
                dataItem.name,
                dataItem.lecturer,
                dataItem.credits.toString() + " sks",
                dataItem.schedule
            )
            holder.btn.findNavController().navigate(bundle)
        }
    }

    private lateinit var data: List<Subject>

    override fun getItemCount(): Int{
        when(itemId){
            ListFragment.ODD -> {
                data = Data(context).loadOddSemester()
            }
            ListFragment.EVEN -> {
                data = Data(context).loadEvenSemester()
            }
            ListFragment.OPTIONAL -> {
                data = Data(context).loadOptionalSubject()
            }
        }
        return data.size
    }
}