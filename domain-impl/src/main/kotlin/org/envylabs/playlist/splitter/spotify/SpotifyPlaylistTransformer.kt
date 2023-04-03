package org.envylabs.playlist.splitter.spotify

import org.envylabs.playlist.splitter.Playlist

fun SpotifyPlaylist.toPlaylist(): Playlist {
    return Playlist(
        externalId = this.id,
        name = this.name,
        tracks = this.tracks.map {
            it.toTrack()
        }
    )
}
