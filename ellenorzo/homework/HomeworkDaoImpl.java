package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/homework/Homework;", "Lhu/ekreta/ellenorzo/homework/HomeworkRealm;", "Lhu/ekreta/ellenorzo/homework/HomeworkDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDaoImpl */
/* compiled from: HomeworkDaoImpl.kt */
public final class HomeworkDaoImpl extends ReadableByUserDaoImpl<Homework, HomeworkRealm> implements HomeworkDao {
    public HomeworkDaoImpl(C5061c0 c0Var) {
        Class<HomeworkRealm> cls = HomeworkRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p289hu.ekreta.ellenorzo.homework.Homework realmModelToModel(p289hu.ekreta.ellenorzo.homework.HomeworkRealm r15) {
        /*
            r14 = this;
            java.lang.String r0 = "realmModel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
            hu.ekreta.ellenorzo.homework.Homework r0 = new hu.ekreta.ellenorzo.homework.Homework     // Catch:{ NullPointerException -> 0x009b }
            java.lang.String r2 = r15.mo11376d()     // Catch:{ NullPointerException -> 0x009b }
            if (r2 != 0) goto L_0x0010
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0010:
            java.lang.String r3 = r15.mo12991g2()     // Catch:{ NullPointerException -> 0x009b }
            if (r3 != 0) goto L_0x0019
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0019:
            java.lang.String r4 = r15.mo12997j2()     // Catch:{ NullPointerException -> 0x009b }
            if (r4 != 0) goto L_0x0022
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0022:
            java.lang.String r5 = r15.mo12995i2()     // Catch:{ NullPointerException -> 0x009b }
            if (r5 != 0) goto L_0x002b
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x002b:
            java.lang.Boolean r1 = r15.mo13000m2()     // Catch:{ NullPointerException -> 0x009b }
            if (r1 != 0) goto L_0x0034
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0034:
            boolean r6 = r1.booleanValue()     // Catch:{ NullPointerException -> 0x009b }
            java.lang.String r7 = r15.mo12998k2()     // Catch:{ NullPointerException -> 0x009b }
            java.util.Date r1 = r15.mo12994h2()     // Catch:{ NullPointerException -> 0x009b }
            if (r1 != 0) goto L_0x0045
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0045:
            java.util.Calendar r8 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14838b(r1)     // Catch:{ NullPointerException -> 0x009b }
            if (r8 != 0) goto L_0x004e
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x004e:
            java.util.Date r1 = r15.mo12988e2()     // Catch:{ NullPointerException -> 0x009b }
            if (r1 != 0) goto L_0x0057
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0057:
            java.util.Calendar r9 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14838b(r1)     // Catch:{ NullPointerException -> 0x009b }
            if (r9 != 0) goto L_0x0060
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0060:
            java.util.Date r1 = r15.mo12984d2()     // Catch:{ NullPointerException -> 0x009b }
            if (r1 == 0) goto L_0x006e
            java.util.Calendar r1 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14838b(r1)     // Catch:{ NullPointerException -> 0x009b }
            if (r1 == 0) goto L_0x006e
        L_0x006c:
            r10 = r1
            goto L_0x0081
        L_0x006e:
            java.util.Date r1 = r15.mo12988e2()     // Catch:{ NullPointerException -> 0x009b }
            if (r1 != 0) goto L_0x0077
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x0077:
            java.util.Calendar r1 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14838b(r1)     // Catch:{ NullPointerException -> 0x009b }
            if (r1 != 0) goto L_0x006c
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
            goto L_0x006c
        L_0x0081:
            java.lang.Boolean r1 = r15.mo12999l2()     // Catch:{ NullPointerException -> 0x009b }
            if (r1 != 0) goto L_0x008a
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NullPointerException -> 0x009b }
        L_0x008a:
            boolean r11 = r1.booleanValue()     // Catch:{ NullPointerException -> 0x009b }
            java.lang.Boolean r12 = r15.mo11399u()     // Catch:{ NullPointerException -> 0x009b }
            java.lang.String r13 = r15.mo12990f2()     // Catch:{ NullPointerException -> 0x009b }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ NullPointerException -> 0x009b }
            return r0
        L_0x009b:
            hu.ekreta.ellenorzo.util.mapper.DaoMapperException r15 = new hu.ekreta.ellenorzo.util.mapper.DaoMapperException
            java.lang.String r0 = "Some fields are null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.homework.HomeworkDaoImpl.realmModelToModel(hu.ekreta.ellenorzo.homework.HomeworkRealm):hu.ekreta.ellenorzo.homework.Homework");
    }

    /* renamed from: a */
    public HomeworkRealm modelToRealmModel(Homework homework) {
        Intrinsics.checkParameterIsNotNull(homework, "model");
        HomeworkRealm homeworkRealm = new HomeworkRealm(homework.mo11316d(), homework.mo11318e(), homework.mo12914m(), homework.mo12913l(), Boolean.valueOf(homework.mo12917p()), homework.mo12915n(), homework.mo12912k().getTime(), homework.mo12908h().getTime(), homework.mo12907g().getTime(), Boolean.valueOf(homework.mo12916o()), homework.mo12911j(), homework.mo12910i());
        return homeworkRealm;
    }
}
