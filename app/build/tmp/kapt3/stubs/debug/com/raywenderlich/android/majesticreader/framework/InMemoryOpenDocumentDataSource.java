package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/InMemoryOpenDocumentDataSource;", "Lcom/raywenderlich/android/majesticreader/data/OpenDocumentDataSource;", "()V", "openDocument", "Lcom/raywenderlich/android/majesticreader/domain/Document;", "getOpenDocument", "setOpenDocument", "", "document", "app_debug"})
public final class InMemoryOpenDocumentDataSource implements com.raywenderlich.android.majesticreader.data.OpenDocumentDataSource {
    private com.raywenderlich.android.majesticreader.domain.Document openDocument;
    
    @java.lang.Override()
    public void setOpenDocument(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.domain.Document document) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.android.majesticreader.domain.Document getOpenDocument() {
        return null;
    }
    
    public InMemoryOpenDocumentDataSource() {
        super();
    }
}