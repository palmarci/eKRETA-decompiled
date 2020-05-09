package p289hu.ekreta.ellenorzo.splash;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p001a.p002a.C0006f;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl$loginOrNavigateForward$2 */
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$loginOrNavigateForward$2 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ SplashViewModelImpl f14810c;

    public SplashViewModelImpl$loginOrNavigateForward$2(SplashViewModelImpl splashViewModelImpl) {
        this.f14810c = splashViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo15675a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        if (!((Boolean) this.f14810c.f14802j.getValue(this.f14810c, SplashViewModelImpl.f14801p[0])).booleanValue()) {
            this.f14810c.f14807o.mo16357a();
            DataBindingViewModel.showError$default(this.f14810c, th, null, new Function1<C0006f, Unit>(this) {

                /* renamed from: c */
                public final /* synthetic */ SplashViewModelImpl$loginOrNavigateForward$2 f14811c;

                {
                    this.f14811c = r1;
                }

                /* renamed from: a */
                public final void mo15676a(C0006f fVar) {
                    Intrinsics.checkParameterIsNotNull(fVar, "it");
                    this.f14811c.f14810c.f14802j.setValue(this.f14811c.f14810c, SplashViewModelImpl.f14801p[0], Boolean.valueOf(true));
                    this.f14811c.f14810c.mo16364O1();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo15676a((C0006f) obj);
                    return Unit.INSTANCE;
                }
            }, 2, null);
            return;
        }
        DataBindingViewModel.showAlert$default(this.f14810c, C4014R.string.fatal_error, null, new Function1<C0006f, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ SplashViewModelImpl$loginOrNavigateForward$2 f14812c;

            {
                this.f14812c = r1;
            }

            /* renamed from: a */
            public final void mo15677a(C0006f fVar) {
                Intrinsics.checkParameterIsNotNull(fVar, "it");
                this.f14812c.f14810c.mo16363N1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo15677a((C0006f) obj);
                return Unit.INSTANCE;
            }
        }, 2, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15675a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
