package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$4 */
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$startSendMessageRequest$4<T> implements C4673f<Throwable> {

    /* renamed from: c */
    public final /* synthetic */ NewMessageViewModelImpl f14028c;

    public NewMessageViewModelImpl$startSendMessageRequest$4(NewMessageViewModelImpl newMessageViewModelImpl) {
        this.f14028c = newMessageViewModelImpl;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        NewMessageViewModelImpl newMessageViewModelImpl = this.f14028c;
        Intrinsics.checkExpressionValueIsNotNull(th, "throwable");
        DataBindingViewModel.showError$default(newMessageViewModelImpl, th, null, null, 6, null);
    }
}
