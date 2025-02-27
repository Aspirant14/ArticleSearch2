import kotlinx.coroutines.flow.Flow
@Dao
interface ArticleDao{
    @Query("SELECT * FROM article_table")
    fun getAll(): Flow<List<ArticleEntity>>
    @Insert
    fun insertAll(articles: List<ArticleEntry>)
    @Query("DELETE FROM article_table")
    fun deleteAll()
}