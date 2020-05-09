package p289hu.ekreta.ellenorzo.evaluation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u001b\u001a\u00020\rH\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "evaluationDao", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;)V", "adapter", "hu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl$adapter$1;", "getEvaluationDao", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "createEvaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "evaluationDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "listOfGroupDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "fetchEvaluation", "Lio/reactivex/Observable;", "fetchEvaluations", "fetchGroup", "getEvaluations", "updateEvaluation", "evaluation", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl */
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl implements EvaluationRepository {

    /* renamed from: a */
    public final EvaluationRepositoryImpl$adapter$1 f13267a = new EvaluationRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f13268b;

    /* renamed from: c */
    public final EvaluationDao f13269c;

    public EvaluationRepositoryImpl(MobileApiV3 mobileApiV3, EvaluationDao evaluationDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(evaluationDao, "evaluationDao");
        this.f13268b = mobileApiV3;
        this.f13269c = evaluationDao;
    }

    public static final /* synthetic */ C5027n access$fetchEvaluation(EvaluationRepositoryImpl evaluationRepositoryImpl, Profile profile) {
        MobileApiV3 mobileApiV3 = evaluationRepositoryImpl.f13268b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Ertekelesek");
        return mobileApiV3.getEvaluations(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), null, null);
    }

    /* renamed from: C */
    public C5027n<List<Evaluation>> mo12735C(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f13267a.mo12741a(profile);
    }

    /* renamed from: a */
    public final EvaluationDao mo12739a() {
        return this.f13269c;
    }

    /* renamed from: m */
    public C5027n<List<Evaluation>> mo12737m(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13268b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/OsztalyCsoportok");
        C5027n<List<Evaluation>> c = mobileApiV3.getGroups(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new EvaluationRepositoryImpl$fetchEvaluations$1<Object,Object>(this, profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new EvaluationRepositoryImpl$fetchEvaluations$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "fetchGroup(profile)\n    …ile.id, it)\n            }");
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0091, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p289hu.ekreta.ellenorzo.evaluation.Evaluation mo12738a(p289hu.ekreta.ellenorzo.profile.Profile r29, p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto r30, java.util.List<p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto> r31) {
        /*
            r28 = this;
            java.util.Iterator r0 = r31.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            r2 = r1
            hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto) r2
            java.lang.String r2 = r2.getUid()
            java.lang.String r3 = r30.getGroupUid()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L_0x0004
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto r1 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto) r1
            hu.ekreta.ellenorzo.evaluation.Evaluation r0 = new hu.ekreta.ellenorzo.evaluation.Evaluation
            java.lang.String r3 = r30.getUid()
            java.lang.String r4 = r29.mo14054m()
            java.lang.String r5 = r30.getForm()
            java.lang.String r6 = r30.getTypeDescription()
            java.lang.String r7 = r30.getFormTypeDescription()
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type$Companion r2 = p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.Companion
            java.lang.String r8 = r30.getTypeName()
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type r8 = r2.mo12626a(r8)
            java.lang.String r9 = r30.getSubjectName()
            java.lang.String r10 = r30.getSubjectCategoryDescription()
            java.lang.String r11 = r30.getSubjectCategoryName()
            java.lang.String r12 = r30.getTheme()
            java.lang.String r13 = r30.getModeName()
            java.lang.String r14 = r30.getModeDescription()
            java.lang.String r15 = r30.getWeight()
            java.lang.String r16 = r30.getValue()
            java.lang.String r17 = r30.getShortValue()
            java.lang.Integer r18 = r30.getNumberValue()
            java.util.Calendar r19 = r30.getSeenByTutelaryUTC()
            java.lang.String r20 = r30.getTeacher()
            java.util.Calendar r21 = r30.getRecordingDate()
            java.util.Calendar r22 = r30.getCreatingTime()
            hu.ekreta.ellenorzo.evaluation.Evaluation$FormType$Companion r2 = p289hu.ekreta.ellenorzo.evaluation.Evaluation.FormType.Companion
            r29 = r15
            java.lang.String r15 = r30.getFormTypeName()
            hu.ekreta.ellenorzo.evaluation.Evaluation$FormType r23 = r2.mo12622a(r15)
            java.lang.String r25 = r30.getGroupUid()
            if (r1 == 0) goto L_0x0094
            java.lang.String r2 = r1.getEducationTypeDescription()
            if (r2 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            java.lang.String r2 = ""
        L_0x0096:
            r26 = r2
            if (r1 == 0) goto L_0x00a1
            int r1 = r1.getSortIndex()
            r27 = r1
            goto L_0x00a4
        L_0x00a1:
            r1 = -1
            r27 = -1
        L_0x00a4:
            r24 = 0
            r2 = r0
            r15 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl.mo12738a(hu.ekreta.ellenorzo.profile.Profile, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto, java.util.List):hu.ekreta.ellenorzo.evaluation.Evaluation");
    }

    /* renamed from: a */
    public C5027n<Evaluation> mo12736a(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
        return this.f13267a.mo12740a(evaluation);
    }
}
