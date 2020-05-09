package p289hu.ekreta.ellenorzo.evaluation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "kotlin.jvm.PlatformType", "listOfGroupDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$fetchEvaluations$1 */
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl$fetchEvaluations$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ EvaluationRepositoryImpl f13274c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13275e;

    public EvaluationRepositoryImpl$fetchEvaluations$1(EvaluationRepositoryImpl evaluationRepositoryImpl, Profile profile) {
        this.f13274c = evaluationRepositoryImpl;
        this.f13275e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Evaluation>> apply(final List<GroupDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "listOfGroupDto");
        return EvaluationRepositoryImpl.access$fetchEvaluation(this.f13274c, this.f13275e).mo17246g(new C4675h<T, R>(this) {

            /* renamed from: c */
            public final /* synthetic */ EvaluationRepositoryImpl$fetchEvaluations$1 f13276c;

            {
                this.f13276c = r1;
            }

            /* renamed from: a */
            public final List<Evaluation> apply(List<EvaluationDto> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (EvaluationDto evaluationDto : list) {
                    EvaluationRepositoryImpl$fetchEvaluations$1 evaluationRepositoryImpl$fetchEvaluations$1 = this.f13276c;
                    EvaluationRepositoryImpl evaluationRepositoryImpl = evaluationRepositoryImpl$fetchEvaluations$1.f13274c;
                    Profile profile = evaluationRepositoryImpl$fetchEvaluations$1.f13275e;
                    List list2 = list;
                    Intrinsics.checkExpressionValueIsNotNull(list2, "listOfGroupDto");
                    arrayList.add(evaluationRepositoryImpl.mo12738a(profile, evaluationDto, list2));
                }
                return arrayList;
            }
        });
    }
}
