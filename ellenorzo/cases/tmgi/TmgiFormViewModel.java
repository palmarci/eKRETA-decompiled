package p289hu.ekreta.ellenorzo.cases.tmgi;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p211h.p258l.C3709k;
import p211h.p258l.C3710l;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010N\u001a\u00020OH&J\b\u0010P\u001a\u00020OH&J\b\u0010Q\u001a\u00020OH&J\u0010\u0010R\u001a\u00020O2\u0006\u0010S\u001a\u00020\fH&J\u0010\u0010T\u001a\u00020O2\u0006\u0010U\u001a\u00020\u001cH\u0016J\u0010\u0010V\u001a\u00020O2\u0006\u0010U\u001a\u00020\u001cH\u0016J\b\u0010W\u001a\u00020OH&J\b\u0010X\u001a\u00020OH&J\b\u0010Y\u001a\u00020OH&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8gX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0012\u0010'\u001a\u00020(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u001a\u0010-\u001a\u00020\f8gX¦\u000e¢\u0006\f\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u0014\u00100\u001a\u0004\u0018\u000101X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R \u00104\u001a\b\u0012\u0004\u0012\u000206058gX¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\f8gX¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R\u0014\u0010>\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u000eR\u0014\u0010B\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u000eR\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020J0EX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010HR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001b058gX¦\u0004¢\u0006\u0006\u001a\u0004\bM\u00108¨\u0006Z"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "addMandatoryDocumentSectionEnabled", "", "getAddMandatoryDocumentSectionEnabled", "()Z", "caseType", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "caseTypeText", "", "getCaseTypeText", "()Ljava/lang/String;", "setCaseTypeText", "(Ljava/lang/String;)V", "childrenDataToUpload", "Lhu/ekreta/ellenorzo/cases/subModels/Children;", "getChildrenDataToUpload", "()Lhu/ekreta/ellenorzo/cases/subModels/Children;", "setChildrenDataToUpload", "(Lhu/ekreta/ellenorzo/cases/subModels/Children;)V", "endDate", "getEndDate", "mandatoryAttachments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getMandatoryAttachments", "()Landroidx/lifecycle/LiveData;", "mandatoryDocumentIsAdded", "getMandatoryDocumentIsAdded", "setMandatoryDocumentIsAdded", "(Z)V", "optionalAttachments", "getOptionalAttachments", "optionalDocumentIsAdded", "getOptionalDocumentIsAdded", "otherDocumentSectionTitle", "Landroidx/databinding/ObservableInt;", "getOtherDocumentSectionTitle", "()Landroidx/databinding/ObservableInt;", "progressVisible", "getProgressVisible", "reasonText", "getReasonText", "setReasonText", "selectedMandatoryDocumentTypeId", "", "getSelectedMandatoryDocumentTypeId", "()Ljava/lang/Integer;", "selectedTmgiType", "Landroidx/databinding/ObservableField;", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "getSelectedTmgiType", "()Landroidx/databinding/ObservableField;", "setSelectedTmgiType", "(Landroidx/databinding/ObservableField;)V", "selectedTmgiTypeName", "getSelectedTmgiTypeName", "setSelectedTmgiTypeName", "sendButtonEnabled", "getSendButtonEnabled", "startDate", "getStartDate", "subtitle", "getSubtitle", "temporaryMandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "getTemporaryMandatoryDocuments", "()Ljava/util/List;", "temporaryOptionalAttachmens", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryOptionalAttachmens", "tmgiCaseTypes", "getTmgiCaseTypes", "addNewMandatoryAttachment", "", "addNewOptionalAttachment", "cancel", "onCaseTypeNameChanged", "newValue", "onDelete", "item", "onSelect", "selectEndDate", "selectStartDate", "send", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel */
/* compiled from: TmgiFormViewModel.kt */
public interface TmgiFormViewModel extends UiCommandSource, C3705i {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel$DefaultImpls */
    /* compiled from: TmgiFormViewModel.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: A1 */
    String mo12138A1();

    /* renamed from: C0 */
    void mo12139C0();

    /* renamed from: E0 */
    String mo12140E0();

    /* renamed from: G1 */
    boolean mo12141G1();

    /* renamed from: I1 */
    String mo12142I1();

    /* renamed from: J1 */
    void mo12143J1();

    /* renamed from: K1 */
    C3709k<List<TmgiCaseType>> mo12144K1();

    /* renamed from: O0 */
    boolean mo12145O0();

    /* renamed from: Y0 */
    void mo12146Y0();

    /* renamed from: a */
    void mo12147a(Attachment attachment);

    /* renamed from: b */
    void mo12148b(Attachment attachment);

    void cancel();

    /* renamed from: d */
    boolean mo12150d();

    /* renamed from: d1 */
    String mo12151d1();

    /* renamed from: e1 */
    String mo12152e1();

    /* renamed from: f1 */
    boolean mo12153f1();

    /* renamed from: g */
    void mo12154g(String str);

    LiveData<List<Attachment>> getMandatoryAttachments();

    LiveData<List<Attachment>> getOptionalAttachments();

    /* renamed from: i */
    void mo12157i(String str);

    /* renamed from: j1 */
    boolean mo12158j1();

    /* renamed from: k1 */
    C3709k<TmgiCaseType> mo12159k1();

    /* renamed from: m */
    void mo12160m(String str);

    /* renamed from: x */
    void mo12161x();

    /* renamed from: y0 */
    C3710l mo12162y0();

    /* renamed from: z0 */
    void mo12163z0();
}
