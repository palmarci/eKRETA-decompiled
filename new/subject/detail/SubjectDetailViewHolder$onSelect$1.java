package hu.ekreta.ellenorzo.subject.detail;

import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewHolder.kt */
public final class SubjectDetailViewHolder$onSelect$1 extends Lambda implements Function1<SubjectDetailViewModel.ListItem, Unit> {
    public static final SubjectDetailViewHolder$onSelect$1 INSTANCE = new SubjectDetailViewHolder$onSelect$1();

    public SubjectDetailViewHolder$onSelect$1() {
        super(1);
    }

    public final void a(SubjectDetailViewModel.ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "<anonymous parameter 0>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((SubjectDetailViewModel.ListItem) obj);
        return Unit.INSTANCE;
    }
}
