package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "T", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel$start$2 */
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$2 extends Lambda implements Function1<Profile, C4667b> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedListViewModel f11197c;

    /* renamed from: e */
    public final /* synthetic */ Function1 f11198e;

    public AuthenticatedListViewModel$start$2(AuthenticatedListViewModel authenticatedListViewModel, Function1 function1) {
        this.f11197c = authenticatedListViewModel;
        this.f11198e = function1;
        super(1);
    }

    /* renamed from: a */
    public final C4667b invoke(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        C4667b e = this.f11197c.mo11505a((C5027n) this.f11198e.invoke(profile)).mo17241e();
        Intrinsics.checkExpressionValueIsNotNull(e, "updateLocalData(it).retr…orized().ignoreElements()");
        return e;
    }
}
