package p289hu.ekreta.ellenorzo.subject.certificate;

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
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.SectionHeader;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002JL\u0010\u001b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001d*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u0017 \u001d*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001d*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u0017\u0018\u00010\u001c0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002JL\u0010 \u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001d*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u0017 \u001d*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001d*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u0017\u0018\u00010\u001c0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificateViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "filter", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Lkotlin/jvm/functions/Function1;)V", "getEvaluationRepository", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "getFilter", "()Lkotlin/jvm/functions/Function1;", "addHeadersToNotEmptyList", "", "listOfEvaluation", "convertAndAddHeaders", "evaluationList", "fetchData", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "observeLocalData", "onSelect", "", "item", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificateViewModelImpl */
/* compiled from: CertificateViewModelImpl.kt */
public class CertificateViewModelImpl extends AuthenticatedListViewModel<CertificationListItem> {

    /* renamed from: s */
    public final EvaluationRepository f14933s;

    /* renamed from: t */
    public final Function1<Evaluation, Boolean> f14934t;

    public CertificateViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, EvaluationRepository evaluationRepository, Function1<? super Evaluation, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(evaluationRepository, "evaluationRepository");
        Intrinsics.checkParameterIsNotNull(function1, "filter");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14933s = evaluationRepository;
        this.f14934t = function1;
        mo11490a(new Function1<Profile, C5027n<List<? extends CertificationListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<CertificationListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((CertificateViewModelImpl) this.receiver).f14933s.mo12735C(profile).mo17246g(new CertificateViewModelImpl$observeLocalData$1((CertificateViewModelImpl) this.receiver));
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(CertificateViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, C5027n<List<? extends CertificationListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<CertificationListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((CertificateViewModelImpl) this.receiver).f14933s.mo12737m(profile).mo17246g(new CertificateViewModelImpl$fetchData$1((CertificateViewModelImpl) this.receiver));
            }

            public final String getName() {
                return "fetchData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(CertificateViewModelImpl.class);
            }

            public final String getSignature() {
                return "fetchData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false);
    }

    public static final /* synthetic */ List access$convertAndAddHeaders(CertificateViewModelImpl certificateViewModelImpl, List list) {
        Function1<Evaluation, Boolean> function1 = certificateViewModelImpl.f14934t;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, ComparisonsKt__ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$2.INSTANCE, CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$3.INSTANCE}));
        if (!(!sortedWith.isEmpty())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        String g = ((Evaluation) CollectionsKt___CollectionsKt.last(sortedWith)).mo12596g();
        int size = sortedWith.size();
        while (true) {
            size--;
            if (size >= 0) {
                Evaluation evaluation = (Evaluation) sortedWith.get(size);
                if (!Intrinsics.areEqual((Object) g, (Object) evaluation.mo12596g())) {
                    arrayList2.add(0, new SectionHeader(g));
                    g = evaluation.mo12596g();
                }
                arrayList2.add(0, new CertificationItem(evaluation));
            } else {
                arrayList2.add(0, new SectionHeader(g));
                return arrayList2;
            }
        }
    }

    /* renamed from: a */
    public void onSelect(CertificationListItem certificationListItem) {
        Intrinsics.checkParameterIsNotNull(certificationListItem, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new CertificateViewModelImpl$onSelect$1<Object,Object>(certificationListItem));
    }
}
