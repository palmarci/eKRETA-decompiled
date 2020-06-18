package hu.ekreta.ellenorzo.di;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import m.m0.a;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R#\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"hu/ekreta/ellenorzo/di/AppModule$provideHttpLoggingInterceptor$1", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "log", "", "message", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$provideHttpLoggingInterceptor$1 implements a.b {
    public static final /* synthetic */ KProperty[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AppModule$provideHttpLoggingInterceptor$1.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};
    public final Lazy b = LazyKt__LazyJVMKt.lazy(AppModule$provideHttpLoggingInterceptor$1$logger$2.INSTANCE);

    public void a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Lazy lazy = this.b;
        KProperty kProperty = c[0];
        ((b) lazy.getValue()).d(str);
    }
}
