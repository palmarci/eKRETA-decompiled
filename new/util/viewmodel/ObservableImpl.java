package hu.ekreta.ellenorzo.util.viewmodel;

import h.l.i;
import h.l.m;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "Landroidx/databinding/Observable;", "()V", "callbackRegistry", "Landroidx/databinding/PropertyChangeRegistry;", "getCallbackRegistry", "()Landroidx/databinding/PropertyChangeRegistry;", "callbackRegistry$delegate", "Lkotlin/Lazy;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "notifyPropertyChanged", "sender", "fieldId", "", "removeOnPropertyChangedCallback", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ObservableImpl.kt */
public final class ObservableImpl implements i {
    public static final /* synthetic */ KProperty[] e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ObservableImpl.class), "callbackRegistry", "getCallbackRegistry()Landroidx/databinding/PropertyChangeRegistry;"))};
    public final Lazy c = LazyKt__LazyJVMKt.lazy(ObservableImpl$callbackRegistry$2.INSTANCE);

    public final m a() {
        Lazy lazy = this.c;
        KProperty kProperty = e[0];
        return (m) lazy.getValue();
    }

    public void a(i.a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        a().a(aVar);
    }

    public void b(i.a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        a().b(aVar);
    }

    public final void a(i iVar, int i2) {
        Intrinsics.checkParameterIsNotNull(iVar, "sender");
        a().a(iVar, i2, null);
    }
}
