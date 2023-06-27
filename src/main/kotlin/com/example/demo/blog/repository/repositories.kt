package com.example.demo.blog.repository

import com.example.demo.blog.entity.Wordcount
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface wordRepository : CrudRepository<Wordcount, String> {
    fun findTop10ByOrderByCntDesc(): List<Wordcount>
}