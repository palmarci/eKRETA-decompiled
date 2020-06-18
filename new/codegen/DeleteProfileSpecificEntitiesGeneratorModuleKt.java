package hu.ekreta.ellenorzo.codegen;

import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRealm;
import hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import hu.ekreta.ellenorzo.cases.CaseRealm;
import hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationDocumentTypeRealm;
import hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm;
import hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm;
import hu.ekreta.ellenorzo.classmaster.ClassMasterRealm;
import hu.ekreta.ellenorzo.evaluation.EvaluationRealm;
import hu.ekreta.ellenorzo.group.GroupRealm;
import hu.ekreta.ellenorzo.homework.HomeworkRealm;
import hu.ekreta.ellenorzo.message.AddresseeRealm;
import hu.ekreta.ellenorzo.message.MessageRealm;
import hu.ekreta.ellenorzo.notes.NoteRealm;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm;
import hu.ekreta.ellenorzo.notification.NotificationStateRealm;
import hu.ekreta.ellenorzo.omission.OmissionRealm;
import hu.ekreta.ellenorzo.profile.GuardianRealm;
import hu.ekreta.ellenorzo.profile.ProfileRealm;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntryRealm;
import hu.ekreta.ellenorzo.subject.SubjectRealm;
import hu.ekreta.ellenorzo.timetable.TimeTableDayRealm;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRealm;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"PROFILE_SPECIFIC_ENTITIES", "", "Lkotlin/reflect/KClass;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "getPROFILE_SPECIFIC_ENTITIES", "()Ljava/util/List;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: DeleteProfileSpecificEntitiesGeneratorModule.kt */
public final class DeleteProfileSpecificEntitiesGeneratorModuleKt {

    /* renamed from: a  reason: collision with root package name */
    public static final List<KClass<? extends ProfileSpecificModelRealm>> f5291a = CollectionsKt__CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(SchoolYearCalendarEntryRealm.class), Reflection.getOrCreateKotlinClass(GroupRealm.class), Reflection.getOrCreateKotlinClass(ClassMasterRealm.class), Reflection.getOrCreateKotlinClass(NotificationStateRealm.class), Reflection.getOrCreateKotlinClass(AttachmentRealm.class), Reflection.getOrCreateKotlinClass(SubjectRealm.class), Reflection.getOrCreateKotlinClass(CaseRealm.class), Reflection.getOrCreateKotlinClass(ApplicationDocumentTypeRealm.class), Reflection.getOrCreateKotlinClass(ApplicationMandatoryDocumentRealm.class), Reflection.getOrCreateKotlinClass(FileRealm.class), Reflection.getOrCreateKotlinClass(AddresseeRealm.class), Reflection.getOrCreateKotlinClass(MessageRealm.class), Reflection.getOrCreateKotlinClass(OmissionRealm.class), Reflection.getOrCreateKotlinClass(NoticeBoardItemRealm.class), Reflection.getOrCreateKotlinClass(NoteRealm.class), Reflection.getOrCreateKotlinClass(GuardianRealm.class), Reflection.getOrCreateKotlinClass(ProfileRealm.class), Reflection.getOrCreateKotlinClass(HomeworkRealm.class), Reflection.getOrCreateKotlinClass(AnnouncedTestRealm.class), Reflection.getOrCreateKotlinClass(EvaluationRealm.class), Reflection.getOrCreateKotlinClass(TimeTableDayRealm.class), Reflection.getOrCreateKotlinClass(TimeTableItemRealm.class));
}
