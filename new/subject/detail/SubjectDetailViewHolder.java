package hu.ekreta.ellenorzo.subject.detail;

import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "method", "Lkotlin/Function1;", "", "onSelect", "getOnSelect", "()Lkotlin/jvm/functions/Function1;", "setOnSelect", "(Lkotlin/jvm/functions/Function1;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewHolder.kt */
public final class SubjectDetailViewHolder extends MVVMViewHolder<SubjectDetailViewModel.ListItem> {
    public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SubjectDetailViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;"))};
    public final ReadWriteProperty w = new SubjectDetailViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6188a = new int[Evaluation.FormType.values().length];

        static {
            f6188a[Evaluation.FormType.LONG_TEXT.ordinal()] = 1;
            f6188a[Evaluation.FormType.MARK.ordinal()] = 2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubjectDetailViewHolder(ViewGroup viewGroup) {
        super(R.layout.subject_detail_item, viewGroup);
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        SubjectDetailViewHolder$onSelect$1 subjectDetailViewHolder$onSelect$1 = SubjectDetailViewHolder$onSelect$1.INSTANCE;
        Delegates delegates = Delegates.INSTANCE;
    }

    /* renamed from: a */
    public void setModel(SubjectDetailViewModel.ListItem listItem) {
        this.w.setValue(this, x[0], listItem);
    }

    public final void a(Function1<? super SubjectDetailViewModel.ListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "method");
        this.c.setOnClickListener(new SubjectDetailViewHolder$onSelect$2(this, function1));
    }

    public SubjectDetailViewModel.ListItem getModel() {
        return (SubjectDetailViewModel.ListItem) this.w.getValue(this, x[0]);
    }
}
