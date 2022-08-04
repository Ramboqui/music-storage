package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity

import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "sheet_entity")
open class SheetEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "music_id", referencedColumnName = "id")
    var music: MusicEntity,
    val tone: String,
    val musicalInstrument: String,
    val sheetKey: String,
    val arranger: String,
    val createdDate: ZonedDateTime
)