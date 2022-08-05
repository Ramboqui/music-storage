package com.gomes.custodio.musicstorage.application.port.input

import com.gomes.custodio.musicstorage.application.domain.MusicDomain
import reactor.core.publisher.Flux

interface MusicUseCase {

    fun listMusics() : List<MusicDomain>
}