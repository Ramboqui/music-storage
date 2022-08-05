package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree

import com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity.toMusicDomain
import com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.repository.MusicRepository
import com.gomes.custodio.musicstorage.application.domain.MusicDomain
import com.gomes.custodio.musicstorage.application.port.output.MusicPort
import org.springframework.stereotype.Component

@Component
class MusicPersistence(
    private val musicRepository: MusicRepository
): MusicPort {
    override fun findAll(): List<MusicDomain> {
        return musicRepository.findAll().map { it.toMusicDomain() }
    }
}