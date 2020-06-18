package hu.ekreta.ellenorzo.subject.certificate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SectionHeaderViewHolder.kt */
public final class SectionHeaderViewHolder extends MVVMViewHolder<CertificationListItem> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;"))};
    public final ReadWriteProperty w = new SectionHeaderViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/SectionHeaderViewHolder$Companion;", "", "()V", "create", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "parent", "Landroid/view/ViewGroup;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SectionHeaderViewHolder.kt */
    public static final class Companion {
        public Companion() {
        }

        public final MVVMViewHolder<? super CertificationListItem> a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_header, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new SectionHeaderViewHolder(inflate);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SectionHeaderViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Delegates delegates = Delegates.INSTANCE;
    }

    /* renamed from: a */
    public void setModel(CertificationListItem certificationListItem) {
        this.w.setValue(this, x[0], certificationListItem);
    }

    public CertificationListItem getModel() {
        return (CertificationListItem) this.w.getValue(this, x[0]);
    }
}
