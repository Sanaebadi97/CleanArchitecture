package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000f\u001a\u0002H\u0010\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/MajesticViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "dependencies", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "getDependencies", "()Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "setDependencies", "(Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "inject", "", "app_debug"})
public final class MajesticViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    public static android.app.Application application;
    @org.jetbrains.annotations.NotNull()
    public static com.raywenderlich.android.majesticreader.framework.Interactors dependencies;
    public static final com.raywenderlich.android.majesticreader.framework.MajesticViewModelFactory INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.framework.Interactors getDependencies() {
        return null;
    }
    
    public final void setDependencies(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.Interactors p0) {
    }
    
    public final void inject(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.Interactors dependencies) {
    }
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    private MajesticViewModelFactory() {
        super();
    }
}