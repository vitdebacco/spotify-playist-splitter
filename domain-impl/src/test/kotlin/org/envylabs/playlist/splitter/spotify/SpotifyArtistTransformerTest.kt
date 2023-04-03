package org.envylabs.playlist.splitter.spotify

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpotifyArtistTransformerTest() {
    @Test
    fun `transforms spotify artist to artist`() {
        val spotifyArtist = SpotifyArtistTestData.instance()

        val transformedArtist = spotifyArtist.toArtist()

        assertEquals(spotifyArtist.id, transformedArtist.externalId)
        assertEquals(spotifyArtist.name, transformedArtist.name)
    }
}
