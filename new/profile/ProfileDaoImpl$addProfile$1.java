package hu.ekreta.ellenorzo.profile;

import h.w.v;
import java.util.Arrays;
import java.util.Date;
import k.c.d0;
import k.c.y;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$addProfile$1 extends Lambda implements Function1<y, Profile> {
    public final /* synthetic */ Profile c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDaoImpl$addProfile$1(Profile profile) {
        super(1);
        this.c = profile;
    }

    /* renamed from: a */
    public final Profile invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        Profile profile = this.c;
        Intrinsics.checkParameterIsNotNull(profile, "$this$toProfileRealm");
        String m2 = profile.m();
        String D = profile.D();
        String l2 = profile.l();
        boolean e = profile.e();
        String d2 = profile.d();
        String C = profile.C();
        Integer valueOf = Integer.valueOf(profile.k());
        String u = profile.u();
        String z = profile.z();
        String a2 = profile.v().a();
        String o2 = profile.o();
        String n2 = profile.n();
        String q2 = profile.q();
        String p2 = profile.p();
        String y = profile.y();
        String x = profile.x();
        String h2 = profile.h();
        Date time = profile.g().getTime();
        String t = profile.t();
        String r = profile.r();
        Object[] array = profile.f().toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            d0 d0Var = r3;
            d0 d0Var2 = new d0((String[]) Arrays.copyOf(strArr, strArr.length));
            v.c(new ProfileRealm(m2, D, l2, e, d2, C, valueOf, u, z, a2, o2, n2, q2, p2, y, x, h2, time, t, r, d0Var, profile.i().getTime(), profile.B(), profile.s(), Boolean.valueOf(profile.j()), (Boolean) null, 33554432, (DefaultConstructorMarker) null));
            return profile;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
