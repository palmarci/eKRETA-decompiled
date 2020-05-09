package p289hu.ekreta.ellenorzo.reminder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
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
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BG\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00170\u0016H\u0002J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00170\u0016H\u0002R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/RemindersViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "repositories", "Ljava/util/ArrayList;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateLocalData", "toReminderListItems", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "toSectionedList", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl */
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl extends AuthenticatedListViewModel<ReminderListItem> implements RemindersViewModel {

    /* renamed from: s */
    public final ArrayList<ReminderRepository> f14670s;

    /* renamed from: t */
    public final Context f14671t;

    public RemindersViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, ArrayList<ReminderRepository> arrayList, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(arrayList, "repositories");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14670s = arrayList;
        this.f14671t = context;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends ReminderListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ReminderListItem>> invoke(Profile profile) {
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
        }, new Function1<Profile, C5027n<List<? extends ReminderListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ReminderListItem>> invoke(Profile profile) {
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
        }, false, 4, null);
    }

    public static final /* synthetic */ C5027n access$observeLocalData(RemindersViewModelImpl remindersViewModelImpl, Profile profile) {
        ArrayList<ReminderRepository> arrayList = remindersViewModelImpl.f14670s;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ReminderRepository a : arrayList) {
            arrayList2.add(remindersViewModelImpl.mo14321b(a.mo11406a(profile)));
        }
        C5027n a2 = C5027n.m16887a((Iterable<? extends C5030q<? extends T>>) arrayList2, (C4675h<? super Object[], ? extends R>) RemindersViewModelImpl$observeLocalData$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(a2, "Observable\n            .…nderItem>()\n            }");
        C5027n g = a2.mo17246g(RemindersViewModelImpl$toSectionedList$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "map { list ->\n        li…          .toList()\n    }");
        return g;
    }

    public static final /* synthetic */ C5027n access$updateLocalData(RemindersViewModelImpl remindersViewModelImpl, Profile profile) {
        ArrayList<ReminderRepository> arrayList = remindersViewModelImpl.f14670s;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ReminderRepository b : arrayList) {
            arrayList2.add(remindersViewModelImpl.mo14321b(b.mo11408b(profile)));
        }
        C5027n b2 = C5027n.m16895b((Iterable<? extends C5030q<? extends T>>) arrayList2);
        Intrinsics.checkExpressionValueIsNotNull(b2, "Observable.merge(reposit….toReminderListItems() })");
        return b2;
    }

    /* renamed from: Q1 */
    public final Context mo14319Q1() {
        return this.f14671t;
    }

    /* renamed from: a */
    public void onSelect(ReminderListItem reminderListItem) {
        Intrinsics.checkParameterIsNotNull(reminderListItem, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new RemindersViewModelImpl$onSelect$1<Object,Object>(reminderListItem));
    }

    /* renamed from: b */
    public final C5027n<List<ReminderListItem>> mo14321b(C5027n<List<Reminder>> nVar) {
        C5027n<List<ReminderListItem>> g = nVar.mo17246g(new RemindersViewModelImpl$toReminderListItems$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { list ->\n        li…esources)\n        }\n    }");
        return g;
    }
}
