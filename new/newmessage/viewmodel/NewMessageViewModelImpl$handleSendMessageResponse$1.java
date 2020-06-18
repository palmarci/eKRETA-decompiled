package hu.ekreta.ellenorzo.newmessage.viewmodel;

import a.a.a.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$handleSendMessageResponse$1 extends Lambda implements Function1<f, Unit> {
    public final /* synthetic */ NewMessageViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewMessageViewModelImpl$handleSendMessageResponse$1(NewMessageViewModelImpl newMessageViewModelImpl) {
        super(1);
        this.c = newMessageViewModelImpl;
    }

    public final void a(f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "it");
        this.c.W1();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return Unit.INSTANCE;
    }
}
