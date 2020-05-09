package p289hu.ekreta.ellenorzo.cases.detail;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p211h.p271p.C3817l;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010B\u001a\u00020CH&J\b\u0010D\u001a\u00020CH&J\u0010\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020\u000bH&J\b\u0010G\u001a\u00020CH&J\b\u0010H\u001a\u00020CH&R\u0014\u0010\u0004\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00178gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007R\u001e\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\rR\u0014\u0010*\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00178gX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u00178gX¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0014\u00106\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0007R\u0012\u0010>\u001a\u00020?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006I"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "Landroidx/lifecycle/LifecycleObserver;", "administratorName", "", "getAdministratorName", "()Ljava/lang/String;", "attachments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "()Landroidx/lifecycle/LiveData;", "case", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "getCase", "()Lhu/ekreta/ellenorzo/cases/BaseCase;", "setCase", "(Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "decisionButtonText", "getDecisionButtonText", "decisionButtonVisible", "", "getDecisionButtonVisible", "()Z", "decisionItemIndex", "", "getDecisionItemIndex", "()I", "documentNumber", "getDocumentNumber", "firstDecision", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "getFirstDecision", "()Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "longName", "getLongName", "mandatoryDocumentName", "getMandatoryDocumentName", "mandatoryDocuments", "getMandatoryDocuments", "printableDocument", "getPrintableDocument", "progressVisible", "getProgressVisible", "reason", "getReason", "rectificationButtonText", "getRectificationButtonText", "rectificationButtonVisible", "getRectificationButtonVisible", "secondDecision", "getSecondDecision", "sentDate", "getSentDate", "state", "getState", "studentEducationId", "getStudentEducationId", "studentName", "getStudentName", "tmgi", "Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "getTmgi", "()Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "decisionButtonClicked", "", "loadCaseById", "onSelect", "item", "rectificationButtonClicked", "viewPrintableDocument", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel */
/* compiled from: CaseDetailsViewModel.kt */
public interface CaseDetailsViewModel extends UiCommandSource, C3705i, C3817l {
    /* renamed from: B */
    TmgiCaseDetailsViewModel mo11785B();

    /* renamed from: E */
    String mo11786E();

    /* renamed from: F */
    void mo11787F();

    /* renamed from: J */
    String mo11788J();

    /* renamed from: N */
    void mo11789N();

    /* renamed from: O */
    String mo11790O();

    /* renamed from: P */
    String mo11791P();

    /* renamed from: Q */
    String mo11792Q();

    /* renamed from: S */
    boolean mo11793S();

    /* renamed from: T */
    BaseCase mo11794T();

    /* renamed from: a */
    void mo11795a(Attachment attachment);

    /* renamed from: a */
    void mo11796a(BaseCase baseCase);

    /* renamed from: d */
    boolean mo11797d();

    LiveData<List<Attachment>> getAttachments();

    LiveData<List<Attachment>> getMandatoryDocuments();

    /* renamed from: i */
    String mo11800i();

    /* renamed from: k */
    void mo11801k();

    /* renamed from: l */
    String mo11802l();

    /* renamed from: o */
    String mo11803o();

    /* renamed from: q */
    String mo11804q();

    /* renamed from: r */
    String mo11805r();

    /* renamed from: u */
    String mo11806u();

    /* renamed from: w */
    boolean mo11807w();

    /* renamed from: z */
    String mo11808z();
}
