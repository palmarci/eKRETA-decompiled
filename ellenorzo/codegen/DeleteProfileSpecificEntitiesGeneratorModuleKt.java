package p289hu.ekreta.ellenorzo.codegen;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRealm;
import p289hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import p289hu.ekreta.ellenorzo.cases.CaseRealm;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationDocumentTypeRealm;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm;
import p289hu.ekreta.ellenorzo.classmaster.ClassMasterRealm;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRealm;
import p289hu.ekreta.ellenorzo.group.GroupRealm;
import p289hu.ekreta.ellenorzo.homework.HomeworkRealm;
import p289hu.ekreta.ellenorzo.message.AddresseeRealm;
import p289hu.ekreta.ellenorzo.message.MessageRealm;
import p289hu.ekreta.ellenorzo.notes.NoteRealm;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm;
import p289hu.ekreta.ellenorzo.notification.NotificationStateRealm;
import p289hu.ekreta.ellenorzo.omission.OmissionRealm;
import p289hu.ekreta.ellenorzo.profile.GuardianRealm;
import p289hu.ekreta.ellenorzo.profile.ProfileRealm;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntryRealm;
import p289hu.ekreta.ellenorzo.subject.SubjectRealm;
import p289hu.ekreta.ellenorzo.timetable.TimeTableDayRealm;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItemRealm;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo17463d2 = {"PROFILE_SPECIFIC_ENTITIES", "", "Lkotlin/reflect/KClass;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "getPROFILE_SPECIFIC_ENTITIES", "()Ljava/util/List;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.codegen.DeleteProfileSpecificEntitiesGeneratorModuleKt */
/* compiled from: DeleteProfileSpecificEntitiesGeneratorModule.kt */
public final class DeleteProfileSpecificEntitiesGeneratorModuleKt {

    /* renamed from: a */
    public static final List<KClass<? extends ProfileSpecificModelRealm>> f11879a = CollectionsKt__CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(SchoolYearCalendarEntryRealm.class), Reflection.getOrCreateKotlinClass(GroupRealm.class), Reflection.getOrCreateKotlinClass(ClassMasterRealm.class), Reflection.getOrCreateKotlinClass(NotificationStateRealm.class), Reflection.getOrCreateKotlinClass(AttachmentRealm.class), Reflection.getOrCreateKotlinClass(SubjectRealm.class), Reflection.getOrCreateKotlinClass(CaseRealm.class), Reflection.getOrCreateKotlinClass(ApplicationDocumentTypeRealm.class), Reflection.getOrCreateKotlinClass(ApplicationMandatoryDocumentRealm.class), Reflection.getOrCreateKotlinClass(FileRealm.class), Reflection.getOrCreateKotlinClass(AddresseeRealm.class), Reflection.getOrCreateKotlinClass(MessageRealm.class), Reflection.getOrCreateKotlinClass(OmissionRealm.class), Reflection.getOrCreateKotlinClass(NoticeBoardItemRealm.class), Reflection.getOrCreateKotlinClass(NoteRealm.class), Reflection.getOrCreateKotlinClass(GuardianRealm.class), Reflection.getOrCreateKotlinClass(ProfileRealm.class), Reflection.getOrCreateKotlinClass(HomeworkRealm.class), Reflection.getOrCreateKotlinClass(AnnouncedTestRealm.class), Reflection.getOrCreateKotlinClass(EvaluationRealm.class), Reflection.getOrCreateKotlinClass(TimeTableDayRealm.class), Reflection.getOrCreateKotlinClass(TimeTableItemRealm.class));
}
