package p289hu.ekreta.ellenorzo.subject.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder$onSelect$1 */
/* compiled from: SubjectDetailViewHolder.kt */
public final class SubjectDetailViewHolder$onSelect$1 extends Lambda implements Function1<ListItem, Unit> {
    public static final SubjectDetailViewHolder$onSelect$1 INSTANCE = new SubjectDetailViewHolder$onSelect$1();

    public SubjectDetailViewHolder$onSelect$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo15884a(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "<anonymous parameter 0>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15884a((ListItem) obj);
        return Unit.INSTANCE;
    }
}
