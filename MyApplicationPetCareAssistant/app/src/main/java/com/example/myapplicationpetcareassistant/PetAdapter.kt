package com.example.myapplicationpetcareassistant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PetAdapter(private val petList: List<String>) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {

    class PetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val petNameText: TextView = itemView.findViewById(R.id.petNameText)
        val petSpeciesText: TextView = itemView.findViewById(R.id.petSpeciesText)
        val lastFedText: TextView = itemView.findViewById(R.id.lastFedText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pet_item, parent, false)
        return PetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        // 假设 petList 是一个包含宠物名字的列表，你可以根据需要调整此处的内容
        holder.petNameText.text = petList[position]
        holder.petSpeciesText.text = "品种"  // 示例内容
        holder.lastFedText.text = "上次喂食: 2小时前"  // 示例内容
    }

    override fun getItemCount(): Int = petList.size
}
