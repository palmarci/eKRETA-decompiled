package p289hu.ekreta.ellenorzo.omission;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.omission.Omission.JustificationState;
import p289hu.ekreta.ellenorzo.omission.Omission.LessonType;
import p289hu.ekreta.ellenorzo.omission.Omission.LessonType.Companion;
import p289hu.ekreta.ellenorzo.omission.Omission.Type;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/omission/Omission;", "Lhu/ekreta/ellenorzo/omission/OmissionRealm;", "Lhu/ekreta/ellenorzo/omission/OmissionDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionDaoImpl */
/* compiled from: OmissionDaoImpl.kt */
public final class OmissionDaoImpl extends ReadableByUserDaoImpl<Omission, OmissionRealm> implements OmissionDao {
    public OmissionDaoImpl(C5061c0 c0Var) {
        Class<OmissionRealm> cls = OmissionRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public Omission realmModelToModel(OmissionRealm omissionRealm) {
        Intrinsics.checkParameterIsNotNull(omissionRealm, "realmModel");
        try {
            String d = omissionRealm.mo11376d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String p2 = omissionRealm.mo13955p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            Type a = Type.Companion.mo13872a(omissionRealm.mo13967v2());
            String u2 = omissionRealm.mo13964u2();
            String s2 = omissionRealm.mo13961s2();
            if (s2 == null) {
                Intrinsics.throwNpe();
            }
            String q2 = omissionRealm.mo13957q2();
            if (q2 == null) {
                Intrinsics.throwNpe();
            }
            String r2 = omissionRealm.mo13959r2();
            if (r2 == null) {
                Intrinsics.throwNpe();
            }
            Companion companion = LessonType.Companion;
            String o2 = omissionRealm.mo13953o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            LessonType a2 = companion.mo13870a(o2);
            String n2 = omissionRealm.mo13950n2();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            Integer g2 = omissionRealm.mo13933g2();
            String t2 = omissionRealm.mo13963t2();
            if (t2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.m14838b(omissionRealm.mo13948m2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.m14838b(omissionRealm.mo13945l2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Integer d2 = omissionRealm.mo13923d2();
            Calendar b3 = UtilsKt.m14838b(omissionRealm.mo13925e2());
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            JustificationState.Companion companion2 = JustificationState.Companion;
            Integer num = d2;
            String i2 = omissionRealm.mo13937i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            JustificationState a3 = companion2.mo13868a(i2);
            String j2 = omissionRealm.mo13940j2();
            String k2 = omissionRealm.mo13943k2();
            Calendar b4 = UtilsKt.m14838b(omissionRealm.mo13929f2());
            if (b4 == null) {
                Intrinsics.throwNpe();
            }
            Omission omission = new Omission(d, p2, a, u2, s2, q2, r2, a2, n2, g2, t2, b, b2, num, b3, a3, j2, k2, b4, omissionRealm.mo13936h2(), omissionRealm.mo11399u());
            return omission;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }

    /* renamed from: a */
    public OmissionRealm modelToRealmModel(Omission omission) {
        Intrinsics.checkParameterIsNotNull(omission, "model");
        OmissionRealm omissionRealm = new OmissionRealm(omission.mo11316d(), omission.mo11318e(), omission.mo13861w().mo13871a(), omission.mo13863x(), omission.mo13859u(), omission.mo13856s(), omission.mo13857t(), omission.mo13852o().mo13869a(), omission.mo13853p(), omission.mo13844h(), omission.mo13860v(), omission.mo13851n().getTime(), omission.mo13850m().getTime(), omission.mo13842f(), omission.mo13843g().getTime(), omission.mo13847j().mo13867b(), omission.mo13848k(), omission.mo13849l(), omission.mo13855r().getTime(), null, omission.mo13846i(), omission.mo13854q(), 524288, null);
        return omissionRealm;
    }
}
