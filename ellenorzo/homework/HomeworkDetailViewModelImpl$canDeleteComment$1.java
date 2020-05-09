package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$canDeleteComment$1 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$canDeleteComment$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkComment f13484c;

    public HomeworkDetailViewModelImpl$canDeleteComment$1(HomeworkComment homeworkComment) {
        this.f13484c = homeworkComment;
    }

    /* renamed from: a */
    public final boolean mo12968a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return profile.mo14064v() == SupportedRole.Student && Intrinsics.areEqual((Object) profile.mo14058q(), (Object) this.f13484c.mo13036d()) && !this.f13484c.mo13033a() && !this.f13484c.mo13034b();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(mo12968a((Profile) obj));
    }
}
