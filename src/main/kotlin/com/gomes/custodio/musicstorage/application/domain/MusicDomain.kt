package com.gomes.custodio.musicstorage.application.domain

data class MusicDomain(
    val name: String,
    val composer: String,
    val sheetList: List<Sheet>
)