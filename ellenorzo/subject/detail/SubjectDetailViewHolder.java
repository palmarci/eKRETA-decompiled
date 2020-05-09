package p289hu.ekreta.ellenorzo.subject.detail;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.FormType;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "method", "Lkotlin/Function1;", "", "onSelect", "getOnSelect", "()Lkotlin/jvm/functions/Function1;", "setOnSelect", "(Lkotlin/jvm/functions/Function1;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder */
/* compiled from: SubjectDetailViewHolder.kt */
public final class SubjectDetailViewHolder extends MVVMViewHolder<ListItem> {

    /* renamed from: x */
    public static final /* synthetic */ KProperty[] f15014x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SubjectDetailViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;"))};

    /* renamed from: w */
    public final ReadWriteProperty f15015w = new SubjectDetailViewHolder$$special$$inlined$observable$1(null, null, this);

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15016a = new int[FormType.values().length];

        static {
            f15016a[FormType.LONG_TEXT.ordinal()] = 1;
            f15016a[FormType.MARK.ordinal()] = 2;
        }
    }

    public SubjectDetailViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        super(C4014R.layout.subject_detail_item, viewGroup);
        SubjectDetailViewHolder$onSelect$1 subjectDetailViewHolder$onSelect$1 = SubjectDetailViewHolder$onSelect$1.INSTANCE;
        Delegates delegates = Delegates.INSTANCE;
    }

    /* renamed from: a */
    public void setModel(ListItem listItem) {
        this.f15015w.setValue(this, f15014x[0], listItem);
    }

    /* renamed from: a */
    public final void mo15882a(Function1<? super ListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "method");
        this.f7113c.setOnClickListener(new SubjectDetailViewHolder$onSelect$2(this, function1));
    }

    public ListItem getModel() {
        return (ListItem) this.f15015w.getValue(this, f15014x[0]);
    }
}
