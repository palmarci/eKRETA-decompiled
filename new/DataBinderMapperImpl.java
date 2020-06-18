package hu.ekreta.ellenorzo;

import a.b.a.a.a;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import h.l.d;
import h.l.f;
import hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityAnnouncedTestDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityClassMasterBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityDailyOmissionsBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityEvaluationDetailsBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityMainBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityNotSupportedAppBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityNoteDetailsBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityNoticeboardItemDetailsBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityOmissionDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityProfileBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityRootedDeviceDetectedBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivitySettingsBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBindingImpl;
import hu.ekreta.ellenorzo.databinding.ActivityTmgiFormBindingImpl;
import hu.ekreta.ellenorzo.databinding.DashboardItemBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentAboutBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentAveragesBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentCasesBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentClassMastersBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentEndOfYearBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentHalfYearBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentHomeBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentMessagesBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentNotesBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentNoticeboardBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentOmissionPerDayBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentQuarterlyBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentRemindersBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentSubjectsBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentTimetableBindingImpl;
import hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl;
import hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBindingImpl;
import hu.ekreta.ellenorzo.databinding.MessageItemBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f4965a = new SparseIntArray(63);

    public static class InnerBrLookup {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f4966a = new SparseArray<>(119);

        static {
            f4966a.put(0, "_all");
            f4966a.put(1, "reason");
            f4966a.put(2, "appVersion");
            f4966a.put(3, "listViewVisible");
            f4966a.put(4, "onFocusChangeListener");
            f4966a.put(5, "endDate");
            f4966a.put(6, "announcedTestButtonVisible");
            f4966a.put(7, "homeworkCommentEnabled");
            f4966a.put(8, "type");
            f4966a.put(9, "birthName");
            f4966a.put(10, "homeworkButtonVisible");
            f4966a.put(11, "requestedAbsenceInterval");
            f4966a.put(12, "password");
            f4966a.put(13, "seenByTutelaryUTC");
            f4966a.put(14, "text");
            f4966a.put(15, "state");
            f4966a.put(16, "addresseeTypes");
            f4966a.put(17, "signer");
            f4966a.put(18, "messageText");
            f4966a.put(19, "classSelectorIsVisible");
            f4966a.put(20, "administratorName");
            f4966a.put(21, "classroom");
            f4966a.put(22, "optionalDocumentIsAdded");
            f4966a.put(23, "caseTypeText");
            f4966a.put(24, "studentName");
            f4966a.put(25, "subtitle");
            f4966a.put(26, "mothersName");
            f4966a.put(27, "decisionButtonText");
            f4966a.put(28, "smsEnabled");
            f4966a.put(29, "printableDocument");
            f4966a.put(30, "grantType");
            f4966a.put(31, "classScheduleNumber");
            f4966a.put(32, "startDate");
            f4966a.put(33, "lessonTimeFormatted");
            f4966a.put(34, "attachments");
            f4966a.put(35, "institutePickerButtonText");
            f4966a.put(36, "typeName");
            f4966a.put(37, "progressVisible");
            f4966a.put(38, "activeProfileName");
            f4966a.put(39, "commentText");
            f4966a.put(40, "selectedTmgiType");
            f4966a.put(41, "instituteName");
            f4966a.put(42, "rectificationButtonText");
            f4966a.put(43, "birthPlace");
            f4966a.put(44, "searchText");
            f4966a.put(45, "sentDate");
            f4966a.put(46, "dayOfWeek");
            f4966a.put(47, "mandatoryDocuments");
            f4966a.put(48, "creatingTime");
            f4966a.put(49, "mandatoryDocumentName");
            f4966a.put(50, "decisionButtonVisible");
            f4966a.put(51, "theme");
            f4966a.put(52, "loginEnabled");
            f4966a.put(53, "sendButtonEnabled");
            f4966a.put(54, "deadline");
            f4966a.put(55, "createDate");
            f4966a.put(56, "address");
            f4966a.put(57, "callEnabled");
            f4966a.put(58, "userId");
            f4966a.put(59, "decisionType");
            f4966a.put(60, "midYear");
            f4966a.put(61, "activeProfileRole");
            f4966a.put(62, "announcedAt");
            f4966a.put(63, "longName");
            f4966a.put(64, "date");
            f4966a.put(65, "emptyViewVisible");
            f4966a.put(66, "justificationType");
            f4966a.put(67, "onClick");
            f4966a.put(68, "studentShortName");
            f4966a.put(69, "reasonText");
            f4966a.put(70, "subject");
            f4966a.put(71, "documentNumber");
            f4966a.put(72, "mandatoryDocumentIsAdded");
            f4966a.put(73, "selectedTmgiTypeName");
            f4966a.put(74, "savePassword");
            f4966a.put(75, "mode");
            f4966a.put(76, "searchTerm");
            f4966a.put(77, "justificationStateName");
            f4966a.put(78, "decisionNeedsToBeSend");
            f4966a.put(79, "group");
            f4966a.put(80, "provenAbsenceDate");
            f4966a.put(81, "studentHomeworkEnabled");
            f4966a.put(82, "emailEnabled");
            f4966a.put(83, "weight");
            f4966a.put(84, "studentEducationId");
            f4966a.put(85, "tmgiCaseTypes");
            f4966a.put(86, "homeworkDone");
            f4966a.put(87, "name");
            f4966a.put(88, "viewModel");
            f4966a.put(89, "topic");
            f4966a.put(90, "addNewHomeworkButtonVisible");
            f4966a.put(91, "modeName");
            f4966a.put(92, "classes");
            f4966a.put(93, "description");
            f4966a.put(94, "addMandatoryDocumentSectionEnabled");
            f4966a.put(95, "addNevAddresseeIsVisible");
            f4966a.put(96, "commentButtonVisibility");
            f4966a.put(97, "title");
            f4966a.put(98, "content");
            f4966a.put(99, "adjudication");
            f4966a.put(100, "rectificationButtonVisible");
            f4966a.put(101, "teacher");
            f4966a.put(102, "messageSpanned");
            f4966a.put(103, "justification");
            f4966a.put(104, "value");
            f4966a.put(105, "passwordShowable");
            f4966a.put(106, "messageSubject");
            f4966a.put(107, "homeworkDoneEditable");
            f4966a.put(108, "fullName");
            f4966a.put(109, "message");
            f4966a.put(110, "birthDate");
            f4966a.put(111, "addresseeNames");
            f4966a.put(112, "decisionDate");
            f4966a.put(113, "messageSenderNameAndType");
            f4966a.put(114, "form");
            f4966a.put(115, "addresseesIsEmpty");
            f4966a.put(116, "themeCaptionText");
            f4966a.put(117, "homeworkDoneText");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f4967a = new HashMap<>(63);

        static {
            f4967a.put("layout/activity_addressee_selector_0", Integer.valueOf(R.layout.activity_addressee_selector));
            f4967a.put("layout/activity_announced_test_detail_0", Integer.valueOf(R.layout.activity_announced_test_detail));
            f4967a.put("layout/activity_case_details_0", Integer.valueOf(R.layout.activity_case_details));
            f4967a.put("layout/activity_case_details_tmgi_0", Integer.valueOf(R.layout.activity_case_details_tmgi));
            f4967a.put("layout/activity_class_master_0", Integer.valueOf(R.layout.activity_class_master));
            f4967a.put("layout/activity_daily_omissions_0", Integer.valueOf(R.layout.activity_daily_omissions));
            f4967a.put("layout/activity_decision_detail_0", Integer.valueOf(R.layout.activity_decision_detail));
            f4967a.put("layout/activity_evaluation_details_0", Integer.valueOf(R.layout.activity_evaluation_details));
            f4967a.put("layout/activity_homework_comment_0", Integer.valueOf(R.layout.activity_homework_comment));
            f4967a.put("layout/activity_homework_detail_0", Integer.valueOf(R.layout.activity_homework_detail));
            f4967a.put("layout/activity_insitute_picker_0", Integer.valueOf(R.layout.activity_insitute_picker));
            f4967a.put("layout/activity_lesson_detail_0", Integer.valueOf(R.layout.activity_lesson_detail));
            f4967a.put("layout/activity_login_0", Integer.valueOf(R.layout.activity_login));
            f4967a.put("layout/activity_main_0", Integer.valueOf(R.layout.activity_main));
            f4967a.put("layout/activity_message_detail_0", Integer.valueOf(R.layout.activity_message_detail));
            f4967a.put("layout/activity_new_message_0", Integer.valueOf(R.layout.activity_new_message));
            f4967a.put("layout/activity_not_supported_app_0", Integer.valueOf(R.layout.activity_not_supported_app));
            f4967a.put("layout/activity_note_details_0", Integer.valueOf(R.layout.activity_note_details));
            f4967a.put("layout/activity_noticeboard_item_details_0", Integer.valueOf(R.layout.activity_noticeboard_item_details));
            f4967a.put("layout/activity_omission_detail_0", Integer.valueOf(R.layout.activity_omission_detail));
            f4967a.put("layout/activity_profile_0", Integer.valueOf(R.layout.activity_profile));
            f4967a.put("layout/activity_profile_detail_0", Integer.valueOf(R.layout.activity_profile_detail));
            f4967a.put("layout/activity_rooted_device_detected_0", Integer.valueOf(R.layout.activity_rooted_device_detected));
            f4967a.put("layout/activity_settings_0", Integer.valueOf(R.layout.activity_settings));
            f4967a.put("layout/activity_subject_detail_0", Integer.valueOf(R.layout.activity_subject_detail));
            f4967a.put("layout/activity_tmgi_form_0", Integer.valueOf(R.layout.activity_tmgi_form));
            f4967a.put("layout/dashboard_item_0", Integer.valueOf(R.layout.dashboard_item));
            f4967a.put("layout/fragment_about_0", Integer.valueOf(R.layout.fragment_about));
            f4967a.put("layout/fragment_averages_0", Integer.valueOf(R.layout.fragment_averages));
            f4967a.put("layout/fragment_cases_0", Integer.valueOf(R.layout.fragment_cases));
            f4967a.put("layout/fragment_class_masters_0", Integer.valueOf(R.layout.fragment_class_masters));
            f4967a.put("layout/fragment_end_of_year_0", Integer.valueOf(R.layout.fragment_end_of_year));
            f4967a.put("layout/fragment_half_year_0", Integer.valueOf(R.layout.fragment_half_year));
            f4967a.put("layout/fragment_home_0", Integer.valueOf(R.layout.fragment_home));
            f4967a.put("layout/fragment_messages_0", Integer.valueOf(R.layout.fragment_messages));
            f4967a.put("layout/fragment_notes_0", Integer.valueOf(R.layout.fragment_notes));
            f4967a.put("layout/fragment_noticeboard_0", Integer.valueOf(R.layout.fragment_noticeboard));
            f4967a.put("layout/fragment_omission_per_day_0", Integer.valueOf(R.layout.fragment_omission_per_day));
            f4967a.put("layout/fragment_quarterly_0", Integer.valueOf(R.layout.fragment_quarterly));
            f4967a.put("layout/fragment_reminders_0", Integer.valueOf(R.layout.fragment_reminders));
            f4967a.put("layout/fragment_subjects_0", Integer.valueOf(R.layout.fragment_subjects));
            f4967a.put("layout/fragment_timetable_0", Integer.valueOf(R.layout.fragment_timetable));
            f4967a.put("layout/fragment_tmgi_form_0", Integer.valueOf(R.layout.fragment_tmgi_form));
            f4967a.put("layout/include_case_decision_add_attachment_0", Integer.valueOf(R.layout.include_case_decision_add_attachment));
            f4967a.put("layout/include_case_decision_adjudication_0", Integer.valueOf(R.layout.include_case_decision_adjudication));
            f4967a.put("layout/include_case_decision_date_0", Integer.valueOf(R.layout.include_case_decision_date));
            f4967a.put("layout/include_case_decision_signer_0", Integer.valueOf(R.layout.include_case_decision_signer));
            f4967a.put("layout/include_case_decision_type_0", Integer.valueOf(R.layout.include_case_decision_type));
            f4967a.put("layout/include_case_details_administratorname_0", Integer.valueOf(R.layout.include_case_details_administratorname));
            f4967a.put("layout/include_case_details_attachments_0", Integer.valueOf(R.layout.include_case_details_attachments));
            f4967a.put("layout/include_case_details_mandatorydocuments_0", Integer.valueOf(R.layout.include_case_details_mandatorydocuments));
            f4967a.put("layout/include_case_details_name_0", Integer.valueOf(R.layout.include_case_details_name));
            f4967a.put("layout/include_case_details_printable_0", Integer.valueOf(R.layout.include_case_details_printable));
            f4967a.put("layout/include_case_details_reason_0", Integer.valueOf(R.layout.include_case_details_reason));
            f4967a.put("layout/include_case_details_rectificationbutton_0", Integer.valueOf(R.layout.include_case_details_rectificationbutton));
            f4967a.put("layout/include_case_details_sentdate_0", Integer.valueOf(R.layout.include_case_details_sentdate));
            f4967a.put("layout/include_case_details_state_0", Integer.valueOf(R.layout.include_case_details_state));
            f4967a.put("layout/include_case_details_studenteducationid_0", Integer.valueOf(R.layout.include_case_details_studenteducationid));
            f4967a.put("layout/include_case_details_studentname_0", Integer.valueOf(R.layout.include_case_details_studentname));
            f4967a.put("layout/include_case_details_tmgi_justificationtype_0", Integer.valueOf(R.layout.include_case_details_tmgi_justificationtype));
            f4967a.put("layout/include_case_details_tmgi_requestedabsenceinterval_0", Integer.valueOf(R.layout.include_case_details_tmgi_requestedabsenceinterval));
            f4967a.put("layout/include_proven_absence_0", Integer.valueOf(R.layout.include_proven_absence));
            f4967a.put("layout/message_item_0", Integer.valueOf(R.layout.message_item));
        }
    }

    static {
        f4965a.put(R.layout.activity_addressee_selector, 1);
        f4965a.put(R.layout.activity_announced_test_detail, 2);
        f4965a.put(R.layout.activity_case_details, 3);
        f4965a.put(R.layout.activity_case_details_tmgi, 4);
        f4965a.put(R.layout.activity_class_master, 5);
        f4965a.put(R.layout.activity_daily_omissions, 6);
        f4965a.put(R.layout.activity_decision_detail, 7);
        f4965a.put(R.layout.activity_evaluation_details, 8);
        f4965a.put(R.layout.activity_homework_comment, 9);
        f4965a.put(R.layout.activity_homework_detail, 10);
        f4965a.put(R.layout.activity_insitute_picker, 11);
        f4965a.put(R.layout.activity_lesson_detail, 12);
        f4965a.put(R.layout.activity_login, 13);
        f4965a.put(R.layout.activity_main, 14);
        f4965a.put(R.layout.activity_message_detail, 15);
        f4965a.put(R.layout.activity_new_message, 16);
        f4965a.put(R.layout.activity_not_supported_app, 17);
        f4965a.put(R.layout.activity_note_details, 18);
        f4965a.put(R.layout.activity_noticeboard_item_details, 19);
        f4965a.put(R.layout.activity_omission_detail, 20);
        f4965a.put(R.layout.activity_profile, 21);
        f4965a.put(R.layout.activity_profile_detail, 22);
        f4965a.put(R.layout.activity_rooted_device_detected, 23);
        f4965a.put(R.layout.activity_settings, 24);
        f4965a.put(R.layout.activity_subject_detail, 25);
        f4965a.put(R.layout.activity_tmgi_form, 26);
        f4965a.put(R.layout.dashboard_item, 27);
        f4965a.put(R.layout.fragment_about, 28);
        f4965a.put(R.layout.fragment_averages, 29);
        f4965a.put(R.layout.fragment_cases, 30);
        f4965a.put(R.layout.fragment_class_masters, 31);
        f4965a.put(R.layout.fragment_end_of_year, 32);
        f4965a.put(R.layout.fragment_half_year, 33);
        f4965a.put(R.layout.fragment_home, 34);
        f4965a.put(R.layout.fragment_messages, 35);
        f4965a.put(R.layout.fragment_notes, 36);
        f4965a.put(R.layout.fragment_noticeboard, 37);
        f4965a.put(R.layout.fragment_omission_per_day, 38);
        f4965a.put(R.layout.fragment_quarterly, 39);
        f4965a.put(R.layout.fragment_reminders, 40);
        f4965a.put(R.layout.fragment_subjects, 41);
        f4965a.put(R.layout.fragment_timetable, 42);
        f4965a.put(R.layout.fragment_tmgi_form, 43);
        f4965a.put(R.layout.include_case_decision_add_attachment, 44);
        f4965a.put(R.layout.include_case_decision_adjudication, 45);
        f4965a.put(R.layout.include_case_decision_date, 46);
        f4965a.put(R.layout.include_case_decision_signer, 47);
        f4965a.put(R.layout.include_case_decision_type, 48);
        f4965a.put(R.layout.include_case_details_administratorname, 49);
        f4965a.put(R.layout.include_case_details_attachments, 50);
        f4965a.put(R.layout.include_case_details_mandatorydocuments, 51);
        f4965a.put(R.layout.include_case_details_name, 52);
        f4965a.put(R.layout.include_case_details_printable, 53);
        f4965a.put(R.layout.include_case_details_reason, 54);
        f4965a.put(R.layout.include_case_details_rectificationbutton, 55);
        f4965a.put(R.layout.include_case_details_sentdate, 56);
        f4965a.put(R.layout.include_case_details_state, 57);
        f4965a.put(R.layout.include_case_details_studenteducationid, 58);
        f4965a.put(R.layout.include_case_details_studentname, 59);
        f4965a.put(R.layout.include_case_details_tmgi_justificationtype, 60);
        f4965a.put(R.layout.include_case_details_tmgi_requestedabsenceinterval, 61);
        f4965a.put(R.layout.include_proven_absence, 62);
        f4965a.put(R.layout.message_item, 63);
    }

    public ViewDataBinding a(f fVar, View view, int i2) {
        int i3 = f4965a.get(i2);
        if (i3 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i4 = (i3 - 1) / 50;
                if (i4 == 0) {
                    switch (i3) {
                        case 1:
                            if ("layout/activity_addressee_selector_0".equals(tag)) {
                                return new ActivityAddresseeSelectorBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_addressee_selector is invalid. Received: ", tag));
                        case 2:
                            if ("layout/activity_announced_test_detail_0".equals(tag)) {
                                return new ActivityAnnouncedTestDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_announced_test_detail is invalid. Received: ", tag));
                        case 3:
                            if ("layout/activity_case_details_0".equals(tag)) {
                                return new ActivityCaseDetailsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_case_details is invalid. Received: ", tag));
                        case 4:
                            if ("layout/activity_case_details_tmgi_0".equals(tag)) {
                                return new ActivityCaseDetailsTmgiBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_case_details_tmgi is invalid. Received: ", tag));
                        case 5:
                            if ("layout/activity_class_master_0".equals(tag)) {
                                return new ActivityClassMasterBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_class_master is invalid. Received: ", tag));
                        case 6:
                            if ("layout/activity_daily_omissions_0".equals(tag)) {
                                return new ActivityDailyOmissionsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_daily_omissions is invalid. Received: ", tag));
                        case 7:
                            if ("layout/activity_decision_detail_0".equals(tag)) {
                                return new ActivityDecisionDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_decision_detail is invalid. Received: ", tag));
                        case 8:
                            if ("layout/activity_evaluation_details_0".equals(tag)) {
                                return new ActivityEvaluationDetailsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_evaluation_details is invalid. Received: ", tag));
                        case 9:
                            if ("layout/activity_homework_comment_0".equals(tag)) {
                                return new ActivityHomeworkCommentBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_homework_comment is invalid. Received: ", tag));
                        case 10:
                            if ("layout/activity_homework_detail_0".equals(tag)) {
                                return new ActivityHomeworkDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_homework_detail is invalid. Received: ", tag));
                        case 11:
                            if ("layout/activity_insitute_picker_0".equals(tag)) {
                                return new ActivityInsitutePickerBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_insitute_picker is invalid. Received: ", tag));
                        case 12:
                            if ("layout/activity_lesson_detail_0".equals(tag)) {
                                return new ActivityLessonDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_lesson_detail is invalid. Received: ", tag));
                        case 13:
                            if ("layout/activity_login_0".equals(tag)) {
                                return new ActivityLoginBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_login is invalid. Received: ", tag));
                        case 14:
                            if ("layout/activity_main_0".equals(tag)) {
                                return new ActivityMainBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_main is invalid. Received: ", tag));
                        case 15:
                            if ("layout/activity_message_detail_0".equals(tag)) {
                                return new ActivityMessageDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_message_detail is invalid. Received: ", tag));
                        case 16:
                            if ("layout/activity_new_message_0".equals(tag)) {
                                return new ActivityNewMessageBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_new_message is invalid. Received: ", tag));
                        case 17:
                            if ("layout/activity_not_supported_app_0".equals(tag)) {
                                return new ActivityNotSupportedAppBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_not_supported_app is invalid. Received: ", tag));
                        case 18:
                            if ("layout/activity_note_details_0".equals(tag)) {
                                return new ActivityNoteDetailsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_note_details is invalid. Received: ", tag));
                        case 19:
                            if ("layout/activity_noticeboard_item_details_0".equals(tag)) {
                                return new ActivityNoticeboardItemDetailsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_noticeboard_item_details is invalid. Received: ", tag));
                        case 20:
                            if ("layout/activity_omission_detail_0".equals(tag)) {
                                return new ActivityOmissionDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_omission_detail is invalid. Received: ", tag));
                        case 21:
                            if ("layout/activity_profile_0".equals(tag)) {
                                return new ActivityProfileBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_profile is invalid. Received: ", tag));
                        case 22:
                            if ("layout/activity_profile_detail_0".equals(tag)) {
                                return new ActivityProfileDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_profile_detail is invalid. Received: ", tag));
                        case 23:
                            if ("layout/activity_rooted_device_detected_0".equals(tag)) {
                                return new ActivityRootedDeviceDetectedBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_rooted_device_detected is invalid. Received: ", tag));
                        case 24:
                            if ("layout/activity_settings_0".equals(tag)) {
                                return new ActivitySettingsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_settings is invalid. Received: ", tag));
                        case 25:
                            if ("layout/activity_subject_detail_0".equals(tag)) {
                                return new ActivitySubjectDetailBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_subject_detail is invalid. Received: ", tag));
                        case 26:
                            if ("layout/activity_tmgi_form_0".equals(tag)) {
                                return new ActivityTmgiFormBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for activity_tmgi_form is invalid. Received: ", tag));
                        case 27:
                            if ("layout/dashboard_item_0".equals(tag)) {
                                return new DashboardItemBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for dashboard_item is invalid. Received: ", tag));
                        case 28:
                            if ("layout/fragment_about_0".equals(tag)) {
                                return new FragmentAboutBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_about is invalid. Received: ", tag));
                        case 29:
                            if ("layout/fragment_averages_0".equals(tag)) {
                                return new FragmentAveragesBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_averages is invalid. Received: ", tag));
                        case 30:
                            if ("layout/fragment_cases_0".equals(tag)) {
                                return new FragmentCasesBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_cases is invalid. Received: ", tag));
                        case 31:
                            if ("layout/fragment_class_masters_0".equals(tag)) {
                                return new FragmentClassMastersBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_class_masters is invalid. Received: ", tag));
                        case 32:
                            if ("layout/fragment_end_of_year_0".equals(tag)) {
                                return new FragmentEndOfYearBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_end_of_year is invalid. Received: ", tag));
                        case 33:
                            if ("layout/fragment_half_year_0".equals(tag)) {
                                return new FragmentHalfYearBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_half_year is invalid. Received: ", tag));
                        case 34:
                            if ("layout/fragment_home_0".equals(tag)) {
                                return new FragmentHomeBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_home is invalid. Received: ", tag));
                        case 35:
                            if ("layout/fragment_messages_0".equals(tag)) {
                                return new FragmentMessagesBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_messages is invalid. Received: ", tag));
                        case 36:
                            if ("layout/fragment_notes_0".equals(tag)) {
                                return new FragmentNotesBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_notes is invalid. Received: ", tag));
                        case 37:
                            if ("layout/fragment_noticeboard_0".equals(tag)) {
                                return new FragmentNoticeboardBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_noticeboard is invalid. Received: ", tag));
                        case 38:
                            if ("layout/fragment_omission_per_day_0".equals(tag)) {
                                return new FragmentOmissionPerDayBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_omission_per_day is invalid. Received: ", tag));
                        case 39:
                            if ("layout/fragment_quarterly_0".equals(tag)) {
                                return new FragmentQuarterlyBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_quarterly is invalid. Received: ", tag));
                        case 40:
                            if ("layout/fragment_reminders_0".equals(tag)) {
                                return new FragmentRemindersBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_reminders is invalid. Received: ", tag));
                        case 41:
                            if ("layout/fragment_subjects_0".equals(tag)) {
                                return new FragmentSubjectsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_subjects is invalid. Received: ", tag));
                        case 42:
                            if ("layout/fragment_timetable_0".equals(tag)) {
                                return new FragmentTimetableBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_timetable is invalid. Received: ", tag));
                        case 43:
                            if ("layout/fragment_tmgi_form_0".equals(tag)) {
                                return new FragmentTmgiFormBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for fragment_tmgi_form is invalid. Received: ", tag));
                        case 44:
                            if ("layout/include_case_decision_add_attachment_0".equals(tag)) {
                                return new IncludeCaseDecisionAddAttachmentBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_decision_add_attachment is invalid. Received: ", tag));
                        case 45:
                            if ("layout/include_case_decision_adjudication_0".equals(tag)) {
                                return new IncludeCaseDecisionAdjudicationBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_decision_adjudication is invalid. Received: ", tag));
                        case 46:
                            if ("layout/include_case_decision_date_0".equals(tag)) {
                                return new IncludeCaseDecisionDateBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_decision_date is invalid. Received: ", tag));
                        case 47:
                            if ("layout/include_case_decision_signer_0".equals(tag)) {
                                return new IncludeCaseDecisionSignerBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_decision_signer is invalid. Received: ", tag));
                        case 48:
                            if ("layout/include_case_decision_type_0".equals(tag)) {
                                return new IncludeCaseDecisionTypeBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_decision_type is invalid. Received: ", tag));
                        case 49:
                            if ("layout/include_case_details_administratorname_0".equals(tag)) {
                                return new IncludeCaseDetailsAdministratornameBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_administratorname is invalid. Received: ", tag));
                        case 50:
                            if ("layout/include_case_details_attachments_0".equals(tag)) {
                                return new IncludeCaseDetailsAttachmentsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_attachments is invalid. Received: ", tag));
                        default:
                            return null;
                    }
                } else if (i4 == 1) {
                    switch (i3) {
                        case 51:
                            if ("layout/include_case_details_mandatorydocuments_0".equals(tag)) {
                                return new IncludeCaseDetailsMandatorydocumentsBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_mandatorydocuments is invalid. Received: ", tag));
                        case 52:
                            if ("layout/include_case_details_name_0".equals(tag)) {
                                return new IncludeCaseDetailsNameBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_name is invalid. Received: ", tag));
                        case 53:
                            if ("layout/include_case_details_printable_0".equals(tag)) {
                                return new IncludeCaseDetailsPrintableBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_printable is invalid. Received: ", tag));
                        case 54:
                            if ("layout/include_case_details_reason_0".equals(tag)) {
                                return new IncludeCaseDetailsReasonBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_reason is invalid. Received: ", tag));
                        case 55:
                            if ("layout/include_case_details_rectificationbutton_0".equals(tag)) {
                                return new IncludeCaseDetailsRectificationbuttonBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_rectificationbutton is invalid. Received: ", tag));
                        case 56:
                            if ("layout/include_case_details_sentdate_0".equals(tag)) {
                                return new IncludeCaseDetailsSentdateBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_sentdate is invalid. Received: ", tag));
                        case 57:
                            if ("layout/include_case_details_state_0".equals(tag)) {
                                return new IncludeCaseDetailsStateBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_state is invalid. Received: ", tag));
                        case 58:
                            if ("layout/include_case_details_studenteducationid_0".equals(tag)) {
                                return new IncludeCaseDetailsStudenteducationidBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_studenteducationid is invalid. Received: ", tag));
                        case 59:
                            if ("layout/include_case_details_studentname_0".equals(tag)) {
                                return new IncludeCaseDetailsStudentnameBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_studentname is invalid. Received: ", tag));
                        case 60:
                            if ("layout/include_case_details_tmgi_justificationtype_0".equals(tag)) {
                                return new IncludeCaseDetailsTmgiJustificationtypeBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_tmgi_justificationtype is invalid. Received: ", tag));
                        case 61:
                            if ("layout/include_case_details_tmgi_requestedabsenceinterval_0".equals(tag)) {
                                return new IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_case_details_tmgi_requestedabsenceinterval is invalid. Received: ", tag));
                        case 62:
                            if ("layout/include_proven_absence_0".equals(tag)) {
                                return new IncludeProvenAbsenceBindingImpl(fVar, new View[]{view});
                            }
                            throw new IllegalArgumentException(a.a("The tag for include_proven_absence is invalid. Received: ", tag));
                        case 63:
                            if ("layout/message_item_0".equals(tag)) {
                                return new MessageItemBindingImpl(fVar, view);
                            }
                            throw new IllegalArgumentException(a.a("The tag for message_item is invalid. Received: ", tag));
                        default:
                            return null;
                    }
                }
            } else {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    public ViewDataBinding a(f fVar, View[] viewArr, int i2) {
        int i3;
        if (!(viewArr == null || viewArr.length == 0 || (i3 = f4965a.get(i2)) <= 0)) {
            Object tag = viewArr[0].getTag();
            if (tag != null) {
                switch (i3) {
                    case 44:
                        if ("layout/include_case_decision_add_attachment_0".equals(tag)) {
                            return new IncludeCaseDecisionAddAttachmentBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_decision_add_attachment is invalid. Received: ", tag));
                    case 45:
                        if ("layout/include_case_decision_adjudication_0".equals(tag)) {
                            return new IncludeCaseDecisionAdjudicationBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_decision_adjudication is invalid. Received: ", tag));
                    case 46:
                        if ("layout/include_case_decision_date_0".equals(tag)) {
                            return new IncludeCaseDecisionDateBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_decision_date is invalid. Received: ", tag));
                    case 47:
                        if ("layout/include_case_decision_signer_0".equals(tag)) {
                            return new IncludeCaseDecisionSignerBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_decision_signer is invalid. Received: ", tag));
                    case 48:
                        if ("layout/include_case_decision_type_0".equals(tag)) {
                            return new IncludeCaseDecisionTypeBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_decision_type is invalid. Received: ", tag));
                    case 49:
                        if ("layout/include_case_details_administratorname_0".equals(tag)) {
                            return new IncludeCaseDetailsAdministratornameBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_administratorname is invalid. Received: ", tag));
                    case 52:
                        if ("layout/include_case_details_name_0".equals(tag)) {
                            return new IncludeCaseDetailsNameBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_name is invalid. Received: ", tag));
                    case 53:
                        if ("layout/include_case_details_printable_0".equals(tag)) {
                            return new IncludeCaseDetailsPrintableBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_printable is invalid. Received: ", tag));
                    case 54:
                        if ("layout/include_case_details_reason_0".equals(tag)) {
                            return new IncludeCaseDetailsReasonBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_reason is invalid. Received: ", tag));
                    case 55:
                        if ("layout/include_case_details_rectificationbutton_0".equals(tag)) {
                            return new IncludeCaseDetailsRectificationbuttonBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_rectificationbutton is invalid. Received: ", tag));
                    case 56:
                        if ("layout/include_case_details_sentdate_0".equals(tag)) {
                            return new IncludeCaseDetailsSentdateBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_sentdate is invalid. Received: ", tag));
                    case 57:
                        if ("layout/include_case_details_state_0".equals(tag)) {
                            return new IncludeCaseDetailsStateBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_state is invalid. Received: ", tag));
                    case 58:
                        if ("layout/include_case_details_studenteducationid_0".equals(tag)) {
                            return new IncludeCaseDetailsStudenteducationidBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_studenteducationid is invalid. Received: ", tag));
                    case 59:
                        if ("layout/include_case_details_studentname_0".equals(tag)) {
                            return new IncludeCaseDetailsStudentnameBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_studentname is invalid. Received: ", tag));
                    case 60:
                        if ("layout/include_case_details_tmgi_justificationtype_0".equals(tag)) {
                            return new IncludeCaseDetailsTmgiJustificationtypeBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_tmgi_justificationtype is invalid. Received: ", tag));
                    case 61:
                        if ("layout/include_case_details_tmgi_requestedabsenceinterval_0".equals(tag)) {
                            return new IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_case_details_tmgi_requestedabsenceinterval is invalid. Received: ", tag));
                    case 62:
                        if ("layout/include_proven_absence_0".equals(tag)) {
                            return new IncludeProvenAbsenceBindingImpl(fVar, viewArr);
                        }
                        throw new IllegalArgumentException(a.a("The tag for include_proven_absence is invalid. Received: ", tag));
                }
            } else {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    public List<d> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new h.l.p.b.a());
        return arrayList;
    }
}
