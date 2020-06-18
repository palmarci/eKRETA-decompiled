package hu.ekreta.ellenorzo.main;

import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b;
import k.b.b0.h;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$changeProfile$2<T, R> implements h<Profile, d> {
    public final /* synthetic */ MainViewModelImpl c;

    public MainViewModelImpl$changeProfile$2(MainViewModelImpl mainViewModelImpl) {
        this.c = mainViewModelImpl;
    }

    /* renamed from: a */
    public final b apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        return this.c.u.d(profile);
    }
}
