package org.envylabs.playlist.splitter.spotify

data class SpotifyTrack(
    val id: String,
    val name: String,
    val artists: Set<SpotifyArtist>
)
