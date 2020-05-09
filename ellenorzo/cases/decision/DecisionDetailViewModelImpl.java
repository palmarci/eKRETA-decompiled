package p289hu.ekreta.ellenorzo.cases.decision;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepository;
import p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5036u;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p337h0.C5016a;
import p300k.p313b.p337h0.C5021d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\b\u0010o\u001a\u00020pH\u0016J\u0010\u0010q\u001a\u00020p2\u0006\u0010r\u001a\u00020EH\u0002J\u0010\u0010s\u001a\u00020p2\b\u0010t\u001a\u0004\u0018\u00010%J\u0010\u0010u\u001a\u00020p2\u0006\u0010r\u001a\u00020EH\u0016J\u0010\u0010v\u001a\u00020p2\u0006\u0010r\u001a\u00020EH\u0016J\u0010\u0010w\u001a\u00020p2\u0006\u0010r\u001a\u00020EH\u0002J\b\u0010x\u001a\u00020pH\u0016J\b\u0010y\u001a\u00020pH\u0016R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\"R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010%8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010,\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\"R+\u00101\u001a\u0002002\u0006\u0010\u001e\u001a\u0002008V@VX\u0002¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R+\u00107\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\"R+\u0010;\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b>\u0010$\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\"R\u001b\u0010?\u001a\u0002008VX\u0002¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\b@\u00103R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0CX\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR+\u0010H\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\bK\u0010$\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010\"R+\u0010L\u001a\u0002002\u0006\u0010\u001e\u001a\u0002008V@VX\u0002¢\u0006\u0012\n\u0004\bO\u0010$\u001a\u0004\bM\u00103\"\u0004\bN\u00105R\u001a\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020R0QX\u0004¢\u0006\u0002\n\u0000R+\u0010S\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\bV\u0010$\u001a\u0004\bT\u0010\u001d\"\u0004\bU\u0010\"R+\u0010W\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\bZ\u0010$\u001a\u0004\bX\u0010\u001d\"\u0004\bY\u0010\"R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010[\u001a\u0010\u0012\f\u0012\n ]*\u0004\u0018\u000100000\\X\u0004¢\u0006\u0002\n\u0000R+\u0010^\u001a\u0002002\u0006\u0010\u001e\u001a\u0002008V@VX\u0002¢\u0006\u0012\n\u0004\ba\u0010$\u001a\u0004\b_\u00103\"\u0004\b`\u00105R+\u0010b\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\be\u0010$\u001a\u0004\bc\u0010\u001d\"\u0004\bd\u0010\"R+\u0010f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\bi\u0010$\u001a\u0004\bg\u0010\u001d\"\u0004\bh\u0010\"R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020l0kX\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010n¨\u0006z"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "signerRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "contentResolver", "Landroid/content/ContentResolver;", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "decisionRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "caseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Landroid/content/ContentResolver;Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;)V", "actionBarTitle", "", "getActionBarTitle", "()Ljava/lang/String;", "<set-?>", "adjudication", "getAdjudication", "setAdjudication", "(Ljava/lang/String;)V", "adjudication$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "caseDetailParameter", "getCaseDetailParameter", "()Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "setCaseDetailParameter", "(Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;)V", "caseDetailParameter$delegate", "decisionDate", "getDecisionDate", "setDecisionDate", "decisionDate$delegate", "", "decisionNeedsToBeSend", "getDecisionNeedsToBeSend", "()Z", "setDecisionNeedsToBeSend", "(Z)V", "decisionNeedsToBeSend$delegate", "decisionType", "getDecisionType", "setDecisionType", "decisionType$delegate", "documentNumber", "getDocumentNumber", "setDocumentNumber", "documentNumber$delegate", "emptyViewVisible", "getEmptyViewVisible", "emptyViewVisible$delegate", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "justification", "getJustification", "setJustification", "justification$delegate", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "localFiles", "", "Landroid/net/Uri;", "longName", "getLongName", "setLongName", "longName$delegate", "printableDocument", "getPrintableDocument", "setPrintableDocument", "printableDocument$delegate", "progressSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "provenAbsenceDate", "getProvenAbsenceDate", "setProvenAbsenceDate", "provenAbsenceDate$delegate", "signer", "getSigner", "setSigner", "signer$delegate", "temporaryAttachments", "", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryAttachments", "()Ljava/util/List;", "addAttachment", "", "downloadAttachmentFromServer", "item", "loadRectification", "newCase", "onDelete", "onSelect", "openLocalAttachment", "send", "viewPrintableDocument", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl extends AuthenticatedViewModel implements DecisionDetailViewModel {

    /* renamed from: M */
    public static final /* synthetic */ KProperty[] f11371M;

    /* renamed from: A */
    public final List<OtherThingsToDoAttachment> f11372A;

    /* renamed from: B */
    public final ReadWriteProperty f11373B;

    /* renamed from: C */
    public final C5016a<Boolean> f11374C;

    /* renamed from: D */
    public final Map<String, Uri> f11375D;

    /* renamed from: E */
    public final Context f11376E;

    /* renamed from: F */
    public final ProfileRepository f11377F;

    /* renamed from: G */
    public final SignerRepository f11378G;

    /* renamed from: H */
    public final AttachmentService f11379H;

    /* renamed from: I */
    public final ContentResolver f11380I;

    /* renamed from: J */
    public final AttachmentRepository f11381J;

    /* renamed from: K */
    public final DecisionRepository f11382K;

    /* renamed from: L */
    public final CaseTypeRepository f11383L;

    /* renamed from: m */
    public final ReadWriteProperty f11384m = DataBindingViewModel.boundBoolean$default(this, this, 3, false, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f11385n;

    /* renamed from: o */
    public final ReadWriteProperty f11386o;

    /* renamed from: p */
    public final ReadWriteProperty f11387p;

    /* renamed from: q */
    public final ReadWriteProperty f11388q;

    /* renamed from: r */
    public final ReadWriteProperty f11389r;

    /* renamed from: s */
    public final ReadWriteProperty f11390s;

    /* renamed from: t */
    public final ReadWriteProperty f11391t;

    /* renamed from: u */
    public final ReadWriteProperty f11392u;

    /* renamed from: v */
    public final ReadWriteProperty f11393v;

    /* renamed from: w */
    public final ReadWriteProperty f11394w;

    /* renamed from: x */
    public final ReadWriteProperty f11395x;

    /* renamed from: y */
    public final ReadWriteProperty f11396y;

    /* renamed from: z */
    public final C3824r<List<Attachment>> f11397z;

    static {
        Class<DecisionDetailViewModelImpl> cls = DecisionDetailViewModelImpl.class;
        f11371M = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emptyViewVisible", "getEmptyViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "caseDetailParameter", "getCaseDetailParameter()Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "longName", "getLongName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "documentNumber", "getDocumentNumber()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "provenAbsenceDate", "getProvenAbsenceDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "justification", "getJustification()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "adjudication", "getAdjudication()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionType", "getDecisionType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "signer", "getSigner()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionDate", "getDecisionDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionNeedsToBeSend", "getDecisionNeedsToBeSend()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "printableDocument", "getPrintableDocument()Ljava/lang/String;"))};
    }

    public DecisionDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, Context context, ProfileRepository profileRepository, SignerRepository signerRepository, AttachmentService attachmentService, ContentResolver contentResolver, AttachmentRepository attachmentRepository, DecisionRepository decisionRepository, CaseTypeRepository caseTypeRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(signerRepository, "signerRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(contentResolver, "contentResolver");
        Intrinsics.checkParameterIsNotNull(attachmentRepository, "attachmentRepository");
        Intrinsics.checkParameterIsNotNull(decisionRepository, "decisionRepository");
        Intrinsics.checkParameterIsNotNull(caseTypeRepository, "caseTypeRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f11376E = context;
        this.f11377F = profileRepository;
        this.f11378G = signerRepository;
        this.f11379H = attachmentService;
        this.f11380I = contentResolver;
        this.f11381J = attachmentRepository;
        this.f11382K = decisionRepository;
        this.f11383L = caseTypeRepository;
        this.f11385n = DataBindingViewModel.boundBoolean$default(this, this, 65, false, null, 6, null);
        Delegates delegates = Delegates.INSTANCE;
        this.f11386o = new DecisionDetailViewModelImpl$$special$$inlined$observable$1(null, null, this);
        this.f11387p = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);
        this.f11388q = DataBindingViewModel.boundString$default(this, this, 63, null, null, 6, null);
        this.f11389r = DataBindingViewModel.boundString$default(this, this, 71, null, null, 6, null);
        this.f11390s = DataBindingViewModel.boundString$default(this, this, 80, null, null, 6, null);
        this.f11391t = DataBindingViewModel.boundString$default(this, this, 1, null, null, 6, null);
        this.f11392u = DataBindingViewModel.boundString$default(this, this, 97, null, null, 6, null);
        this.f11393v = DataBindingViewModel.boundString$default(this, this, 59, null, null, 6, null);
        this.f11394w = DataBindingViewModel.boundString$default(this, this, 17, null, null, 6, null);
        this.f11395x = DataBindingViewModel.boundString$default(this, this, 109, null, null, 6, null);
        this.f11396y = DataBindingViewModel.boundBoolean$default(this, this, 78, false, null, 6, null);
        this.f11397z = new C3824r<>();
        this.f11372A = new ArrayList();
        this.f11373B = DataBindingViewModel.boundString$default(this, this, 29, null, null, 6, null);
        C5016a<Boolean> aVar = new C5016a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create<Boolean>()");
        this.f11374C = aVar;
        this.f11375D = new LinkedHashMap();
        C4663c e = this.f11374C.mo17240e((C4673f<? super T>) new C4673f<Boolean>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl f11398c;

            {
                this.f11398c = r1;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                DecisionDetailViewModelImpl decisionDetailViewModelImpl = this.f11398c;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                decisionDetailViewModelImpl.mo11748d(bool.booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e, "progressSubject.subscribe { progressVisible = it }");
        mo16413a(e);
    }

    /* renamed from: P1 */
    public CaseDetailParameter mo11742P1() {
        return (CaseDetailParameter) this.f11386o.getValue(this, f11371M[2]);
    }

    /* renamed from: Q1 */
    public List<OtherThingsToDoAttachment> mo11743Q1() {
        return this.f11372A;
    }

    /* renamed from: U */
    public void mo11726U() {
        mo16373a((Function1<? super C3737d, Unit>) new DecisionDetailViewModelImpl$addAttachment$1<Object,Unit>(this));
    }

    /* renamed from: W */
    public String mo11727W() {
        return (String) this.f11393v.getValue(this, f11371M[9]);
    }

    /* renamed from: Y */
    public String mo11728Y() {
        return (String) this.f11394w.getValue(this, f11371M[10]);
    }

    /* renamed from: Z */
    public String mo11729Z() {
        return (String) this.f11395x.getValue(this, f11371M[11]);
    }

    /* renamed from: a */
    public void onSelect(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        if (this.f11375D.containsKey(attachment.mo11438j())) {
            Uri uri = (Uri) this.f11375D.get(attachment.mo11438j());
            if (uri != null) {
                mo16373a((Function1<? super C3737d, Unit>) new C4064xfd4c6fcd<Object,Unit>(uri, this));
                return;
            }
            return;
        }
        CaseDetailParameter P1 = mo11742P1();
        Boolean valueOf = P1 != null ? Boolean.valueOf(P1.mo11704h()) : null;
        if (valueOf == null) {
            Intrinsics.throwNpe();
        }
        C3984v.m10232a((AuthenticatedViewModel) this, this.f11379H, (C5021d<Boolean>) this.f11374C, getItems(), attachment, (Function0<? extends C5027n<File>>) new DecisionDetailViewModelImpl$downloadAttachmentFromServer$1<Object>(this, attachment, valueOf.booleanValue() ? "dokumentumok/hatarozatok" : "dokumentumok/kerelmek"));
    }

    /* renamed from: a */
    public void mo11730a(CaseDetailParameter caseDetailParameter) {
        this.f11386o.setValue(this, f11371M[2], caseDetailParameter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r0 != null) goto L_0x00b6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11745b(p289hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x012e
            java.lang.String r0 = r7.mo11706i()
            r6.mo11754w(r0)
            java.lang.String r0 = r7.mo11703g()
            r6.mo11752u(r0)
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r7.mo11700e()
            java.util.Calendar r0 = r0.mo11956k()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            hu.ekreta.ellenorzo.cases.subModels.Decision r3 = r7.mo11700e()
            java.util.Calendar r3 = r3.mo11955j()
            if (r3 != 0) goto L_0x002a
            r1 = 1
        L_0x002a:
            r0 = r0 | r1
            java.lang.String r1 = " - "
            r3 = 0
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0034
            r0 = r4
            goto L_0x0066
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            hu.ekreta.ellenorzo.cases.subModels.Decision r5 = r7.mo11700e()
            java.util.Calendar r5 = r5.mo11956k()
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14828a(r5)
            goto L_0x0049
        L_0x0048:
            r5 = r3
        L_0x0049:
            r0.append(r5)
            r0.append(r1)
            hu.ekreta.ellenorzo.cases.subModels.Decision r5 = r7.mo11700e()
            java.util.Calendar r5 = r5.mo11955j()
            if (r5 == 0) goto L_0x005e
            java.lang.String r5 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14828a(r5)
            goto L_0x005f
        L_0x005e:
            r5 = r3
        L_0x005f:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x0066:
            r6.mo11756y(r0)
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r7.mo11700e()
            java.lang.String r0 = r0.mo11954i()
            if (r0 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r0 = r4
        L_0x0075:
            r6.mo11753v(r0)
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r7.mo11700e()
            java.lang.String r0 = r0.mo11946d()
            if (r0 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r0 = r4
        L_0x0084:
            r6.mo11749r(r0)
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r7.mo11700e()
            hu.ekreta.ellenorzo.cases.subModels.Judgement r0 = r0.mo11952h()
            if (r0 == 0) goto L_0x009c
            android.content.Context r5 = r6.f11376E
            int r0 = r0.mo11974d()
            java.lang.String r0 = r5.getString(r0)
            goto L_0x009d
        L_0x009c:
            r0 = r3
        L_0x009d:
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r0 = r4
        L_0x00a1:
            r6.mo11751t(r0)
            hu.ekreta.ellenorzo.cases.subModels.Decision r0 = r7.mo11700e()
            java.util.Calendar r0 = r0.mo11950f()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = p289hu.ekreta.ellenorzo.util.datetime.UtilsKt.m14828a(r0)
            if (r0 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = r4
        L_0x00b6:
            r6.mo11750s(r0)
            h.p.r r0 = r6.getItems()
            hu.ekreta.ellenorzo.cases.subModels.Decision r4 = r7.mo11700e()
            java.util.List r4 = r4.mo11948e()
            boolean r5 = r4.isEmpty()
            r2 = r2 ^ r5
            r6.mo11747c(r2)
            r0.setValue(r4)
            boolean r0 = r7.mo11702f()
            r6.mo11746b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r2 = r6.f11376E
            boolean r4 = r7.mo11704h()
            if (r4 == 0) goto L_0x00e8
            r4 = 2131689649(0x7f0f00b1, float:1.900832E38)
            goto L_0x00eb
        L_0x00e8:
            r4 = 2131689711(0x7f0f00ef, float:1.9008445E38)
        L_0x00eb:
            java.lang.String r2 = r2.getString(r4)
            r0.append(r2)
            r0.append(r1)
            android.content.Context r1 = r6.f11376E
            r2 = 2131690024(0x7f0f0228, float:1.900908E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.mo11755x(r0)
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r6.f11377F
            k.b.n r0 = r0.mo14191b()
            hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$1 r1 = new hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$1
            r1.<init>(r7, r6)
            k.b.n r7 = r0.mo17234c(r1)
            java.lang.String r0 = "profileRepository\n      …      }\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r0)
            hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$2 r0 = new hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$2
            r0.<init>(r6)
            hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$3 r1 = new hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$3
            r1.<init>(r6)
            r2 = 2
            k.b.a0.c r7 = p300k.p313b.p335f0.C4998b.m16842a(r7, r1, r3, r0, r2)
            r6.mo16413a(r7)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl.mo11745b(hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter):void");
    }

    /* renamed from: b */
    public void mo11746b(boolean z) {
        this.f11396y.setValue(this, f11371M[12], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo11747c(boolean z) {
        this.f11384m.setValue(this, f11371M[0], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo11748d(boolean z) {
        this.f11387p.setValue(this, f11371M[3], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo11494d() {
        return ((Boolean) this.f11387p.getValue(this, f11371M[3])).booleanValue();
    }

    /* renamed from: d0 */
    public String mo11732d0() {
        CaseDetailParameter P1 = mo11742P1();
        if (P1 == null) {
            Intrinsics.throwNpe();
        }
        String string = this.f11376E.getString(P1.mo11704h() ? C4014R.string.MenuItem_Cases_Decision_Title : C4014R.string.Rectification_title);
        if (string != null) {
            return string;
        }
        String string2 = this.f11376E.getString(C4014R.string.Rectification_title);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(\n     …ification_title\n        )");
        return string2;
    }

    /* renamed from: e */
    public void mo11495e() {
    }

    /* renamed from: e0 */
    public String mo11733e0() {
        return (String) this.f11390s.getValue(this, f11371M[6]);
    }

    /* renamed from: f */
    public boolean mo11496f() {
        return ((Boolean) this.f11385n.getValue(this, f11371M[1])).booleanValue();
    }

    /* renamed from: f0 */
    public String mo11734f0() {
        return (String) this.f11392u.getValue(this, f11371M[8]);
    }

    /* renamed from: i */
    public String mo11735i() {
        return (String) this.f11373B.getValue(this, f11371M[13]);
    }

    /* renamed from: k */
    public void mo11736k() {
        if (mo11742P1() != null) {
            CaseDetailParameter P1 = mo11742P1();
            if (P1 == null) {
                Intrinsics.throwNpe();
            }
            C3984v.m10233a((AuthenticatedViewModel) this, this.f11379H, (C5021d<Boolean>) this.f11374C, (Function0<? extends C5027n<File>>) new DecisionDetailViewModelImpl$viewPrintableDocument$1<Object>(this, P1.mo11700e().mo11951g()));
        }
    }

    /* renamed from: m0 */
    public String mo11737m0() {
        return (String) this.f11391t.getValue(this, f11371M[7]);
    }

    /* renamed from: o */
    public String mo11738o() {
        return (String) this.f11388q.getValue(this, f11371M[4]);
    }

    /* renamed from: r */
    public String mo11739r() {
        return (String) this.f11389r.getValue(this, f11371M[5]);
    }

    /* renamed from: r */
    public void mo11749r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11392u.setValue(this, f11371M[8], str);
    }

    /* renamed from: s */
    public void mo11750s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11395x.setValue(this, f11371M[11], str);
    }

    /* renamed from: t */
    public void mo11751t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11393v.setValue(this, f11371M[9], str);
    }

    /* renamed from: u */
    public void mo11752u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11389r.setValue(this, f11371M[5], str);
    }

    /* renamed from: v */
    public void mo11753v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11391t.setValue(this, f11371M[7], str);
    }

    /* renamed from: w */
    public void mo11754w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11388q.setValue(this, f11371M[4], str);
    }

    /* renamed from: w0 */
    public boolean mo11740w0() {
        return ((Boolean) this.f11396y.getValue(this, f11371M[12])).booleanValue();
    }

    /* renamed from: x */
    public void mo11741x() {
        C5036u d = this.f11377F.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new DecisionDetailViewModelImpl$send$1<Object,Object>(this)).mo17232c((C4668a) new DecisionDetailViewModelImpl$send$2(this)).mo17239d();
        Intrinsics.checkExpressionValueIsNotNull(d, "profileRepository\n      …          .firstOrError()");
        mo16413a(C4998b.m16843a(d, (Function1<? super Throwable, Unit>) new DecisionDetailViewModelImpl$send$4<Object,Unit>(this), (Function1<? super T, Unit>) new DecisionDetailViewModelImpl$send$3<Object,Unit>(this)));
    }

    /* renamed from: x */
    public void mo11755x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11373B.setValue(this, f11371M[13], str);
    }

    /* renamed from: y */
    public void mo11756y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11390s.setValue(this, f11371M[6], str);
    }

    /* renamed from: z */
    public void mo11757z(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11394w.setValue(this, f11371M[10], str);
    }

    public C3824r<List<Attachment>> getItems() {
        return this.f11397z;
    }

    /* renamed from: b */
    public void mo11731b(Attachment attachment) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        C3824r items = getItems();
        List list = (List) getItems().mo6263a();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                if (!Intrinsics.areEqual((Object) ((Attachment) next).mo11438j(), (Object) attachment.mo11438j())) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        items.setValue(arrayList);
        int i = 0;
        Iterator it = mo11743Q1().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((OtherThingsToDoAttachment) it.next()).mo11988a(attachment.mo11438j())) {
                break;
            } else {
                i++;
            }
        }
        mo11743Q1().remove(i);
    }
}
