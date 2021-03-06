package com.example.gamebacklog.ui.gamelog



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gamebacklog.R
import com.example.gamebacklog.model.Game
import kotlinx.android.synthetic.main.game_log_item.view.*


class BackLogAdapter(private var listGames :List<Game>): RecyclerView.Adapter<BackLogAdapter.ViewHolder>(){
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bind(game: Game){
            itemView.tvTitle.text = game.title
            itemView.tvPlatform.text = game.platform
            itemView.tvRelease.text =  itemView.context.getString(R.string.release_string, game.releaseDate)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.game_log_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listGames.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listGames[position])
    }
}