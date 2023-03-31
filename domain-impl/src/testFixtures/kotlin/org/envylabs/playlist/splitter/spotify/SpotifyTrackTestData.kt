package org.envylabs.playlist.splitter.spotify

object SpotifyTrackTestData {
    fun instance(
        id: String = "track-id-1",
        name: String = "Track 1",
        artists: Set<SpotifyArtist> = setOf(SpotifyArtistTestData.instance())
    ): SpotifyTrack {
        return SpotifyTrack(
            id = id,
            name = name,
            artists = artists
        )
    }
}
