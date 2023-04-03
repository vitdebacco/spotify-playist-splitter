package org.envylabs.playlist.splitter.spotify

data class SpotifyPlaylist(
    val id: String,
    val name: String,
    val tracks: Set<SpotifyTrack>
)
