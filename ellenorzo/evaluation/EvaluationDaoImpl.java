package p289hu.ekreta.ellenorzo.evaluation;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.FormType;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.Companion;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRealm;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDaoImpl */
/* compiled from: EvaluationDaoImpl.kt */
public final class EvaluationDaoImpl extends ReadableByUserDaoImpl<Evaluation, EvaluationRealm> implements EvaluationDao {
    public EvaluationDaoImpl(C5061c0 c0Var) {
        Class<EvaluationRealm> cls = EvaluationRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public Evaluation realmModelToModel(EvaluationRealm evaluationRealm) {
        Intrinsics.checkParameterIsNotNull(evaluationRealm, "realmModel");
        try {
            String d = evaluationRealm.mo11376d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String o2 = evaluationRealm.mo12713o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = evaluationRealm.mo12697h2();
            String w2 = evaluationRealm.mo12730w2();
            String i2 = evaluationRealm.mo12699i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Companion companion = Type.Companion;
            String x2 = evaluationRealm.mo12732x2();
            if (x2 == null) {
                Intrinsics.throwNpe();
            }
            Type a = companion.mo12626a(x2);
            String t2 = evaluationRealm.mo12725t2();
            String r2 = evaluationRealm.mo12722r2();
            String s2 = evaluationRealm.mo12724s2();
            String v2 = evaluationRealm.mo12729v2();
            String m2 = evaluationRealm.mo12709m2();
            String l2 = evaluationRealm.mo12707l2();
            String z2 = evaluationRealm.mo12734z2();
            String y2 = evaluationRealm.mo12733y2();
            String q2 = evaluationRealm.mo12720q2();
            Integer n2 = evaluationRealm.mo12711n2();
            Date p2 = evaluationRealm.mo12716p2();
            Calendar b = p2 != null ? UtilsKt.m14838b(p2) : null;
            String u2 = evaluationRealm.mo12726u2();
            if (u2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.m14838b(evaluationRealm.mo12688e2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b3 = UtilsKt.m14838b(evaluationRealm.mo12686d2());
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            FormType.Companion companion2 = FormType.Companion;
            String str = y2;
            String j2 = evaluationRealm.mo12702j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            FormType a2 = companion2.mo12622a(j2);
            Boolean u = evaluationRealm.mo11399u();
            String k2 = evaluationRealm.mo12705k2();
            String f2 = evaluationRealm.mo12691f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            Integer g2 = evaluationRealm.mo12694g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            Evaluation evaluation = new Evaluation(d, o2, h2, w2, i2, a, t2, r2, s2, v2, m2, l2, z2, str, q2, n2, b, u2, b2, b3, a2, u, k2, f2, g2.intValue());
            return evaluation;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public EvaluationRealm modelToRealmModel(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "model");
        String d = evaluation.mo11316d();
        String e = evaluation.mo11318e();
        String i = evaluation.mo12599i();
        String C = evaluation.mo12587C();
        String k = evaluation.mo12601k();
        String c = evaluation.mo12586B().mo12625c();
        String y = evaluation.mo12617y();
        String w = evaluation.mo12614w();
        String x = evaluation.mo12616x();
        String A = evaluation.mo12585A();
        String p = evaluation.mo12606p();
        String n = evaluation.mo12604n();
        String F = evaluation.mo12590F();
        String D = evaluation.mo12588D();
        String v = evaluation.mo12613v();
        Integer q = evaluation.mo12607q();
        Calendar u = evaluation.mo12612u();
        EvaluationRealm evaluationRealm = new EvaluationRealm(d, i, c, C, evaluation.mo12600j().mo12621a(), k, y, w, x, A, p, n, F, D, v, q, u != null ? u.getTime() : null, evaluation.mo12618z(), evaluation.mo12610t().getTime(), evaluation.mo12595f().getTime(), e, evaluation.mo12609s(), evaluation.mo12602l(), evaluation.mo12596g(), Integer.valueOf(evaluation.mo12597h()));
        return evaluationRealm;
    }
}
