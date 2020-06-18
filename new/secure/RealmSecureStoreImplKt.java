package hu.ekreta.ellenorzo.secure;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\"#\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00018BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: RealmSecureStoreImpl.kt */
public final class RealmSecureStoreImplKt {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f6103a = {Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(RealmSecureStoreImplKt.class, "app_guardianProdRelease"), "logger", "getLogger()Lorg/slf4j/Logger;"))};
    public static final Lazy b;

    static {
        Lazy lazy = LazyKt__LazyJVMKt.lazy(RealmSecureStoreImplKt$logger$2.INSTANCE);
        if (lazy == null) {
            Intrinsics.throwNpe();
        }
        b = lazy;
    }

    public static final /* synthetic */ b access$getLogger$p() {
        Lazy lazy = b;
        KProperty kProperty = f6103a[0];
        return (b) lazy.getValue();
    }
}
