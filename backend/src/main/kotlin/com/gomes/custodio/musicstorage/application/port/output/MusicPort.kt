package com.gomes.custodio.musicstorage.application.port.output

import com.gomes.custodio.musicstorage.application.domain.MusicDomain
import reactor.core.publisher.Flux

interface MusicPort {

    fun findAll() : List<MusicDomain>
}