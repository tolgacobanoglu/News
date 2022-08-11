package com.tolgacobanoglu.newsapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.tolgacobanoglu.newsapp.model.Article

@Dao
interface ArticleDAO
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article) : Long

    @Query("SELECT * FROM articles")
    fun getAllArticles() : LiveData<List<Article>>

    @Delete
    suspend fun delete(article: Article)
}