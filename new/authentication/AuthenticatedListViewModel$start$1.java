package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "T", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$1 extends Lambda implements Function1<Profile, n<List<? extends T>>> {
    public final /* synthetic */ Function1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedListViewModel$start$1(Function1 function1) {
        super(1);
        this.c = function1;
    }

    /* renamed from: a */
    public final n<List<T>> invoke(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        return (n) this.c.invoke(profile);
    }
}
