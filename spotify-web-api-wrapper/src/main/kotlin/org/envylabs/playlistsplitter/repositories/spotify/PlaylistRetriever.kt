package org.envylabs.playlistsplitter.repositories.spotify

import se.michaelthelin.spotify.SpotifyApi

class PlaylistRetriever(
    private val spotifyApi: SpotifyApi
) {

    fun getUserPlaylist() {
        val playlists = spotifyApi.getListOfUsersPlaylists("").build().execute()
    }

    fun getPlaylistDetails() {
        // ultimately want to retrieve the playlistId by iterating through the user's playlists and matching on the name
//        spotifyApi.getListOfUsersPlaylists("")
        val playlistListId = "1UMUeZauWkic0fsXfvG2kg"
        val playlist = spotifyApi.getPlaylist(playlistListId).build().execute()
        val playlistItems = spotifyApi.getPlaylistsItems(playlistListId).build().execute()
    }


}