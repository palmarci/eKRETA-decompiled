package hu.ekreta.ellenorzo.message;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$deleteMessage$3 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ MessagesViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$deleteMessage$3(MessagesViewModelImpl messagesViewModelImpl) {
        super(1);
        this.c = messagesViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.c.k0().c(true);
        DataBindingViewModel.showError$default(this.c, th, (Integer) null, (Function1) null, 6, (Object) null);
        b access$getLogger$p = this.c.V1();
        StringBuilder a2 = a.a("Error happened deleting message permanently  ");
        a2.append(th.getMessage());
        access$getLogger$p.d(a2.toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
