package p289hu.ekreta.ellenorzo.subject.detail;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SectionHeaderViewHolder */
/* compiled from: SectionHeaderViewHolder.kt */
public final class SectionHeaderViewHolder extends MVVMViewHolder<ListItem> {

    /* renamed from: x */
    public static final /* synthetic */ KProperty[] f15002x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;"))};

    /* renamed from: w */
    public final ReadWriteProperty f15003w = new SectionHeaderViewHolder$$special$$inlined$observable$1(null, null, this);

    public SectionHeaderViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        super(C4014R.layout.section_header, viewGroup);
        Delegates delegates = Delegates.INSTANCE;
    }

    /* renamed from: a */
    public void setModel(ListItem listItem) {
        this.f15003w.setValue(this, f15002x[0], listItem);
    }

    public ListItem getModel() {
        return (ListItem) this.f15003w.getValue(this, f15002x[0]);
    }
}
