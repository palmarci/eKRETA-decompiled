package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "invoke", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$6", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$6"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$6 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$6(MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        super(1);
        this.c = messageDetailViewModelImpl$$special$$inlined$observable$1;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.c.c, th, (Integer) null, (Function1) null, 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
