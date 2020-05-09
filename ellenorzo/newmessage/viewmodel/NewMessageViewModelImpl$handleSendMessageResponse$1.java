package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p001a.p002a.C0006f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$handleSendMessageResponse$1 */
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$handleSendMessageResponse$1 extends Lambda implements Function1<C0006f, Unit> {

    /* renamed from: c */
    public final /* synthetic */ NewMessageViewModelImpl f14024c;

    public NewMessageViewModelImpl$handleSendMessageResponse$1(NewMessageViewModelImpl newMessageViewModelImpl) {
        this.f14024c = newMessageViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13548a(C0006f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "it");
        this.f14024c.mo16363N1();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13548a((C0006f) obj);
        return Unit.INSTANCE;
    }
}
