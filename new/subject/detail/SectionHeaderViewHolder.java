package hu.ekreta.ellenorzo.subject.detail;

import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SectionHeaderViewHolder.kt */
public final class SectionHeaderViewHolder extends MVVMViewHolder<SubjectDetailViewModel.ListItem> {
    public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;"))};
    public final ReadWriteProperty w = new SectionHeaderViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SectionHeaderViewHolder(ViewGroup viewGroup) {
        super(R.layout.section_header, viewGroup);
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Delegates delegates = Delegates.INSTANCE;
    }

    /* renamed from: a */
    public void setModel(SubjectDetailViewModel.ListItem listItem) {
        this.w.setValue(this, x[0], listItem);
    }

    public SubjectDetailViewModel.ListItem getModel() {
        return (SubjectDetailViewModel.ListItem) this.w.getValue(this, x[0]);
    }
}
