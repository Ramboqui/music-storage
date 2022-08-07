package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity

import com.gomes.custodio.musicstorage.application.domain.MusicDomain
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "music")
@Getter
@Setter
class MusicEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long?,
        val musicName: String,
        val composer: String,
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "music")
        val sheetList: List<SheetEntity>?
) {

}
fun MusicEntity.toMusicDomain() = MusicDomain(
    name = musicName,
    composer = composer,
    sheetList = sheetList?.map { it.toSheetDomain() } ?: null
)

fun MusicDomain.toMusicEntity() = MusicEntity(
        id = null,
        musicName = name,
        composer = composer,
        sheetList = null
)