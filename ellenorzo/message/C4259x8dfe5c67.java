package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$6", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$6"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$6 */
/* compiled from: MessageDetailViewModelImpl.kt */
public final class C4259x8dfe5c67 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 f13856c;

    public C4259x8dfe5c67(MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f13856c = messageDetailViewModelImpl$$special$$inlined$observable$1;
        super(1);
    }

    /* renamed from: a */
    public final void mo13341a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.f13856c.f13847c, th, null, null, 6, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13341a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
