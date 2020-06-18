package hu.ekreta.ellenorzo.rest;

import hu.ekreta.ellenorzo.rest.eadminapi.TemporaryFileDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.CreateHomeworkPostDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkCommentDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkCommentPostDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkStatePostDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NewlyCreatedHomeworkCommentDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NoticeBoardItemDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.SubjectAverageDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import m.h0;
import m.x;
import p.t.a;
import p.t.b;
import p.t.f;
import p.t.i;
import p.t.j;
import p.t.k;
import p.t.p;
import p.t.s;
import p.t.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J2\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H'J4\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0006H'J@\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J@\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J(\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\"\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J2\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H'J,\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u000203H'J2\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u00102\u001a\b\u0012\u0004\u0012\u0002050\rH'J,\u00106\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u000207H'¨\u00068"}, d2 = {"Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "", "createAttachment", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/eadminapi/TemporaryFileDto;", "url", "", "authorizationHeader", "file", "Lokhttp3/MultipartBody$Part;", "deleteHomeworkComment", "Lokhttp3/ResponseBody;", "getAnnouncedTests", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto;", "fromDate", "toDate", "getClassAverage", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto;", "educationTypeUid", "getClassMaster", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "uids", "getEvaluations", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "getGroups", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "getHomeworkById", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "getHomeworkCommentList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentDto;", "getHomeworks", "getInstitutes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "getLessons", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "getNotes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto;", "getNoticeBoardItems", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoticeBoardItemDto;", "getOmissions", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "getSchoolYearCalendar", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "getStudent", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "getSubjectAverage", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto;", "postHomeworkComment", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "body", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentPostDto;", "postHomeworkState", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkStatePostDto;", "postNewHomework", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/CreateHomeworkPostDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MobileApiV3.kt */
public interface MobileApiV3 {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: MobileApiV3.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ n getAnnouncedTests$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getAnnouncedTests(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnnouncedTests");
        }

        public static /* synthetic */ n getClassMaster$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                return mobileApiV3.getClassMaster(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClassMaster");
        }

        public static /* synthetic */ n getEvaluations$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getEvaluations(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEvaluations");
        }

        public static /* synthetic */ n getHomeworks$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getHomeworks(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeworks");
        }

        public static /* synthetic */ n getLessons$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getLessons(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLessons");
        }

        public static /* synthetic */ n getNotes$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getNotes(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotes");
        }

        public static /* synthetic */ n getOmissions$default(MobileApiV3 mobileApiV3, String str, String str2, String str3, String str4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    str4 = null;
                }
                return mobileApiV3.getOmissions(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOmissions");
        }
    }

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @k
    @p.t.n
    n<TemporaryFileDto> createAttachment(@w String str, @i("Authorization") String str2, @p x.b bVar);

    @b
    n<h0> deleteHomeworkComment(@w String str, @i("Authorization") String str2);

    @f
    n<List<AnnouncedTestDto>> getAnnouncedTests(@w String str, @i("Authorization") String str2, @s("datumTol") String str3, @s("datumIg") String str4);

    @f
    n<List<ClassAverageDto>> getClassAverage(@w String str, @i("Authorization") String str2, @s("oktatasiNevelesiFeladatUid") String str3);

    @f
    n<List<ClassMasterDto>> getClassMaster(@w String str, @i("Authorization") String str2, @s("Uids") String str3);

    @f
    n<List<EvaluationDto>> getEvaluations(@w String str, @i("Authorization") String str2, @s("datumTol") String str3, @s("datumIg") String str4);

    @f
    n<List<GroupDto>> getGroups(@w String str, @i("Authorization") String str2);

    @f
    n<HomeworkDto> getHomeworkById(@w String str, @i("Authorization") String str2);

    @f
    n<List<HomeworkCommentDto>> getHomeworkCommentList(@w String str, @i("Authorization") String str2);

    @f
    n<List<HomeworkDto>> getHomeworks(@w String str, @i("Authorization") String str2, @s("datumTol") String str3, @s("datumIg") String str4);

    @f
    n<InstitutionDto> getInstitutes(@w String str, @i("Authorization") String str2);

    @f
    n<List<LessonDto>> getLessons(@w String str, @i("Authorization") String str2, @s("datumTol") String str3, @s("datumIg") String str4);

    @f
    n<List<NoteDto>> getNotes(@w String str, @i("Authorization") String str2, @s("datumTol") String str3, @s("datumIg") String str4);

    @f
    n<List<NoticeBoardItemDto>> getNoticeBoardItems(@w String str, @i("Authorization") String str2);

    @f
    n<List<OmissionDto>> getOmissions(@w String str, @i("Authorization") String str2, @s("datumTol") String str3, @s("datumIg") String str4);

    @f
    n<List<SchoolYearCalendarEntryDto>> getSchoolYearCalendar(@w String str, @i("Authorization") String str2);

    @f
    n<StudentDto> getStudent(@w String str, @i("Authorization") String str2);

    @f
    n<List<SubjectAverageDto>> getSubjectAverage(@w String str, @i("Authorization") String str2, @s("oktatasiNevelesiFeladatUid") String str3);

    @p.t.n
    n<NewlyCreatedHomeworkCommentDto> postHomeworkComment(@w String str, @i("Authorization") String str2, @a HomeworkCommentPostDto homeworkCommentPostDto);

    @p.t.n
    n<h0> postHomeworkState(@w String str, @i("Authorization") String str2, @a List<HomeworkStatePostDto> list);

    @p.t.n
    n<NewlyCreatedHomeworkCommentDto> postNewHomework(@w String str, @i("Authorization") String str2, @a CreateHomeworkPostDto createHomeworkPostDto);
}
