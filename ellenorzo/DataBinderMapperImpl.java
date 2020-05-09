package p289hu.ekreta.ellenorzo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p258l.C3700d;
import p211h.p258l.C3702f;
import p211h.p258l.p260p.p261b.C3722a;
import p289hu.ekreta.ellenorzo.databinding.ActivityAnnouncedTestDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityClassMasterBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityDailyOmissionsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityEvaluationDetailsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityMainBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityNotSupportedAppBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityNoteDetailsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityNoticeboardItemDetailsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityOmissionDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityProfileBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityRootedDeviceDetectedBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivitySettingsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.ActivityTmgiFormBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.DashboardItemBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentAboutBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentAveragesBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentCasesBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentClassMastersBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentEndOfYearBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentHalfYearBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentHomeBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentMessagesBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentNotesBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentNoticeboardBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentOmissionPerDayBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentQuarterlyBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentRemindersBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentSubjectsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentTimetableBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBindingImpl;
import p289hu.ekreta.ellenorzo.databinding.MessageItemBindingImpl;

/* renamed from: hu.ekreta.ellenorzo.DataBinderMapperImpl */
public class DataBinderMapperImpl extends C3700d {

    /* renamed from: a */
    public static final SparseIntArray f11003a = new SparseIntArray(62);

    /* renamed from: hu.ekreta.ellenorzo.DataBinderMapperImpl$InnerBrLookup */
    public static class InnerBrLookup {

        /* renamed from: a */
        public static final SparseArray<String> f11004a = new SparseArray<>(114);

        static {
            f11004a.put(0, "_all");
            f11004a.put(1, "reason");
            f11004a.put(2, "appVersion");
            f11004a.put(3, "listViewVisible");
            f11004a.put(4, "onFocusChangeListener");
            f11004a.put(5, "endDate");
            f11004a.put(6, "pageTitle");
            f11004a.put(7, "announcedTestButtonVisible");
            f11004a.put(8, "homeworkCommentEnabled");
            f11004a.put(9, "type");
            f11004a.put(10, "birthName");
            f11004a.put(11, "homeworkButtonVisible");
            f11004a.put(12, "requestedAbsenceInterval");
            f11004a.put(13, "password");
            f11004a.put(14, "seenByTutelaryUTC");
            f11004a.put(15, "text");
            f11004a.put(16, "state");
            f11004a.put(17, "signer");
            f11004a.put(18, "messageText");
            f11004a.put(19, "administratorName");
            f11004a.put(20, "classroom");
            f11004a.put(21, "onTouchListener");
            f11004a.put(22, "optionalDocumentIsAdded");
            f11004a.put(23, "caseTypeText");
            f11004a.put(24, "studentName");
            f11004a.put(25, "subtitle");
            f11004a.put(26, "mothersName");
            f11004a.put(27, "decisionButtonText");
            f11004a.put(28, "smsEnabled");
            f11004a.put(29, "printableDocument");
            f11004a.put(30, "grantType");
            f11004a.put(31, "classScheduleNumber");
            f11004a.put(32, "startDate");
            f11004a.put(33, "lessonTimeFormatted");
            f11004a.put(34, "attachments");
            f11004a.put(35, "institutePickerButtonText");
            f11004a.put(36, "typeName");
            f11004a.put(37, "progressVisible");
            f11004a.put(38, "activeProfileName");
            f11004a.put(39, "commentText");
            f11004a.put(40, "selectedTmgiType");
            f11004a.put(41, "instituteName");
            f11004a.put(42, "rectificationButtonText");
            f11004a.put(43, "birthPlace");
            f11004a.put(44, "sentDate");
            f11004a.put(45, "dayOfWeek");
            f11004a.put(46, "mandatoryDocuments");
            f11004a.put(47, "creatingTime");
            f11004a.put(48, "mandatoryDocumentName");
            f11004a.put(49, "decisionButtonVisible");
            f11004a.put(50, "theme");
            f11004a.put(51, "loginEnabled");
            f11004a.put(52, "sendButtonEnabled");
            f11004a.put(53, "deadline");
            f11004a.put(54, "createDate");
            f11004a.put(55, "address");
            f11004a.put(56, "numberOfLessons");
            f11004a.put(57, "callEnabled");
            f11004a.put(58, "userId");
            f11004a.put(59, "decisionType");
            f11004a.put(60, "midYear");
            f11004a.put(61, "activeProfileRole");
            f11004a.put(62, "announcedAt");
            f11004a.put(63, "longName");
            f11004a.put(64, "date");
            f11004a.put(65, "emptyViewVisible");
            f11004a.put(66, "justificationType");
            f11004a.put(67, "onClick");
            f11004a.put(68, "studentShortName");
            f11004a.put(69, "reasonText");
            f11004a.put(70, "subject");
            f11004a.put(71, "documentNumber");
            f11004a.put(72, "mandatoryDocumentIsAdded");
            f11004a.put(73, "selectedTmgiTypeName");
            f11004a.put(74, "savePassword");
            f11004a.put(75, "mode");
            f11004a.put(76, "searchTerm");
            f11004a.put(77, "justificationStateName");
            f11004a.put(78, "decisionNeedsToBeSend");
            f11004a.put(79, "group");
            f11004a.put(80, "provenAbsenceDate");
            f11004a.put(81, "studentHomeworkEnabled");
            f11004a.put(82, "emailEnabled");
            f11004a.put(83, "weight");
            f11004a.put(84, "studentEducationId");
            f11004a.put(85, "tmgiCaseTypes");
            f11004a.put(86, "addressee");
            f11004a.put(87, "name");
            f11004a.put(88, "viewModel");
            f11004a.put(89, "topic");
            f11004a.put(90, "addNewHomeworkButtonVisible");
            f11004a.put(91, "modeName");
            f11004a.put(92, "description");
            f11004a.put(93, "addMandatoryDocumentSectionEnabled");
            f11004a.put(94, "commentButtonVisibility");
            f11004a.put(95, "title");
            f11004a.put(96, "content");
            f11004a.put(97, "adjudication");
            f11004a.put(98, "rectificationButtonVisible");
            f11004a.put(99, "teacher");
            f11004a.put(100, "messageSpanned");
            f11004a.put(101, "justification");
            f11004a.put(102, "value");
            f11004a.put(103, "passwordShowable");
            f11004a.put(104, "messageSubject");
            f11004a.put(105, "fullName");
            f11004a.put(106, "message");
            f11004a.put(107, "birthDate");
            f11004a.put(108, "addresseeNames");
            f11004a.put(109, "decisionDate");
            f11004a.put(110, "messageSenderNameAndType");
            f11004a.put(111, "form");
            f11004a.put(112, "themeCaptionText");
        }
    }

