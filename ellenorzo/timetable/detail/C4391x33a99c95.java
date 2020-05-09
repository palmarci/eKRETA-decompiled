package p289hu.ekreta.ellenorzo.timetable.detail;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, mo17463d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$timeTableItem$2$1$1", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$$special$$inlined$also$lambda$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class C4391x33a99c95 extends Lambda implements Function1<Profile, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItem f15239c;

    /* renamed from: e */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 f15240e;

    public C4391x33a99c95(TimeTableItem timeTableItem, TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 timeTableItemDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f15239c = timeTableItem;
        this.f15240e = timeTableItemDetailViewModelImpl$$special$$inlined$observable$1;
        super(1);
    }

    /* renamed from: a */
    public final void mo16167a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.f15240e.f15238c;
        boolean z = true;
        boolean k = (profile.mo14064v() == SupportedRole.Student) & this.f15239c.mo16009k();
        String j = this.f15239c.mo16008j();
        if (!(j == null || j.length() == 0)) {
            z = false;
        }
        timeTableItemDetailViewModelImpl.mo16158b(k & z & this.f15239c.mo16016r().before(Calendar.getInstance()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16167a((Profile) obj);
        return Unit.INSTANCE;
    }
}
