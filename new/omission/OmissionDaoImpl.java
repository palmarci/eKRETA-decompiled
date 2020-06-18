package hu.ekreta.ellenorzo.omission;

import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/omission/Omission;", "Lhu/ekreta/ellenorzo/omission/OmissionRealm;", "Lhu/ekreta/ellenorzo/omission/OmissionDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionDaoImpl.kt */
public final class OmissionDaoImpl extends ReadableByUserDaoImpl<Omission, OmissionRealm> implements OmissionDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OmissionDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.omission.OmissionRealm> r0 = hu.ekreta.ellenorzo.omission.OmissionRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.omission.OmissionDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public Omission realmModelToModel(OmissionRealm omissionRealm) {
        Intrinsics.checkParameterIsNotNull(omissionRealm, "realmModel");
        try {
            String d2 = omissionRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String q2 = omissionRealm.q2();
            if (q2 == null) {
                Intrinsics.throwNpe();
            }
            Omission.Type a2 = Omission.Type.Companion.a(omissionRealm.w2());
            String v2 = omissionRealm.v2();
            String t2 = omissionRealm.t2();
            if (t2 == null) {
                Intrinsics.throwNpe();
            }
            String r2 = omissionRealm.r2();
            if (r2 == null) {
                Intrinsics.throwNpe();
            }
            String s2 = omissionRealm.s2();
            if (s2 == null) {
                Intrinsics.throwNpe();
            }
            Omission.LessonType.Companion companion = Omission.LessonType.Companion;
            String p2 = omissionRealm.p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            Omission.LessonType a3 = companion.a(p2);
            String o2 = omissionRealm.o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            Integer h2 = omissionRealm.h2();
            String u2 = omissionRealm.u2();
            if (u2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.b(omissionRealm.n2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(omissionRealm.m2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Integer e2 = omissionRealm.e2();
            Calendar b3 = UtilsKt.b(omissionRealm.f2());
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            Omission.JustificationState.Companion companion2 = Omission.JustificationState.Companion;
            Integer num = e2;
            String j2 = omissionRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            Omission.JustificationState a4 = companion2.a(j2);
            String k2 = omissionRealm.k2();
            String l2 = omissionRealm.l2();
            Calendar b4 = UtilsKt.b(omissionRealm.g2());
            if (b4 == null) {
                Intrinsics.throwNpe();
            }
            return new Omission(d2, q2, a2, v2, t2, r2, s2, a3, o2, h2, u2, b, b2, num, b3, a4, k2, l2, b4, omissionRealm.i2(), omissionRealm.u());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }

    /* renamed from: a */
    public OmissionRealm modelToRealmModel(Omission omission) {
        Intrinsics.checkParameterIsNotNull(omission, "model");
        return new OmissionRealm(omission.d(), omission.e(), omission.w().a(), omission.x(), omission.u(), omission.s(), omission.t(), omission.o().a(), omission.p(), omission.h(), omission.v(), omission.n().getTime(), omission.m().getTime(), omission.f(), omission.g().getTime(), omission.j().b(), omission.k(), omission.l(), omission.r().getTime(), (Date) null, omission.i(), omission.q(), 524288, (DefaultConstructorMarker) null);
    }
}
