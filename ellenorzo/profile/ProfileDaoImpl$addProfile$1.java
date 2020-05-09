package p289hu.ekreta.ellenorzo.profile;

import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p300k.p340c.C5065d0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$addProfile$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$addProfile$1 extends Lambda implements Function1<C5179y, Profile> {

    /* renamed from: c */
    public final /* synthetic */ Profile f14492c;

    public ProfileDaoImpl$addProfile$1(Profile profile) {
        this.f14492c = profile;
        super(1);
    }

    /* renamed from: a */
    public final Profile invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        Profile profile = this.f14492c;
        Intrinsics.checkParameterIsNotNull(profile, "$this$toProfileRealm");
        String m = profile.mo14054m();
        String D = profile.mo14040D();
        String l = profile.mo14053l();
        boolean e = profile.mo14044e();
        String d = profile.mo14042d();
        String C = profile.mo14039C();
        Integer valueOf = Integer.valueOf(profile.mo14052k());
        String u = profile.mo14063u();
        String z = profile.mo14069z();
        String a = profile.mo14064v().mo11567a();
        String o = profile.mo14056o();
        String n = profile.mo14055n();
        String q = profile.mo14058q();
        String p = profile.mo14057p();
        String y = profile.mo14068y();
        String x = profile.mo14067x();
        String h = profile.mo14048h();
        Date time = profile.mo14047g().getTime();
        String t = profile.mo14061t();
        String r = profile.mo14059r();
        Object[] array = profile.mo14046f().toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            C5065d0 d0Var = r3;
            C5065d0 d0Var2 = new C5065d0((String[]) Arrays.copyOf(strArr, strArr.length));
            ProfileRealm profileRealm = new ProfileRealm(m, D, l, e, d, C, valueOf, u, z, a, o, n, q, p, y, x, h, time, t, r, d0Var, profile.mo14050i().getTime(), profile.mo14038B(), profile.mo14060s(), Boolean.valueOf(profile.mo14051j()), null, 33554432, null);
            C3984v.m10309c(profileRealm);
            return profile;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
