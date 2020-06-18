package hu.ekreta.ellenorzo.util;

import k.b.c0.j.g;
import k.b.h0.a;
import k.b.n;
import k.b.s;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J$\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0014H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/util/BehaviorRelay;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "Lio/reactivex/Observable;", "initialValue", "(Ljava/lang/Object;)V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "subscribeActual", "observer", "Lio/reactivex/Observer;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: BehaviorRelay.kt */
public final class BehaviorRelay<T> extends n<T> implements ReadWriteProperty<Object, T> {
    public a<T> c;

    public BehaviorRelay() {
        this((Object) null, 1, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ BehaviorRelay(Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        a<T> aVar;
        obj = (i2 & 1) != 0 ? null : obj;
        if (obj != null) {
            aVar = a.f(obj);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.createDefault(initialValue)");
        } else {
            aVar = new a<>();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create()");
        }
        this.c = aVar;
    }

    public void b(s<? super T> sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "observer");
        this.c.b(n.j()).a(k.b.z.a.a.a()).a(sVar);
    }

    public T getValue(Object obj, KProperty<?> kProperty) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        T t = this.c.c.get();
        if ((t == g.COMPLETE) || (t instanceof g.b)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new KotlinNullPointerException("BehaviorRelay not initialized");
    }

    public void setValue(Object obj, KProperty<?> kProperty, T t) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        this.c.a(t);
    }
}
