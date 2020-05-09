package p289hu.ekreta.ellenorzo.login;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p173k.p174a.C2676c;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.institute.InstitutePickerActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p315b0.C4676i;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$startInstitutePickerActivity$1 */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$startInstitutePickerActivity$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ LoginViewModelImpl f13668c;

    public LoginViewModelImpl$startInstitutePickerActivity$1(LoginViewModelImpl loginViewModelImpl) {
        this.f13668c = loginViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13154a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        LoginViewModelImpl loginViewModelImpl = this.f13668c;
        C2676c cVar = (C2676c) loginViewModelImpl.f13632A.get();
        C5027n b = cVar.f6080a.mo5054a(new Intent(dVar, InstitutePickerActivity.class)).mo17256a((C4676i<? super T>) C42231.INSTANCE).mo17188b((C4675h<? super T, ? extends C5030q<? extends R>>) C42242.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(b, "rxActivityResultProvider…bservable.just(it.data) }");
        loginViewModelImpl.mo16413a(C4998b.m16842a(b, (Function1) null, (Function0) null, (Function1) new Function1<Intent, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ LoginViewModelImpl$startInstitutePickerActivity$1 f13669c;

            {
                this.f13669c = r1;
            }

            /* renamed from: a */
            public final void mo13157a(Intent intent) {
                Intrinsics.checkExpressionValueIsNotNull(intent, "it");
                String g = ExtensionsKt.m14670g(intent);
                if (g != null) {
                    LoginViewModelImpl loginViewModelImpl = this.f13669c.f13668c;
                    C4663c e = loginViewModelImpl.f13645v.mo13094c(g).mo17240e((C4673f<? super T>) new C4220x2e40c0d4<Object>(this));
                    Intrinsics.checkExpressionValueIsNotNull(e, "instituteRepository\n    …                        }");
                    loginViewModelImpl.mo16413a(e);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13157a((Intent) obj);
                return Unit.INSTANCE;
            }
        }, 3));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13154a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
