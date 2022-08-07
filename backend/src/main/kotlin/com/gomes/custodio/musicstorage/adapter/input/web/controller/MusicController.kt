package com.gomes.custodio.musicstorage.adapter.input.web.controller

import com.gomes.custodio.musicstorage.adapter.input.web.model.request.MusicRequest
import com.gomes.custodio.musicstorage.adapter.input.web.model.request.toMusicDomain
import com.gomes.custodio.musicstorage.adapter.input.web.model.response.MusicResponse
import com.gomes.custodio.musicstorage.adapter.input.web.model.response.toWebResponse
import com.gomes.custodio.musicstorage.application.port.input.MusicUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/music")
class MusicController(private val musicUseCase: MusicUseCase) {

    @GetMapping
    fun listMusics(): List<MusicResponse> {
        return musicUseCase.listMusics().map { it.toWebResponse() }
    }

    @PostMapping
    fun createMusic(@RequestBody musicRequest: MusicRequest): MusicResponse {
        return musicUseCase.createMusic(musicRequest.toMusicDomain()).toWebResponse()
    }
}