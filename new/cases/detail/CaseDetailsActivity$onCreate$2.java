package hu.ekreta.ellenorzo.cases.detail;

import hu.ekreta.ellenorzo.attachment.Attachment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "Lkotlin/ParameterName;", "name", "item", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDetailsActivity.kt */
public final /* synthetic */ class CaseDetailsActivity$onCreate$2 extends FunctionReference implements Function1<Attachment, Unit> {
    public CaseDetailsActivity$onCreate$2(CaseDetailsViewModel caseDetailsViewModel) {
        super(1, caseDetailsViewModel);
    }

    public final void a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "p1");
        ((CaseDetailsViewModel) this.receiver).a(attachment);
    }

    public final String getName() {
        return "onSelect";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(CaseDetailsViewModel.class);
    }

    public final String getSignature() {
        return "onSelect(Lhu/ekreta/ellenorzo/attachment/Attachment;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Attachment) obj);
        return Unit.INSTANCE;
    }
}
