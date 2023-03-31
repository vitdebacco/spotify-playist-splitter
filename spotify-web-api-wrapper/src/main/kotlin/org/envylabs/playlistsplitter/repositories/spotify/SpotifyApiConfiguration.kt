package org.envylabs.playlistsplitter.repositories.spotify

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import se.michaelthelin.spotify.SpotifyApi
import java.net.URI

@Configuration
class SpotifyApiConfiguration {

    @Bean
    fun spotifyApi(): SpotifyApi {
        return SpotifyApi.Builder()
            .setClientId("")
            .setClientSecret("")
//            .setRedirectUri(URI(""))
            .build()
    }
}