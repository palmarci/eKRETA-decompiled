package p289hu.ekreta.ellenorzo.cases.tmgi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p001a.p002a.C0006f;
import p289hu.ekreta.ellenorzo.C4014R;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo17463d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl$send$4 */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$send$4 extends Lambda implements Function1<Boolean, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TmgiFormViewModelImpl f11767c;

    public TmgiFormViewModelImpl$send$4(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        this.f11767c = tmgiFormViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo12210a(Boolean bool) {
        Intrinsics.checkExpressionValueIsNotNull(bool, "success");
        if (bool.booleanValue()) {
            this.f11767c.mo16370a((int) C4014R.string.Successful_case_send, Integer.valueOf(C4014R.string.Successful_dialog_title), (Function1<? super C0006f, Unit>) new Function1<C0006f, Unit>(this) {

                /* renamed from: c */
                public final /* synthetic */ TmgiFormViewModelImpl$send$4 f11768c;

                {
                    this.f11768c = r1;
                }

                /* renamed from: a */
                public final void mo12211a(C0006f fVar) {
                    Intrinsics.checkParameterIsNotNull(fVar, "it");
                    TmgiFormViewModelImpl.access$resetActualData(this.f11768c.f11767c);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo12211a((C0006f) obj);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12210a((Boolean) obj);
        return Unit.INSTANCE;
    }
}
