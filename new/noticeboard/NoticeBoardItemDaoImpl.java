package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.timetable.DaoMapperException;
import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRealm;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardItemDaoImpl.kt */
public final class NoticeBoardItemDaoImpl extends ReadableByUserDaoImpl<NoticeBoardItem, NoticeBoardItemRealm> implements NoticeBoardItemDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NoticeBoardItemDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm> r0 = hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public NoticeBoardItem realmModelToModel(NoticeBoardItemRealm noticeBoardItemRealm) {
        Intrinsics.checkParameterIsNotNull(noticeBoardItemRealm, "realmModel");
        try {
            String d2 = noticeBoardItemRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.b(noticeBoardItemRealm.g2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(noticeBoardItemRealm.f2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            String e2 = noticeBoardItemRealm.e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = noticeBoardItemRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = noticeBoardItemRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            return new NoticeBoardItem(d2, b, b2, e2, i2, h2, noticeBoardItemRealm.u());
        } catch (DaoMapperException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public NoticeBoardItemRealm modelToRealmModel(NoticeBoardItem noticeBoardItem) {
        Intrinsics.checkParameterIsNotNull(noticeBoardItem, "model");
        String d2 = noticeBoardItem.d();
        String f = noticeBoardItem.f();
        Date time = noticeBoardItem.h().getTime();
        Calendar g2 = noticeBoardItem.g();
        return new NoticeBoardItemRealm(d2, time, g2 != null ? g2.getTime() : null, f, noticeBoardItem.j(), noticeBoardItem.e(), noticeBoardItem.i());
    }
}
