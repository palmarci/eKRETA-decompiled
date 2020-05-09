package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4676i;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "test"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileRepositoryImpl$activeProfileSource$1 */
/* compiled from: ProfileRepositoryImpl.kt */
public final class ProfileRepositoryImpl$activeProfileSource$1<T> implements C4676i<List<? extends Profile>> {
    public static final ProfileRepositoryImpl$activeProfileSource$1 INSTANCE = new ProfileRepositoryImpl$activeProfileSource$1();

    /* renamed from: a */
    public final boolean test(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return !list.isEmpty();
    }
}
