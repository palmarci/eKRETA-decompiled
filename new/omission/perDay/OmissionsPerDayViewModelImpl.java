package hu.ekreta.ellenorzo.omission.perDay;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionPerDay;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002JT\u0010\u001c\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001d*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00150\u0015 \u001d*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001d*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00150\u0015\u0018\u00010\u00140\u0014*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u0014H\u0002R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "omissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/omission/OmissionRepository;)V", "getOmissionRepository", "()Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "toOmissionPerDayList", "kotlin.jvm.PlatformType", "Lhu/ekreta/ellenorzo/omission/Omission;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionsPerDayViewModelImpl.kt */
public final class OmissionsPerDayViewModelImpl extends AuthenticatedListViewModel<OmissionPerDay> implements OmissionsPerDayViewModel {
    public final OmissionRepository t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OmissionsPerDayViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, OmissionRepository omissionRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(omissionRepository, "omissionRepository");
        this.t = omissionRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends OmissionPerDay>>>(this) {
            /* renamed from: a */
            public final n<List<OmissionPerDay>> invoke(Profile profile) {
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
        }, new Function1<Profile, n<List<? extends OmissionPerDay>>>(this) {
            /* renamed from: a */
            public final n<List<OmissionPerDay>> invoke(Profile profile) {
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
        }, false, 4, (Object) null);
    }

    public static final /* synthetic */ n access$observeLocalData(OmissionsPerDayViewModelImpl omissionsPerDayViewModelImpl, Profile profile) {
        n<List<OmissionPerDay>> b = omissionsPerDayViewModelImpl.b(omissionsPerDayViewModelImpl.t.F(profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "omissionRepository\n     …  .toOmissionPerDayList()");
        return b;
    }

    public static final /* synthetic */ n access$updateLocalData(OmissionsPerDayViewModelImpl omissionsPerDayViewModelImpl, Profile profile) {
        n<List<OmissionPerDay>> b = omissionsPerDayViewModelImpl.b(omissionsPerDayViewModelImpl.t.v(profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "omissionRepository\n     …  .toOmissionPerDayList()");
        return b;
    }

    /* renamed from: a */
    public void onSelect(OmissionPerDay omissionPerDay) {
        Intrinsics.checkParameterIsNotNull(omissionPerDay, "item");
        b((Function1<? super Activity, ? extends Intent>) new OmissionsPerDayViewModelImpl$onSelect$1(omissionPerDay));
    }

    public final n<List<OmissionPerDay>> b(n<List<Omission>> nVar) {
        return nVar.g(OmissionsPerDayViewModelImpl$toOmissionPerDayList$1.INSTANCE);
    }
}
