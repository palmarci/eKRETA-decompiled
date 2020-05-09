package p289hu.ekreta.ellenorzo.cases.decision;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020)H&J\b\u0010-\u001a\u00020)H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00128gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "actionBarTitle", "", "getActionBarTitle", "()Ljava/lang/String;", "adjudication", "getAdjudication", "caseDetailParameter", "Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "getCaseDetailParameter", "()Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "setCaseDetailParameter", "(Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;)V", "decisionDate", "getDecisionDate", "decisionNeedsToBeSend", "", "getDecisionNeedsToBeSend", "()Z", "decisionType", "getDecisionType", "documentNumber", "getDocumentNumber", "justification", "getJustification", "longName", "getLongName", "printableDocument", "getPrintableDocument", "provenAbsenceDate", "getProvenAbsenceDate", "signer", "getSigner", "temporaryAttachments", "", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryAttachments", "()Ljava/util/List;", "addAttachment", "", "onDelete", "item", "send", "viewPrintableDocument", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel */
/* compiled from: DecisionDetailViewModel.kt */
public interface DecisionDetailViewModel extends DataBindingListViewModel<Attachment> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel$DefaultImpls */
    /* compiled from: DecisionDetailViewModel.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: U */
    void mo11726U();

    /* renamed from: W */
    String mo11727W();

    /* renamed from: Y */
    String mo11728Y();

    /* renamed from: Z */
    String mo11729Z();

    /* renamed from: a */
    void mo11730a(CaseDetailParameter caseDetailParameter);

    /* renamed from: b */
    void mo11731b(Attachment attachment);

    /* renamed from: d0 */
    String mo11732d0();

    /* renamed from: e0 */
    String mo11733e0();

    /* renamed from: f0 */
    String mo11734f0();

    /* renamed from: i */
    String mo11735i();

    /* renamed from: k */
    void mo11736k();

    /* renamed from: m0 */
    String mo11737m0();

    /* renamed from: o */
    String mo11738o();

    /* renamed from: r */
    String mo11739r();

    /* renamed from: w0 */
    boolean mo11740w0();

    /* renamed from: x */
    void mo11741x();
}
