package p289hu.ekreta.ellenorzo.login;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.institute.Institute;
import p289hu.ekreta.ellenorzo.login.LoginViewModelImpl$startInstitutePickerActivity$1.C42253;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo17463d2 = {"<anonymous>", "", "instituteList", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/login/LoginViewModelImpl$startInstitutePickerActivity$1$3$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$startInstitutePickerActivity$1$3$$special$$inlined$also$lambda$1 */
/* compiled from: LoginViewModelImpl.kt */
public final class C4220x2e40c0d4<T> implements C4673f<List<? extends Institute>> {

    /* renamed from: c */
    public final /* synthetic */ C42253 f13660c;

    public C4220x2e40c0d4(C42253 r1) {
        this.f13660c = r1;
    }

    /* renamed from: a */
    public final void accept(List<Institute> list) {
        LoginViewModelImpl loginViewModelImpl = this.f13660c.f13669c.f13668c;
        Intrinsics.checkExpressionValueIsNotNull(list, "instituteList");
        loginViewModelImpl.f13643t.setValue(loginViewModelImpl, LoginViewModelImpl.f13631B[8], (Institute) CollectionsKt___CollectionsKt.firstOrNull(list));
    }
}
