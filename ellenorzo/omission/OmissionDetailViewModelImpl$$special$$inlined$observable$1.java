package p289hu.ekreta.ellenorzo.omission;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.omission.OmissionDetailViewModelImpl.WhenMappings;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class OmissionDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Omission> {

    /* renamed from: c */
    public final /* synthetic */ OmissionDetailViewModelImpl f14381c;

    /* renamed from: e */
    public final /* synthetic */ GroupRepository f14382e;

    public OmissionDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, OmissionDetailViewModelImpl omissionDetailViewModelImpl, GroupRepository groupRepository) {
        this.f14381c = omissionDetailViewModelImpl;
        this.f14382e = groupRepository;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Omission omission, Omission omission2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Omission omission3 = omission2;
        Omission omission4 = omission;
        if (omission3 != null) {
            this.f14381c.mo13890p(omission3.mo13859u());
            this.f14381c.mo13895v(omission3.mo13853p());
            OmissionDetailViewModelImpl omissionDetailViewModelImpl = this.f14381c;
            int i = WhenMappings.f14380a[omission3.mo13861w().ordinal()];
            if (i == 1) {
                str = this.f14381c.mo13889P1().getString(C4014R.string.absence);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.absence)");
            } else if (i != 2) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f14381c.mo13889P1().getString(C4014R.string.lateness));
                String string = this.f14381c.mo13889P1().getString(C4014R.string.minute);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …ute\n                    )");
                sb.append(omission3.mo13838a(string));
                str = sb.toString();
            }
            omissionDetailViewModelImpl.mo13898y(str);
            this.f14381c.mo13897x(omission3.mo13860v());
            this.f14381c.mo13896w(String.valueOf(omission3.mo13842f()));
            OmissionDetailViewModelImpl omissionDetailViewModelImpl2 = this.f14381c;
            String string2 = omissionDetailViewModelImpl2.mo13889P1().getString(omission3.mo13847j().mo13866a());
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(it.jus…onState.localizedNameRes)");
            omissionDetailViewModelImpl2.mo13893t(string2);
            OmissionDetailViewModelImpl omissionDetailViewModelImpl3 = this.f14381c;
            omissionDetailViewModelImpl3.mo13894u(omission3.mo13837a(omissionDetailViewModelImpl3.mo13889P1()));
            this.f14381c.mo13891r(UtilsKt.m14841d(omission3.mo13843g()));
            OmissionDetailViewModelImpl omissionDetailViewModelImpl4 = this.f14381c;
            omissionDetailViewModelImpl4.mo16415a((KMutableProperty0<T>) new C4304x8765182c<T>(omissionDetailViewModelImpl4), this.f14382e.mo12812b(omission3.mo13846i()));
        }
    }
}
