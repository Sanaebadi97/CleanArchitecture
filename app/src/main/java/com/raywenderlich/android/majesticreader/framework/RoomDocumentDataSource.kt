package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.raywenderlich.android.majesticreader.domain.Document
import com.raywenderlich.android.majesticreader.domain.DocumentDataSource
import com.raywenderlich.android.majesticreader.framework.db.DocumentEntity
import com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase

class RoomDocumentDataSource(val context: Context) : DocumentDataSource {

    private val documentDao = MajesticReaderDatabase.getInstance(context).documentDao()

    override suspend fun add(document: Document) {
        val details = FileUtil.getDocumentDetails(context = context, documentUri = document.url)
        documentDao.addDocument(
                DocumentEntity(document.url, details.name, details.size, details.thumbnail)
        )
    }

    override suspend fun readAll(): List<Document> = documentDao.getDocuments().map { documentEntity ->
        Document(
                documentEntity.uri,
                documentEntity.title,
                documentEntity.size,
                documentEntity.thumbnailUri
        )
    }

    override suspend fun remove(document: Document) = documentDao.removeDocument(DocumentEntity(uri = document.url,
            title = document.name, size = document.size, thumbnailUri = document.thumbnail))
}