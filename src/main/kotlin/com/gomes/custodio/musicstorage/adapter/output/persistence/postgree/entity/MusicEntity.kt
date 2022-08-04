package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity

import com.gomes.custodio.musicstorage.application.domain.Sheet
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.management.monitor.StringMonitor
import javax.persistence.*

@Entity
@Table(name = "music")
@Getter
@Setter
class MusicEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val mame: String,
    val composer: String,
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "music")
    val sheetList: List<SheetEntity>
) {

}