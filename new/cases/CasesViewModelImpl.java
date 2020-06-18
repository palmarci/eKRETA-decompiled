package hu.ekreta.ellenorzo.cases;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CasesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Lhu/ekreta/ellenorzo/cases/CasesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "caseRepository", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/CaseRepository;)V", "noContentHandler", "", "onSelect", "item", "openTmgiFormActivity", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CasesViewModelImpl.kt */
public final class CasesViewModelImpl extends AuthenticatedListViewModel<BaseCase> implements CasesViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CasesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, final CaseRepository caseRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(caseRepository, "caseRepository");
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends BaseCase>>>() {
            /* renamed from: a */
            public final n<List<BaseCase>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                n<R> g2 = caseRepository.o(profile).g(AnonymousClass1.INSTANCE);
                Intrinsics.checkExpressionValueIsNotNull(g2, "caseRepository\n         ….lastModificationDate } }");
                return g2;
            }
        }, new Function1<Profile, n<List<? extends BaseCase>>>() {
            /* renamed from: a */
            public final n<List<BaseCase>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                return caseRepository.B(profile);
            }
        }, false, 4, (Object) null);
    }

    public void Z1() {
        DataBindingViewModel.showAlert$default(this, R.string.server_is_under_maintenance, (Integer) null, (Function1) null, (Integer) null, (Function1) null, 30, (Object) null);
    }

    /* renamed from: b */
    public void onSelect(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "item");
        b((Function1<? super Activity, ? extends Intent>) new CasesViewModelImpl$onSelect$1(baseCase));
    }

    public boolean i0() {
        b((Function1<? super Activity, ? extends Intent>) CasesViewModelImpl$openTmgiFormActivity$1.INSTANCE);
        return false;
    }
}
