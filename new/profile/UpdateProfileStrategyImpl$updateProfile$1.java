package hu.ekreta.ellenorzo.profile;

import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "profiles", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public UpdateProfileStrategyImpl$updateProfile$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final List<Profile> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "profiles");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!Intrinsics.areEqual((Object) ((Profile) next).x(), (Object) this.c.x())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
