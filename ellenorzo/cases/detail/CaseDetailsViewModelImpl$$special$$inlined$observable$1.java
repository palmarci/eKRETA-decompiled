package p289hu.ekreta.ellenorzo.cases.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class CaseDetailsViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<BaseCase> {

    /* renamed from: c */
    public final /* synthetic */ CaseDetailsViewModelImpl f11486c;

    public CaseDetailsViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        this.f11486c = caseDetailsViewModelImpl;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, BaseCase baseCase, BaseCase baseCase2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        BaseCase baseCase3 = baseCase2;
        BaseCase baseCase4 = baseCase;
        if (baseCase3 != null) {
            this.f11486c.mo11823d(baseCase3);
            this.f11486c.f11458I = baseCase3.mo11582i().size();
            if (this.f11486c.f11458I >= 1) {
                this.f11486c.mo11817b(baseCase3);
            }
            if (this.f11486c.f11458I == 2) {
                this.f11486c.mo11820c(baseCase3);
            }
            if (baseCase3 instanceof TmgiCase) {
                this.f11486c.mo11785B().updateWith(baseCase3);
            }
            this.f11486c.f11465m.mo17017a(baseCase3.mo11585l());
        }
    }
}
