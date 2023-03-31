package org.envylabs.playlist.splitter

data class Artist(
    val externalId: String,
    val name: String
) {
    fun sanitizedName() = name.lowercase()
}
