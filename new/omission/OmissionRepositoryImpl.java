package hu.ekreta.ellenorzo.omission;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionRepositoryImpl;", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "omissionDao", "Lhu/ekreta/ellenorzo/omission/OmissionDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/omission/OmissionDao;)V", "adapter", "hu/ekreta/ellenorzo/omission/OmissionRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/omission/OmissionRepositoryImpl$adapter$1;", "getOmissionDao", "()Lhu/ekreta/ellenorzo/omission/OmissionDao;", "fetchOmissions", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getOmissionsByProfile", "getOmissionsWithBeJustifiedStateCountByProfile", "", "updateOmission", "omission", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionRepositoryImpl.kt */
public final class OmissionRepositoryImpl implements OmissionRepository {

    /* renamed from: a  reason: collision with root package name */
    public final OmissionRepositoryImpl$adapter$1 f5962a = new OmissionRepositoryImpl$adapter$1(this);
    public final MobileApiV3 b;
    public final OmissionDao c;

    public OmissionRepositoryImpl(MobileApiV3 mobileApiV3, OmissionDao omissionDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(omissionDao, "omissionDao");
        this.b = mobileApiV3;
        this.c = omissionDao;
    }

    public n<List<Omission>> F(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5962a.a(profile);
    }

    public final OmissionDao a() {
        return this.c;
    }

    public n<Integer> p(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> g2 = this.f5962a.a(profile).g(OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$1.INSTANCE).g(OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "adapter.getOmissions(pro…    it.size\n            }");
        return g2;
    }

    public n<List<Omission>> v(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.b;
        n<List<Omission>> a2 = MobileApiV3.DefaultImpls.getOmissions$default(mobileApiV3, profile.p() + "/ellenorzo/V3/Sajat/Mulasztasok", MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), (String) null, (String) null, 12, (Object) null).g(new OmissionRepositoryImpl$fetchOmissions$1(profile)).c(new OmissionRepositoryImpl$fetchOmissions$2(this, profile)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "mobileApiV3.getOmissions…dSchedulers.mainThread())");
        return a2;
    }

    public n<Omission> a(Omission omission) {
        Intrinsics.checkParameterIsNotNull(omission, "omission");
        return this.f5962a.a(omission);
    }
}
