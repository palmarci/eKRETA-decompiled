package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.timetable.DaoMapperException;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRealm;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemDaoImpl */
/* compiled from: NoticeBoardItemDaoImpl.kt */
public final class NoticeBoardItemDaoImpl extends ReadableByUserDaoImpl<NoticeBoardItem, NoticeBoardItemRealm> implements NoticeBoardItemDao {
    public NoticeBoardItemDaoImpl(C5061c0 c0Var) {
        Class<NoticeBoardItemRealm> cls = NoticeBoardItemRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public NoticeBoardItem realmModelToModel(NoticeBoardItemRealm noticeBoardItemRealm) {
        Intrinsics.checkParameterIsNotNull(noticeBoardItemRealm, "realmModel");
        try {
            String d = noticeBoardItemRealm.mo11376d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.m14838b(noticeBoardItemRealm.mo13700f2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.m14838b(noticeBoardItemRealm.mo13698e2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            String d2 = noticeBoardItemRealm.mo13697d2();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String g2 = noticeBoardItemRealm.mo13701g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = noticeBoardItemRealm.mo13703h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            NoticeBoardItem noticeBoardItem = new NoticeBoardItem(d, b, b2, d2, h2, g2, noticeBoardItemRealm.mo11399u());
            return noticeBoardItem;
        } catch (DaoMapperException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public NoticeBoardItemRealm modelToRealmModel(NoticeBoardItem noticeBoardItem) {
        Intrinsics.checkParameterIsNotNull(noticeBoardItem, "model");
        String d = noticeBoardItem.mo11316d();
        String f = noticeBoardItem.mo13676f();
        Date time = noticeBoardItem.mo13678h().getTime();
        Calendar g = noticeBoardItem.mo13677g();
        NoticeBoardItemRealm noticeBoardItemRealm = new NoticeBoardItemRealm(d, time, g != null ? g.getTime() : null, f, noticeBoardItem.mo13681j(), noticeBoardItem.mo11318e(), noticeBoardItem.mo13680i());
        return noticeBoardItemRealm;
    }
}
