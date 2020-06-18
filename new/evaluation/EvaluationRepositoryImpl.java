package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u001b\u001a\u00020\rH\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "evaluationDao", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;)V", "adapter", "hu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl$adapter$1;", "getEvaluationDao", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "createEvaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "evaluationDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "listOfGroupDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "fetchEvaluation", "Lio/reactivex/Observable;", "fetchEvaluations", "fetchGroup", "getEvaluations", "updateEvaluation", "evaluation", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl implements EvaluationRepository {

    /* renamed from: a  reason: collision with root package name */
    public final EvaluationRepositoryImpl$adapter$1 f5590a = new EvaluationRepositoryImpl$adapter$1(this);
    public final MobileApiV3 b;
    public final EvaluationDao c;

    public EvaluationRepositoryImpl(MobileApiV3 mobileApiV3, EvaluationDao evaluationDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(evaluationDao, "evaluationDao");
        this.b = mobileApiV3;
        this.c = evaluationDao;
    }

    public n<List<Evaluation>> C(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5590a.a(profile);
    }

    public final EvaluationDao a() {
        return this.c;
    }

    public n<List<Evaluation>> m(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.b;
        n<R> c2 = mobileApiV3.getGroups(profile.p() + "/ellenorzo/V3/Sajat/OsztalyCsoportok", MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).c(new EvaluationRepositoryImpl$fetchEvaluations$1(this, profile)).c(new EvaluationRepositoryImpl$fetchEvaluations$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "fetchGroup(profile)\n    …ile.id, it)\n            }");
        return c2;
    }

    public final Evaluation a(Profile profile, EvaluationDto evaluationDto, List<GroupDto> list) {
        T t;
        String str;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual((Object) ((GroupDto) t).getUid(), (Object) evaluationDto.getGroupUid())) {
                break;
            }
        }
        GroupDto groupDto = (GroupDto) t;
        String uid = evaluationDto.getUid();
        String m2 = profile.m();
        String form = evaluationDto.getForm();
        String typeDescription = evaluationDto.getTypeDescription();
        String formTypeDescription = evaluationDto.getFormTypeDescription();
        Evaluation.Type a2 = Evaluation.Type.Companion.a(evaluationDto.getTypeName());
        String subjectName = evaluationDto.getSubjectName();
        String subjectCategoryDescription = evaluationDto.getSubjectCategoryDescription();
        String subjectCategoryName = evaluationDto.getSubjectCategoryName();
        String theme = evaluationDto.getTheme();
        String modeName = evaluationDto.getModeName();
        String modeDescription = evaluationDto.getModeDescription();
        String weight = evaluationDto.getWeight();
        String value = evaluationDto.getValue();
        String shortValue = evaluationDto.getShortValue();
        Integer numberValue = evaluationDto.getNumberValue();
        Calendar seenByTutelaryUTC = evaluationDto.getSeenByTutelaryUTC();
        String teacher = evaluationDto.getTeacher();
        Calendar recordingDate = evaluationDto.getRecordingDate();
        Calendar creatingTime = evaluationDto.getCreatingTime();
        String str2 = weight;
        Evaluation.FormType a3 = Evaluation.FormType.Companion.a(evaluationDto.getFormTypeName());
        String groupUid = evaluationDto.getGroupUid();
        if (groupDto == null || (str = groupDto.getEducationTypeDescription()) == null) {
            str = "";
        }
        return new Evaluation(uid, m2, form, typeDescription, formTypeDescription, a2, subjectName, subjectCategoryDescription, subjectCategoryName, theme, modeName, modeDescription, str2, value, shortValue, numberValue, seenByTutelaryUTC, teacher, recordingDate, creatingTime, a3, (Boolean) null, groupUid, str, groupDto != null ? groupDto.getSortIndex() : -1);
    }

    public n<Evaluation> a(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
        return this.f5590a.a(evaluation);
    }
}
