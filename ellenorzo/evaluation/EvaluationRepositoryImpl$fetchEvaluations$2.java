package p289hu.ekreta.ellenorzo.evaluation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$fetchEvaluations$2 */
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl$fetchEvaluations$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ EvaluationRepositoryImpl f13278c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13279e;

    public EvaluationRepositoryImpl$fetchEvaluations$2(EvaluationRepositoryImpl evaluationRepositoryImpl, Profile profile) {
        this.f13278c = evaluationRepositoryImpl;
        this.f13279e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Evaluation>> apply(List<Evaluation> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return this.f13278c.mo12739a().mo13307a(this.f13279e.mo14054m(), list);
    }
}
