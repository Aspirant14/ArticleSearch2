package ArticleSearch2.app.src.main.java.com.codepath.articlesearch

import AppDatabase

class ArticleApplication: Application(){
    val db by lazy{ AppDatabase.getInstance(this) }
}