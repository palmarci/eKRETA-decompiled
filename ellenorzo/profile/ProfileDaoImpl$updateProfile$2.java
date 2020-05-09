package p289hu.ekreta.ellenorzo.profile;

import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.DynamicRealmObject;
import p296io.realm.RealmQuery;
import p296io.realm.internal.CheckedRow;
import p296io.realm.internal.Table;
import p296io.realm.internal.TableQuery;
import p296io.realm.internal.UncheckedRow;
import p296io.realm.internal.core.DescriptorOrdering;
import p300k.p340c.C5047a;
import p300k.p340c.C5092k0;
import p300k.p340c.C5095l0;
import p300k.p340c.C5179y;
import p300k.p340c.p341m1.C5105f;
import p300k.p340c.p341m1.C5116n;
import p300k.p340c.p341m1.C5118o;
import p300k.p340c.p341m1.C5119p;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "realm", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$updateProfile$2 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$updateProfile$2 extends Lambda implements Function1<C5179y, Profile> {

    /* renamed from: c */
    public final /* synthetic */ ProfileDaoImpl f14503c;

    /* renamed from: e */
    public final /* synthetic */ String f14504e;

    /* renamed from: f */
    public final /* synthetic */ Function1 f14505f;

    public ProfileDaoImpl$updateProfile$2(ProfileDaoImpl profileDaoImpl, String str, Function1 function1) {
        this.f14503c = profileDaoImpl;
        this.f14504e = str;
        this.f14505f = function1;
        super(1);
    }

    /* renamed from: a */
    public final Profile invoke(C5179y yVar) {
        long j;
        C5119p pVar;
        C5119p pVar2;
        C5179y yVar2 = yVar;
        Intrinsics.checkParameterIsNotNull(yVar2, "realm");
        ProfileDaoImpl profileDaoImpl = this.f14503c;
        yVar.mo17277c();
        RealmQuery realmQuery = new RealmQuery(yVar2, ProfileRealm.class);
        Intrinsics.checkExpressionValueIsNotNull(realmQuery, "realm.where(ProfileRealm::class.java)");
        RealmQuery access$primaryKeyEquals = profileDaoImpl.mo14082a(realmQuery, this.f14504e);
        access$primaryKeyEquals.f15530b.mo17277c();
        Object obj = null;
        if (!access$primaryKeyEquals.f15535g) {
            if (!DescriptorOrdering.nativeIsEmpty(access$primaryKeyEquals.f15537i.f15985c)) {
                C5092k0 a = access$primaryKeyEquals.mo16478a();
                UncheckedRow a2 = a.f17450g.mo16611a();
                C5116n nVar = (C5116n) (a2 != null ? a.f17447c.mo17274a(a.f17448e, a.f17449f, a2) : null);
                j = nVar != null ? nVar.mo16467E().f17455b.getIndex() : -1;
            } else {
                TableQuery tableQuery = access$primaryKeyEquals.f15531c;
                tableQuery.mo16722a();
                j = tableQuery.nativeFind(tableQuery.f15978e, 0);
            }
            if (j >= 0) {
                C5047a aVar = access$primaryKeyEquals.f15530b;
                Class<E> cls = access$primaryKeyEquals.f15533e;
                String str = access$primaryKeyEquals.f15534f;
                boolean z = str != null;
                Table c = z ? aVar.mo17281n().mo17358c(str) : aVar.mo17281n().mo17355b(cls);
                if (z) {
                    if (j != -1) {
                        pVar2 = CheckedRow.m15669b(c.f15974e, c, j);
                    } else {
                        pVar2 = C5105f.INSTANCE;
                    }
                    obj = new DynamicRealmObject(aVar, pVar2);
                } else {
                    C5118o oVar = aVar.f17209e.f17248j;
                    if (j != -1) {
                        pVar = UncheckedRow.m15738a(c.f15974e, c, j);
                    } else {
                        pVar = C5105f.INSTANCE;
                    }
                    C5119p pVar3 = pVar;
                    C5095l0 n = aVar.mo17281n();
                    n.mo17354a();
                    obj = oVar.mo16459a(cls, aVar, pVar3, n.f17304f.mo17359a(cls), false, Collections.emptyList());
                }
            }
        }
        return (Profile) this.f14505f.invoke(obj);
    }
}
