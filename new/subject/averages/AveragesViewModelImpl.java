package hu.ekreta.ellenorzo.subject.averages;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.subject.Subject;
import hu.ekreta.ellenorzo.subject.SubjectsRepository;
import hu.ekreta.ellenorzo.subject.averages.AveragesListItem;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.ArrayList;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0002JL\u0010\u0019\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00140\u0014 \u001b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00140\u0014\u0018\u00010\u001a0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002JL\u0010\u001e\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00140\u0014 \u001b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00140\u0014\u0018\u00010\u001a0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "subjectsRepository", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/subject/SubjectsRepository;)V", "getSubjectsRepository", "()Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "addHeadersToNotEmptyList", "", "listOfSubject", "Lhu/ekreta/ellenorzo/subject/Subject;", "convertAndAddHeaders", "list", "fetchData", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "observeLocalData", "onSelect", "", "item", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AveragesViewModelImpl.kt */
public final class AveragesViewModelImpl extends AuthenticatedListViewModel<AveragesListItem> implements AveragesViewModel {
    public final SubjectsRepository t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AveragesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, SubjectsRepository subjectsRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(subjectsRepository, "subjectsRepository");
        this.t = subjectsRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends AveragesListItem>>>(this) {
            /* renamed from: a */
            public final n<List<AveragesListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((AveragesViewModelImpl) this.receiver).t.n(profile).g(new AveragesViewModelImpl$observeLocalData$1((AveragesViewModelImpl) this.receiver));
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(AveragesViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, n<List<? extends AveragesListItem>>>(this) {
            /* renamed from: a */
            public final n<List<AveragesListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((AveragesViewModelImpl) this.receiver).t.r(profile).g(new AveragesViewModelImpl$fetchData$1((AveragesViewModelImpl) this.receiver));
            }

            public final String getName() {
                return "fetchData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(AveragesViewModelImpl.class);
            }

            public final String getSignature() {
                return "fetchData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, (Object) null);
    }

    /* renamed from: a */
    public void onSelect(AveragesListItem averagesListItem) {
        Intrinsics.checkParameterIsNotNull(averagesListItem, "item");
        b((Function1<? super Activity, ? extends Intent>) new AveragesViewModelImpl$onSelect$1(averagesListItem));
    }

    public final List<AveragesListItem> b(List<Subject> list) {
        List<T> sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, ComparisonsKt__ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$1.INSTANCE, AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$2.INSTANCE}));
        if (!(!sortedWith.isEmpty())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String h2 = ((Subject) CollectionsKt___CollectionsKt.last(sortedWith)).h();
        int size = sortedWith.size();
        while (true) {
            size--;
            if (size >= 0) {
                Subject subject = (Subject) sortedWith.get(size);
                if (!Intrinsics.areEqual((Object) h2, (Object) subject.h())) {
                    arrayList.add(0, new AveragesListItem.SectionHeader(h2));
                    h2 = subject.h();
                }
                arrayList.add(0, new AveragesListItem.Average(subject.m(), subject.f(), subject.g(), subject.n(), subject.l(), subject.j(), subject.h()));
            } else {
                arrayList.add(0, new AveragesListItem.SectionHeader(h2));
                return arrayList;
            }
        }
    }
}
