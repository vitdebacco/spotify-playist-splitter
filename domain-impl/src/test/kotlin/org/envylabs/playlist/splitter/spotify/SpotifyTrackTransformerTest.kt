package org.envylabs.playlist.splitter.spotify

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpotifyTrackTransformerTest {

    @Test
    fun `transforms spotify track to track`() {
        val spotifyTrack = SpotifyTrackTestData.instance()

        val transformed = spotifyTrack.toTrack()

        assertEquals(spotifyTrack.id, transformed.externalId)
        assertEquals(spotifyTrack.name, transformed.name)
        assertEquals(spotifyTrack.artists.size, transformed.artists.size)
    }
}
