package hu.ekreta.ellenorzo.omission.detail;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailViewModelImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class OmissionDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Omission> {
    public final /* synthetic */ OmissionDetailViewModelImpl c;
    public final /* synthetic */ GroupRepository e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OmissionDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, OmissionDetailViewModelImpl omissionDetailViewModelImpl, GroupRepository groupRepository) {
        super(obj2);
        this.c = omissionDetailViewModelImpl;
        this.e = groupRepository;
    }

    public void afterChange(KProperty<?> kProperty, Omission omission, Omission omission2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Omission omission3 = omission2;
        Omission omission4 = omission;
        if (omission3 != null) {
            this.c.o(omission3.u());
            this.c.u(omission3.p());
            OmissionDetailViewModelImpl omissionDetailViewModelImpl = this.c;
            int i2 = OmissionDetailViewModelImpl.WhenMappings.f5987a[omission3.w().ordinal()];
            if (i2 == 1) {
                str = this.c.Z1().getString(R.string.absence);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.absence)");
            } else if (i2 != 2) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.c.Z1().getString(R.string.lateness));
                String string = this.c.Z1().getString(R.string.minute);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …ute\n                    )");
                sb.append(omission3.a(string));
                str = sb.toString();
            }
            omissionDetailViewModelImpl.w(str);
            this.c.v(omission3.v());
            OmissionDetailViewModelImpl omissionDetailViewModelImpl2 = this.c;
            String string2 = omissionDetailViewModelImpl2.Z1().getString(omission3.j().a());
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(it.jus…onState.localizedNameRes)");
            omissionDetailViewModelImpl2.s(string2);
            OmissionDetailViewModelImpl omissionDetailViewModelImpl3 = this.c;
            String string3 = omissionDetailViewModelImpl3.Z1().getString(R.string.lesson);
            Intrinsics.checkExpressionValueIsNotNull(string3, "context.getString(R.string.lesson)");
            omissionDetailViewModelImpl3.t(omission3.b(string3));
            this.c.q(UtilsKt.d(omission3.g()));
            OmissionDetailViewModelImpl omissionDetailViewModelImpl4 = this.c;
            omissionDetailViewModelImpl4.a(new OmissionDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(omissionDetailViewModelImpl4), this.e.b(omission3.i()));
        }
    }
}
