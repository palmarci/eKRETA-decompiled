package p289hu.ekreta.ellenorzo.subject.certificate.quarterly;

import android.app.Activity;
import android.content.Context;
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
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.SectionHeader;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002JL\u0010\u001f\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0015*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a0\u001a \u0015*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0015*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a0\u001a\u0018\u00010 0 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001cH\u0002JL\u0010%\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0015*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a0\u001a \u0015*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0015*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a0\u001a\u0018\u00010 0 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0002H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/quarterly/QuarterlyViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "Lhu/ekreta/ellenorzo/subject/certificate/quarterly/QuarterlyViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Landroid/content/Context;)V", "getEvaluationRepository", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "firstQuarter", "", "kotlin.jvm.PlatformType", "fourthQuarter", "secondQuarter", "thirdQuarter", "addHeadersToNotEmptyList", "", "listOfEvaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "convertAndAddHeaders", "evaluationList", "fetchData", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getHeaderName", "evaluation", "observeLocalData", "onSelect", "", "item", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModelImpl */
/* compiled from: QuarterlyViewModelImpl.kt */
public class QuarterlyViewModelImpl extends AuthenticatedListViewModel<CertificationListItem> implements QuarterlyViewModel {

    /* renamed from: s */
    public final String f14987s;

    /* renamed from: t */
    public final String f14988t;

    /* renamed from: u */
    public final String f14989u;

    /* renamed from: v */
    public final String f14990v;

    /* renamed from: w */
    public final EvaluationRepository f14991w;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModelImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14992a = new int[Type.values().length];

        static {
            f14992a[Type.FirstQuarter.ordinal()] = 1;
            f14992a[Type.SecondQuarter.ordinal()] = 2;
            f14992a[Type.ThirdQuarter.ordinal()] = 3;
            f14992a[Type.FourthQuarter.ordinal()] = 4;
        }
    }

    public QuarterlyViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, EvaluationRepository evaluationRepository, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(evaluationRepository, "evaluationRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f14991w = evaluationRepository;
        this.f14987s = context.getString(C4014R.string.quarter1);
        this.f14988t = context.getString(C4014R.string.quarter2);
        this.f14989u = context.getString(C4014R.string.quarter3);
        this.f14990v = context.getString(C4014R.string.quarter4);
        mo11490a(new Function1<Profile, C5027n<List<? extends CertificationListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<CertificationListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((QuarterlyViewModelImpl) this.receiver).f14991w.mo12735C(profile).mo17246g(new QuarterlyViewModelImpl$observeLocalData$1((QuarterlyViewModelImpl) this.receiver));
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
        }, new Function1<Profile, C5027n<List<? extends CertificationListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<CertificationListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((QuarterlyViewModelImpl) this.receiver).f14991w.mo12737m(profile).mo17246g(new QuarterlyViewModelImpl$fetchData$1((QuarterlyViewModelImpl) this.receiver));
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
        mo16376b((Function1<? super Activity, ? extends Intent>) new QuarterlyViewModelImpl$onSelect$1<Object,Object>(certificationListItem));
    }

    /* renamed from: b */
    public final String mo15861b(Evaluation evaluation) {
        int i = WhenMappings.f14992a[evaluation.mo12586B().ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14987s);
            sb.append(' ');
            sb.append(evaluation.mo12596g());
            return sb.toString();
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f14988t);
            sb2.append(' ');
            sb2.append(evaluation.mo12596g());
            return sb2.toString();
        } else if (i == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f14989u);
            sb3.append(' ');
            sb3.append(evaluation.mo12596g());
            return sb3.toString();
        } else if (i != 4) {
            return "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f14990v);
            sb4.append(' ');
            sb4.append(evaluation.mo12596g());
            return sb4.toString();
        }
    }

    /* renamed from: b */
    public final List<CertificationListItem> mo15862b(List<Evaluation> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Evaluation) next).mo12586B().mo12624b()) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, ComparisonsKt__ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{QuarterlyViewModelImpl$convertAndAddHeaders$listOfEvaluation$2.INSTANCE, QuarterlyViewModelImpl$convertAndAddHeaders$listOfEvaluation$3.INSTANCE, QuarterlyViewModelImpl$convertAndAddHeaders$listOfEvaluation$4.INSTANCE}));
        if (!(!sortedWith.isEmpty())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        String b = mo15861b((Evaluation) CollectionsKt___CollectionsKt.last(sortedWith));
        int size = sortedWith.size();
        while (true) {
            size--;
            if (size >= 0) {
                Evaluation evaluation = (Evaluation) sortedWith.get(size);
                if (!Intrinsics.areEqual((Object) b, (Object) mo15861b(evaluation))) {
                    arrayList2.add(0, new SectionHeader(b));
                    b = mo15861b(evaluation);
                }
                arrayList2.add(0, new CertificationItem(evaluation));
            } else {
                arrayList2.add(0, new SectionHeader(b));
                return arrayList2;
            }
        }
    }
}
