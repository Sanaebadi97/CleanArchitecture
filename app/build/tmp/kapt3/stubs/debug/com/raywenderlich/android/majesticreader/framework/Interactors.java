package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00063"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "", "addBookmark", "Lcom/raywenderlich/android/majesticreader/interactors/AddBookmark;", "getBookmarks", "Lcom/raywenderlich/android/majesticreader/interactors/GetBookmarks;", "deleteBookmark", "Lcom/raywenderlich/android/majesticreader/interactors/RemoveBookmark;", "addDocument", "Lcom/raywenderlich/android/majesticreader/interactors/AddDocument;", "getDocuments", "Lcom/raywenderlich/android/majesticreader/interactors/GetDocuments;", "removeDocument", "Lcom/raywenderlich/android/majesticreader/interactors/RemoveDocument;", "getOpenDocument", "Lcom/raywenderlich/android/majesticreader/interactors/GetOpenDocument;", "setOpenDocument", "Lcom/raywenderlich/android/majesticreader/interactors/SetOpenDocument;", "(Lcom/raywenderlich/android/majesticreader/interactors/AddBookmark;Lcom/raywenderlich/android/majesticreader/interactors/GetBookmarks;Lcom/raywenderlich/android/majesticreader/interactors/RemoveBookmark;Lcom/raywenderlich/android/majesticreader/interactors/AddDocument;Lcom/raywenderlich/android/majesticreader/interactors/GetDocuments;Lcom/raywenderlich/android/majesticreader/interactors/RemoveDocument;Lcom/raywenderlich/android/majesticreader/interactors/GetOpenDocument;Lcom/raywenderlich/android/majesticreader/interactors/SetOpenDocument;)V", "getAddBookmark", "()Lcom/raywenderlich/android/majesticreader/interactors/AddBookmark;", "getAddDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/AddDocument;", "getDeleteBookmark", "()Lcom/raywenderlich/android/majesticreader/interactors/RemoveBookmark;", "getGetBookmarks", "()Lcom/raywenderlich/android/majesticreader/interactors/GetBookmarks;", "getGetDocuments", "()Lcom/raywenderlich/android/majesticreader/interactors/GetDocuments;", "getGetOpenDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/GetOpenDocument;", "getRemoveDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/RemoveDocument;", "getSetOpenDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/SetOpenDocument;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Interactors {
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.AddBookmark addBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.GetBookmarks getBookmarks = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.RemoveBookmark deleteBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.AddDocument addDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.GetDocuments getDocuments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.RemoveDocument removeDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getOpenDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.SetOpenDocument setOpenDocument = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddBookmark getAddBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetBookmarks getGetBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveBookmark getDeleteBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddDocument getAddDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetDocuments getGetDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveDocument getRemoveDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getGetOpenDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.SetOpenDocument getSetOpenDocument() {
        return null;
    }
    
    public Interactors(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddBookmark addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetBookmarks getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveBookmark deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.SetOpenDocument setOpenDocument) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddBookmark component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetBookmarks component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveBookmark component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddDocument component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetDocuments component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveDocument component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetOpenDocument component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.SetOpenDocument component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.framework.Interactors copy(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddBookmark addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetBookmarks getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveBookmark deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.SetOpenDocument setOpenDocument) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}