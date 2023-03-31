package org.envylabs.playlist.splitter.spotify

import org.envylabs.playlist.splitter.Artist

fun SpotifyArtist.toArtist(): Artist {
    return Artist(
        externalId = this.id,
        name = this.name
    )
}
