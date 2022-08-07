package com.gomes.custodio.musicstorage.application.service

import com.gomes.custodio.musicstorage.application.domain.MusicDomain
import com.gomes.custodio.musicstorage.application.port.input.MusicUseCase
import com.gomes.custodio.musicstorage.application.port.output.MusicPort
import org.springframework.stereotype.Service

@Service
class MusicService(private val musicPort: MusicPort) : MusicUseCase {

    override fun listMusics(): List<MusicDomain> {
        return musicPort.findAll()
    }

    override fun createMusic(musicDomain: MusicDomain): MusicDomain {
        return musicPort.save(musicDomain)
    }
}