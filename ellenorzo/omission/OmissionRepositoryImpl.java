package p289hu.ekreta.ellenorzo.omission;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3.DefaultImpls;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionRepositoryImpl;", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "omissionDao", "Lhu/ekreta/ellenorzo/omission/OmissionDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/omission/OmissionDao;)V", "adapter", "hu/ekreta/ellenorzo/omission/OmissionRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/omission/OmissionRepositoryImpl$adapter$1;", "getOmissionDao", "()Lhu/ekreta/ellenorzo/omission/OmissionDao;", "fetchOmissions", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getOmissionsByProfile", "getOmissionsWithBeJustifiedStateCountByProfile", "", "updateOmission", "omission", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl */
/* compiled from: OmissionRepositoryImpl.kt */
public final class OmissionRepositoryImpl implements OmissionRepository {

    /* renamed from: a */
    public final OmissionRepositoryImpl$adapter$1 f14414a = new OmissionRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f14415b;

    /* renamed from: c */
    public final OmissionDao f14416c;

    public OmissionRepositoryImpl(MobileApiV3 mobileApiV3, OmissionDao omissionDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(omissionDao, "omissionDao");
        this.f14415b = mobileApiV3;
        this.f14416c = omissionDao;
    }

    /* renamed from: F */
    public C5027n<List<Omission>> mo13969F(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14414a.mo13975a(profile);
    }

    /* renamed from: a */
    public final OmissionDao mo13973a() {
        return this.f14416c;
    }

    /* renamed from: p */
    public C5027n<Integer> mo13971p(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<Integer> g = this.f14414a.mo13975a(profile).mo17246g(C4305xa368b1a8.INSTANCE).mo17246g(C4306xa368b1a9.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "adapter.getOmissions(pro…    it.size\n            }");
        return g;
    }

    /* renamed from: v */
    public C5027n<List<Omission>> mo13972v(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f14415b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Mulasztasok");
        C5027n<List<Omission>> a = DefaultImpls.getOmissions$default(mobileApiV3, sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), null, null, 12, null).mo17246g(new OmissionRepositoryImpl$fetchOmissions$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new OmissionRepositoryImpl$fetchOmissions$2<Object,Object>(this, profile)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "mobileApiV3.getOmissions…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public C5027n<Omission> mo13970a(Omission omission) {
        Intrinsics.checkParameterIsNotNull(omission, "omission");
        return this.f14414a.mo13974a(omission);
    }
}
