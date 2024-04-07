package spiral.bit.dev.sunset.other

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface PushApi {

    @Headers("Authorization: key=${Constants.SERVER_KEY}", "Content-Type:${Constants.CONTENT_TYPE}")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body push: Push
    ): Response<ResponseBody>
}