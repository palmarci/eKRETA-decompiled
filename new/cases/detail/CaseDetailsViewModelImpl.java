package hu.ekreta.ellenorzo.cases.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.l.i;
import h.p.h;
import h.p.r;
import h.p.t;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.attachment.AttachmentType;
import hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.CaseRepository;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.Decision;
import hu.ekreta.ellenorzo.cases.subModels.Judgement;
import hu.ekreta.ellenorzo.cases.subModels.State;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k.b.a0.c;
import k.b.a0.d;
import k.b.c0.b.b;
import k.b.f;
import k.b.h0.a;
import k.b.n;
import k.b.q;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010$\u001a\u00020#H\u0002J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010$\u001a\u00020#H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0017J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020 H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010$\u001a\u00020#H\u0002J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010$\u001a\u00020#H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020DH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020DH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0014\u001a\u0004\u0018\u00010#8V@VX\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010*\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00150\u00150+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010-\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR+\u00102\u001a\u0002012\u0006\u0010\u0014\u001a\u0002018V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u001c\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00108\u001a\u000209X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010?\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010I\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bL\u0010\u001c\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010\u001aR+\u0010M\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bP\u0010\u001c\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u0010\u001aR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\"R+\u0010S\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bV\u0010\u001c\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010\u001aR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010W\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u000101010+X\u0004¢\u0006\u0002\n\u0000R+\u0010X\u001a\u0002012\u0006\u0010\u0014\u001a\u0002018V@VX\u0002¢\u0006\u0012\n\u0004\b[\u0010\u001c\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R+\u0010\\\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b_\u0010\u001c\u001a\u0004\b]\u0010\u0018\"\u0004\b^\u0010\u001aR+\u0010`\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bc\u0010\u001c\u001a\u0004\ba\u0010\u0018\"\u0004\bb\u0010\u001aR+\u0010d\u001a\u0002012\u0006\u0010\u0014\u001a\u0002018V@VX\u0002¢\u0006\u0012\n\u0004\bg\u0010\u001c\u001a\u0004\be\u00104\"\u0004\bf\u00106R\u001c\u0010h\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010F\"\u0004\bj\u0010HR+\u0010k\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bn\u0010\u001c\u001a\u0004\bl\u0010\u0018\"\u0004\bm\u0010\u001aR+\u0010o\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\br\u0010\u001c\u001a\u0004\bp\u0010\u0018\"\u0004\bq\u0010\u001aR+\u0010s\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bv\u0010\u001c\u001a\u0004\bt\u0010\u0018\"\u0004\bu\u0010\u001aR+\u0010w\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bz\u0010\u001c\u001a\u0004\bx\u0010\u0018\"\u0004\by\u0010\u001aR\u001c\u0010{\u001a\u00020|8VX\u0002¢\u0006\r\n\u0005\b\u0010\u0001\u001a\u0004\b}\u0010~¨\u0006\u0001"}, d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "caseRepository", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/CaseRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;)V", "<set-?>", "", "administratorName", "getAdministratorName", "()Ljava/lang/String;", "setAdministratorName", "(Ljava/lang/String;)V", "administratorName$delegate", "Lkotlin/properties/ReadWriteProperty;", "attachments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "()Landroidx/lifecycle/MutableLiveData;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "case", "getCase", "()Lhu/ekreta/ellenorzo/cases/BaseCase;", "setCase", "(Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "case$delegate", "caseIdSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "decisionButtonText", "getDecisionButtonText", "setDecisionButtonText", "decisionButtonText$delegate", "", "decisionButtonVisible", "getDecisionButtonVisible", "()Z", "setDecisionButtonVisible", "(Z)V", "decisionButtonVisible$delegate", "decisionCount", "", "decisionItemIndex", "getDecisionItemIndex", "()I", "setDecisionItemIndex", "(I)V", "documentNumber", "getDocumentNumber", "setDocumentNumber", "documentNumber$delegate", "firstDecision", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "getFirstDecision", "()Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "setFirstDecision", "(Lhu/ekreta/ellenorzo/cases/subModels/Decision;)V", "longName", "getLongName", "setLongName", "longName$delegate", "mandatoryDocumentName", "getMandatoryDocumentName", "setMandatoryDocumentName", "mandatoryDocumentName$delegate", "mandatoryDocuments", "getMandatoryDocuments", "printableDocument", "getPrintableDocument", "setPrintableDocument", "printableDocument$delegate", "progressSubject", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "reason", "getReason", "setReason", "reason$delegate", "rectificationButtonText", "getRectificationButtonText", "setRectificationButtonText", "rectificationButtonText$delegate", "rectificationButtonVisible", "getRectificationButtonVisible", "setRectificationButtonVisible", "rectificationButtonVisible$delegate", "secondDecision", "getSecondDecision", "setSecondDecision", "sentDate", "getSentDate", "setSentDate", "sentDate$delegate", "state", "getState", "setState", "state$delegate", "studentEducationId", "getStudentEducationId", "setStudentEducationId", "studentEducationId$delegate", "studentName", "getStudentName", "setStudentName", "studentName$delegate", "tmgi", "Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "getTmgi", "()Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "tmgi$delegate", "Lkotlin/Lazy;", "decisionButtonClicked", "", "handleFirstDecision", "handleSecondDecision", "loadCaseById", "onSelect", "item", "rectificationButtonClicked", "setUiPropertiesFromCase", "setupRectificationButton", "showDecision", "decisionToShow", "updateDecisionButton", "decision", "viewPrintableDocument", "TmgiCaseDetailsViewModelImpl", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl extends AuthenticatedViewModel implements CaseDetailsViewModel {
    public static final /* synthetic */ KProperty[] Q;
    public final r<List<Attachment>> A = new r<>();
    public final r<List<Attachment>> B = new r<>();
    public final ReadWriteProperty C = DataBindingViewModel.boundBoolean$default(this, this, 50, false, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty D = DataBindingViewModel.boundString$default(this, this, 42, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty E = DataBindingViewModel.boundString$default(this, this, 27, (String) null, (Function1) null, 6, (Object) null);
    public Decision F;
    public Decision G;
    public final ReadWriteProperty H = DataBindingViewModel.boundBoolean$default(this, this, 100, false, (Function1) null, 6, (Object) null);
    public int I;
    public int J;
    public final ReadWriteProperty K;
    public final Lazy L;
    public final Context M;
    public final ProfileRepository N;
    public final CaseRepository O;
    public final AttachmentService P;

    /* renamed from: n  reason: collision with root package name */
    public final a<String> f5133n;

    /* renamed from: o  reason: collision with root package name */
    public final a<Boolean> f5134o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5135p = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5136q = DataBindingViewModel.boundString$default(this, this, 63, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty r = DataBindingViewModel.boundString$default(this, this, 71, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty s = DataBindingViewModel.boundString$default(this, this, 45, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty t = DataBindingViewModel.boundString$default(this, this, 15, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty u = DataBindingViewModel.boundString$default(this, this, 24, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty v = DataBindingViewModel.boundString$default(this, this, 84, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty w = DataBindingViewModel.boundString$default(this, this, 29, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty x = DataBindingViewModel.boundString$default(this, this, 1, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty y = DataBindingViewModel.boundString$default(this, this, 20, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty z = DataBindingViewModel.boundString$default(this, this, 49, (String) null, (Function1) null, 6, (Object) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0001J\u0019\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0001J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModelImpl$TmgiCaseDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;", "Landroidx/databinding/Observable;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "(Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModelImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;)V", "<set-?>", "", "justificationType", "getJustificationType", "()Ljava/lang/String;", "setJustificationType", "(Ljava/lang/String;)V", "justificationType$delegate", "Lkotlin/properties/ReadWriteProperty;", "requestedAbsenceInterval", "getRequestedAbsenceInterval", "setRequestedAbsenceInterval", "requestedAbsenceInterval$delegate", "addOnPropertyChangedCallback", "", "p0", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "kotlin.jvm.PlatformType", "removeOnPropertyChangedCallback", "updateWith", "newCase", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiCase;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: CaseDetailsViewModelImpl.kt */
    public final class TmgiCaseDetailsViewModelImpl implements TmgiCaseDetailsViewModel, i {

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f5137h;
        public final ReadWriteProperty c;
        public final ReadWriteProperty e;
        public final /* synthetic */ ObservableImpl f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ CaseDetailsViewModelImpl f5138g;

        static {
            Class<TmgiCaseDetailsViewModelImpl> cls = TmgiCaseDetailsViewModelImpl.class;
            f5137h = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "justificationType", "getJustificationType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "requestedAbsenceInterval", "getRequestedAbsenceInterval()Ljava/lang/String;"))};
        }

        public TmgiCaseDetailsViewModelImpl(CaseDetailsViewModelImpl caseDetailsViewModelImpl, ObservableImpl observableImpl) {
            Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
            this.f5138g = caseDetailsViewModelImpl;
            this.f = observableImpl;
            this.c = DataBindingViewModel.boundString$default(caseDetailsViewModelImpl, this, 66, (String) null, (Function1) null, 6, (Object) null);
            this.e = DataBindingViewModel.boundString$default(caseDetailsViewModelImpl, this, 11, (String) null, (Function1) null, 6, (Object) null);
        }

        public void a(i.a aVar) {
            this.f.a(aVar);
        }

        /* renamed from: a */
        public void updateWith(TmgiCase tmgiCase) {
            String str;
            Intrinsics.checkParameterIsNotNull(tmgiCase, "newCase");
            String w = tmgiCase.w();
            String str2 = "";
            if (w == null) {
                w = str2;
            }
            p(w);
            if (!(tmgiCase.y() == null || tmgiCase.x() == null)) {
                if (Intrinsics.areEqual((Object) UtilsKt.a(tmgiCase.y()), (Object) UtilsKt.a(tmgiCase.x()))) {
                    str2 = UtilsKt.a(tmgiCase.y());
                } else {
                    str2 = UtilsKt.a(tmgiCase.y()) + " - " + UtilsKt.a(tmgiCase.x());
                }
            }
            q(str2);
            CaseDetailsViewModelImpl caseDetailsViewModelImpl = this.f5138g;
            String w2 = tmgiCase.w();
            if (w2 == null || w2.length() == 0) {
                str = this.f5138g.M.getString(R.string.mandatory_attachment);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.mandatory_attachment)");
            } else {
                str = tmgiCase.w();
            }
            caseDetailsViewModelImpl.u(str);
        }

        public void b(i.a aVar) {
            this.f.b(aVar);
        }

        public String g0() {
            return (String) this.e.getValue(this, f5137h[1]);
        }

        public String n0() {
            return (String) this.c.getValue(this, f5137h[0]);
        }

        public void p(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.c.setValue(this, f5137h[0], str);
        }

        public void q(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.e.setValue(this, f5137h[1], str);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5139a = new int[State.StateType.values().length];
        public static final /* synthetic */ int[] b = new int[Judgement.JudgementType.values().length];

        static {
            f5139a[State.StateType.NEEDS_CORRECTION.ordinal()] = 1;
            f5139a[State.StateType.IN_PROGRESS.ordinal()] = 2;
            f5139a[State.StateType.CLOSED.ordinal()] = 3;
            f5139a[State.StateType.DONE.ordinal()] = 4;
            f5139a[State.StateType.NEW.ordinal()] = 5;
            b[Judgement.JudgementType.ACCEPTED.ordinal()] = 1;
            b[Judgement.JudgementType.DENIED.ordinal()] = 2;
        }
    }

    static {
        Class<CaseDetailsViewModelImpl> cls = CaseDetailsViewModelImpl.class;
        Q = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "longName", "getLongName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "documentNumber", "getDocumentNumber()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "sentDate", "getSentDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "state", "getState()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentName", "getStudentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentEducationId", "getStudentEducationId()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "printableDocument", "getPrintableDocument()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "reason", "getReason()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "administratorName", "getAdministratorName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mandatoryDocumentName", "getMandatoryDocumentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionButtonVisible", "getDecisionButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "rectificationButtonText", "getRectificationButtonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionButtonText", "getDecisionButtonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "rectificationButtonVisible", "getRectificationButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "case", "getCase()Lhu/ekreta/ellenorzo/cases/BaseCase;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "tmgi", "getTmgi()Lhu/ekreta/ellenorzo/cases/detail/TmgiCaseDetailsViewModel;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaseDetailsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, Context context, ProfileRepository profileRepository, CaseRepository caseRepository, AttachmentService attachmentService) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(caseRepository, "caseRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        this.M = context;
        this.N = profileRepository;
        this.O = caseRepository;
        this.P = attachmentService;
        a<String> aVar = new a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create<String>()");
        this.f5133n = aVar;
        a<Boolean> aVar2 = new a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "BehaviorSubject.create<Boolean>()");
        this.f5134o = aVar2;
        Delegates delegates = Delegates.INSTANCE;
        this.K = new CaseDetailsViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
        this.L = LazyKt__LazyJVMKt.lazy(new CaseDetailsViewModelImpl$tmgi$2(this, observableImpl));
    }

    public void A(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.v.setValue(this, Q[6], str);
    }

    public TmgiCaseDetailsViewModel B() {
        Lazy lazy = this.L;
        KProperty kProperty = Q[16];
        return (TmgiCaseDetailsViewModel) lazy.getValue();
    }

    public void B(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.u.setValue(this, Q[5], str);
    }

    public String E() {
        return (String) this.v.getValue(this, Q[6]);
    }

    public void F() {
        Decision a2 = a2();
        if (a2 != null) {
            b((Function1<? super Activity, ? extends Intent>) new CaseDetailsViewModelImpl$showDecision$1(this, a2));
        }
    }

    public String J() {
        return (String) this.z.getValue(this, Q[10]);
    }

    public void N() {
        Decision decision;
        boolean z2 = false;
        boolean z3 = a2() != null;
        if (b2() != null) {
            z2 = true;
        }
        if (z3 || z2) {
            if (Z1() != 0 ? (decision = b2()) == null : (decision = a2()) == null) {
                Intrinsics.throwNpe();
            }
            b((Function1<? super Activity, ? extends Intent>) new CaseDetailsViewModelImpl$showDecision$1(this, decision));
        }
    }

    public String O() {
        return (String) this.D.getValue(this, Q[12]);
    }

    public String P() {
        return (String) this.x.getValue(this, Q[8]);
    }

    public String Q() {
        return (String) this.E.getValue(this, Q[13]);
    }

    public boolean S() {
        return ((Boolean) this.C.getValue(this, Q[11])).booleanValue();
    }

    public BaseCase T() {
        return (BaseCase) this.K.getValue(this, Q[15]);
    }

    public int Z1() {
        return this.I;
    }

    public void a(BaseCase baseCase) {
        this.K.setValue(this, Q[15], baseCase);
    }

    public void a(Decision decision) {
        this.F = decision;
    }

    public Decision a2() {
        return this.F;
    }

    public void b(Decision decision) {
        this.G = decision;
    }

    public Decision b2() {
        return this.G;
    }

    public final void c(BaseCase baseCase) {
        b(baseCase.i().get(1));
        Decision b2 = b2();
        if (b2 == null) {
            Intrinsics.throwNpe();
        }
        if (b2.g() != null) {
            Decision b22 = b2();
            if (b22 == null) {
                Intrinsics.throwNpe();
            }
            c(b22);
            b(1);
        }
    }

    public void c(boolean z2) {
        this.C.setValue(this, Q[11], Boolean.valueOf(z2));
    }

    public final void d(BaseCase baseCase) {
        t(baseCase.u() + " - " + baseCase.v());
        s('(' + baseCase.j() + ')');
        y(UtilsKt.a(baseCase.o()));
        z(baseCase.p());
        StringBuilder sb = new StringBuilder();
        String s2 = baseCase.s();
        if (s2 == null) {
            s2 = "";
        }
        sb.append(s2);
        sb.append(' ');
        String t2 = baseCase.t();
        if (t2 == null) {
            t2 = "";
        }
        sb.append(t2);
        B(sb.toString());
        String r2 = baseCase.r();
        if (r2 == null) {
            r2 = "";
        }
        A(r2);
        String f = baseCase.f();
        if (f == null) {
            f = "";
        }
        q(f);
        String n2 = baseCase.n();
        if (n2 == null) {
            n2 = "";
        }
        w(n2);
        getAttachments().setValue(baseCase.h());
        String string = this.M.getString(R.string.mandatory_attachment);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.mandatory_attachment)");
        u(string);
        r mandatoryDocuments = getMandatoryDocuments();
        List<ApplicationMandatoryDocument> g2 = baseCase.g();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10));
        for (ApplicationMandatoryDocument applicationMandatoryDocument : g2) {
            Intrinsics.checkParameterIsNotNull(applicationMandatoryDocument, "$this$toAttachment");
            Integer i2 = applicationMandatoryDocument.i();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            arrayList.add(new Attachment(i2.intValue(), applicationMandatoryDocument.h(), (String) null, (AttachmentType) null, (AttachmentDownloadState) null, applicationMandatoryDocument.e(), (String) null, (String) null, 220, (DefaultConstructorMarker) null));
        }
        mandatoryDocuments.setValue(arrayList);
        v(this.M.getString(R.string.case_request) + " - " + this.M.getString(R.string.printable_document));
    }

    public void d(boolean z2) {
        this.f5135p.setValue(this, Q[0], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.f5135p.getValue(this, Q[0])).booleanValue();
    }

    public void e(boolean z2) {
        this.H.setValue(this, Q[14], Boolean.valueOf(z2));
    }

    public String i() {
        return (String) this.w.getValue(this, Q[7]);
    }

    public void k() {
        if (T() != null) {
            ViewModelExtensionsKt.a(this, this.P, this.f5134o, new CaseDetailsViewModelImpl$viewPrintableDocument$1(this));
        }
    }

    public String l() {
        return (String) this.t.getValue(this, Q[4]);
    }

    @t(h.a.ON_RESUME)
    public void loadCaseById() {
        n nVar;
        n<Profile> b = this.N.b();
        n<String> b2 = this.f5133n.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "caseIdSubject.distinctUntilChanged()");
        Intrinsics.checkParameterIsNotNull(b, "source1");
        Intrinsics.checkParameterIsNotNull(b2, "source2");
        k.b.f0.a aVar = k.b.f0.a.f7073a;
        b.a(b, "source1 is null");
        b.a(b2, "source2 is null");
        k.b.b0.h a2 = k.b.c0.b.a.a(aVar);
        int i2 = f.c;
        q[] qVarArr = {b, b2};
        b.a(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            nVar = n.j();
        } else {
            b.a(a2, "combiner is null");
            b.a(i2, "bufferSize");
            nVar = d.a(new k.b.c0.e.e.f(qVarArr, (Iterable) null, a2, i2 << 1, false));
        }
        n b3 = nVar.k(new CaseDetailsViewModelImpl$loadCaseById$1(this)).a(k.b.z.a.a.a()).d((k.b.b0.f<? super c>) new CaseDetailsViewModelImpl$loadCaseById$2(this)).c(new CaseDetailsViewModelImpl$loadCaseById$3(this)).b((k.b.b0.f<? super Throwable>) new CaseDetailsViewModelImpl$loadCaseById$4(this));
        Intrinsics.checkExpressionValueIsNotNull(b3, "Observables\n            …progressVisible = false }");
        a(k.b.f0.b.a(b3, new CaseDetailsViewModelImpl$loadCaseById$6(this), (Function0) null, new CaseDetailsViewModelImpl$loadCaseById$5(this), 2));
        c e = this.f5134o.e(new CaseDetailsViewModelImpl$loadCaseById$7(this));
        Intrinsics.checkExpressionValueIsNotNull(e, "progressSubject.subscribe { progressVisible = it }");
        a(e);
    }

    public String o() {
        return (String) this.f5136q.getValue(this, Q[1]);
    }

    public String q() {
        return (String) this.u.getValue(this, Q[5]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.y.setValue(this, Q[9], str);
    }

    public String r() {
        return (String) this.r.getValue(this, Q[2]);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.E.setValue(this, Q[13], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, Q[2], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5136q.setValue(this, Q[1], str);
    }

    public String u() {
        return (String) this.s.getValue(this, Q[3]);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.z.setValue(this, Q[10], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.w.setValue(this, Q[7], str);
    }

    public void w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.x.setValue(this, Q[8], str);
    }

    public boolean w() {
        return ((Boolean) this.H.getValue(this, Q[14])).booleanValue();
    }

    public void x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.D.setValue(this, Q[12], str);
    }

    public void y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, Q[3], str);
    }

    public String z() {
        return (String) this.y.getValue(this, Q[9]);
    }

    public void z(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.t.setValue(this, Q[4], str);
    }

    public void a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        ViewModelExtensionsKt.a((AuthenticatedViewModel) this, this.P, (k.b.h0.d<Boolean>) this.f5134o, (r<List<Attachment>>) getAttachments(), attachment, (Function0<? extends n<File>>) new CaseDetailsViewModelImpl$onSelect$1(this, attachment));
    }

    public void b(int i2) {
        this.I = i2;
    }

    public r<List<Attachment>> getAttachments() {
        return this.B;
    }

    public r<List<Attachment>> getMandatoryDocuments() {
        return this.A;
    }

    public final void b(BaseCase baseCase) {
        a(baseCase.i().get(0));
        State.StateType q2 = baseCase.q();
        int i2 = WhenMappings.f5139a[q2.ordinal()];
        boolean z2 = true;
        if (i2 != 1) {
            String str = "";
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                Decision a2 = a2();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                String g2 = a2.g();
                boolean z3 = g2 != null && g2.length() > 0;
                Decision a22 = a2();
                if (a22 == null) {
                    Intrinsics.throwNpe();
                }
                Judgement h2 = a22.h();
                e(z3 & (h2 != null ? h2.g() : false));
                if (w()) {
                    str = this.M.getString(R.string.Rectification_sent_button_title);
                    Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.stri…cation_sent_button_title)");
                }
                x(str);
            } else if (i2 == 5) {
                x(str);
                e(false);
            }
        } else {
            String string = this.M.getString(R.string.Rectification_is_needed_button_title);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…n_is_needed_button_title)");
            x(string);
            e(true);
        }
        boolean z4 = q2 == State.StateType.CLOSED;
        if (q2 != State.StateType.DONE) {
            z2 = false;
        }
        if (z4 || z2) {
            Decision a23 = a2();
            if (a23 == null) {
                Intrinsics.throwNpe();
            }
            c(a23);
            b(0);
        }
    }

    public final void c(Decision decision) {
        Judgement h2 = decision.h();
        Judgement.JudgementType f = h2 != null ? h2.f() : null;
        if (f != null) {
            int i2 = WhenMappings.b[f.ordinal()];
            if (i2 == 1) {
                String string = this.M.getString(R.string.Case_with_accepted_decision);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…e_with_accepted_decision)");
                r(string);
                c(true);
                return;
            } else if (i2 == 2) {
                String string2 = this.M.getString(R.string.Case_with_declined_decision);
                Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri…e_with_declined_decision)");
                r(string2);
                c(true);
                return;
            }
        }
        c(false);
    }
}
