package org.envylabs.playlist.splitter.spotify

import org.envylabs.playlist.splitter.Track

fun SpotifyTrack.toTrack(): Track {
    return Track(
        externalId = this.id,
        name = this.name,
        artists = this.artists.map {
            it.toArtist()
        }.toSet()
    )
}
