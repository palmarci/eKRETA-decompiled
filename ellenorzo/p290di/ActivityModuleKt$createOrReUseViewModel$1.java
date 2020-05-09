package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p271p.C3834w;
import p211h.p271p.C3835x.C3837b;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo17463d2 = {"hu/ekreta/ellenorzo/di/ActivityModuleKt$createOrReUseViewModel$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.ActivityModuleKt$createOrReUseViewModel$1 */
/* compiled from: ActivityModule.kt */
public final class ActivityModuleKt$createOrReUseViewModel$1 implements C3837b {

    /* renamed from: a */
    public final /* synthetic */ C5431a f12535a;

    public ActivityModuleKt$createOrReUseViewModel$1(C5431a aVar) {
        this.f12535a = aVar;
    }

    /* renamed from: a */
    public <T extends C3834w> T mo10655a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return (C3834w) this.f12535a.get();
    }
}
