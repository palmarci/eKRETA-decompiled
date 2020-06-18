package hu.ekreta.ellenorzo.login;

import a.k.a.a;
import a.k.a.c;
import android.content.Intent;
import h.m.d.d;
import hu.ekreta.ellenorzo.institute.InstitutePickerActivity;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import java.util.List;
import k.b.b0.h;
import k.b.f0.b;
import k.b.j;
import k.b.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$startInstitutePickerActivity$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ LoginViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$startInstitutePickerActivity$1(LoginViewModelImpl loginViewModelImpl) {
        super(1);
        this.c = loginViewModelImpl;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        LoginViewModelImpl loginViewModelImpl = this.c;
        j<R> c2 = ((c) loginViewModelImpl.A.get()).f2809a.a(new Intent(dVar, InstitutePickerActivity.class)).c(new h<T, l<? extends R>>(this) {
            public final /* synthetic */ LoginViewModelImpl$startInstitutePickerActivity$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final j<List<InstituteDto>> apply(a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "it");
                if (!aVar.a()) {
                    return j.c();
                }
                Intent intent = aVar.b;
                Intrinsics.checkExpressionValueIsNotNull(intent, "it.data");
                String h2 = ExtensionsKt.h(intent);
                if (h2 != null) {
                    return this.c.c.w.c(h2).c();
                }
                return null;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c2, "rxActivityResultProvider…          }\n            }");
        AnonymousClass2 r1 = new Function1<List<? extends InstituteDto>, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl$startInstitutePickerActivity$1 c;

            {
                this.c = r1;
            }

            public final void a(List<InstituteDto> list) {
                LoginViewModelImpl loginViewModelImpl = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                loginViewModelImpl.t.setValue(loginViewModelImpl, LoginViewModelImpl.B[8], (InstituteDto) CollectionsKt___CollectionsKt.firstOrNull(list));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.INSTANCE;
            }
        };
        loginViewModelImpl.a(b.a(c2, (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl$startInstitutePickerActivity$1 c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showError$default(this.c.c, th, (Integer) null, (Function1) null, 6, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0<Unit>) new Function0<Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl$startInstitutePickerActivity$1 c;

            {
                this.c = r1;
            }

            public final void invoke() {
                this.c.c.t.setValue(this.c.c, LoginViewModelImpl.B[8], null);
            }
        }, r1));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
