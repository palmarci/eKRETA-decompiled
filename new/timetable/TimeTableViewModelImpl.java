package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.h0.a;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010JL\u0010\u001d\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0014*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f0\u001f \u0014*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0014*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f0\u001f\u0018\u00010\u001e0\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0002H\u0016J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0002R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R/\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "lessonRepository", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;)V", "calendarDaySubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "kotlin.jvm.PlatformType", "<set-?>", "selectedCalendarDay", "getSelectedCalendarDay", "()Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "setSelectedCalendarDay", "(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V", "selectedCalendarDay$delegate", "Lkotlin/properties/ReadWriteProperty;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableViewModelImpl.kt */
public final class TimeTableViewModelImpl extends AuthenticatedListViewModel<TimeTableItem> implements TimeTableViewModel {
    public static final /* synthetic */ KProperty[] w = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(TimeTableViewModelImpl.class), "selectedCalendarDay", "getSelectedCalendarDay()Lcom/prolificinteractive/materialcalendarview/CalendarDay;"))};
    public final a<b> t;
    public final ReadWriteProperty u = new TimeTableViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
    public final TimeTableItemRepository v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, TimeTableItemRepository timeTableItemRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(timeTableItemRepository, "lessonRepository");
        this.v = timeTableItemRepository;
        a<b> aVar = new a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create<CalendarDay>()");
        this.t = aVar;
        Delegates delegates = Delegates.INSTANCE;
        a(new Function1<Profile, n<List<? extends TimeTableItem>>>(this) {
            /* renamed from: a */
            public final n<List<TimeTableItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((TimeTableViewModelImpl) this.receiver).t.k(new TimeTableViewModelImpl$observeLocalData$1((TimeTableViewModelImpl) this.receiver, profile));
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(TimeTableViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, n<List<? extends TimeTableItem>>>(this) {
            /* renamed from: a */
            public final n<List<TimeTableItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return TimeTableViewModelImpl.access$updateLocalData((TimeTableViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(TimeTableViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false);
    }

    public static final /* synthetic */ n access$updateLocalData(TimeTableViewModelImpl timeTableViewModelImpl, Profile profile) {
        n<List<TimeTableItem>> c;
        b u0 = timeTableViewModelImpl.u0();
        if (u0 != null && (c = timeTableViewModelImpl.v.b(u0, profile).c(new TimeTableViewModelImpl$updateLocalData$$inlined$let$lambda$1(timeTableViewModelImpl, profile))) != null) {
            return c;
        }
        n j2 = n.j();
        Intrinsics.checkExpressionValueIsNotNull(j2, "Observable.empty()");
        return j2;
    }

    public void a(b bVar) {
        this.u.setValue(this, w[0], bVar);
    }

    /* renamed from: b */
    public void onSelect(TimeTableItem timeTableItem) {
        Intrinsics.checkParameterIsNotNull(timeTableItem, "item");
        if (!timeTableItem.t()) {
            b((Function1<? super Activity, ? extends Intent>) new TimeTableViewModelImpl$onSelect$1(timeTableItem));
        }
    }

    public b u0() {
        return (b) this.u.getValue(this, w[0]);
    }
}
