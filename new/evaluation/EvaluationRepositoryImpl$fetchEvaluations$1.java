package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "kotlin.jvm.PlatformType", "listOfGroupDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl$fetchEvaluations$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ EvaluationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public EvaluationRepositoryImpl$fetchEvaluations$1(EvaluationRepositoryImpl evaluationRepositoryImpl, Profile profile) {
        this.c = evaluationRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<Evaluation>> apply(final List<GroupDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "listOfGroupDto");
        return this.c.b.g(new h<T, R>(this) {
            public final /* synthetic */ EvaluationRepositoryImpl$fetchEvaluations$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final List<Evaluation> apply(List<EvaluationDto> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (EvaluationDto access$createEvaluation : list) {
                    EvaluationRepositoryImpl$fetchEvaluations$1 evaluationRepositoryImpl$fetchEvaluations$1 = this.c;
                    EvaluationRepositoryImpl evaluationRepositoryImpl = evaluationRepositoryImpl$fetchEvaluations$1.c;
                    Profile profile = evaluationRepositoryImpl$fetchEvaluations$1.e;
                    List list2 = list;
                    Intrinsics.checkExpressionValueIsNotNull(list2, "listOfGroupDto");
                    arrayList.add(evaluationRepositoryImpl.a(profile, access$createEvaluation, list2));
                }
                return arrayList;
            }
        });
    }
}
