package org.envylabs.playlist.splitter

data class Playlist(
    val externalId: String,
    val name: String,
    val tracks: List<Track>
)
