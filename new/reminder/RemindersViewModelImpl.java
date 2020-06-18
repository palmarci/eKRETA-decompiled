package hu.ekreta.ellenorzo.reminder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.ArrayList;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BW\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u0018*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u0018H\u0002J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u0018*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00190\u0018H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/RemindersViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "repositories", "Ljava/util/ArrayList;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "Lkotlin/collections/ArrayList;", "datetimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Ljava/util/ArrayList;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Landroid/content/Context;)V", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "toReminderListItems", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "toSectionedList", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl extends AuthenticatedListViewModel<ReminderListItem> implements RemindersViewModel {
    public final ArrayList<ReminderRepository> t;
    public final DateTimeFactory u;
    public final Context v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemindersViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, ArrayList<ReminderRepository> arrayList, DateTimeFactory dateTimeFactory, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(arrayList, "repositories");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "datetimeFactory");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.t = arrayList;
        this.u = dateTimeFactory;
        this.v = context;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends ReminderListItem>>>(this) {
            /* renamed from: a */
            public final n<List<ReminderListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return RemindersViewModelImpl.access$observeLocalData((RemindersViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(RemindersViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, n<List<? extends ReminderListItem>>>(this) {
            /* renamed from: a */
            public final n<List<ReminderListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return RemindersViewModelImpl.access$updateLocalData((RemindersViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(RemindersViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, (Object) null);
    }

    public static final /* synthetic */ n access$observeLocalData(RemindersViewModelImpl remindersViewModelImpl, Profile profile) {
        ArrayList<ReminderRepository> arrayList = remindersViewModelImpl.t;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ReminderRepository a2 : arrayList) {
            arrayList2.add(remindersViewModelImpl.b(a2.a(profile)));
        }
        n a3 = n.a(arrayList2, RemindersViewModelImpl$observeLocalData$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(a3, "Observable\n            .…nderItem>()\n            }");
        n g2 = a3.g(new RemindersViewModelImpl$toSectionedList$1(remindersViewModelImpl));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { list ->\n        li…          .toList()\n    }");
        return g2;
    }

    public static final /* synthetic */ n access$updateLocalData(RemindersViewModelImpl remindersViewModelImpl, Profile profile) {
        ArrayList<ReminderRepository> arrayList = remindersViewModelImpl.t;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ReminderRepository b : arrayList) {
            arrayList2.add(remindersViewModelImpl.b(b.b(profile)));
        }
        n b2 = n.b(arrayList2);
        Intrinsics.checkExpressionValueIsNotNull(b2, "Observable.merge(reposit….toReminderListItems() })");
        return b2;
    }

    /* renamed from: a */
    public void onSelect(ReminderListItem reminderListItem) {
        Intrinsics.checkParameterIsNotNull(reminderListItem, "item");
        b((Function1<? super Activity, ? extends Intent>) new RemindersViewModelImpl$onSelect$1(reminderListItem));
    }

    public final n<List<ReminderListItem>> b(n<List<Reminder>> nVar) {
        n<R> g2 = nVar.g(new RemindersViewModelImpl$toReminderListItems$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { list ->\n        li…esources)\n        }\n    }");
        return g2;
    }
}
