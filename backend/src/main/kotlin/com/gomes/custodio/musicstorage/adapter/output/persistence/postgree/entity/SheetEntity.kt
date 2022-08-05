package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity

import com.gomes.custodio.musicstorage.application.domain.SheetDomain
import lombok.Getter
import lombok.Setter
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "sheet_entity")
@Getter
@Setter
class SheetEntity(
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

fun SheetEntity.toSheetDomain() = SheetDomain(
    tone = tone,
    musicalInstrument = musicalInstrument,
    sheetKey = sheetKey,
    arranger = arranger,
    createdDate = createdDate
)