    /* renamed from: hu.ekreta.ellenorzo.DataBinderMapperImpl$InnerLayoutIdLookup */
    public static class InnerLayoutIdLookup {

        /* renamed from: a */
        public static final HashMap<String, Integer> f11005a = new HashMap<>(62);

        static {
            f11005a.put("layout/activity_announced_test_detail_0", Integer.valueOf(C4014R.layout.activity_announced_test_detail));
            f11005a.put("layout/activity_case_details_0", Integer.valueOf(C4014R.layout.activity_case_details));
            f11005a.put("layout/activity_case_details_tmgi_0", Integer.valueOf(C4014R.layout.activity_case_details_tmgi));
            f11005a.put("layout/activity_class_master_0", Integer.valueOf(C4014R.layout.activity_class_master));
            f11005a.put("layout/activity_daily_omissions_0", Integer.valueOf(C4014R.layout.activity_daily_omissions));
            f11005a.put("layout/activity_decision_detail_0", Integer.valueOf(C4014R.layout.activity_decision_detail));
            f11005a.put("layout/activity_evaluation_details_0", Integer.valueOf(C4014R.layout.activity_evaluation_details));
            f11005a.put("layout/activity_homework_comment_0", Integer.valueOf(C4014R.layout.activity_homework_comment));
            f11005a.put("layout/activity_homework_detail_0", Integer.valueOf(C4014R.layout.activity_homework_detail));
            f11005a.put("layout/activity_insitute_picker_0", Integer.valueOf(C4014R.layout.activity_insitute_picker));
            f11005a.put("layout/activity_lesson_detail_0", Integer.valueOf(C4014R.layout.activity_lesson_detail));
            f11005a.put("layout/activity_login_0", Integer.valueOf(C4014R.layout.activity_login));
            f11005a.put("layout/activity_main_0", Integer.valueOf(C4014R.layout.activity_main));
            f11005a.put("layout/activity_message_detail_0", Integer.valueOf(C4014R.layout.activity_message_detail));
            f11005a.put("layout/activity_new_message_0", Integer.valueOf(C4014R.layout.activity_new_message));
            f11005a.put("layout/activity_not_supported_app_0", Integer.valueOf(C4014R.layout.activity_not_supported_app));
            f11005a.put("layout/activity_note_details_0", Integer.valueOf(C4014R.layout.activity_note_details));
            f11005a.put("layout/activity_noticeboard_item_details_0", Integer.valueOf(C4014R.layout.activity_noticeboard_item_details));
            f11005a.put("layout/activity_omission_detail_0", Integer.valueOf(C4014R.layout.activity_omission_detail));
            f11005a.put("layout/activity_profile_0", Integer.valueOf(C4014R.layout.activity_profile));
            f11005a.put("layout/activity_profile_detail_0", Integer.valueOf(C4014R.layout.activity_profile_detail));
            f11005a.put("layout/activity_rooted_device_detected_0", Integer.valueOf(C4014R.layout.activity_rooted_device_detected));
            f11005a.put("layout/activity_settings_0", Integer.valueOf(C4014R.layout.activity_settings));
            f11005a.put("layout/activity_subject_detail_0", Integer.valueOf(C4014R.layout.activity_subject_detail));
            f11005a.put("layout/activity_tmgi_form_0", Integer.valueOf(C4014R.layout.activity_tmgi_form));
            f11005a.put("layout/dashboard_item_0", Integer.valueOf(C4014R.layout.dashboard_item));
            f11005a.put("layout/fragment_about_0", Integer.valueOf(C4014R.layout.fragment_about));
            f11005a.put("layout/fragment_averages_0", Integer.valueOf(C4014R.layout.fragment_averages));
            f11005a.put("layout/fragment_cases_0", Integer.valueOf(C4014R.layout.fragment_cases));
            f11005a.put("layout/fragment_class_masters_0", Integer.valueOf(C4014R.layout.fragment_class_masters));
            f11005a.put("layout/fragment_end_of_year_0", Integer.valueOf(C4014R.layout.fragment_end_of_year));
            f11005a.put("layout/fragment_half_year_0", Integer.valueOf(C4014R.layout.fragment_half_year));
            f11005a.put("layout/fragment_home_0", Integer.valueOf(C4014R.layout.fragment_home));
            f11005a.put("layout/fragment_messages_0", Integer.valueOf(C4014R.layout.fragment_messages));
            f11005a.put("layout/fragment_notes_0", Integer.valueOf(C4014R.layout.fragment_notes));
            f11005a.put("layout/fragment_noticeboard_0", Integer.valueOf(C4014R.layout.fragment_noticeboard));
            f11005a.put("layout/fragment_omission_per_day_0", Integer.valueOf(C4014R.layout.fragment_omission_per_day));
            f11005a.put("layout/fragment_quarterly_0", Integer.valueOf(C4014R.layout.fragment_quarterly));
            f11005a.put("layout/fragment_reminders_0", Integer.valueOf(C4014R.layout.fragment_reminders));
            f11005a.put("layout/fragment_subjects_0", Integer.valueOf(C4014R.layout.fragment_subjects));
            f11005a.put("layout/fragment_timetable_0", Integer.valueOf(C4014R.layout.fragment_timetable));
            f11005a.put("layout/fragment_tmgi_form_0", Integer.valueOf(C4014R.layout.fragment_tmgi_form));
            f11005a.put("layout/include_case_decision_add_attachment_0", Integer.valueOf(C4014R.layout.include_case_decision_add_attachment));
            f11005a.put("layout/include_case_decision_adjudication_0", Integer.valueOf(C4014R.layout.include_case_decision_adjudication));
            f11005a.put("layout/include_case_decision_date_0", Integer.valueOf(C4014R.layout.include_case_decision_date));
            f11005a.put("layout/include_case_decision_signer_0", Integer.valueOf(C4014R.layout.include_case_decision_signer));
            f11005a.put("layout/include_case_decision_type_0", Integer.valueOf(C4014R.layout.include_case_decision_type));
            f11005a.put("layout/include_case_details_administratorname_0", Integer.valueOf(C4014R.layout.include_case_details_administratorname));
            f11005a.put("layout/include_case_details_attachments_0", Integer.valueOf(C4014R.layout.include_case_details_attachments));
            f11005a.put("layout/include_case_details_mandatorydocuments_0", Integer.valueOf(C4014R.layout.include_case_details_mandatorydocuments));
            f11005a.put("layout/include_case_details_name_0", Integer.valueOf(C4014R.layout.include_case_details_name));
            f11005a.put("layout/include_case_details_printable_0", Integer.valueOf(C4014R.layout.include_case_details_printable));
            f11005a.put("layout/include_case_details_reason_0", Integer.valueOf(C4014R.layout.include_case_details_reason));
            f11005a.put("layout/include_case_details_rectificationbutton_0", Integer.valueOf(C4014R.layout.include_case_details_rectificationbutton));
            f11005a.put("layout/include_case_details_sentdate_0", Integer.valueOf(C4014R.layout.include_case_details_sentdate));
            f11005a.put("layout/include_case_details_state_0", Integer.valueOf(C4014R.layout.include_case_details_state));
            f11005a.put("layout/include_case_details_studenteducationid_0", Integer.valueOf(C4014R.layout.include_case_details_studenteducationid));
            f11005a.put("layout/include_case_details_studentname_0", Integer.valueOf(C4014R.layout.include_case_details_studentname));
            f11005a.put("layout/include_case_details_tmgi_justificationtype_0", Integer.valueOf(C4014R.layout.include_case_details_tmgi_justificationtype));
            f11005a.put("layout/include_case_details_tmgi_requestedabsenceinterval_0", Integer.valueOf(C4014R.layout.include_case_details_tmgi_requestedabsenceinterval));
            f11005a.put("layout/include_proven_absence_0", Integer.valueOf(C4014R.layout.include_proven_absence));
            f11005a.put("layout/message_item_0", Integer.valueOf(C4014R.layout.message_item));
        }
    }

