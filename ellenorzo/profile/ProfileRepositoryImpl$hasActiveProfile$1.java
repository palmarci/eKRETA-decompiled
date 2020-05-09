package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileRepositoryImpl$hasActiveProfile$1 */
/* compiled from: ProfileRepositoryImpl.kt */
public final class ProfileRepositoryImpl$hasActiveProfile$1<T, R> implements C4675h<T, R> {
    public static final ProfileRepositoryImpl$hasActiveProfile$1 INSTANCE = new ProfileRepositoryImpl$hasActiveProfile$1();

    /* renamed from: a */
    public final boolean mo14203a(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return !list.isEmpty();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(mo14203a((List) obj));
    }
}
