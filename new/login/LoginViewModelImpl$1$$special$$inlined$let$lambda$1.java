package hu.ekreta.ellenorzo.login;

import hu.ekreta.ellenorzo.login.LoginViewModelImpl;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import java.util.List;
import k.b.b0.f;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/login/LoginViewModelImpl$1$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$1$$special$$inlined$let$lambda$1<T> implements f<List<? extends InstituteDto>> {
    public final /* synthetic */ LoginViewModelImpl.AnonymousClass1 c;

    public LoginViewModelImpl$1$$special$$inlined$let$lambda$1(LoginViewModelImpl.AnonymousClass1 r1) {
        this.c = r1;
    }

    /* renamed from: a */
    public final void accept(List<InstituteDto> list) {
        LoginViewModelImpl loginViewModelImpl = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(list, "it");
        loginViewModelImpl.t.setValue(loginViewModelImpl, LoginViewModelImpl.B[8], (InstituteDto) CollectionsKt___CollectionsKt.firstOrNull(list));
    }
}
