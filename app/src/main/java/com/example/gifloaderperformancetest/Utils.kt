package com.example.gifloaderperformancetest

import android.app.Activity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_child.*

fun setViewHolder(vh: ViewHolder, gifList: List<Gif>, activity: Activity): ViewHolder {
    vh.gif.setOnClickListener {
        val position = vh.adapterPosition
        val gif = gifList[position]
        Glide.with(activity)
            .load(gif.gifId)
            .into(activity.bigGif)
    }
    return vh
}

fun initPokemons(gifList: ArrayList<Gif>) {
    gifList.add(Gif("口袋", "https://media.giphy.com/media/U2nN0ridM4lXy/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/xuXzcHMkuwvf2/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/yhfTY8JL1wIAE/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/7T200DTPdx31e/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/vsyKKf1t22nmw/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/amrNGnZUeWhZC/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/slVWEctHZKvWU/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/HZpCCbcWc0a3u/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/l3n2pVYnj11hm/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/m6aZERsqxPiBa/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/l0FeaNym7NR02fku4/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/7ISIRaCMrgFfa/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/HtqFbL7el09oY/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/OazoCyXHeGyDm/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/AGPBj8UmV5YyI/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/26hisC8akEsnLmmSQ/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/GDuOdHz0lCzNS/giphy.gif"))
    gifList.add(Gif("口袋", "https://media.giphy.com/media/DRfu7BT8ZK1uo/giphy.gif"))
}

fun initHamtaros(gifList: ArrayList<Gif>) {
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/10wfgzlX5CKzRe/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/hc1jyTXYaiXy8/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/D2gH40gq5bg08/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/JWGgsu82QDoEE/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/CpR9lbo8TDUmk/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/ADyQEh474eu0o/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/ZtB2l3jHiJsFa/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/PdcTSy3CjZ5M4/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/Y4z9olnoVl5QI/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/mEsOq022kLlDO/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/dDtb2XvkbG8YU/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/5cjgoeKubHDSU/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/R6JRG9Y8nrwPe/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/Id0IZ49MNMzKHI9qpV/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/dwZOgH1bBCwco/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/iHmzGAgGlc9d6/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/Qvx4qnHPL1LDa/giphy.gif"))
    gifList.add(Gif("哈姆", "https://media.giphy.com/media/7oUdj7cAkXVfi/giphy.gif"))
}