package com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.repository

import com.gomes.custodio.musicstorage.adapter.output.persistence.postgree.entity.MusicEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface MusicRepository : JpaRepository<MusicEntity, Long> {

    override fun findAll(): List<MusicEntity>
}