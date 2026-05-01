package com.back.domain.wiseSaying.service

import com.back.domain.wiseSaying.entity.WiseSaying
import com.back.domain.wiseSaying.repository.WiseSayingRepository

class WiseSayingService(
    val wiseSayingRepository: WiseSayingRepository = WiseSayingRepository()
) {

    fun write(content: String, author: String): WiseSaying =
        WiseSaying(content = content, author = author).also {
            wiseSayingRepository.save(it)
        }

    fun findAll() = wiseSayingRepository.findAll()

    fun findById(id: Int): WiseSaying? =
        wiseSayingRepository.findById(id)

    fun delete(wiseSaying: WiseSaying) = wiseSayingRepository.delete(wiseSaying)
}