package hu.ekreta.ellenorzo.notes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.notes.NotesViewModel;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import java.util.Locale;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001b0\u001aH\u0002R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NotesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "notesRepository", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/notes/NotesRepository;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "locale", "Ljava/util/Locale;", "getNotesRepository", "()Lhu/ekreta/ellenorzo/notes/NotesRepository;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "toListItems", "Lhu/ekreta/ellenorzo/notes/Note;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotesViewModelImpl.kt */
public final class NotesViewModelImpl extends AuthenticatedListViewModel<NotesViewModel.ListItem> implements NotesViewModel {
    public final Locale t = new Locale("hu");
    public final NotesRepository u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, NotesRepository notesRepository, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(notesRepository, "notesRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.u = notesRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends NotesViewModel.ListItem>>>(this) {
            /* renamed from: a */
            public final n<List<NotesViewModel.ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NotesViewModelImpl) this.receiver).b(((NotesViewModelImpl) this.receiver).u.A(profile));
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(NotesViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, n<List<? extends NotesViewModel.ListItem>>>(this) {
            /* renamed from: a */
            public final n<List<NotesViewModel.ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NotesViewModelImpl) this.receiver).b(((NotesViewModelImpl) this.receiver).u.x(profile));
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(NotesViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, (Object) null);
    }

    /* renamed from: a */
    public void onSelect(NotesViewModel.ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        if (listItem instanceof NotesViewModel.ListItem.Note) {
            b((Function1<? super Activity, ? extends Intent>) new NotesViewModelImpl$onSelect$1(listItem));
        }
    }

    public final n<List<NotesViewModel.ListItem>> b(n<List<Note>> nVar) {
        n<R> g2 = nVar.g(new NotesViewModelImpl$toListItems$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { notes ->\n        n…    }\n            }\n    }");
        return g2;
    }
}
