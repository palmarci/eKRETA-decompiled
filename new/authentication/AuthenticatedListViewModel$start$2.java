package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "T", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$2 extends Lambda implements Function1<Profile, b> {
    public final /* synthetic */ AuthenticatedListViewModel c;
    public final /* synthetic */ Function1 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedListViewModel$start$2(AuthenticatedListViewModel authenticatedListViewModel, Function1 function1) {
        super(1);
        this.c = authenticatedListViewModel;
        this.e = function1;
    }

    /* renamed from: a */
    public final b invoke(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        b e2 = this.c.a((n) this.e.invoke(profile)).e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "updateLocalData(it).retr…orized().ignoreElements()");
        return e2;
    }
}
