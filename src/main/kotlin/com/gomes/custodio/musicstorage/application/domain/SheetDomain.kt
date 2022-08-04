package com.gomes.custodio.musicstorage.application.domain

import java.time.ZonedDateTime

data class Sheet(
    val tone: String,
    val musicalInstrument: String,
    val sheetKey: String,
    val arranger: String,
    val createdDate: ZonedDateTime
)