package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRealm;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EvaluationDaoImpl.kt */
public final class EvaluationDaoImpl extends ReadableByUserDaoImpl<Evaluation, EvaluationRealm> implements EvaluationDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EvaluationDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.evaluation.EvaluationRealm> r0 = hu.ekreta.ellenorzo.evaluation.EvaluationRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.evaluation.EvaluationDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public Evaluation realmModelToModel(EvaluationRealm evaluationRealm) {
        Intrinsics.checkParameterIsNotNull(evaluationRealm, "realmModel");
        try {
            String d2 = evaluationRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String p2 = evaluationRealm.p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = evaluationRealm.i2();
            String x2 = evaluationRealm.x2();
            String j2 = evaluationRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            Evaluation.Type.Companion companion = Evaluation.Type.Companion;
            String y2 = evaluationRealm.y2();
            if (y2 == null) {
                Intrinsics.throwNpe();
            }
            Evaluation.Type a2 = companion.a(y2);
            String u2 = evaluationRealm.u2();
            String s2 = evaluationRealm.s2();
            String t2 = evaluationRealm.t2();
            String w2 = evaluationRealm.w2();
            String n2 = evaluationRealm.n2();
            String m2 = evaluationRealm.m2();
            String A2 = evaluationRealm.A2();
            String z2 = evaluationRealm.z2();
            String r2 = evaluationRealm.r2();
            Integer o2 = evaluationRealm.o2();
            Date q2 = evaluationRealm.q2();
            Calendar b = q2 != null ? UtilsKt.b(q2) : null;
            String v2 = evaluationRealm.v2();
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(evaluationRealm.f2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b3 = UtilsKt.b(evaluationRealm.e2());
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            Evaluation.FormType.Companion companion2 = Evaluation.FormType.Companion;
            String str = z2;
            String k2 = evaluationRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            Evaluation.FormType a3 = companion2.a(k2);
            Boolean u = evaluationRealm.u();
            String l2 = evaluationRealm.l2();
            String g2 = evaluationRealm.g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            Integer h2 = evaluationRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            return new Evaluation(d2, p2, i2, x2, j2, a2, u2, s2, t2, w2, n2, m2, A2, str, r2, o2, b, v2, b2, b3, a3, u, l2, g2, h2.intValue());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public EvaluationRealm modelToRealmModel(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "model");
        String d2 = evaluation.d();
        String e = evaluation.e();
        String i2 = evaluation.i();
        String C = evaluation.C();
        String k2 = evaluation.k();
        String c = evaluation.B().c();
        String y = evaluation.y();
        String w = evaluation.w();
        String x = evaluation.x();
        String A = evaluation.A();
        String p2 = evaluation.p();
        String n2 = evaluation.n();
        String F = evaluation.F();
        String D = evaluation.D();
        String v = evaluation.v();
        Integer q2 = evaluation.q();
        Calendar u = evaluation.u();
        return new EvaluationRealm(d2, i2, c, C, evaluation.j().a(), k2, y, w, x, A, p2, n2, F, D, v, q2, u != null ? u.getTime() : null, evaluation.z(), evaluation.t().getTime(), evaluation.f().getTime(), e, evaluation.s(), evaluation.l(), evaluation.g(), Integer.valueOf(evaluation.h()));
    }
}
