package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.raywenderlich.android.majesticreader.domain.Document
import com.raywenderlich.android.majesticreader.domain.DocumentDataSource

class RoomDocumentDataSource (context: Context) :DocumentDataSource {
    override suspend fun add(document: Document) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun readAll(): List<Document> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun remove(document: Document) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}