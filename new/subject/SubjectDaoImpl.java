package hu.ekreta.ellenorzo.subject;

import a.h.c.k;
import a.h.c.l;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u001e\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\f0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/subject/Subject;", "Lhu/ekreta/ellenorzo/subject/SubjectRealm;", "Lhu/ekreta/ellenorzo/subject/SubjectDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "convertFromJsonString", "", "", "json", "", "convertRealmSubjectToSubject", "realmModel", "convertToJsonString", "kotlin.jvm.PlatformType", "sortedListOfAaverages", "modelToRealmModel", "model", "realmModelToModel", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectDaoImpl.kt */
public final class SubjectDaoImpl extends ProfileSpecificDaoImpl<Subject, SubjectRealm> implements SubjectDao {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final k b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectDaoImpl$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectDaoImpl.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        k a2 = new l().a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "GsonBuilder().create()");
        b = a2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubjectDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.subject.SubjectRealm> r0 = hu.ekreta.ellenorzo.subject.SubjectRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.SubjectDaoImpl.<init>(k.c.c0):void");
    }

    public final Subject a(SubjectRealm subjectRealm) {
        String j2 = subjectRealm.j2();
        if (j2 == null) {
            Intrinsics.throwNpe();
        }
        String m2 = subjectRealm.m2();
        if (m2 == null) {
            Intrinsics.throwNpe();
        }
        String e2 = subjectRealm.e2();
        if (e2 == null) {
            Intrinsics.throwNpe();
        }
        Integer k2 = subjectRealm.k2();
        if (k2 == null) {
            Intrinsics.throwNpe();
        }
        int intValue = k2.intValue();
        String f2 = subjectRealm.f2();
        if (f2 == null) {
            Intrinsics.throwNpe();
        }
        Boolean n2 = subjectRealm.n2();
        if (n2 == null) {
            Intrinsics.throwNpe();
        }
        boolean booleanValue = n2.booleanValue();
        String g2 = subjectRealm.g2();
        if (g2 == null) {
            Intrinsics.throwNpe();
        }
        Integer h2 = subjectRealm.h2();
        if (h2 == null) {
            Intrinsics.throwNpe();
        }
        int intValue2 = h2.intValue();
        String l2 = subjectRealm.l2();
        if (l2 == null) {
            Intrinsics.throwNpe();
        }
        Object a2 = b.a(l2, new SubjectDaoImpl$convertFromJsonString$itemType$1().b());
        Intrinsics.checkExpressionValueIsNotNull(a2, "gson.fromJson<List<Float>>(json, itemType)");
        List list = (List) a2;
        String i2 = subjectRealm.i2();
        if (i2 == null) {
            Intrinsics.throwNpe();
        }
        return new Subject(j2, m2, e2, intValue, g2, f2, booleanValue, intValue2, list, i2);
    }

    /* renamed from: b */
    public Subject realmModelToModel(SubjectRealm subjectRealm) {
        Intrinsics.checkParameterIsNotNull(subjectRealm, "realmModel");
        try {
            return a(subjectRealm);
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public SubjectRealm modelToRealmModel(Subject subject) {
        Intrinsics.checkParameterIsNotNull(subject, "model");
        return new SubjectRealm(subject.e(), subject.m(), subject.f(), Integer.valueOf(subject.k()), subject.g(), Boolean.valueOf(subject.n()), subject.h(), Integer.valueOf(subject.i()), b.a((Object) subject.l()), subject.j());
    }
}
