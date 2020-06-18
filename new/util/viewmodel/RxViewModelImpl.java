package hu.ekreta.ellenorzo.util.viewmodel;

import h.p.w;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import k.b.a0.b;
import k.b.a0.c;
import k.b.n;
import k.b.u;
import k.b.z.a.a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u00020\r*\u00020\u000fJ(\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010\u0011*\u00020\u0012*\b\u0012\u0004\u0012\u0002H\u00110\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0015J(\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010\u0011*\u00020\u0012*\b\u0012\u0004\u0012\u0002H\u00110\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068DX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RxViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "onCleared", "", "disposeOnCleared", "Lio/reactivex/disposables/Disposable;", "set", "T", "", "Lkotlin/reflect/KMutableProperty0;", "observable", "Lio/reactivex/Observable;", "single", "Lio/reactivex/Single;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RxViewModelImpl.kt */
public class RxViewModelImpl extends w {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f6340g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RxViewModelImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};
    public final b e = new b();
    public final Lazy f = LazyKt__LazyJVMKt.lazy(new RxViewModelImpl$logger$2(this));

    public void U1() {
        this.e.b();
    }

    public final o.b.b V1() {
        Lazy lazy = this.f;
        KProperty kProperty = f6340g[0];
        return (o.b.b) lazy.getValue();
    }

    public final void a(c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$disposeOnCleared");
        ExtensionsKt.a(cVar, this.e);
    }

    public final <T> void a(KMutableProperty0<T> kMutableProperty0, u<T> uVar) {
        Intrinsics.checkParameterIsNotNull(kMutableProperty0, "$this$set");
        Intrinsics.checkParameterIsNotNull(uVar, "single");
        n<T> b = uVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b, "single.toObservable()");
        a(kMutableProperty0, b);
    }

    public final <T> void a(KMutableProperty0<T> kMutableProperty0, n<T> nVar) {
        Intrinsics.checkParameterIsNotNull(kMutableProperty0, "$this$set");
        Intrinsics.checkParameterIsNotNull(nVar, "observable");
        n<T> a2 = nVar.a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "observable\n            .…dSchedulers.mainThread())");
        a(k.b.f0.b.a(a2, new RxViewModelImpl$set$2(this), (Function0) null, new RxViewModelImpl$set$1(kMutableProperty0), 2));
    }
}
