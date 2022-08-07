package com.gomes.custodio.musicstorage.application.domain

import com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity.SheetEntity

data class MusicDomain(
    val name: String,
    val composer: String,
    val sheetList: List<SheetDomain>?
)