package com.gomes.custodio.musicstorage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class MusicStorageApplication

fun main(args: Array<String>) {
	runApplication<MusicStorageApplication>(*args)
}
