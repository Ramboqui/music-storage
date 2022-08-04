package com.gomes.custodio.musicstorage.adapter.input.web.model.response

import com.gomes.custodio.musicstorage.application.domain.MusicDomain

data class MusicResponse(
    val name: String,
    val composer: String,
)
fun MusicDomain.toWebResponse() = MusicResponse(
    name = name,
    composer = composer
)