package com.raywenderlich.android.majesticreader.framework.db;

import java.lang.System;

@androidx.room.Database(entities = {com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity.class, com.raywenderlich.android.majesticreader.framework.db.DocumentEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/db/MajesticReaderDatabase;", "Landroidx/room/RoomDatabase;", "()V", "bookmarkDao", "Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkDao;", "documentDao", "Lcom/raywenderlich/android/majesticreader/framework/db/DocumentDao;", "Companion", "app_debug"})
public abstract class MajesticReaderDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "reader.db";
    private static com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase instance;
    public static final com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.majesticreader.framework.db.BookmarkDao bookmarkDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.majesticreader.framework.db.DocumentDao documentDao();
    
    public MajesticReaderDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/db/MajesticReaderDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "instance", "Lcom/raywenderlich/android/majesticreader/framework/db/MajesticReaderDatabase;", "create", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private final com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase create(android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}