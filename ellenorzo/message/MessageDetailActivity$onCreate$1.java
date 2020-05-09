package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.attachment.Attachment;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "p1", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "Lkotlin/ParameterName;", "name", "item", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailActivity$onCreate$1 */
/* compiled from: MessageDetailActivity.kt */
public final /* synthetic */ class MessageDetailActivity$onCreate$1 extends FunctionReference implements Function1<Attachment, Unit> {
    public MessageDetailActivity$onCreate$1(MessageDetailViewModel messageDetailViewModel) {
        super(1, messageDetailViewModel);
    }

    /* renamed from: a */
    public final void mo13314a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "p1");
        ((MessageDetailViewModel) this.receiver).onSelect(attachment);
    }

    public final String getName() {
        return "onSelect";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MessageDetailViewModel.class);
    }

    public final String getSignature() {
        return "onSelect(Ljava/lang/Object;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13314a((Attachment) obj);
        return Unit.INSTANCE;
    }
}
