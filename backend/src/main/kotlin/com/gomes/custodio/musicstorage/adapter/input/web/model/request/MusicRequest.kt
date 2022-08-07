package com.gomes.custodio.musicstorage.adapter.input.web.model.request

import com.gomes.custodio.musicstorage.application.domain.MusicDomain

data class MusicRequest(
        val name: String,
        val composer: String
)

fun MusicRequest.toMusicDomain() = MusicDomain(
        name = name,
        composer = composer,
        sheetList = null
)