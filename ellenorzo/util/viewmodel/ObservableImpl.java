package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p211h.p258l.C3705i;
import p211h.p258l.C3705i.C3706a;
import p211h.p258l.C3712m;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "Landroidx/databinding/Observable;", "()V", "callbackRegistry", "Landroidx/databinding/PropertyChangeRegistry;", "getCallbackRegistry", "()Landroidx/databinding/PropertyChangeRegistry;", "callbackRegistry$delegate", "Lkotlin/Lazy;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "notifyPropertyChanged", "sender", "fieldId", "", "removeOnPropertyChangedCallback", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl */
/* compiled from: ObservableImpl.kt */
public final class ObservableImpl implements C3705i {

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f15469e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ObservableImpl.class), "callbackRegistry", "getCallbackRegistry()Landroidx/databinding/PropertyChangeRegistry;"))};

    /* renamed from: c */
    public final Lazy f15470c = LazyKt__LazyJVMKt.lazy(ObservableImpl$callbackRegistry$2.INSTANCE);

    /* renamed from: a */
    public final C3712m mo16393a() {
        Lazy lazy = this.f15470c;
        KProperty kProperty = f15469e[0];
        return (C3712m) lazy.getValue();
    }

    /* renamed from: a */
    public void mo10510a(C3706a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        mo16393a().mo10514a(aVar);
    }

    /* renamed from: b */
    public void mo10511b(C3706a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        mo16393a().mo10520b(aVar);
    }

    /* renamed from: a */
    public final void mo16394a(C3705i iVar, int i) {
        Intrinsics.checkParameterIsNotNull(iVar, "sender");
        mo16393a().mo10515a(iVar, i, null);
    }
}
