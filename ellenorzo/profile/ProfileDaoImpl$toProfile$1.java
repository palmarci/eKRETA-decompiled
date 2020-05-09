package p289hu.ekreta.ellenorzo.profile;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$toProfile$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$toProfile$1<T, R> implements C4675h<T, R> {
    public static final ProfileDaoImpl$toProfile$1 INSTANCE = new ProfileDaoImpl$toProfile$1();

    /* renamed from: a */
    public final List<Profile> apply(List<? extends ProfileRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ProfileRealm a : list) {
            arrayList.add(C3984v.m10160a(a));
        }
        return arrayList;
    }
}
