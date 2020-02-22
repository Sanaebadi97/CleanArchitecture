package com.raywenderlich.android.majesticreader.presentation.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J\u0010\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\r\u0010+\u001a\u0004\u0018\u00010(\u00a2\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\nJ\u000e\u0010/\u001a\u00020(2\u0006\u0010$\u001a\u00020%J\u0017\u00100\u001a\u0004\u0018\u00010(2\u0006\u00101\u001a\u000202H\u0002\u00a2\u0006\u0002\u00103J\r\u00104\u001a\u0004\u0018\u00010(\u00a2\u0006\u0002\u0010,J\r\u00105\u001a\u0004\u0018\u00010(\u00a2\u0006\u0002\u0010,J\u0006\u00106\u001a\u00020(J\u0006\u00107\u001a\u00020(R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\f\u00a8\u00069"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/reader/ReaderViewModel;", "Lcom/raywenderlich/android/majesticreader/framework/MajesticViewModel;", "application", "Landroid/app/Application;", "interactors", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "(Landroid/app/Application;Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "bookmarks", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/raywenderlich/android/majesticreader/domain/Bookmark;", "getBookmarks", "()Landroidx/lifecycle/MediatorLiveData;", "currentPage", "Landroid/graphics/pdf/PdfRenderer$Page;", "Landroid/graphics/pdf/PdfRenderer;", "getCurrentPage", "document", "Landroidx/lifecycle/MutableLiveData;", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "getDocument", "()Landroidx/lifecycle/MutableLiveData;", "hasNextPage", "Landroidx/lifecycle/LiveData;", "", "getHasNextPage", "()Landroidx/lifecycle/LiveData;", "hasPreviousPage", "getHasPreviousPage", "isBookmarked", "isInLibrary", "renderer", "getRenderer", "getFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "kotlin.jvm.PlatformType", "uri", "Landroid/net/Uri;", "isCurrentPageBookmarked", "loadArguments", "", "arguments", "Landroid/os/Bundle;", "nextPage", "()Lkotlin/Unit;", "openBookmark", "bookmark", "openDocument", "openPage", "page", "", "(I)Lkotlin/Unit;", "previousPage", "reopenPage", "toggleBookmark", "toggleInLibrary", "Companion", "app_debug"})
public final class ReaderViewModel extends com.raywenderlich.android.majesticreader.framework.MajesticViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.majesticreader.domain.Document> document = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.Bookmark>> bookmarks = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<android.graphics.pdf.PdfRenderer.Page> currentPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasPreviousPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasNextPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isBookmarked = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isInLibrary = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<android.graphics.pdf.PdfRenderer> renderer = null;
    private static final java.lang.String DOCUMENT_ARG = "document";
    public static final com.raywenderlich.android.majesticreader.presentation.reader.ReaderViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.majesticreader.domain.Document> getDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.Bookmark>> getBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<android.graphics.pdf.PdfRenderer.Page> getCurrentPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasPreviousPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasNextPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isBookmarked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isInLibrary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<android.graphics.pdf.PdfRenderer> getRenderer() {
        return null;
    }
    
    private final android.os.ParcelFileDescriptor getFileDescriptor(android.net.Uri uri) {
        return null;
    }
    
    private final boolean isCurrentPageBookmarked() {
        return false;
    }
    
    private final boolean isInLibrary(com.raywenderlich.android.majesticreader.domain.Document document) {
        return false;
    }
    
    public final void loadArguments(@org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments) {
    }
    
    public final void openDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void openBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.domain.Bookmark bookmark) {
    }
    
    private final kotlin.Unit openPage(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit nextPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit previousPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit reopenPage() {
        return null;
    }
    
    public final void toggleBookmark() {
    }
    
    public final void toggleInLibrary() {
    }
    
    public ReaderViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.Interactors interactors) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/reader/ReaderViewModel$Companion;", "", "()V", "DOCUMENT_ARG", "", "createArguments", "Landroid/os/Bundle;", "document", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle createArguments(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.majesticreader.domain.Document document) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}