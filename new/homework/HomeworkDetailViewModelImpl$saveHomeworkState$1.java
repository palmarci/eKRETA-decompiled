package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "test"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$saveHomeworkState$1<T> implements i<Profile> {
    public static final HomeworkDetailViewModelImpl$saveHomeworkState$1 INSTANCE = new HomeworkDetailViewModelImpl$saveHomeworkState$1();

    /* renamed from: a */
    public final boolean test(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        return profile.v() == SupportedRole.Student;
    }
}
