package p289hu.ekreta.ellenorzo.group;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4675h;
import p300k.p340c.C5061c0;
import p300k.p340c.C5074f0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/group/GroupDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/group/Group;", "Lhu/ekreta/ellenorzo/group/GroupRealm;", "Lhu/ekreta/ellenorzo/group/GroupDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "getGroup", "Lio/reactivex/Single;", "", "uid", "", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupDaoImpl */
/* compiled from: GroupDaoImpl.kt */
public final class GroupDaoImpl extends ProfileSpecificDaoImpl<Group, GroupRealm> implements GroupDao {
    public GroupDaoImpl(C5061c0 c0Var) {
        Class<GroupRealm> cls = GroupRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public GroupRealm modelToRealmModel(Group group) {
        Intrinsics.checkParameterIsNotNull(group, "model");
        GroupRealm groupRealm = new GroupRealm(group.mo11318e(), group.mo12754d(), group.mo12761j(), Boolean.valueOf(group.mo12764m()), group.mo12763l(), group.mo12758h(), group.mo12757g(), group.mo12760i(), group.mo12756f(), group.mo12753c(), group.mo12752b(), group.mo12751a(), Integer.valueOf(group.mo12762k()));
        return groupRealm;
    }

    /* renamed from: b */
    public C5036u<List<Group>> mo12766b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        C5036u<List<Group>> a = C3984v.m10196a((C5074f0) mo16313b(), false, (Function1) new GroupDaoImpl$getGroup$1(str), 1).mo17165a((C4675h<? super T, ? extends R>) new GroupDaoImpl$getGroup$2<Object,Object>(this)).mo17168a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ENTITY.queryAsFlowable {…\n        }.firstOrError()");
        return a;
    }

    /* renamed from: a */
    public Group realmModelToModel(GroupRealm groupRealm) {
        Intrinsics.checkParameterIsNotNull(groupRealm, "realmModel");
        try {
            String l2 = groupRealm.mo12800l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String d = groupRealm.mo12785d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String k2 = groupRealm.mo12798k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            Boolean o2 = groupRealm.mo12805o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            boolean booleanValue = o2.booleanValue();
            String n2 = groupRealm.mo12804n2();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = groupRealm.mo12796i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = groupRealm.mo12794h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            String j2 = groupRealm.mo12797j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            String g2 = groupRealm.mo12793g2();
            String f2 = groupRealm.mo12792f2();
            String e2 = groupRealm.mo12791e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            String d2 = groupRealm.mo12790d2();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            Integer m2 = groupRealm.mo12802m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            Group group = new Group(l2, d, k2, booleanValue, n2, i2, h2, j2, g2, f2, e2, d2, m2.intValue());
            return group;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }
}
