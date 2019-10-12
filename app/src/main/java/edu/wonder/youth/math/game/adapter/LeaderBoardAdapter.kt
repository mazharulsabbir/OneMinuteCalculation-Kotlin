package edu.wonder.youth.math.game.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import edu.wonder.youth.math.game.R
import edu.wonder.youth.math.game.model.LeaderBoardRanking

class LeaderBoardAdapter(
    private val userList: List<LeaderBoardRanking>,
    private val context: Context
) :
    RecyclerView.Adapter<LeaderBoardAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutRes = R.layout.leader_board_item

        val view: View = LayoutInflater.from(this.context).inflate(layoutRes, parent, false)

        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.userList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val ranking: LeaderBoardRanking = userList[position]
        holder.rankingPosition.text = (position + 1).toString()

        holder.userName.text = ranking.userName
        holder.score.text = ranking.score.toString()

        Glide.with(context)
            .load(ranking.avatarUrl)
            .error(R.drawable.ic_avatar)
            .optionalCenterCrop()
            .circleCrop()
            .into(holder.avatar)

    }


    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val rankingPosition = itemView.findViewById<TextView>(R.id.ranking_position)!!

        val avatar = itemView.findViewById<ImageView>(R.id.avatar)!!

        val userName = itemView.findViewById<TextView>(R.id.user_name)!!

        val score = itemView.findViewById<TextView>(R.id.total_score)!!

    }

}
