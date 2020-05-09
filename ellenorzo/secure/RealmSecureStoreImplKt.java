package p289hu.ekreta.ellenorzo.secure;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\"#\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00018BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo17463d2 = {"logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.secure.RealmSecureStoreImplKt */
/* compiled from: RealmSecureStoreImpl.kt */
public final class RealmSecureStoreImplKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f14773a = {Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(RealmSecureStoreImplKt.class, "app_studentProdRelease"), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: b */
    public static final Lazy f14774b;

    static {
        Lazy lazy = LazyKt__LazyJVMKt.lazy(RealmSecureStoreImplKt$logger$2.INSTANCE);
        if (lazy == null) {
            Intrinsics.throwNpe();
        }
        f14774b = lazy;
    }

    public static final /* synthetic */ C5620b access$getLogger$p() {
        Lazy lazy = f14774b;
        KProperty kProperty = f14773a[0];
        return (C5620b) lazy.getValue();
    }
}
