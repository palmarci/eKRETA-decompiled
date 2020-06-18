package hu.ekreta.ellenorzo.profile;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.LoggedIn;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.b0.h;
import k.b.d;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$5<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ UpdateProfileStrategyImpl c;
    public final /* synthetic */ StudentDto e;
    public final /* synthetic */ List f;

    public UpdateProfileStrategyImpl$updateProfile$5(UpdateProfileStrategyImpl updateProfileStrategyImpl, StudentDto studentDto, List list) {
        this.c = updateProfileStrategyImpl;
        this.e = studentDto;
        this.f = list;
    }

    /* renamed from: a */
    public final n<LoggedIn> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.f6031a.a(profile.m(), (List<Guardian>) v.a(this.e.getGuardianList(), profile)).e().a((d) this.c.b.b(profile.m(), v.a(this.f, profile)).e()).a(n.d(new LoggedIn(profile)));
    }
}
