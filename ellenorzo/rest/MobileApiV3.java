package p289hu.ekreta.ellenorzo.rest;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.CreateHomeworkPostDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkCommentDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkCommentPostDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoticeBoardItemDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.StudentDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SubjectAverageDto;
import p300k.p313b.C5027n;
import p353m.C5456h0;
import p380p.p385t.C5811a;
import p380p.p385t.C5812b;
import p380p.p385t.C5816f;
import p380p.p385t.C5819i;
import p380p.p385t.C5824n;
import p380p.p385t.C5829s;
import p380p.p385t.C5833w;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H'J2\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'J4\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'J@\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H'J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H'J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H'J@\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H'J(\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H'J(\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J2\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'J,\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020/H'J,\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u000201H'¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "", "deleteHomeworkComment", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "url", "", "authorizationHeader", "getAnnouncedTests", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto;", "fromDate", "toDate", "getClassAverage", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto;", "educationTypeUid", "getClassMaster", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "uids", "getEvaluations", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "getGroups", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "getHomeworkById", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "getHomeworkCommentList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentDto;", "getHomeworks", "getInstitutes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "getLessons", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "getNotes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto;", "getNoticeBoardItems", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoticeBoardItemDto;", "getOmissions", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "getSchoolYearCalendar", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "getStudent", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "getSubjectAverage", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto;", "postHomeworkComment", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "body", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentPostDto;", "postNewHomework", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/CreateHomeworkPostDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.MobileApiV3 */
/* compiled from: MobileApiV3.kt */
public interface MobileApiV3 {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.MobileApiV3$DefaultImpls */
    /* compiled from: MobileApiV3.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ C5027n getAnnouncedTests$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getAnnouncedTests(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnnouncedTests");
        }

        public static /* synthetic */ C5027n getClassMaster$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return mobileApiV3.getClassMaster(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClassMaster");
        }

        public static /* synthetic */ C5027n getEvaluations$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getEvaluations(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEvaluations");
        }

        public static /* synthetic */ C5027n getHomeworks$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getHomeworks(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeworks");
        }

        public static /* synthetic */ C5027n getLessons$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getLessons(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLessons");
        }

        public static /* synthetic */ C5027n getNotes$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getNotes(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotes");
        }

        public static /* synthetic */ C5027n getOmissions$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getOmissions(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOmissions");
        }
    }

    @C5812b
    C5027n<C5456h0> deleteHomeworkComment(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<List<AnnouncedTestDto>> getAnnouncedTests(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("datumTol") String str3, @C5829s("datumIg") String str4);

    @C5816f
    C5027n<List<ClassAverageDto>> getClassAverage(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("oktatasiNevelesiFeladatUid") String str3);

    @C5816f
    C5027n<List<ClassMasterDto>> getClassMaster(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("Uids") String str3);

    @C5816f
    C5027n<List<EvaluationDto>> getEvaluations(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("datumTol") String str3, @C5829s("datumIg") String str4);

    @C5816f
    C5027n<List<GroupDto>> getGroups(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<HomeworkDto> getHomeworkById(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<List<HomeworkCommentDto>> getHomeworkCommentList(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<List<HomeworkDto>> getHomeworks(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("datumTol") String str3, @C5829s("datumIg") String str4);

    @C5816f
    C5027n<InstitutionDto> getInstitutes(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<List<LessonDto>> getLessons(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("datumTol") String str3, @C5829s("datumIg") String str4);

    @C5816f
    C5027n<List<NoteDto>> getNotes(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("datumTol") String str3, @C5829s("datumIg") String str4);

    @C5816f
    C5027n<List<NoticeBoardItemDto>> getNoticeBoardItems(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<List<OmissionDto>> getOmissions(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("datumTol") String str3, @C5829s("datumIg") String str4);

    @C5816f
    C5027n<List<SchoolYearCalendarEntryDto>> getSchoolYearCalendar(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<StudentDto> getStudent(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f
    C5027n<List<SubjectAverageDto>> getSubjectAverage(@C5833w String str, @C5819i("Authorization") String str2, @C5829s("oktatasiNevelesiFeladatUid") String str3);

    @C5824n
    C5027n<NewlyCreatedHomeworkCommentDto> postHomeworkComment(@C5833w String str, @C5819i("Authorization") String str2, @C5811a HomeworkCommentPostDto homeworkCommentPostDto);

    @C5824n
    C5027n<NewlyCreatedHomeworkCommentDto> postNewHomework(@C5833w String str, @C5819i("Authorization") String str2, @C5811a CreateHomeworkPostDto createHomeworkPostDto);
}
