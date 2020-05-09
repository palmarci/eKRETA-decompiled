package p289hu.ekreta.ellenorzo.subject.averages;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.subject.Subject;
import p289hu.ekreta.ellenorzo.subject.SubjectsRepository;
import p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.Average;
import p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.SectionHeader;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H\u0002JL\u0010\u0017\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0019*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00120\u0012 \u0019*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0019*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00120\u0012\u0018\u00010\u00180\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002JL\u0010\u001c\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0019*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00120\u0012 \u0019*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0019*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00120\u0012\u0018\u00010\u00180\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "subjectsRepository", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/subject/SubjectsRepository;)V", "getSubjectsRepository", "()Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "addHeadersToNotEmptyList", "", "listOfSubject", "Lhu/ekreta/ellenorzo/subject/Subject;", "convertAndAddHeaders", "list", "fetchData", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "observeLocalData", "onSelect", "", "item", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesViewModelImpl */
/* compiled from: AveragesViewModelImpl.kt */
public final class AveragesViewModelImpl extends AuthenticatedListViewModel<AveragesListItem> implements AveragesViewModel {

    /* renamed from: s */
    public final SubjectsRepository f14924s;

    public AveragesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, SubjectsRepository subjectsRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(subjectsRepository, "subjectsRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14924s = subjectsRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends AveragesListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<AveragesListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((AveragesViewModelImpl) this.receiver).f14924s.mo15742n(profile).mo17246g(new AveragesViewModelImpl$observeLocalData$1((AveragesViewModelImpl) this.receiver));
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
        }, new Function1<Profile, C5027n<List<? extends AveragesListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<AveragesListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((AveragesViewModelImpl) this.receiver).f14924s.mo15743r(profile).mo17246g(new AveragesViewModelImpl$fetchData$1((AveragesViewModelImpl) this.receiver));
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
        }, false, 4, null);
    }

    /* renamed from: a */
    public void onSelect(AveragesListItem averagesListItem) {
        Intrinsics.checkParameterIsNotNull(averagesListItem, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new AveragesViewModelImpl$onSelect$1<Object,Object>(averagesListItem));
    }

    /* renamed from: b */
    public final List<AveragesListItem> mo15800b(List<Subject> list) {
        List<Subject> list2 = list;
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(list2, ComparisonsKt__ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$1.INSTANCE, AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$2.INSTANCE}));
        if (!(!sortedWith.isEmpty())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String h = ((Subject) CollectionsKt___CollectionsKt.last(sortedWith)).mo15690h();
        int size = sortedWith.size();
        while (true) {
            size--;
            if (size >= 0) {
                Subject subject = (Subject) sortedWith.get(size);
                if (!Intrinsics.areEqual((Object) h, (Object) subject.mo15690h())) {
                    arrayList.add(0, new SectionHeader(h));
                    h = subject.mo15690h();
                }
                Average average = new Average(subject.mo15696m(), subject.mo15688f(), subject.mo15689g(), subject.mo15697n(), subject.mo15695l(), subject.mo15693j(), subject.mo15690h());
                arrayList.add(0, average);
            } else {
                arrayList.add(0, new SectionHeader(h));
                return arrayList;
            }
        }
    }
}
