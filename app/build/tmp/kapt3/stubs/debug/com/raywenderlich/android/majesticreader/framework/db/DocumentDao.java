package com.raywenderlich.android.majesticreader.framework.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/db/DocumentDao;", "", "addDocument", "", "document", "Lcom/raywenderlich/android/majesticreader/framework/db/DocumentEntity;", "(Lcom/raywenderlich/android/majesticreader/framework/db/DocumentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocuments", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDocument", "app_debug"})
public abstract interface DocumentDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addDocument(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.db.DocumentEntity document, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM document")
    public abstract java.lang.Object getDocuments(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.raywenderlich.android.majesticreader.framework.db.DocumentEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeDocument(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.db.DocumentEntity document, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}