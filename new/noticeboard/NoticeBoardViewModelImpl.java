package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\u0012H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "noticeBoardItemRepository", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;)V", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "updateLocalData", "toListItems", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardViewModelImpl.kt */
public final class NoticeBoardViewModelImpl extends AuthenticatedListViewModel<NoticeBoardViewModel.ListItem> implements NoticeBoardViewModel {
    public final NoticeBoardItemRepository t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeBoardViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, NoticeBoardItemRepository noticeBoardItemRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(noticeBoardItemRepository, "noticeBoardItemRepository");
        this.t = noticeBoardItemRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends NoticeBoardViewModel.ListItem>>>(this) {
            /* renamed from: a */
            public final n<List<NoticeBoardViewModel.ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NoticeBoardViewModelImpl) this.receiver).b(((NoticeBoardViewModelImpl) this.receiver).t.y(profile));
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(NoticeBoardViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, n<List<? extends NoticeBoardViewModel.ListItem>>>(this) {
            /* renamed from: a */
            public final n<List<NoticeBoardViewModel.ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NoticeBoardViewModelImpl) this.receiver).b(((NoticeBoardViewModelImpl) this.receiver).t.t(profile));
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(NoticeBoardViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, (Object) null);
    }

    public final n<List<NoticeBoardViewModel.ListItem>> b(n<List<NoticeBoardItem>> nVar) {
        n<R> g2 = nVar.g(NoticeBoardViewModelImpl$toListItems$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { notes ->\n         …              }\n        }");
        return g2;
    }

    public /* bridge */ /* synthetic */ void onSelect(NoticeBoardViewModel.ListItem listItem) {
        onSelect(listItem);
    }
}
