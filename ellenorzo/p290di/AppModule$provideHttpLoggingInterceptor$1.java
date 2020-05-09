package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p353m.p363m0.C5557a.C5559b;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R#\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo17463d2 = {"hu/ekreta/ellenorzo/di/AppModule$provideHttpLoggingInterceptor$1", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "log", "", "message", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$provideHttpLoggingInterceptor$1 */
/* compiled from: AppModule.kt */
public final class AppModule$provideHttpLoggingInterceptor$1 implements C5559b {

    /* renamed from: c */
    public static final /* synthetic */ KProperty[] f12560c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AppModule$provideHttpLoggingInterceptor$1.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: b */
    public final Lazy f12561b = LazyKt__LazyJVMKt.lazy(AppModule$provideHttpLoggingInterceptor$1$logger$2.INSTANCE);

    /* renamed from: a */
    public void mo12480a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Lazy lazy = this.f12561b;
        KProperty kProperty = f12560c[0];
        ((C5620b) lazy.getValue()).mo115b(str);
    }
}
