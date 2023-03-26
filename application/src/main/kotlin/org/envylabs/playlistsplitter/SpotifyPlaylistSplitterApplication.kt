package org.envylabs.playlistsplitter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpotifyPlaylistSplitterApplication

fun main(args: Array<String>) {
    runApplication<SpotifyPlaylistSplitterApplication>(*args)
}
