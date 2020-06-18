package hu.ekreta.ellenorzo.cases.decision;

import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020)H&J\b\u0010-\u001a\u00020)H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00128gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "actionBarTitle", "", "getActionBarTitle", "()Ljava/lang/String;", "adjudication", "getAdjudication", "caseDetailParameter", "Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "getCaseDetailParameter", "()Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "setCaseDetailParameter", "(Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;)V", "decisionDate", "getDecisionDate", "decisionNeedsToBeSend", "", "getDecisionNeedsToBeSend", "()Z", "decisionType", "getDecisionType", "documentNumber", "getDocumentNumber", "justification", "getJustification", "longName", "getLongName", "printableDocument", "getPrintableDocument", "provenAbsenceDate", "getProvenAbsenceDate", "signer", "getSigner", "temporaryAttachments", "", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryAttachments", "()Ljava/util/List;", "addAttachment", "", "onDelete", "item", "send", "viewPrintableDocument", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModel.kt */
public interface DecisionDetailViewModel extends DataBindingListViewModel<Attachment> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: DecisionDetailViewModel.kt */
    public static final class DefaultImpls {
    }

    void U();

    String W();

    String Y();

    String Z();

    void a(CaseDetailParameter caseDetailParameter);

    void b(Attachment attachment);

    String d0();

    String e0();

    String f0();

    String i();

    void k();

    String m0();

    String o();

    String r();

    boolean w0();

    void x();
}
