import com.google.gson.annotations.SerializedName

data class Movie (
    @SerializedName("original_title")
    val title: String,
    @SerializedName("vote_average")
    val note: Float,
    @SerializedName("release_date")
    val year: String,
    @SerializedName("backdrop_path")
    val image: String
)