    static {
        f11003a.put(C4014R.layout.activity_announced_test_detail, 1);
        f11003a.put(C4014R.layout.activity_case_details, 2);
        f11003a.put(C4014R.layout.activity_case_details_tmgi, 3);
        f11003a.put(C4014R.layout.activity_class_master, 4);
        f11003a.put(C4014R.layout.activity_daily_omissions, 5);
        f11003a.put(C4014R.layout.activity_decision_detail, 6);
        f11003a.put(C4014R.layout.activity_evaluation_details, 7);
        f11003a.put(C4014R.layout.activity_homework_comment, 8);
        f11003a.put(C4014R.layout.activity_homework_detail, 9);
        f11003a.put(C4014R.layout.activity_insitute_picker, 10);
        f11003a.put(C4014R.layout.activity_lesson_detail, 11);
        f11003a.put(C4014R.layout.activity_login, 12);
        f11003a.put(C4014R.layout.activity_main, 13);
        f11003a.put(C4014R.layout.activity_message_detail, 14);
        f11003a.put(C4014R.layout.activity_new_message, 15);
        f11003a.put(C4014R.layout.activity_not_supported_app, 16);
        f11003a.put(C4014R.layout.activity_note_details, 17);
        f11003a.put(C4014R.layout.activity_noticeboard_item_details, 18);
        f11003a.put(C4014R.layout.activity_omission_detail, 19);
        f11003a.put(C4014R.layout.activity_profile, 20);
        f11003a.put(C4014R.layout.activity_profile_detail, 21);
        f11003a.put(C4014R.layout.activity_rooted_device_detected, 22);
        f11003a.put(C4014R.layout.activity_settings, 23);
        f11003a.put(C4014R.layout.activity_subject_detail, 24);
        f11003a.put(C4014R.layout.activity_tmgi_form, 25);
        f11003a.put(C4014R.layout.dashboard_item, 26);
        f11003a.put(C4014R.layout.fragment_about, 27);
        f11003a.put(C4014R.layout.fragment_averages, 28);
        f11003a.put(C4014R.layout.fragment_cases, 29);
        f11003a.put(C4014R.layout.fragment_class_masters, 30);
        f11003a.put(C4014R.layout.fragment_end_of_year, 31);
        f11003a.put(C4014R.layout.fragment_half_year, 32);
        f11003a.put(C4014R.layout.fragment_home, 33);
        f11003a.put(C4014R.layout.fragment_messages, 34);
        f11003a.put(C4014R.layout.fragment_notes, 35);
        f11003a.put(C4014R.layout.fragment_noticeboard, 36);
        f11003a.put(C4014R.layout.fragment_omission_per_day, 37);
        f11003a.put(C4014R.layout.fragment_quarterly, 38);
        f11003a.put(C4014R.layout.fragment_reminders, 39);
        f11003a.put(C4014R.layout.fragment_subjects, 40);
        f11003a.put(C4014R.layout.fragment_timetable, 41);
        f11003a.put(C4014R.layout.fragment_tmgi_form, 42);
        f11003a.put(C4014R.layout.include_case_decision_add_attachment, 43);
        f11003a.put(C4014R.layout.include_case_decision_adjudication, 44);
        f11003a.put(C4014R.layout.include_case_decision_date, 45);
        f11003a.put(C4014R.layout.include_case_decision_signer, 46);
        f11003a.put(C4014R.layout.include_case_decision_type, 47);
        f11003a.put(C4014R.layout.include_case_details_administratorname, 48);
        f11003a.put(C4014R.layout.include_case_details_attachments, 49);
        f11003a.put(C4014R.layout.include_case_details_mandatorydocuments, 50);
        f11003a.put(C4014R.layout.include_case_details_name, 51);
        f11003a.put(C4014R.layout.include_case_details_printable, 52);
        f11003a.put(C4014R.layout.include_case_details_reason, 53);
        f11003a.put(C4014R.layout.include_case_details_rectificationbutton, 54);
        f11003a.put(C4014R.layout.include_case_details_sentdate, 55);
        f11003a.put(C4014R.layout.include_case_details_state, 56);
        f11003a.put(C4014R.layout.include_case_details_studenteducationid, 57);
        f11003a.put(C4014R.layout.include_case_details_studentname, 58);
        f11003a.put(C4014R.layout.include_case_details_tmgi_justificationtype, 59);
        f11003a.put(C4014R.layout.include_case_details_tmgi_requestedabsenceinterval, 60);
        f11003a.put(C4014R.layout.include_proven_absence, 61);
        f11003a.put(C4014R.layout.message_item, 62);
    }

