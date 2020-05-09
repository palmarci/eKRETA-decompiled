package p289hu.ekreta.ellenorzo.notes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u0018*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u0018H\u0002R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "notesRepository", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/notes/NotesRepository;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "locale", "Ljava/util/Locale;", "getNotesRepository", "()Lhu/ekreta/ellenorzo/notes/NotesRepository;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "toListItems", "Lhu/ekreta/ellenorzo/notes/Note;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModelImpl */
/* compiled from: NotesViewModelImpl.kt */
public final class NotesViewModelImpl extends AuthenticatedListViewModel<ListItem> implements NotesViewModel {

    /* renamed from: s */
    public final Locale f14121s = new Locale("hu");

    /* renamed from: t */
    public final NotesRepository f14122t;

    public NotesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, NotesRepository notesRepository, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(notesRepository, "notesRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14122t = notesRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends ListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NotesViewModelImpl) this.receiver).mo13657b(((NotesViewModelImpl) this.receiver).f14122t.mo13637A(profile));
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
        }, new Function1<Profile, C5027n<List<? extends ListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((NotesViewModelImpl) this.receiver).mo13657b(((NotesViewModelImpl) this.receiver).f14122t.mo13639x(profile));
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
        }, false, 4, null);
    }

    /* renamed from: a */
    public void onSelect(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        if (listItem instanceof Note) {
            mo16376b((Function1<? super Activity, ? extends Intent>) new NotesViewModelImpl$onSelect$1<Object,Object>(listItem));
        }
    }

    /* renamed from: b */
    public final C5027n<List<ListItem>> mo13657b(C5027n<List<Note>> nVar) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new NotesViewModelImpl$toListItems$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { notes ->\n        n…    }\n            }\n    }");
        return g;
    }
}
