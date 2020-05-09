package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0010H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "noticeBoardItemRepository", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;)V", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "updateLocalData", "toListItems", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModelImpl */
/* compiled from: NoticeBoardViewModelImpl.kt */
public final class NoticeBoardViewModelImpl extends AuthenticatedListViewModel<ListItem> implements NoticeBoardViewModel {

    /* renamed from: s */
    public final NoticeBoardItemRepository f14175s;

    public NoticeBoardViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, NoticeBoardItemRepository noticeBoardItemRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(noticeBoardItemRepository, "noticeBoardItemRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14175s = noticeBoardItemRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends ListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NoticeBoardViewModelImpl) this.receiver).mo13725b(((NoticeBoardViewModelImpl) this.receiver).f14175s.mo13709y(profile));
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
        }, new Function1<Profile, C5027n<List<? extends ListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NoticeBoardViewModelImpl) this.receiver).mo13725b(((NoticeBoardViewModelImpl) this.receiver).f14175s.mo13708t(profile));
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
        }, false, 4, null);
    }

    /* renamed from: b */
    public final C5027n<List<ListItem>> mo13725b(C5027n<List<NoticeBoardItem>> nVar) {
        C5027n<List<ListItem>> g = nVar.mo17246g(NoticeBoardViewModelImpl$toListItems$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "map { notes ->\n         …              }\n        }");
        return g;
    }

    public /* bridge */ /* synthetic */ void onSelect(ListItem listItem) {
        onSelect(listItem);
    }
}
