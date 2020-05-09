package p289hu.ekreta.ellenorzo.group;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/group/Group;", "listOfGroups", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupRepositoryImpl$fetchGroupsByProfile$2 */
/* compiled from: GroupRepositoryImpl.kt */
public final class GroupRepositoryImpl$fetchGroupsByProfile$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ GroupRepositoryImpl f13325c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13326e;

    public GroupRepositoryImpl$fetchGroupsByProfile$2(GroupRepositoryImpl groupRepositoryImpl, Profile profile) {
        this.f13325c = groupRepositoryImpl;
        this.f13326e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Group>> apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "listOfGroups");
        return this.f13325c.f13322a.mo13307a(this.f13326e.mo14054m(), list);
    }
}
