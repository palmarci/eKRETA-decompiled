package hu.ekreta.ellenorzo.di;

import h.p.w;
import h.p.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"hu/ekreta/ellenorzo/di/ActivityModuleKt$createOrReUseViewModel$2", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ActivityModule.kt */
public final class ActivityModuleKt$createOrReUseViewModel$2 implements x.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f5317a;

    public ActivityModuleKt$createOrReUseViewModel$2(a aVar) {
        this.f5317a = aVar;
    }

    public <T extends w> T a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return (w) this.f5317a.get();
    }
}
