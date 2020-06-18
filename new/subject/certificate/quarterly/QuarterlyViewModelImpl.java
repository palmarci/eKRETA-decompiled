package hu.ekreta.ellenorzo.subject.certificate.quarterly;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001cH\u0002J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001cH\u0002JL\u0010!\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0017*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u001c \u0017*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0017*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u001c\u0018\u00010\"0\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001eH\u0002JL\u0010'\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0017*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u001c \u0017*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0017*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u001c\u0018\u00010\"0\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0002H\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/quarterly/QuarterlyViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "Lhu/ekreta/ellenorzo/subject/certificate/quarterly/QuarterlyViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Landroid/content/Context;)V", "getEvaluationRepository", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "firstQuarter", "", "kotlin.jvm.PlatformType", "fourthQuarter", "secondQuarter", "thirdQuarter", "addHeadersToNotEmptyList", "", "listOfEvaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "convertAndAddHeaders", "evaluationList", "fetchData", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getHeaderName", "evaluation", "observeLocalData", "onSelect", "", "item", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: QuarterlyViewModelImpl.kt */
public class QuarterlyViewModelImpl extends AuthenticatedListViewModel<CertificationListItem> implements QuarterlyViewModel {
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final EvaluationRepository x;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6182a = new int[Evaluation.Type.values().length];

        static {
            f6182a[Evaluation.Type.FirstQuarter.ordinal()] = 1;
            f6182a[Evaluation.Type.SecondQuarter.ordinal()] = 2;
            f6182a[Evaluation.Type.ThirdQuarter.ordinal()] = 3;
            f6182a[Evaluation.Type.FourthQuarter.ordinal()] = 4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuarterlyViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, EvaluationRepository evaluationRepository, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(evaluationRepository, "evaluationRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.x = evaluationRepository;
        this.t = context.getString(R.string.quarter1);
        this.u = context.getString(R.string.quarter2);
        this.v = context.getString(R.string.quarter3);
        this.w = context.getString(R.string.quarter4);
        a(new Function1<Profile, n<List<? extends CertificationListItem>>>(this) {
            /* renamed from: a */
            public final n<List<CertificationListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((QuarterlyViewModelImpl) this.receiver).x.C(profile).g(new QuarterlyViewModelImpl$observeLocalData$1((QuarterlyViewModelImpl) this.receiver));
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(QuarterlyViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, n<List<? extends CertificationListItem>>>(this) {
            /* renamed from: a */
            public final n<List<CertificationListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((QuarterlyViewModelImpl) this.receiver).x.m(profile).g(new QuarterlyViewModelImpl$fetchData$1((QuarterlyViewModelImpl) this.receiver));
            }

            public final String getName() {
                return "fetchData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(QuarterlyViewModelImpl.class);
            }

            public final String getSignature() {
                return "fetchData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false);
    }

    /* renamed from: a */
    public void onSelect(CertificationListItem certificationListItem) {
        Intrinsics.checkParameterIsNotNull(certificationListItem, "item");
        b((Function1<? super Activity, ? extends Intent>) new QuarterlyViewModelImpl$onSelect$1(certificationListItem));
    }

    public final String b(Evaluation evaluation) {
        int i2 = WhenMappings.f6182a[evaluation.B().ordinal()];
        if (i2 == 1) {
            return this.t + ' ' + evaluation.g();
        } else if (i2 == 2) {
            return this.u + ' ' + evaluation.g();
        } else if (i2 == 3) {
            return this.v + ' ' + evaluation.g();
        } else if (i2 != 4) {
            return "";
        } else {
            return this.w + ' ' + evaluation.g();
        }
    }

    public final List<CertificationListItem> b(List<Evaluation> list) {
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((Evaluation) next).B().b()) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, ComparisonsKt__ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{QuarterlyViewModelImpl$convertAndAddHeaders$listOfEvaluation$2.INSTANCE, QuarterlyViewModelImpl$convertAndAddHeaders$listOfEvaluation$3.INSTANCE, QuarterlyViewModelImpl$convertAndAddHeaders$listOfEvaluation$4.INSTANCE}));
        if (!(!sortedWith.isEmpty())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        String b = b((Evaluation) CollectionsKt___CollectionsKt.last(sortedWith));
        int size = sortedWith.size();
        while (true) {
            size--;
            if (size >= 0) {
                Evaluation evaluation = (Evaluation) sortedWith.get(size);
                if (!Intrinsics.areEqual((Object) b, (Object) b(evaluation))) {
                    arrayList2.add(0, new CertificationListItem.SectionHeader(b));
                    b = b(evaluation);
                }
                arrayList2.add(0, new CertificationListItem.CertificationItem(evaluation));
            } else {
                arrayList2.add(0, new CertificationListItem.SectionHeader(b));
                return arrayList2;
            }
        }
    }
}
