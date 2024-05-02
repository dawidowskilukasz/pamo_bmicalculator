package com.example.bmicalculator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToBuyAdapter(private val ingredients: List<String>) :
        RecyclerView.Adapter<ToBuyAdapter.IngredientViewHolder>() {

    inner class IngredientViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ingredientName: TextView = itemView.findViewById(R.id.tobuy_name)
        val checkBox: CheckBox = itemView.findViewById(R.id.cbDone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.tobuy_ingridient, parent, false)
        return IngredientViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        val currentIngredient = ingredients[position]
        holder.ingredientName.text = currentIngredient

        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                holder.ingredientName.strikeThrough()
            } else {
                holder.ingredientName.removeStrikeThrough()
            }
        }
    }

    override fun getItemCount() = ingredients.size
}

fun TextView.strikeThrough() {
    this.paintFlags = this.paintFlags or android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
}

fun TextView.removeStrikeThrough() {
    this.paintFlags = this.paintFlags and android.graphics.Paint.STRIKE_THRU_TEXT_FLAG.inv()
}
