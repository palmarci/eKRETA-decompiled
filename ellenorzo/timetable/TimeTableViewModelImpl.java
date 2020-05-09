package p289hu.ekreta.ellenorzo.timetable;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p000a.p175l.p176a.C2682b;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.p337h0.C5016a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJL\u0010\u001b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0012*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d0\u001d \u0012*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0012*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R/\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "lessonRepository", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;)V", "calendarDaySubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "kotlin.jvm.PlatformType", "<set-?>", "selectedCalendarDay", "getSelectedCalendarDay", "()Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "setSelectedCalendarDay", "(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V", "selectedCalendarDay$delegate", "Lkotlin/properties/ReadWriteProperty;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableViewModelImpl */
/* compiled from: TimeTableViewModelImpl.kt */
public final class TimeTableViewModelImpl extends AuthenticatedListViewModel<TimeTableItem> implements TimeTableViewModel {

    /* renamed from: v */
    public static final /* synthetic */ KProperty[] f15194v = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(TimeTableViewModelImpl.class), "selectedCalendarDay", "getSelectedCalendarDay()Lcom/prolificinteractive/materialcalendarview/CalendarDay;"))};

    /* renamed from: s */
    public final C5016a<C2682b> f15195s;

    /* renamed from: t */
    public final ReadWriteProperty f15196t = new TimeTableViewModelImpl$$special$$inlined$observable$1(null, null, this);

    /* renamed from: u */
    public final TimeTableItemRepository f15197u;

    public TimeTableViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, TimeTableItemRepository timeTableItemRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(timeTableItemRepository, "lessonRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f15197u = timeTableItemRepository;
        C5016a<C2682b> aVar = new C5016a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create<CalendarDay>()");
        this.f15195s = aVar;
        Delegates delegates = Delegates.INSTANCE;
        mo11490a(new Function1<Profile, C5027n<List<? extends TimeTableItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<TimeTableItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((TimeTableViewModelImpl) this.receiver).f15195s.mo17252k(new TimeTableViewModelImpl$observeLocalData$1((TimeTableViewModelImpl) this.receiver, profile));
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
        }, new Function1<Profile, C5027n<List<? extends TimeTableItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<TimeTableItem>> invoke(Profile profile) {
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

    public static final /* synthetic */ C5027n access$updateLocalData(TimeTableViewModelImpl timeTableViewModelImpl, Profile profile) {
        C2682b t0 = timeTableViewModelImpl.mo16131t0();
        if (t0 != null) {
            C5027n b = timeTableViewModelImpl.f15197u.mo16111b(t0, profile);
            if (b != null) {
                return b;
            }
        }
        C5027n j = C5027n.m16899j();
        Intrinsics.checkExpressionValueIsNotNull(j, "Observable.empty()");
        return j;
    }

    /* renamed from: a */
    public void mo16130a(C2682b bVar) {
        this.f15196t.setValue(this, f15194v[0], bVar);
    }

    /* renamed from: b */
    public void onSelect(TimeTableItem timeTableItem) {
        Intrinsics.checkParameterIsNotNull(timeTableItem, "item");
        if (!timeTableItem.mo16018t()) {
            mo16376b((Function1<? super Activity, ? extends Intent>) new TimeTableViewModelImpl$onSelect$1<Object,Object>(timeTableItem));
        }
    }

    /* renamed from: t0 */
    public C2682b mo16131t0() {
        return (C2682b) this.f15196t.getValue(this, f15194v[0]);
    }
}
