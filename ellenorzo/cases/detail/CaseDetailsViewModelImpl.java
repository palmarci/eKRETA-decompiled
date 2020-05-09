package p289hu.ekreta.ellenorzo.cases.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p258l.C3705i;
import p211h.p258l.C3705i.C3706a;
import p211h.p271p.C3810h.C3811a;
import p211h.p271p.C3824r;
import p211h.p271p.C3826t;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.CaseRepository;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.Decision;
import p289hu.ekreta.ellenorzo.cases.subModels.Judgement;
import p289hu.ekreta.ellenorzo.cases.subModels.Judgement.JudgementType;
import p289hu.ekreta.ellenorzo.cases.subModels.State.StateType;
import p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C4996f;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4685a;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4815f;
import p300k.p313b.p335f0.C4997a;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p337h0.C5016a;
import p300k.p313b.p337h0.C5021d;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0002J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0017J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u001eH\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0002J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020BH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020BH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R/\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0012\u001a\u0004\u0018\u00010!8V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00130\u00130)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010+\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R+\u00100\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020/8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000207X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010=\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b@\u0010\u001a\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010\u0018R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010G\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u001a\u001a\u0004\bH\u0010\u0016\"\u0004\bI\u0010\u0018R+\u0010K\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bN\u0010\u001a\u001a\u0004\bL\u0010\u0016\"\u0004\bM\u0010\u0018R \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010 R+\u0010Q\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bT\u0010\u001a\u001a\u0004\bR\u0010\u0016\"\u0004\bS\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010U\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010/0/0)X\u0004¢\u0006\u0002\n\u0000R+\u0010V\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020/8V@VX\u0002¢\u0006\u0012\n\u0004\bY\u0010\u001a\u001a\u0004\bW\u00102\"\u0004\bX\u00104R+\u0010Z\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b]\u0010\u001a\u001a\u0004\b[\u0010\u0016\"\u0004\b\\\u0010\u0018R+\u0010^\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\ba\u0010\u001a\u001a\u0004\b_\u0010\u0016\"\u0004\b`\u0010\u0018R+\u0010b\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020/8V@VX\u0002¢\u0006\u0012\n\u0004\be\u0010\u001a\u001a\u0004\bc\u00102\"\u0004\bd\u00104R\u001c\u0010f\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010D\"\u0004\bh\u0010FR+\u0010i\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bl\u0010\u001a\u001a\u0004\bj\u0010\u0016\"\u0004\bk\u0010\u0018R+\u0010m\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bp\u0010\u001a\u001a\u0004\bn\u0010\u0016\"\u0004\bo\u0010\u0018R+\u0010q\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bt\u0010\u001a\u001a\u0004\br\u0010\u0016\"\u0004\bs\u0010\u0018R+\u0010u\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bx\u0010\u001a\u001a\u0004\bv\u0010\u0016\"\u0004\bw\u0010\u0018R\u001b\u0010y\u001a\u00020z8VX\u0002¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b{\u0010|¨\u0006\u0001"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "caseRepository", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/CaseRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;)V", "<set-?>", "", "administratorName", "getAdministratorName", "()Ljava/lang/String;", "setAdministratorName", "(Ljava/lang/String;)V", "administratorName$delegate", "Lkotlin/properties/ReadWriteProperty;", "attachments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "()Landroidx/lifecycle/MutableLiveData;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "case", "getCase", "()Lhu/ekreta/ellenorzo/cases/BaseCase;", "setCase", "(Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "case$delegate", "caseIdSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "decisionButtonText", "getDecisionButtonText", "setDecisionButtonText", "decisionButtonText$delegate", "", "decisionButtonVisible", "getDecisionButtonVisible", "()Z", "setDecisionButtonVisible", "(Z)V", "decisionButtonVisible$delegate", "decisionCount", "", "decisionItemIndex", "getDecisionItemIndex", "()I", "setDecisionItemIndex", "(I)V", "documentNumber", "getDocumentNumber", "setDocumentNumber", "documentNumber$delegate", "firstDecision", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "getFirstDecision", "()Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "setFirstDecision", "(Lhu/ekreta/ellenorzo/cases/subModels/Decision;)V", "longName", "getLongName", "setLongName", "longName$delegate", "mandatoryDocumentName", "getMandatoryDocumentName", "setMandatoryDocumentName", "mandatoryDocumentName$delegate", "mandatoryDocuments", "getMandatoryDocuments", "printableDocument", "getPrintableDocument", "setPrintableDocument", "printableDocument$delegate", "progressSubject", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "reason", "getReason", "setReason", "reason$delegate", "rectificationButtonText", "getRectificationButtonText", "setRectificationButtonText", "rectificationButtonText$delegate", "rectificationButtonVisible", "getRectificationButtonVisible", "setRectificationButtonVisible", "rectificationButtonVisible$delegate", "secondDecision", "getSecondDecision", "setSecondDecision", "sentDate", "getSentDate", "setSentDate", "sentDate$delegate", "state", "getState", "setState", "state$delegate", "studentEducationId", "getStudentEducationId", "setStudentEducationId", "studentEducationId$delegate", "studentName", "getStudentName", "setStudentName", "studentName$delegate", "tmgi", "Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "getTmgi", "()Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "tmgi$delegate", "Lkotlin/Lazy;", "decisionButtonClicked", "", "handleFirstDecision", "handleSecondDecision", "loadCaseById", "onSelect", "item", "rectificationButtonClicked", "setUiPropertiesFromCase", "setupRectificationButton", "showDecision", "decisionToShow", "updateDecisionButton", "decision", "viewPrintableDocument", "TmgiCaseDetailsViewModelImpl", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl */
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl extends AuthenticatedViewModel implements CaseDetailsViewModel {

    /* renamed from: P */
    public static final /* synthetic */ KProperty[] f11449P;

    /* renamed from: A */
    public final C3824r<List<Attachment>> f11450A = new C3824r<>();

    /* renamed from: B */
    public final ReadWriteProperty f11451B = DataBindingViewModel.boundBoolean$default(this, this, 49, false, null, 6, null);

    /* renamed from: C */
    public final ReadWriteProperty f11452C = DataBindingViewModel.boundString$default(this, this, 42, null, null, 6, null);

    /* renamed from: D */
    public final ReadWriteProperty f11453D = DataBindingViewModel.boundString$default(this, this, 27, null, null, 6, null);

    /* renamed from: E */
    public Decision f11454E;

    /* renamed from: F */
    public Decision f11455F;

    /* renamed from: G */
    public final ReadWriteProperty f11456G = DataBindingViewModel.boundBoolean$default(this, this, 98, false, null, 6, null);

    /* renamed from: H */
    public int f11457H;

    /* renamed from: I */
    public int f11458I;

    /* renamed from: J */
    public final ReadWriteProperty f11459J;

    /* renamed from: K */
    public final Lazy f11460K;

    /* renamed from: L */
    public final Context f11461L;

    /* renamed from: M */
    public final ProfileRepository f11462M;

    /* renamed from: N */
    public final CaseRepository f11463N;

    /* renamed from: O */
    public final AttachmentService f11464O;

    /* renamed from: m */
    public final C5016a<String> f11465m;

    /* renamed from: n */
    public final C5016a<Boolean> f11466n;

    /* renamed from: o */
    public final ReadWriteProperty f11467o = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);

    /* renamed from: p */
    public final ReadWriteProperty f11468p = DataBindingViewModel.boundString$default(this, this, 63, null, null, 6, null);

    /* renamed from: q */
    public final ReadWriteProperty f11469q = DataBindingViewModel.boundString$default(this, this, 71, null, null, 6, null);

    /* renamed from: r */
    public final ReadWriteProperty f11470r = DataBindingViewModel.boundString$default(this, this, 44, null, null, 6, null);

    /* renamed from: s */
    public final ReadWriteProperty f11471s = DataBindingViewModel.boundString$default(this, this, 16, null, null, 6, null);

    /* renamed from: t */
    public final ReadWriteProperty f11472t = DataBindingViewModel.boundString$default(this, this, 24, null, null, 6, null);

    /* renamed from: u */
    public final ReadWriteProperty f11473u = DataBindingViewModel.boundString$default(this, this, 84, null, null, 6, null);

    /* renamed from: v */
    public final ReadWriteProperty f11474v = DataBindingViewModel.boundString$default(this, this, 29, null, null, 6, null);

    /* renamed from: w */
    public final ReadWriteProperty f11475w = DataBindingViewModel.boundString$default(this, this, 1, null, null, 6, null);

    /* renamed from: x */
    public final ReadWriteProperty f11476x = DataBindingViewModel.boundString$default(this, this, 19, null, null, 6, null);

    /* renamed from: y */
    public final ReadWriteProperty f11477y = DataBindingViewModel.boundString$default(this, this, 48, null, null, 6, null);

    /* renamed from: z */
    public final C3824r<List<Attachment>> f11478z = new C3824r<>();

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0001J\u0019\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0001J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModelImpl$TmgiCaseDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "Landroidx/databinding/Observable;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "(Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModelImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;)V", "<set-?>", "", "justificationType", "getJustificationType", "()Ljava/lang/String;", "setJustificationType", "(Ljava/lang/String;)V", "justificationType$delegate", "Lkotlin/properties/ReadWriteProperty;", "requestedAbsenceInterval", "getRequestedAbsenceInterval", "setRequestedAbsenceInterval", "requestedAbsenceInterval$delegate", "addOnPropertyChangedCallback", "", "p0", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "kotlin.jvm.PlatformType", "removeOnPropertyChangedCallback", "updateWith", "newCase", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiCase;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$TmgiCaseDetailsViewModelImpl */
    /* compiled from: CaseDetailsViewModelImpl.kt */
    public final class TmgiCaseDetailsViewModelImpl implements TmgiCaseDetailsViewModel, C3705i {

        /* renamed from: h */
        public static final /* synthetic */ KProperty[] f11479h;

        /* renamed from: c */
        public final ReadWriteProperty f11480c;

        /* renamed from: e */
        public final ReadWriteProperty f11481e;

        /* renamed from: f */
        public final /* synthetic */ ObservableImpl f11482f;

        /* renamed from: g */
        public final /* synthetic */ CaseDetailsViewModelImpl f11483g;

        static {
            Class<TmgiCaseDetailsViewModelImpl> cls = TmgiCaseDetailsViewModelImpl.class;
            f11479h = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "justificationType", "getJustificationType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "requestedAbsenceInterval", "getRequestedAbsenceInterval()Ljava/lang/String;"))};
        }

        public TmgiCaseDetailsViewModelImpl(CaseDetailsViewModelImpl caseDetailsViewModelImpl, ObservableImpl observableImpl) {
            Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
            this.f11483g = caseDetailsViewModelImpl;
            this.f11482f = observableImpl;
            this.f11480c = DataBindingViewModel.boundString$default(caseDetailsViewModelImpl, this, 66, null, null, 6, null);
            this.f11481e = DataBindingViewModel.boundString$default(caseDetailsViewModelImpl, this, 12, null, null, 6, null);
        }

        /* renamed from: a */
        public void mo10510a(C3706a aVar) {
            this.f11482f.mo10510a(aVar);
        }

        /* renamed from: a */
        public void updateWith(TmgiCase tmgiCase) {
            String str;
            Intrinsics.checkParameterIsNotNull(tmgiCase, "newCase");
            String w = tmgiCase.mo12107w();
            String str2 = "";
            if (w == null) {
                w = str2;
            }
            mo11838q(w);
            if (!(tmgiCase.mo12109y() == null || tmgiCase.mo12108x() == null)) {
                if (Intrinsics.areEqual((Object) UtilsKt.m14828a(tmgiCase.mo12109y()), (Object) UtilsKt.m14828a(tmgiCase.mo12108x()))) {
                    str2 = UtilsKt.m14828a(tmgiCase.mo12109y());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(UtilsKt.m14828a(tmgiCase.mo12109y()));
                    sb.append(" - ");
                    sb.append(UtilsKt.m14828a(tmgiCase.mo12108x()));
                    str2 = sb.toString();
                }
            }
            mo11839r(str2);
            CaseDetailsViewModelImpl caseDetailsViewModelImpl = this.f11483g;
            String w2 = tmgiCase.mo12107w();
            if (w2 == null || w2.length() == 0) {
                str = this.f11483g.f11461L.getString(C4014R.string.mandatory_attachment);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.mandatory_attachment)");
            } else {
                str = tmgiCase.mo12107w();
            }
            caseDetailsViewModelImpl.mo11830v(str);
        }

        /* renamed from: b */
        public void mo10511b(C3706a aVar) {
            this.f11482f.mo10511b(aVar);
        }

        /* renamed from: g0 */
        public String mo11836g0() {
            return (String) this.f11481e.getValue(this, f11479h[1]);
        }

        /* renamed from: n0 */
        public String mo11837n0() {
            return (String) this.f11480c.getValue(this, f11479h[0]);
        }

        /* renamed from: q */
        public void mo11838q(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f11480c.setValue(this, f11479h[0], str);
        }

        /* renamed from: r */
        public void mo11839r(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f11481e.setValue(this, f11479h[1], str);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11484a = new int[StateType.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f11485b = new int[JudgementType.values().length];

        static {
            f11484a[StateType.NEEDS_CORRECTION.ordinal()] = 1;
            f11484a[StateType.IN_PROGRESS.ordinal()] = 2;
            f11484a[StateType.CLOSED.ordinal()] = 3;
            f11484a[StateType.DONE.ordinal()] = 4;
            f11484a[StateType.NEW.ordinal()] = 5;
            f11485b[JudgementType.ACCEPTED.ordinal()] = 1;
            f11485b[JudgementType.DENIED.ordinal()] = 2;
        }
    }

    static {
        Class<CaseDetailsViewModelImpl> cls = CaseDetailsViewModelImpl.class;
        f11449P = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "longName", "getLongName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "documentNumber", "getDocumentNumber()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "sentDate", "getSentDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "state", "getState()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentName", "getStudentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentEducationId", "getStudentEducationId()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "printableDocument", "getPrintableDocument()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "reason", "getReason()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "administratorName", "getAdministratorName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mandatoryDocumentName", "getMandatoryDocumentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionButtonVisible", "getDecisionButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "rectificationButtonText", "getRectificationButtonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionButtonText", "getDecisionButtonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "rectificationButtonVisible", "getRectificationButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "case", "getCase()Lhu/ekreta/ellenorzo/cases/BaseCase;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "tmgi", "getTmgi()Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;"))};
    }

    public CaseDetailsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, Context context, ProfileRepository profileRepository, CaseRepository caseRepository, AttachmentService attachmentService) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(caseRepository, "caseRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f11461L = context;
        this.f11462M = profileRepository;
        this.f11463N = caseRepository;
        this.f11464O = attachmentService;
        C5016a<String> aVar = new C5016a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create<String>()");
        this.f11465m = aVar;
        C5016a<Boolean> aVar2 = new C5016a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "BehaviorSubject.create<Boolean>()");
        this.f11466n = aVar2;
        Delegates delegates = Delegates.INSTANCE;
        this.f11459J = new CaseDetailsViewModelImpl$$special$$inlined$observable$1(null, null, this);
        this.f11460K = LazyKt__LazyJVMKt.lazy(new CaseDetailsViewModelImpl$tmgi$2(this, observableImpl));
    }

    /* renamed from: A */
    public void mo11809A(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11471s.setValue(this, f11449P[4], str);
    }

    /* renamed from: B */
    public TmgiCaseDetailsViewModel mo11785B() {
        Lazy lazy = this.f11460K;
        KProperty kProperty = f11449P[16];
        return (TmgiCaseDetailsViewModel) lazy.getValue();
    }

    /* renamed from: B */
    public void mo11810B(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11473u.setValue(this, f11449P[6], str);
    }

    /* renamed from: C */
    public void mo11811C(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11472t.setValue(this, f11449P[5], str);
    }

    /* renamed from: E */
    public String mo11786E() {
        return (String) this.f11473u.getValue(this, f11449P[6]);
    }

    /* renamed from: F */
    public void mo11787F() {
        Decision Q1 = mo11813Q1();
        if (Q1 != null) {
            mo16376b((Function1<? super Activity, ? extends Intent>) new CaseDetailsViewModelImpl$showDecision$1<Object,Object>(this, Q1));
        }
    }

    /* renamed from: J */
    public String mo11788J() {
        return (String) this.f11477y.getValue(this, f11449P[10]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11789N() {
        /*
            r4 = this;
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r4.mo11813Q1()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            hu.ekreta.ellenorzo.cases.subModels.Decision r3 = r4.mo11814R1()
            if (r3 == 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            r0 = r0 | r1
            if (r0 == 0) goto L_0x0033
            int r0 = r4.mo11812P1()
            if (r0 != 0) goto L_0x0022
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r4.mo11813Q1()
            if (r0 != 0) goto L_0x002b
            goto L_0x0028
        L_0x0022:
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r4.mo11814R1()
            if (r0 != 0) goto L_0x002b
        L_0x0028:
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x002b:
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$showDecision$1 r1 = new hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$showDecision$1
            r1.<init>(r4, r0)
            r4.mo16376b(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl.mo11789N():void");
    }

    /* renamed from: O */
    public String mo11790O() {
        return (String) this.f11452C.getValue(this, f11449P[12]);
    }

    /* renamed from: P */
    public String mo11791P() {
        return (String) this.f11475w.getValue(this, f11449P[8]);
    }

    /* renamed from: P1 */
    public int mo11812P1() {
        return this.f11457H;
    }

    /* renamed from: Q */
    public String mo11792Q() {
        return (String) this.f11453D.getValue(this, f11449P[13]);
    }

    /* renamed from: Q1 */
    public Decision mo11813Q1() {
        return this.f11454E;
    }

    /* renamed from: R1 */
    public Decision mo11814R1() {
        return this.f11455F;
    }

    /* renamed from: S */
    public boolean mo11793S() {
        return ((Boolean) this.f11451B.getValue(this, f11449P[11])).booleanValue();
    }

    /* renamed from: T */
    public BaseCase mo11794T() {
        return (BaseCase) this.f11459J.getValue(this, f11449P[15]);
    }

    /* renamed from: a */
    public void mo11796a(BaseCase baseCase) {
        this.f11459J.setValue(this, f11449P[15], baseCase);
    }

    /* renamed from: a */
    public void mo11815a(Decision decision) {
        this.f11454E = decision;
    }

    /* renamed from: b */
    public void mo11818b(Decision decision) {
        this.f11455F = decision;
    }

    /* renamed from: b */
    public void mo11819b(boolean z) {
        this.f11451B.setValue(this, f11449P[11], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo11820c(BaseCase baseCase) {
        mo11818b((Decision) baseCase.mo11582i().get(1));
        Decision R1 = mo11814R1();
        if (R1 == null) {
            Intrinsics.throwNpe();
        }
        if (R1.mo11951g() != null) {
            Decision R12 = mo11814R1();
            if (R12 == null) {
                Intrinsics.throwNpe();
            }
            mo11821c(R12);
            mo11816b(1);
        }
    }

    /* renamed from: c */
    public void mo11822c(boolean z) {
        this.f11467o.setValue(this, f11449P[0], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo11823d(BaseCase baseCase) {
        StringBuilder sb = new StringBuilder();
        sb.append(baseCase.mo11594u());
        String str = " - ";
        sb.append(str);
        sb.append(baseCase.mo11595v());
        mo11829u(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(baseCase.mo11583j());
        sb2.append(')');
        mo11828t(sb2.toString());
        mo11834z(UtilsKt.m14828a(baseCase.mo11588o()));
        mo11809A(baseCase.mo11589p());
        StringBuilder sb3 = new StringBuilder();
        String s = baseCase.mo11592s();
        String str2 = "";
        if (s == null) {
            s = str2;
        }
        sb3.append(s);
        sb3.append(' ');
        String t = baseCase.mo11593t();
        if (t == null) {
            t = str2;
        }
        sb3.append(t);
        mo11811C(sb3.toString());
        String r = baseCase.mo11591r();
        if (r == null) {
            r = str2;
        }
        mo11810B(r);
        String f = baseCase.mo11578f();
        if (f == null) {
            f = str2;
        }
        mo11826r(f);
        String n = baseCase.mo11587n();
        if (n == null) {
            n = str2;
        }
        mo11832x(n);
        getAttachments().setValue(baseCase.mo11580h());
        String string = this.f11461L.getString(C4014R.string.mandatory_attachment);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.mandatory_attachment)");
        mo11830v(string);
        C3824r mandatoryDocuments = getMandatoryDocuments();
        List<ApplicationMandatoryDocument> g = baseCase.mo11579g();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g, 10));
        for (ApplicationMandatoryDocument applicationMandatoryDocument : g) {
            Intrinsics.checkParameterIsNotNull(applicationMandatoryDocument, "$this$toAttachment");
            Integer i = applicationMandatoryDocument.mo11911i();
            if (i == null) {
                Intrinsics.throwNpe();
            }
            Attachment attachment = new Attachment(i.intValue(), applicationMandatoryDocument.mo11909h(), null, null, null, applicationMandatoryDocument.mo11318e(), 28, null);
            arrayList.add(attachment);
        }
        mandatoryDocuments.setValue(arrayList);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f11461L.getString(C4014R.string.case_request));
        sb4.append(str);
        sb4.append(this.f11461L.getString(C4014R.string.printable_document));
        mo11831w(sb4.toString());
    }

    /* renamed from: d */
    public void mo11824d(boolean z) {
        this.f11456G.setValue(this, f11449P[14], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo11797d() {
        return ((Boolean) this.f11467o.getValue(this, f11449P[0])).booleanValue();
    }

    /* renamed from: i */
    public String mo11800i() {
        return (String) this.f11474v.getValue(this, f11449P[7]);
    }

    /* renamed from: k */
    public void mo11801k() {
        if (mo11794T() != null) {
            C3984v.m10233a((AuthenticatedViewModel) this, this.f11464O, (C5021d<Boolean>) this.f11466n, (Function0<? extends C5027n<File>>) new CaseDetailsViewModelImpl$viewPrintableDocument$1<Object>(this));
        }
    }

    /* renamed from: l */
    public String mo11802l() {
        return (String) this.f11471s.getValue(this, f11449P[4]);
    }

    @C3826t(C3811a.ON_RESUME)
    public void loadCaseById() {
        C5027n nVar;
        C5027n b = this.f11462M.mo14191b();
        C5027n b2 = this.f11465m.mo17220b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "caseIdSubject.distinctUntilChanged()");
        Intrinsics.checkParameterIsNotNull(b, "source1");
        Intrinsics.checkParameterIsNotNull(b2, "source2");
        C4997a aVar = C4997a.f17149a;
        C4704b.m16116a(b, "source1 is null");
        C4704b.m16116a(b2, "source2 is null");
        C4675h a = C4685a.m16110a((C4670c<? super T1, ? super T2, ? extends R>) aVar);
        int i = C4996f.f17148c;
        C5030q[] qVarArr = {b, b2};
        C4704b.m16116a(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            nVar = C5027n.m16899j();
        } else {
            C4704b.m16116a(a, "combiner is null");
            C4704b.m16114a(i, "bufferSize");
            C4815f fVar = new C4815f(qVarArr, null, a, i << 1, false);
            nVar = C4664d.m16039a((C5027n<T>) fVar);
        }
        C5027n b3 = nVar.mo17252k(new CaseDetailsViewModelImpl$loadCaseById$1(this)).mo17214a(C5041a.m16999a()).mo17238d((C4673f<? super C4663c>) new CaseDetailsViewModelImpl$loadCaseById$2<Object>(this)).mo17233c((C4673f<? super T>) new CaseDetailsViewModelImpl$loadCaseById$3<Object>(this)).mo17224b((C4673f<? super Throwable>) new CaseDetailsViewModelImpl$loadCaseById$4<Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(b3, "Observables\n            …progressVisible = false }");
        mo16413a(C4998b.m16842a(b3, (Function1) new CaseDetailsViewModelImpl$loadCaseById$6(this), (Function0) null, (Function1) new CaseDetailsViewModelImpl$loadCaseById$5(this), 2));
        C4663c e = this.f11466n.mo17240e((C4673f<? super T>) new CaseDetailsViewModelImpl$loadCaseById$7<Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(e, "progressSubject.subscribe { progressVisible = it }");
        mo16413a(e);
    }

    /* renamed from: o */
    public String mo11803o() {
        return (String) this.f11468p.getValue(this, f11449P[1]);
    }

    /* renamed from: q */
    public String mo11804q() {
        return (String) this.f11472t.getValue(this, f11449P[5]);
    }

    /* renamed from: r */
    public String mo11805r() {
        return (String) this.f11469q.getValue(this, f11449P[2]);
    }

    /* renamed from: r */
    public void mo11826r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11476x.setValue(this, f11449P[9], str);
    }

    /* renamed from: s */
    public void mo11827s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11453D.setValue(this, f11449P[13], str);
    }

    /* renamed from: t */
    public void mo11828t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11469q.setValue(this, f11449P[2], str);
    }

    /* renamed from: u */
    public String mo11806u() {
        return (String) this.f11470r.getValue(this, f11449P[3]);
    }

    /* renamed from: u */
    public void mo11829u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11468p.setValue(this, f11449P[1], str);
    }

    /* renamed from: v */
    public void mo11830v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11477y.setValue(this, f11449P[10], str);
    }

    /* renamed from: w */
    public void mo11831w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11474v.setValue(this, f11449P[7], str);
    }

    /* renamed from: w */
    public boolean mo11807w() {
        return ((Boolean) this.f11456G.getValue(this, f11449P[14])).booleanValue();
    }

    /* renamed from: x */
    public void mo11832x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11475w.setValue(this, f11449P[8], str);
    }

    /* renamed from: y */
    public void mo11833y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11452C.setValue(this, f11449P[12], str);
    }

    /* renamed from: z */
    public String mo11808z() {
        return (String) this.f11476x.getValue(this, f11449P[9]);
    }

    /* renamed from: z */
    public void mo11834z(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11470r.setValue(this, f11449P[3], str);
    }

    /* renamed from: a */
    public void mo11795a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        C3984v.m10232a((AuthenticatedViewModel) this, this.f11464O, (C5021d<Boolean>) this.f11466n, getAttachments(), attachment, (Function0<? extends C5027n<File>>) new CaseDetailsViewModelImpl$onSelect$1<Object>(this, attachment));
    }

    /* renamed from: b */
    public void mo11816b(int i) {
        this.f11457H = i;
    }

    public C3824r<List<Attachment>> getAttachments() {
        return this.f11450A;
    }

    public C3824r<List<Attachment>> getMandatoryDocuments() {
        return this.f11478z;
    }

    /* renamed from: b */
    public final void mo11817b(BaseCase baseCase) {
        mo11815a((Decision) baseCase.mo11582i().get(0));
        StateType q = baseCase.mo11590q();
        int i = WhenMappings.f11484a[q.ordinal()];
        boolean z = true;
        if (i != 1) {
            String str = "";
            if (i == 2 || i == 3 || i == 4) {
                Decision Q1 = mo11813Q1();
                if (Q1 == null) {
                    Intrinsics.throwNpe();
                }
                String g = Q1.mo11951g();
                boolean z2 = g != null && g.length() > 0;
                Decision Q12 = mo11813Q1();
                if (Q12 == null) {
                    Intrinsics.throwNpe();
                }
                Judgement h = Q12.mo11952h();
                mo11824d(z2 & (h != null ? h.mo11979g() : false));
                if (mo11807w()) {
                    str = this.f11461L.getString(C4014R.string.Rectification_sent_button_title);
                    Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.stri…cation_sent_button_title)");
                }
                mo11833y(str);
            } else if (i == 5) {
                mo11833y(str);
                mo11824d(false);
            }
        } else {
            String string = this.f11461L.getString(C4014R.string.Rectification_is_needed_button_title);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…n_is_needed_button_title)");
            mo11833y(string);
            mo11824d(true);
        }
        boolean z3 = q == StateType.CLOSED;
        if (q != StateType.DONE) {
            z = false;
        }
        if (z3 || z) {
            Decision Q13 = mo11813Q1();
            if (Q13 == null) {
                Intrinsics.throwNpe();
            }
            mo11821c(Q13);
            mo11816b(0);
        }
    }

    /* renamed from: c */
    public final void mo11821c(Decision decision) {
        Judgement h = decision.mo11952h();
        JudgementType f = h != null ? h.mo11978f() : null;
        if (f != null) {
            int i = WhenMappings.f11485b[f.ordinal()];
            if (i == 1) {
                String string = this.f11461L.getString(C4014R.string.Case_with_accepted_decision);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…e_with_accepted_decision)");
                mo11827s(string);
                mo11819b(true);
                return;
            } else if (i == 2) {
                String string2 = this.f11461L.getString(C4014R.string.Case_with_declined_decision);
                Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri…e_with_declined_decision)");
                mo11827s(string2);
                mo11819b(true);
                return;
            }
        }
        mo11819b(false);
    }
}
