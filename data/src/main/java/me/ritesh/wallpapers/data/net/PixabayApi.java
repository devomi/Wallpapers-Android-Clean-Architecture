package me.ritesh.wallpapers.data.net;

import io.reactivex.Observable;
import java.util.Map;
import me.ritesh.wallpapers.data.net.response.objects.PhotosListResponse;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * @author Ritesh Shakya
 */

public interface PixabayApi {
    @GET("api/") Observable<PhotosListResponse> getPhotos(@QueryMap Map<String, String> options);
}
