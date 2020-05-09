package p289hu.ekreta.ellenorzo.cases.tmgi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl$send$5 */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$send$5 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TmgiFormViewModelImpl f11769c;

    public TmgiFormViewModelImpl$send$5(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        this.f11769c = tmgiFormViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo12212a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.f11769c, th, Integer.valueOf(C4014R.string.attention), null, 4, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12212a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
