package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree

import com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.repository.MusicRepository
import org.springframework.stereotype.Component

@Component
class MusicPersistence(
    private val musicRepository: MusicRepository
) {
}