    /* renamed from: a */
    public ViewDataBinding mo10523a(C3702f fVar, View view, int i) {
        int i2 = f11003a.get(i);
        ViewDataBinding viewDataBinding = null;
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i3 = (i2 - 1) / 50;
                if (i3 == 0) {
                    switch (i2) {
                        case 1:
                            if ("layout/activity_announced_test_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityAnnouncedTestDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_announced_test_detail is invalid. Received: ", tag));
                            }
                        case 2:
                            if ("layout/activity_case_details_0".equals(tag)) {
                                viewDataBinding = new ActivityCaseDetailsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_case_details is invalid. Received: ", tag));
                            }
                        case 3:
                            if ("layout/activity_case_details_tmgi_0".equals(tag)) {
                                viewDataBinding = new ActivityCaseDetailsTmgiBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_case_details_tmgi is invalid. Received: ", tag));
                            }
                        case 4:
                            if ("layout/activity_class_master_0".equals(tag)) {
                                viewDataBinding = new ActivityClassMasterBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_class_master is invalid. Received: ", tag));
                            }
                        case 5:
                            if ("layout/activity_daily_omissions_0".equals(tag)) {
                                viewDataBinding = new ActivityDailyOmissionsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_daily_omissions is invalid. Received: ", tag));
                            }
                        case 6:
                            if ("layout/activity_decision_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityDecisionDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_decision_detail is invalid. Received: ", tag));
                            }
                        case 7:
                            if ("layout/activity_evaluation_details_0".equals(tag)) {
                                viewDataBinding = new ActivityEvaluationDetailsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_evaluation_details is invalid. Received: ", tag));
                            }
                        case 8:
                            if ("layout/activity_homework_comment_0".equals(tag)) {
                                viewDataBinding = new ActivityHomeworkCommentBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_homework_comment is invalid. Received: ", tag));
                            }
                        case 9:
                            if ("layout/activity_homework_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityHomeworkDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_homework_detail is invalid. Received: ", tag));
                            }
                        case 10:
                            if ("layout/activity_insitute_picker_0".equals(tag)) {
                                viewDataBinding = new ActivityInsitutePickerBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_insitute_picker is invalid. Received: ", tag));
                            }
                        case 11:
                            if ("layout/activity_lesson_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityLessonDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_lesson_detail is invalid. Received: ", tag));
                            }
                        case 12:
                            if ("layout/activity_login_0".equals(tag)) {
                                viewDataBinding = new ActivityLoginBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_login is invalid. Received: ", tag));
                            }
                        case 13:
                            if ("layout/activity_main_0".equals(tag)) {
                                viewDataBinding = new ActivityMainBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_main is invalid. Received: ", tag));
                            }
                        case 14:
                            if ("layout/activity_message_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityMessageDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_message_detail is invalid. Received: ", tag));
                            }
                        case 15:
                            if ("layout/activity_new_message_0".equals(tag)) {
                                viewDataBinding = new ActivityNewMessageBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_new_message is invalid. Received: ", tag));
                            }
                        case 16:
                            if ("layout/activity_not_supported_app_0".equals(tag)) {
                                viewDataBinding = new ActivityNotSupportedAppBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_not_supported_app is invalid. Received: ", tag));
                            }
                        case 17:
                            if ("layout/activity_note_details_0".equals(tag)) {
                                viewDataBinding = new ActivityNoteDetailsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_note_details is invalid. Received: ", tag));
                            }
                        case 18:
                            if ("layout/activity_noticeboard_item_details_0".equals(tag)) {
                                viewDataBinding = new ActivityNoticeboardItemDetailsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_noticeboard_item_details is invalid. Received: ", tag));
                            }
                        case 19:
                            if ("layout/activity_omission_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityOmissionDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_omission_detail is invalid. Received: ", tag));
                            }
                        case 20:
                            if ("layout/activity_profile_0".equals(tag)) {
                                viewDataBinding = new ActivityProfileBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_profile is invalid. Received: ", tag));
                            }
                        case 21:
                            if ("layout/activity_profile_detail_0".equals(tag)) {
                                viewDataBinding = new ActivityProfileDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_profile_detail is invalid. Received: ", tag));
                            }
                        case 22:
                            if ("layout/activity_rooted_device_detected_0".equals(tag)) {
                                viewDataBinding = new ActivityRootedDeviceDetectedBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_rooted_device_detected is invalid. Received: ", tag));
                            }
                        case 23:
                            if ("layout/activity_settings_0".equals(tag)) {
                                viewDataBinding = new ActivitySettingsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_settings is invalid. Received: ", tag));
                            }
                        case 24:
                            if ("layout/activity_subject_detail_0".equals(tag)) {
                                viewDataBinding = new ActivitySubjectDetailBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_subject_detail is invalid. Received: ", tag));
                            }
                        case 25:
                            if ("layout/activity_tmgi_form_0".equals(tag)) {
                                viewDataBinding = new ActivityTmgiFormBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for activity_tmgi_form is invalid. Received: ", tag));
                            }
                        case 26:
                            if ("layout/dashboard_item_0".equals(tag)) {
                                viewDataBinding = new DashboardItemBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for dashboard_item is invalid. Received: ", tag));
                            }
                        case 27:
                            if ("layout/fragment_about_0".equals(tag)) {
                                viewDataBinding = new FragmentAboutBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_about is invalid. Received: ", tag));
                            }
                        case 28:
                            if ("layout/fragment_averages_0".equals(tag)) {
                                viewDataBinding = new FragmentAveragesBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_averages is invalid. Received: ", tag));
                            }
                        case 29:
                            if ("layout/fragment_cases_0".equals(tag)) {
                                viewDataBinding = new FragmentCasesBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_cases is invalid. Received: ", tag));
                            }
                        case 30:
                            if ("layout/fragment_class_masters_0".equals(tag)) {
                                viewDataBinding = new FragmentClassMastersBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_class_masters is invalid. Received: ", tag));
                            }
                        case 31:
                            if ("layout/fragment_end_of_year_0".equals(tag)) {
                                viewDataBinding = new FragmentEndOfYearBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_end_of_year is invalid. Received: ", tag));
                            }
                        case 32:
                            if ("layout/fragment_half_year_0".equals(tag)) {
                                viewDataBinding = new FragmentHalfYearBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_half_year is invalid. Received: ", tag));
                            }
                        case 33:
                            if ("layout/fragment_home_0".equals(tag)) {
                                viewDataBinding = new FragmentHomeBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_home is invalid. Received: ", tag));
                            }
                        case 34:
                            if ("layout/fragment_messages_0".equals(tag)) {
                                viewDataBinding = new FragmentMessagesBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_messages is invalid. Received: ", tag));
                            }
                        case 35:
                            if ("layout/fragment_notes_0".equals(tag)) {
                                viewDataBinding = new FragmentNotesBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_notes is invalid. Received: ", tag));
                            }
                        case 36:
                            if ("layout/fragment_noticeboard_0".equals(tag)) {
                                viewDataBinding = new FragmentNoticeboardBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_noticeboard is invalid. Received: ", tag));
                            }
                        case 37:
                            if ("layout/fragment_omission_per_day_0".equals(tag)) {
                                viewDataBinding = new FragmentOmissionPerDayBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_omission_per_day is invalid. Received: ", tag));
                            }
                        case 38:
                            if ("layout/fragment_quarterly_0".equals(tag)) {
                                viewDataBinding = new FragmentQuarterlyBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_quarterly is invalid. Received: ", tag));
                            }
                        case 39:
                            if ("layout/fragment_reminders_0".equals(tag)) {
                                viewDataBinding = new FragmentRemindersBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_reminders is invalid. Received: ", tag));
                            }
                        case 40:
                            if ("layout/fragment_subjects_0".equals(tag)) {
                                viewDataBinding = new FragmentSubjectsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_subjects is invalid. Received: ", tag));
                            }
                        case 41:
                            if ("layout/fragment_timetable_0".equals(tag)) {
                                viewDataBinding = new FragmentTimetableBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_timetable is invalid. Received: ", tag));
                            }
                        case 42:
                            if ("layout/fragment_tmgi_form_0".equals(tag)) {
                                viewDataBinding = new FragmentTmgiFormBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for fragment_tmgi_form is invalid. Received: ", tag));
                            }
                        case 43:
                            if ("layout/include_case_decision_add_attachment_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDecisionAddAttachmentBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_add_attachment is invalid. Received: ", tag));
                            }
                        case 44:
                            if ("layout/include_case_decision_adjudication_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDecisionAdjudicationBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_adjudication is invalid. Received: ", tag));
                            }
                        case 45:
                            if ("layout/include_case_decision_date_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDecisionDateBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_date is invalid. Received: ", tag));
                            }
                        case 46:
                            if ("layout/include_case_decision_signer_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDecisionSignerBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_signer is invalid. Received: ", tag));
                            }
                        case 47:
                            if ("layout/include_case_decision_type_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDecisionTypeBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_type is invalid. Received: ", tag));
                            }
                        case 48:
                            if ("layout/include_case_details_administratorname_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsAdministratornameBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_administratorname is invalid. Received: ", tag));
                            }
                        case 49:
                            if ("layout/include_case_details_attachments_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsAttachmentsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_attachments is invalid. Received: ", tag));
                            }
                        case 50:
                            if ("layout/include_case_details_mandatorydocuments_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsMandatorydocumentsBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_mandatorydocuments is invalid. Received: ", tag));
                            }
                    }
                    return viewDataBinding;
                } else if (i3 == 1) {
                    switch (i2) {
                        case 51:
                            if ("layout/include_case_details_name_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsNameBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_name is invalid. Received: ", tag));
                            }
                        case 52:
                            if ("layout/include_case_details_printable_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsPrintableBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_printable is invalid. Received: ", tag));
                            }
                        case 53:
                            if ("layout/include_case_details_reason_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsReasonBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_reason is invalid. Received: ", tag));
                            }
                        case 54:
                            if ("layout/include_case_details_rectificationbutton_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsRectificationbuttonBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_rectificationbutton is invalid. Received: ", tag));
                            }
                        case 55:
                            if ("layout/include_case_details_sentdate_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsSentdateBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_sentdate is invalid. Received: ", tag));
                            }
                        case 56:
                            if ("layout/include_case_details_state_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsStateBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_state is invalid. Received: ", tag));
                            }
                        case 57:
                            if ("layout/include_case_details_studenteducationid_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsStudenteducationidBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_studenteducationid is invalid. Received: ", tag));
                            }
                        case 58:
                            if ("layout/include_case_details_studentname_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsStudentnameBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_studentname is invalid. Received: ", tag));
                            }
                        case 59:
                            if ("layout/include_case_details_tmgi_justificationtype_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsTmgiJustificationtypeBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_tmgi_justificationtype is invalid. Received: ", tag));
                            }
                        case 60:
                            if ("layout/include_case_details_tmgi_requestedabsenceinterval_0".equals(tag)) {
                                viewDataBinding = new IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_tmgi_requestedabsenceinterval is invalid. Received: ", tag));
                            }
                        case 61:
                            if ("layout/include_proven_absence_0".equals(tag)) {
                                viewDataBinding = new IncludeProvenAbsenceBindingImpl(fVar, new View[]{view});
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for include_proven_absence is invalid. Received: ", tag));
                            }
                        case 62:
                            if ("layout/message_item_0".equals(tag)) {
                                viewDataBinding = new MessageItemBindingImpl(fVar, view);
                                break;
                            } else {
                                throw new IllegalArgumentException(C0082a.m101a("The tag for message_item is invalid. Received: ", tag));
                            }
                    }
                    return viewDataBinding;
                }
            } else {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    /* renamed from: a */
    public ViewDataBinding mo10524a(C3702f fVar, View[] viewArr, int i) {
        if (!(viewArr == null || viewArr.length == 0)) {
            int i2 = f11003a.get(i);
            if (i2 > 0) {
                Object tag = viewArr[0].getTag();
                if (tag != null) {
                    switch (i2) {
                        case 43:
                            if ("layout/include_case_decision_add_attachment_0".equals(tag)) {
                                return new IncludeCaseDecisionAddAttachmentBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_add_attachment is invalid. Received: ", tag));
                        case 44:
                            if ("layout/include_case_decision_adjudication_0".equals(tag)) {
                                return new IncludeCaseDecisionAdjudicationBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_adjudication is invalid. Received: ", tag));
                        case 45:
                            if ("layout/include_case_decision_date_0".equals(tag)) {
                                return new IncludeCaseDecisionDateBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_date is invalid. Received: ", tag));
                        case 46:
                            if ("layout/include_case_decision_signer_0".equals(tag)) {
                                return new IncludeCaseDecisionSignerBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_signer is invalid. Received: ", tag));
                        case 47:
                            if ("layout/include_case_decision_type_0".equals(tag)) {
                                return new IncludeCaseDecisionTypeBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_decision_type is invalid. Received: ", tag));
                        case 48:
                            if ("layout/include_case_details_administratorname_0".equals(tag)) {
                                return new IncludeCaseDetailsAdministratornameBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_administratorname is invalid. Received: ", tag));
                        case 51:
                            if ("layout/include_case_details_name_0".equals(tag)) {
                                return new IncludeCaseDetailsNameBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_name is invalid. Received: ", tag));
                        case 52:
                            if ("layout/include_case_details_printable_0".equals(tag)) {
                                return new IncludeCaseDetailsPrintableBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_printable is invalid. Received: ", tag));
                        case 53:
                            if ("layout/include_case_details_reason_0".equals(tag)) {
                                return new IncludeCaseDetailsReasonBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_reason is invalid. Received: ", tag));
                        case 54:
                            if ("layout/include_case_details_rectificationbutton_0".equals(tag)) {
                                return new IncludeCaseDetailsRectificationbuttonBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_rectificationbutton is invalid. Received: ", tag));
                        case 55:
                            if ("layout/include_case_details_sentdate_0".equals(tag)) {
                                return new IncludeCaseDetailsSentdateBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_sentdate is invalid. Received: ", tag));
                        case 56:
                            if ("layout/include_case_details_state_0".equals(tag)) {
                                return new IncludeCaseDetailsStateBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_state is invalid. Received: ", tag));
                        case 57:
                            if ("layout/include_case_details_studenteducationid_0".equals(tag)) {
                                return new IncludeCaseDetailsStudenteducationidBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_studenteducationid is invalid. Received: ", tag));
                        case 58:
                            if ("layout/include_case_details_studentname_0".equals(tag)) {
                                return new IncludeCaseDetailsStudentnameBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_studentname is invalid. Received: ", tag));
                        case 59:
                            if ("layout/include_case_details_tmgi_justificationtype_0".equals(tag)) {
                                return new IncludeCaseDetailsTmgiJustificationtypeBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_tmgi_justificationtype is invalid. Received: ", tag));
                        case 60:
                            if ("layout/include_case_details_tmgi_requestedabsenceinterval_0".equals(tag)) {
                                return new IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_case_details_tmgi_requestedabsenceinterval is invalid. Received: ", tag));
                        case 61:
                            if ("layout/include_proven_absence_0".equals(tag)) {
                                return new IncludeProvenAbsenceBindingImpl(fVar, viewArr);
                            }
                            throw new IllegalArgumentException(C0082a.m101a("The tag for include_proven_absence is invalid. Received: ", tag));
                    }
                } else {
                    throw new RuntimeException("view must have a tag");
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C3700d> mo10525a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C3722a());
        return arrayList;
    }
}
