package p289hu.ekreta.ellenorzo.timetable.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/homework/Homework;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$loadHomework$1 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$loadHomework$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15252c;

    public TimeTableItemDetailViewModelImpl$loadHomework$1(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15252c = timeTableItemDetailViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<Homework> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.f15252c;
        HomeworkRepository access$getHomeworkRepository$p = timeTableItemDetailViewModelImpl.f15236y;
        TimeTableItem P1 = this.f15252c.mo16156P1();
        String j = P1 != null ? P1.mo16008j() : null;
        if (j == null) {
            Intrinsics.throwNpe();
        }
        return timeTableItemDetailViewModelImpl.mo11505a(access$getHomeworkRepository$p.mo13012b(Long.parseLong(j), profile));
    }
}
