package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$canDeleteComment$1<T, R> implements h<T, R> {
    public final /* synthetic */ HomeworkComment c;

    public HomeworkDetailViewModelImpl$canDeleteComment$1(HomeworkComment homeworkComment) {
        this.c = homeworkComment;
    }

    public final boolean a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return profile.v() == SupportedRole.Student && Intrinsics.areEqual((Object) profile.q(), (Object) this.c.d()) && !this.c.a() && !this.c.b();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((Profile) obj));
    }
}
