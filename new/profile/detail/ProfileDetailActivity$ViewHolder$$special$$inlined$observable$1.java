package hu.ekreta.ellenorzo.profile.detail;

import hu.ekreta.ellenorzo.profile.Guardian;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class ProfileDetailActivity$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Guardian> {
    public final /* synthetic */ ProfileDetailActivity.ViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDetailActivity$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ProfileDetailActivity.ViewHolder viewHolder) {
        super(obj2);
        this.c = viewHolder;
    }

    public void afterChange(KProperty<?> kProperty, Guardian guardian, Guardian guardian2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Guardian guardian3 = guardian2;
        Guardian guardian4 = guardian;
        if (guardian3 != null) {
            this.c.w.setText(guardian3.b());
            this.c.x.setText(ExtensionsKt.b(guardian3.a()));
            this.c.y.setText(ExtensionsKt.b(guardian3.c()));
        }
    }
}
