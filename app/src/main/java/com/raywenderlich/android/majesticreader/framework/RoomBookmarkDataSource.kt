package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.raywenderlich.android.majesticreader.data.BookmarkDataSource
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document
import com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity
import com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase

class RoomBookmarkDataSource(context: Context) : BookmarkDataSource {

    //1
    private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

    //2
    override suspend fun add(document: Document, bookmark: Bookmark) {
        bookmarkDao.addBookmark(BookmarkEntity(documentUri = document.url, page = bookmark.page))
    }

    override suspend fun read(document: Document): List<Bookmark> = bookmarkDao.getBookmarks(document.url).map { bookmarkEntity ->
        Bookmark(bookmarkEntity.id, bookmarkEntity.page)
    }

    override suspend fun remove(document: Document, bookmark: Bookmark) {
        bookmarkDao.removeBookmark(BookmarkEntity(id = bookmark.id, documentUri = document.url, page = bookmark.page))
    }

}