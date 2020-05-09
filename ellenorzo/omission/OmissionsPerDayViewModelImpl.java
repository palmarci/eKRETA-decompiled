package p289hu.ekreta.ellenorzo.omission;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002JT\u0010\u001a\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00130\u0013 \u001b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u0012H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionsPerDayViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "Lhu/ekreta/ellenorzo/omission/OmissionsPerDayViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "omissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/omission/OmissionRepository;)V", "getOmissionRepository", "()Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "toOmissionPerDayList", "kotlin.jvm.PlatformType", "Lhu/ekreta/ellenorzo/omission/Omission;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionsPerDayViewModelImpl */
/* compiled from: OmissionsPerDayViewModelImpl.kt */
public final class OmissionsPerDayViewModelImpl extends AuthenticatedListViewModel<OmissionPerDay> implements OmissionsPerDayViewModel {

    /* renamed from: s */
    public final OmissionRepository f14443s;

    public OmissionsPerDayViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, OmissionRepository omissionRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(omissionRepository, "omissionRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14443s = omissionRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends OmissionPerDay>>>(this) {
            /* renamed from: a */
            public final C5027n<List<OmissionPerDay>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return OmissionsPerDayViewModelImpl.access$observeLocalData((OmissionsPerDayViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(OmissionsPerDayViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, C5027n<List<? extends OmissionPerDay>>>(this) {
            /* renamed from: a */
            public final C5027n<List<OmissionPerDay>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return OmissionsPerDayViewModelImpl.access$updateLocalData((OmissionsPerDayViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(OmissionsPerDayViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, null);
    }

    public static final /* synthetic */ C5027n access$observeLocalData(OmissionsPerDayViewModelImpl omissionsPerDayViewModelImpl, Profile profile) {
        C5027n b = omissionsPerDayViewModelImpl.mo14001b(omissionsPerDayViewModelImpl.f14443s.mo13969F(profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "omissionRepository\n     …  .toOmissionPerDayList()");
        return b;
    }

    public static final /* synthetic */ C5027n access$updateLocalData(OmissionsPerDayViewModelImpl omissionsPerDayViewModelImpl, Profile profile) {
        C5027n b = omissionsPerDayViewModelImpl.mo14001b(omissionsPerDayViewModelImpl.f14443s.mo13972v(profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "omissionRepository\n     …  .toOmissionPerDayList()");
        return b;
    }

    /* renamed from: a */
    public void onSelect(OmissionPerDay omissionPerDay) {
        Intrinsics.checkParameterIsNotNull(omissionPerDay, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new OmissionsPerDayViewModelImpl$onSelect$1<Object,Object>(omissionPerDay));
    }

    /* renamed from: b */
    public final C5027n<List<OmissionPerDay>> mo14001b(C5027n<List<Omission>> nVar) {
        return nVar.mo17246g(OmissionsPerDayViewModelImpl$toOmissionPerDayList$1.INSTANCE);
    }
}
