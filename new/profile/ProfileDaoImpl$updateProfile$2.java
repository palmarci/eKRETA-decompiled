package hu.ekreta.ellenorzo.profile;

import io.realm.DynamicRealmObject;
import io.realm.RealmQuery;
import io.realm.internal.CheckedRow;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.DescriptorOrdering;
import java.util.Collections;
import k.c.a;
import k.c.f0;
import k.c.k0;
import k.c.l0;
import k.c.m1.f;
import k.c.m1.n;
import k.c.m1.o;
import k.c.m1.p;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "realm", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$updateProfile$2 extends Lambda implements Function1<y, Profile> {
    public final /* synthetic */ ProfileDaoImpl c;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDaoImpl$updateProfile$2(ProfileDaoImpl profileDaoImpl, String str, Function1 function1) {
        super(1);
        this.c = profileDaoImpl;
        this.e = str;
        this.f = function1;
    }

    /* renamed from: a */
    public final Profile invoke(y yVar) {
        long j2;
        p pVar;
        p pVar2;
        y yVar2 = yVar;
        Intrinsics.checkParameterIsNotNull(yVar2, "realm");
        ProfileDaoImpl profileDaoImpl = this.c;
        yVar.c();
        RealmQuery realmQuery = new RealmQuery(yVar2, ProfileRealm.class);
        Intrinsics.checkExpressionValueIsNotNull(realmQuery, "realm.where(ProfileRealm::class.java)");
        RealmQuery access$primaryKeyEquals = profileDaoImpl.a((RealmQuery<ProfileRealm>) realmQuery, this.e);
        access$primaryKeyEquals.b.c();
        Object obj = null;
        if (!access$primaryKeyEquals.f6362g) {
            if (!DescriptorOrdering.nativeIsEmpty(access$primaryKeyEquals.f6364i.c)) {
                k0 a2 = access$primaryKeyEquals.a();
                UncheckedRow a3 = a2.f7218g.a();
                n nVar = (n) (a3 != null ? a2.c.a(a2.e, a2.f, a3) : null);
                j2 = nVar != null ? nVar.E().b.getIndex() : -1;
            } else {
                TableQuery tableQuery = access$primaryKeyEquals.c;
                tableQuery.a();
                j2 = tableQuery.nativeFind(tableQuery.e, 0);
            }
            if (j2 >= 0) {
                a aVar = access$primaryKeyEquals.b;
                Class<E> cls = access$primaryKeyEquals.e;
                String str = access$primaryKeyEquals.f;
                boolean z = str != null;
                Table c2 = z ? aVar.m().c(str) : aVar.m().b((Class<? extends f0>) cls);
                if (z) {
                    if (j2 != -1) {
                        pVar2 = CheckedRow.b(c2.e, c2, j2);
                    } else {
                        pVar2 = f.INSTANCE;
                    }
                    obj = new DynamicRealmObject(aVar, pVar2);
                } else {
                    o oVar = aVar.e.f7119j;
                    if (j2 != -1) {
                        pVar = UncheckedRow.a(c2.e, c2, j2);
                    } else {
                        pVar = f.INSTANCE;
                    }
                    p pVar3 = pVar;
                    l0 m2 = aVar.m();
                    m2.a();
                    obj = oVar.a(cls, aVar, pVar3, m2.f.a(cls), false, Collections.emptyList());
                }
            }
        }
        return (Profile) this.f.invoke(obj);
    }
}
