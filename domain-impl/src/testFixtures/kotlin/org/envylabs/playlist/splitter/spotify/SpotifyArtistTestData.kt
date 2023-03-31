package org.envylabs.playlist.splitter.spotify

object SpotifyArtistTestData {
    fun instance(
        id: String = "test-artist-id",
        name: String = "Test Artist"
    ): SpotifyArtist {
        return SpotifyArtist(
            id = id,
            name = name
        )
    }
}
