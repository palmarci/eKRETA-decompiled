package p289hu.ekreta.ellenorzo.util;

import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5032s;
import p300k.p313b.p316c0.p332j.C4987g;
import p300k.p313b.p316c0.p332j.C4987g.C4989b;
import p300k.p313b.p337h0.C5016a;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J$\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0014H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/BehaviorRelay;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "Lio/reactivex/Observable;", "initialValue", "(Ljava/lang/Object;)V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "subscribeActual", "observer", "Lio/reactivex/Observer;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.BehaviorRelay */
/* compiled from: BehaviorRelay.kt */
public final class BehaviorRelay<T> extends C5027n<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: c */
    public C5016a<T> f15267c;

    public BehaviorRelay() {
        this(null, 1, null);
    }

    public /* synthetic */ BehaviorRelay(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C5016a<T> aVar;
        if ((i & 1) != 0) {
            obj = null;
        }
        if (obj != null) {
            aVar = C5016a.m16849f(obj);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.createDefault(initialValue)");
        } else {
            aVar = new C5016a<>();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create()");
        }
        this.f15267c = aVar;
    }

    /* renamed from: b */
    public void mo16184b(C5032s<? super T> sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "observer");
        this.f15267c.mo17226b((C5030q<? extends T>) C5027n.m16899j()).mo17214a(C5041a.m16999a()).mo17092a(sVar);
    }

    public T getValue(Object obj, KProperty<?> kProperty) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        T t = this.f15267c.f17166c.get();
        if ((t == C4987g.COMPLETE) || (t instanceof C4989b)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new KotlinNullPointerException("BehaviorRelay not initialized");
    }

    public void setValue(Object obj, KProperty<?> kProperty, T t) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        this.f15267c.mo17017a(t);
    }
}
