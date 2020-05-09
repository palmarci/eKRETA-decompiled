package p289hu.ekreta.ellenorzo.authentication;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "T", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel$start$1 */
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$1 extends Lambda implements Function1<Profile, C5027n<List<? extends T>>> {

    /* renamed from: c */
    public final /* synthetic */ Function1 f11196c;

    public AuthenticatedListViewModel$start$1(Function1 function1) {
        this.f11196c = function1;
        super(1);
    }

    /* renamed from: a */
    public final C5027n<List<T>> invoke(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        return (C5027n) this.f11196c.invoke(profile);
    }
}
