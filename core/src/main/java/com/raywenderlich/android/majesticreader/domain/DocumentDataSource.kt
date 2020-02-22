package com.raywenderlich.android.majesticreader.domain

interface DocumentDataSource {
    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}