package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p211h.p271p.C3834w;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;
import p300k.p313b.p314a0.C4662b;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u00020\r*\u00020\u000fJ(\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010\u0011*\u00020\u0012*\b\u0012\u0004\u0012\u0002H\u00110\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0015J(\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010\u0011*\u00020\u0012*\b\u0012\u0004\u0012\u0002H\u00110\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068DX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RxViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "onCleared", "", "disposeOnCleared", "Lio/reactivex/disposables/Disposable;", "set", "T", "", "Lkotlin/reflect/KMutableProperty0;", "observable", "Lio/reactivex/Observable;", "single", "Lio/reactivex/Single;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RxViewModelImpl */
/* compiled from: RxViewModelImpl.kt */
public class RxViewModelImpl extends C3834w {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f15482g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RxViewModelImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: e */
    public final C4662b f15483e = new C4662b();

    /* renamed from: f */
    public final Lazy f15484f = LazyKt__LazyJVMKt.lazy(new RxViewModelImpl$logger$2(this));

    /* renamed from: L1 */
    public void mo10653L1() {
        this.f15483e.mo16965b();
    }

    /* renamed from: M1 */
    public final C5620b mo16412M1() {
        Lazy lazy = this.f15484f;
        KProperty kProperty = f15482g[0];
        return (C5620b) lazy.getValue();
    }

    /* renamed from: a */
    public final void mo16413a(C4663c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$disposeOnCleared");
        ExtensionsKt.m14660a(cVar, this.f15483e);
    }

    /* renamed from: a */
    public final <T> void mo16415a(KMutableProperty0<T> kMutableProperty0, C5036u<T> uVar) {
        Intrinsics.checkParameterIsNotNull(kMutableProperty0, "$this$set");
        Intrinsics.checkParameterIsNotNull(uVar, "single");
        C5027n b = uVar.mo17264b();
        Intrinsics.checkExpressionValueIsNotNull(b, "single.toObservable()");
        mo16414a(kMutableProperty0, b);
    }

    /* renamed from: a */
    public final <T> void mo16414a(KMutableProperty0<T> kMutableProperty0, C5027n<T> nVar) {
        Intrinsics.checkParameterIsNotNull(kMutableProperty0, "$this$set");
        Intrinsics.checkParameterIsNotNull(nVar, "observable");
        C5027n a = nVar.mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "observable\n            .…dSchedulers.mainThread())");
        mo16413a(C4998b.m16842a(a, (Function1) new RxViewModelImpl$set$2(this), (Function0) null, (Function1) new RxViewModelImpl$set$1(kMutableProperty0), 2));
    }
}
