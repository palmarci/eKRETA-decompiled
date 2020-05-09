package p289hu.ekreta.ellenorzo.subject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p159c.C2559k;
import p000a.p054h.p159c.C2561l;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u001e\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\f0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/subject/Subject;", "Lhu/ekreta/ellenorzo/subject/SubjectRealm;", "Lhu/ekreta/ellenorzo/subject/SubjectDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "convertFromJsonString", "", "", "json", "", "convertRealmSubjectToSubject", "realmModel", "convertToJsonString", "kotlin.jvm.PlatformType", "sortedListOfAaverages", "modelToRealmModel", "model", "realmModelToModel", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectDaoImpl */
/* compiled from: SubjectDaoImpl.kt */
public final class SubjectDaoImpl extends ProfileSpecificDaoImpl<Subject, SubjectRealm> implements SubjectDao {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final C2559k f14837b;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectDaoImpl$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.SubjectDaoImpl$Companion */
    /* compiled from: SubjectDaoImpl.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C2559k a = new C2561l().mo4835a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GsonBuilder().create()");
        f14837b = a;
    }

    public SubjectDaoImpl(C5061c0 c0Var) {
        Class<SubjectRealm> cls = SubjectRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public final Subject mo15702a(SubjectRealm subjectRealm) {
        String i2 = subjectRealm.mo15726i2();
        if (i2 == null) {
            Intrinsics.throwNpe();
        }
        String l2 = subjectRealm.mo15729l2();
        if (l2 == null) {
            Intrinsics.throwNpe();
        }
        String d2 = subjectRealm.mo15716d2();
        if (d2 == null) {
            Intrinsics.throwNpe();
        }
        Integer j2 = subjectRealm.mo15727j2();
        if (j2 == null) {
            Intrinsics.throwNpe();
        }
        int intValue = j2.intValue();
        String e2 = subjectRealm.mo15719e2();
        if (e2 == null) {
            Intrinsics.throwNpe();
        }
        Boolean m2 = subjectRealm.mo15730m2();
        if (m2 == null) {
            Intrinsics.throwNpe();
        }
        boolean booleanValue = m2.booleanValue();
        String f2 = subjectRealm.mo15722f2();
        if (f2 == null) {
            Intrinsics.throwNpe();
        }
        Integer g2 = subjectRealm.mo15723g2();
        if (g2 == null) {
            Intrinsics.throwNpe();
        }
        int intValue2 = g2.intValue();
        String k2 = subjectRealm.mo15728k2();
        if (k2 == null) {
            Intrinsics.throwNpe();
        }
        Object a = f14837b.mo4830a(k2, new SubjectDaoImpl$convertFromJsonString$itemType$1().mo4798b());
        Intrinsics.checkExpressionValueIsNotNull(a, "gson.fromJson<List<Float>>(json, itemType)");
        List list = (List) a;
        String h2 = subjectRealm.mo15725h2();
        if (h2 == null) {
            Intrinsics.throwNpe();
        }
        Subject subject = new Subject(i2, l2, d2, intValue, f2, e2, booleanValue, intValue2, list, h2);
        return subject;
    }

    /* renamed from: b */
    public Subject realmModelToModel(SubjectRealm subjectRealm) {
        Intrinsics.checkParameterIsNotNull(subjectRealm, "realmModel");
        try {
            return mo15702a(subjectRealm);
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public SubjectRealm modelToRealmModel(Subject subject) {
        Intrinsics.checkParameterIsNotNull(subject, "model");
        SubjectRealm subjectRealm = new SubjectRealm(subject.mo11318e(), subject.mo15696m(), subject.mo15688f(), Integer.valueOf(subject.mo15694k()), subject.mo15689g(), Boolean.valueOf(subject.mo15697n()), subject.mo15690h(), Integer.valueOf(subject.mo15692i()), f14837b.mo4831a((Object) subject.mo15695l()), subject.mo15693j());
        return subjectRealm;
    }
}
