package org.envylabs.playlist.splitter

data class Track(
    val externalId: String,
    val name: String,
    val artists: Set<Artist>
)
