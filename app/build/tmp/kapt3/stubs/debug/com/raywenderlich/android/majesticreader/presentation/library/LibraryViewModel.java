package com.raywenderlich.android.majesticreader.presentation.library;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\nR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/library/LibraryViewModel;", "Lcom/raywenderlich/android/majesticreader/framework/MajesticViewModel;", "application", "Landroid/app/Application;", "interactors", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "(Landroid/app/Application;Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "documents", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "getDocuments", "()Landroidx/lifecycle/MutableLiveData;", "addDocument", "", "uri", "Landroid/net/Uri;", "loadDocuments", "setOpenDocument", "document", "app_debug"})
public final class LibraryViewModel extends com.raywenderlich.android.majesticreader.framework.MajesticViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.Document>> documents = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.Document>> getDocuments() {
        return null;
    }
    
    public final void loadDocuments() {
    }
    
    public final void addDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void setOpenDocument(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.domain.Document document) {
    }
    
    public LibraryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.Interactors interactors) {
        super(null, null);
    }
}