package com.gomes.custodio.musicstorage.application.port.input

import com.gomes.custodio.musicstorage.application.domain.MusicDomain

interface MusicUseCase {

    fun listMusics(): List<MusicDomain>

    fun createMusic(musicDomain: MusicDomain): MusicDomain
}