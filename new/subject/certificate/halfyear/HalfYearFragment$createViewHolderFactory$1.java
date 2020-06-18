package hu.ekreta.ellenorzo.subject.certificate.halfyear;

import android.view.ViewGroup;
import hu.ekreta.ellenorzo.subject.certificate.CertificationItemViewHolder;
import hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import hu.ekreta.ellenorzo.subject.certificate.SectionHeaderViewHolder;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HalfYearFragment.kt */
public final class HalfYearFragment$createViewHolderFactory$1 extends Lambda implements Function2<ViewGroup, Integer, MVVMViewHolder<? super CertificationListItem>> {
    public final /* synthetic */ HalfYearFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfYearFragment$createViewHolderFactory$1(HalfYearFragment halfYearFragment) {
        super(2);
        this.c = halfYearFragment;
    }

    public final MVVMViewHolder<? super CertificationListItem> a(ViewGroup viewGroup, int i2) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i2 != 0) {
            return CertificationItemViewHolder.Companion.a(viewGroup, new Function1<CertificationListItem, Unit>(this.c.C0()) {
                public final void a(CertificationListItem certificationListItem) {
                    Intrinsics.checkParameterIsNotNull(certificationListItem, "p1");
                    ((HalfYearViewModel) this.receiver).onSelect(certificationListItem);
                }

                public final String getName() {
                    return "onSelect";
                }

                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(HalfYearViewModel.class);
                }

                public final String getSignature() {
                    return "onSelect(Ljava/lang/Object;)V";
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((CertificationListItem) obj);
                    return Unit.INSTANCE;
                }
            });
        }
        return SectionHeaderViewHolder.Companion.a(viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((ViewGroup) obj, ((Number) obj2).intValue());
    }
}
