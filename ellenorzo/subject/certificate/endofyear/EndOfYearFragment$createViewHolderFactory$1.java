package p289hu.ekreta.ellenorzo.subject.certificate.endofyear;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationItemViewHolder;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import p289hu.ekreta.ellenorzo.subject.certificate.SectionHeaderViewHolder;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment$createViewHolderFactory$1 */
/* compiled from: EndOfYearFragment.kt */
public final class EndOfYearFragment$createViewHolderFactory$1 extends Lambda implements Function2<ViewGroup, Integer, MVVMViewHolder<? super CertificationListItem>> {

    /* renamed from: c */
    public final /* synthetic */ EndOfYearFragment f14953c;

    public EndOfYearFragment$createViewHolderFactory$1(EndOfYearFragment endOfYearFragment) {
        this.f14953c = endOfYearFragment;
        super(2);
    }

    /* renamed from: a */
    public final MVVMViewHolder<? super CertificationListItem> mo15837a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i != 0) {
            return CertificationItemViewHolder.Companion.mo15819a(viewGroup, new Function1<CertificationListItem, Unit>(this.f14953c.mo15835C0()) {
                /* renamed from: a */
                public final void mo15838a(CertificationListItem certificationListItem) {
                    Intrinsics.checkParameterIsNotNull(certificationListItem, "p1");
                    ((EndOfYearViewModel) this.receiver).onSelect(certificationListItem);
                }

                public final String getName() {
                    return "onSelect";
                }

                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(EndOfYearViewModel.class);
                }

                public final String getSignature() {
                    return "onSelect(Ljava/lang/Object;)V";
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo15838a((CertificationListItem) obj);
                    return Unit.INSTANCE;
                }
            });
        }
        return SectionHeaderViewHolder.Companion.mo15833a(viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo15837a((ViewGroup) obj, ((Number) obj2).intValue());
    }
}
