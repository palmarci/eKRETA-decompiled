package p289hu.ekreta.ellenorzo.cases;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CasesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Lhu/ekreta/ellenorzo/cases/CasesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "caseRepository", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/CaseRepository;)V", "noContentHandler", "", "onSelect", "item", "openTmgiFormActivity", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CasesViewModelImpl */
/* compiled from: CasesViewModelImpl.kt */
public final class CasesViewModelImpl extends AuthenticatedListViewModel<BaseCase> implements CasesViewModel {
    public CasesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, final CaseRepository caseRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(caseRepository, "caseRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends BaseCase>>>() {
            /* renamed from: a */
            public final C5027n<List<BaseCase>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                C5027n<List<BaseCase>> g = caseRepository.mo11669o(profile).mo17246g(C40581.INSTANCE);
                Intrinsics.checkExpressionValueIsNotNull(g, "caseRepository\n         ….lastModificationDate } }");
                return g;
            }
        }, new Function1<Profile, C5027n<List<? extends BaseCase>>>() {
            /* renamed from: a */
            public final C5027n<List<BaseCase>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                return caseRepository.mo11667B(profile);
            }
        }, false, 4, null);
    }

    /* renamed from: P1 */
    public void mo11488P1() {
        DataBindingViewModel.showAlert$default(this, C4014R.string.server_is_under_maintenance, null, null, 6, null);
    }

    /* renamed from: b */
    public void onSelect(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new CasesViewModelImpl$onSelect$1<Object,Object>(baseCase));
    }

    /* renamed from: i0 */
    public boolean mo11689i0() {
        mo16376b((Function1<? super Activity, ? extends Intent>) CasesViewModelImpl$openTmgiFormActivity$1.INSTANCE);
        return false;
    }
}
