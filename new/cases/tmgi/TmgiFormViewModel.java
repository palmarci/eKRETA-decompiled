package hu.ekreta.ellenorzo.cases.tmgi;

import androidx.lifecycle.LiveData;
import h.l.i;
import h.l.k;
import h.l.l;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010R\u001a\u00020SH&J\b\u0010T\u001a\u00020SH&J\b\u0010U\u001a\u00020SH&J\u0010\u0010V\u001a\u00020S2\u0006\u0010W\u001a\u00020\u000eH&J\u0010\u0010X\u001a\u00020S2\u0006\u0010Y\u001a\u00020\u001fH\u0016J\u0010\u0010Z\u001a\u00020S2\u0006\u0010Y\u001a\u00020\u001fH\u0016J\b\u0010[\u001a\u00020SH&J\b\u0010\\\u001a\u00020SH&J\b\u0010]\u001a\u00020SH&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0006R\u0012\u0010*\u001a\u00020+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0006R\u001a\u00100\u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012R\u0014\u00103\u001a\u0004\u0018\u000104X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R \u00107\u001a\b\u0012\u0004\u0012\u000209088gX¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\b?\u0010\u0010\"\u0004\b@\u0010\u0012R\u0014\u0010A\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u001a\u0010C\u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0010\"\u0004\bE\u0010\u0012R\u0014\u0010F\u001a\u00020\u000e8gX¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0010R\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020N0IX¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010LR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u001e088gX¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010;¨\u0006^"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "addMandatoryDocumentSectionEnabled", "", "getAddMandatoryDocumentSectionEnabled", "()Z", "caseType", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "setCaseType", "(Lhu/ekreta/ellenorzo/cases/subModels/CaseType;)V", "caseTypeText", "", "getCaseTypeText", "()Ljava/lang/String;", "setCaseTypeText", "(Ljava/lang/String;)V", "childrenDataToUpload", "Lhu/ekreta/ellenorzo/cases/subModels/Children;", "getChildrenDataToUpload", "()Lhu/ekreta/ellenorzo/cases/subModels/Children;", "setChildrenDataToUpload", "(Lhu/ekreta/ellenorzo/cases/subModels/Children;)V", "endDate", "getEndDate", "setEndDate", "mandatoryAttachments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getMandatoryAttachments", "()Landroidx/lifecycle/LiveData;", "mandatoryDocumentIsAdded", "getMandatoryDocumentIsAdded", "setMandatoryDocumentIsAdded", "(Z)V", "optionalAttachments", "getOptionalAttachments", "optionalDocumentIsAdded", "getOptionalDocumentIsAdded", "otherDocumentSectionTitle", "Landroidx/databinding/ObservableInt;", "getOtherDocumentSectionTitle", "()Landroidx/databinding/ObservableInt;", "progressVisible", "getProgressVisible", "reasonText", "getReasonText", "setReasonText", "selectedMandatoryDocumentTypeId", "", "getSelectedMandatoryDocumentTypeId", "()Ljava/lang/Integer;", "selectedTmgiType", "Landroidx/databinding/ObservableField;", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "getSelectedTmgiType", "()Landroidx/databinding/ObservableField;", "setSelectedTmgiType", "(Landroidx/databinding/ObservableField;)V", "selectedTmgiTypeName", "getSelectedTmgiTypeName", "setSelectedTmgiTypeName", "sendButtonEnabled", "getSendButtonEnabled", "startDate", "getStartDate", "setStartDate", "subtitle", "getSubtitle", "temporaryMandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "getTemporaryMandatoryDocuments", "()Ljava/util/List;", "temporaryOptionalAttachments", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryOptionalAttachments", "tmgiCaseTypes", "getTmgiCaseTypes", "addNewMandatoryAttachment", "", "addNewOptionalAttachment", "cancel", "onCaseTypeNameChanged", "newValue", "onDelete", "item", "onSelect", "selectEndDate", "selectStartDate", "send", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModel.kt */
public interface TmgiFormViewModel extends UiCommandSource, i {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: TmgiFormViewModel.kt */
    public static final class DefaultImpls {
    }

    void C0();

    String E0();

    String I1();

    boolean P1();

    boolean R0();

    String R1();

    void S1();

    k<List<TmgiCaseType>> T1();

    void a(Attachment attachment);

    void b(Attachment attachment);

    void c1();

    void cancel();

    boolean d();

    void g(String str);

    LiveData<List<Attachment>> getMandatoryAttachments();

    LiveData<List<Attachment>> getOptionalAttachments();

    void i(String str);

    String j1();

    String k1();

    void m(String str);

    boolean m1();

    boolean p1();

    k<TmgiCaseType> q1();

    void x();

    l y0();

    void z0();
}
