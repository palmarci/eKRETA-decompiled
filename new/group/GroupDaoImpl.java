package hu.ekreta.ellenorzo.group;

import h.w.v;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.List;
import k.b.u;
import k.c.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/group/GroupDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/group/Group;", "Lhu/ekreta/ellenorzo/group/GroupRealm;", "Lhu/ekreta/ellenorzo/group/GroupDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "getGroup", "Lio/reactivex/Single;", "", "uid", "", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GroupDaoImpl.kt */
public final class GroupDaoImpl extends ProfileSpecificDaoImpl<Group, GroupRealm> implements GroupDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.group.GroupRealm> r0 = hu.ekreta.ellenorzo.group.GroupRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.group.GroupDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public GroupRealm modelToRealmModel(Group group) {
        Intrinsics.checkParameterIsNotNull(group, "model");
        return new GroupRealm(group.e(), group.d(), group.j(), Boolean.valueOf(group.m()), group.l(), group.h(), group.g(), group.i(), group.f(), group.c(), group.b(), group.a(), Integer.valueOf(group.k()));
    }

    public u<List<Group>> b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        u<List<Group>> a2 = v.a((f0) b(), false, (Function1) new GroupDaoImpl$getGroup$1(str), 1).a(new GroupDaoImpl$getGroup$2(this)).a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ENTITY.queryAsFlowable {…\n        }.firstOrError()");
        return a2;
    }

    /* renamed from: a */
    public Group realmModelToModel(GroupRealm groupRealm) {
        Intrinsics.checkParameterIsNotNull(groupRealm, "realmModel");
        try {
            String m2 = groupRealm.m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            String d2 = groupRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String l2 = groupRealm.l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            Boolean p2 = groupRealm.p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            boolean booleanValue = p2.booleanValue();
            String o2 = groupRealm.o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            String j2 = groupRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = groupRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            String k2 = groupRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = groupRealm.h2();
            String g2 = groupRealm.g2();
            String f2 = groupRealm.f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            String e2 = groupRealm.e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            Integer n2 = groupRealm.n2();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            return new Group(m2, d2, l2, booleanValue, o2, j2, i2, k2, h2, g2, f2, e2, n2.intValue());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }
}
