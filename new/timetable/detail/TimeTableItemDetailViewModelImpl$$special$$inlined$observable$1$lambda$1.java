package hu.ekreta.ellenorzo.timetable.detail;

import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$timeTableItem$2$1$1", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 extends Lambda implements Function1<Profile, Unit> {
    public final /* synthetic */ TimeTableItem c;
    public final /* synthetic */ TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(TimeTableItem timeTableItem, TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 timeTableItemDetailViewModelImpl$$special$$inlined$observable$1) {
        super(1);
        this.c = timeTableItem;
        this.e = timeTableItemDetailViewModelImpl$$special$$inlined$observable$1;
    }

    public final void a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.e.c;
        boolean z = true;
        boolean k2 = (profile.v() == SupportedRole.Student) & this.c.k();
        String j2 = this.c.j();
        if (!(j2 == null || j2.length() == 0)) {
            z = false;
        }
        timeTableItemDetailViewModelImpl.c(k2 & z & this.c.r().before(Calendar.getInstance()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Profile) obj);
        return Unit.INSTANCE;
    }
}
