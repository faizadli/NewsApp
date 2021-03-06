package com.faiz.newsapp

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.card.MaterialCardView
import com.faiz.newsapp.data.DataNews

fun initViewHeadline(context: Context, view: View, position: Int) {
    val imgHeadline: ImageView = view.findViewById(R.id.img_news_headline)
    val tvTitleHeadline: TextView = view.findViewById(R.id.tv_title_headline)
    val tvDescHeadline: TextView = view.findViewById(R.id.tv_desc_headline)
    val tvDateHeadline: TextView = view.findViewById(R.id.tv_date_headline)
    val tvAuthorHeadline: TextView = view.findViewById(R.id.tv_author_headline)

    imgHeadline.setImageResource(DataNews.photoHeadline[position])
    tvTitleHeadline.text = DataNews.titleHeadline[position]
    tvDescHeadline.text = DataNews.contentHeadline[position]
    tvDateHeadline.text = DataNews.dateHeadline[position]
    tvAuthorHeadline.text = DataNews.authorHeadline[position]

    view.setOnClickListener {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_DATA_TITLE, DataNews.titleHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_DATE, DataNews.dateHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_AUTHOR, DataNews.authorHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_CONTENT, DataNews.contentHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_IMAGE, DataNews.photoHeadline[position])
        context.startActivity(intent)
    }
}