package hu.ekreta.ellenorzo.profile.list;

import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b;
import k.b.b0.h;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/CompletableSource;"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileListViewModelImpl.kt */
public final class ProfileListViewModelImpl$onDeleteProfile$1<T, R> implements h<Integer, d> {
    public final /* synthetic */ ProfileListViewModelImpl c;
    public final /* synthetic */ Profile e;

    public ProfileListViewModelImpl$onDeleteProfile$1(ProfileListViewModelImpl profileListViewModelImpl, Profile profile) {
        this.c = profileListViewModelImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final d apply(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "it");
        if (num.intValue() == -1) {
            return this.c.r.e(this.e);
        }
        return b.e();
    }
}
