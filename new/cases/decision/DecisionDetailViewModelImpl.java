package hu.ekreta.ellenorzo.cases.decision;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import h.m.d.d;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepository;
import hu.ekreta.ellenorzo.cases.subModels.Judgement;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.a0.c;
import k.b.b0.f;
import k.b.f0.b;
import k.b.h0.a;
import k.b.n;
import k.b.u;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\b\u0010q\u001a\u00020rH\u0016J\u0010\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020GH\u0002J\u0010\u0010u\u001a\u00020r2\b\u0010v\u001a\u0004\u0018\u00010'J\u0010\u0010w\u001a\u00020r2\u0006\u0010t\u001a\u00020GH\u0016J\u0010\u0010x\u001a\u00020r2\u0006\u0010t\u001a\u00020GH\u0016J\u0010\u0010y\u001a\u00020r2\u0006\u0010t\u001a\u00020GH\u0002J\b\u0010z\u001a\u00020rH\u0016J\b\u0010{\u001a\u00020rH\u0016R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR+\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010$R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010'8V@VX\u0002¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010.\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010$R+\u00103\u001a\u0002022\u0006\u0010 \u001a\u0002028V@VX\u0002¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R+\u00109\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b<\u0010&\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010$R+\u0010=\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010$R\u001b\u0010A\u001a\u0002028VX\u0002¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bB\u00105R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0EX\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR+\u0010J\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bM\u0010&\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010$R+\u0010N\u001a\u0002022\u0006\u0010 \u001a\u0002028V@VX\u0002¢\u0006\u0012\n\u0004\bQ\u0010&\u001a\u0004\bO\u00105\"\u0004\bP\u00107R\u001a\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020T0SX\u0004¢\u0006\u0002\n\u0000R+\u0010U\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bX\u0010&\u001a\u0004\bV\u0010\u001f\"\u0004\bW\u0010$R+\u0010Y\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b\\\u0010&\u001a\u0004\bZ\u0010\u001f\"\u0004\b[\u0010$R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010]\u001a\u0010\u0012\f\u0012\n _*\u0004\u0018\u000102020^X\u0004¢\u0006\u0002\n\u0000R+\u0010`\u001a\u0002022\u0006\u0010 \u001a\u0002028V@VX\u0002¢\u0006\u0012\n\u0004\bc\u0010&\u001a\u0004\ba\u00105\"\u0004\bb\u00107R+\u0010d\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bg\u0010&\u001a\u0004\be\u0010\u001f\"\u0004\bf\u0010$R+\u0010h\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bk\u0010&\u001a\u0004\bi\u0010\u001f\"\u0004\bj\u0010$R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020n0mX\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010p¨\u0006|"}, d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "signerRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "contentResolver", "Landroid/content/ContentResolver;", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "decisionRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "caseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Landroid/content/ContentResolver;Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;)V", "actionBarTitle", "", "getActionBarTitle", "()Ljava/lang/String;", "<set-?>", "adjudication", "getAdjudication", "setAdjudication", "(Ljava/lang/String;)V", "adjudication$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "caseDetailParameter", "getCaseDetailParameter", "()Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "setCaseDetailParameter", "(Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;)V", "caseDetailParameter$delegate", "decisionDate", "getDecisionDate", "setDecisionDate", "decisionDate$delegate", "", "decisionNeedsToBeSend", "getDecisionNeedsToBeSend", "()Z", "setDecisionNeedsToBeSend", "(Z)V", "decisionNeedsToBeSend$delegate", "decisionType", "getDecisionType", "setDecisionType", "decisionType$delegate", "documentNumber", "getDocumentNumber", "setDocumentNumber", "documentNumber$delegate", "emptyViewVisible", "getEmptyViewVisible", "emptyViewVisible$delegate", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "justification", "getJustification", "setJustification", "justification$delegate", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "localFiles", "", "Landroid/net/Uri;", "longName", "getLongName", "setLongName", "longName$delegate", "printableDocument", "getPrintableDocument", "setPrintableDocument", "printableDocument$delegate", "progressSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "provenAbsenceDate", "getProvenAbsenceDate", "setProvenAbsenceDate", "provenAbsenceDate$delegate", "signer", "getSigner", "setSigner", "signer$delegate", "temporaryAttachments", "", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryAttachments", "()Ljava/util/List;", "addAttachment", "", "downloadAttachmentFromServer", "item", "loadRectification", "newCase", "onDelete", "onSelect", "openLocalAttachment", "send", "viewPrintableDocument", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl extends AuthenticatedViewModel implements DecisionDetailViewModel {
    public static final /* synthetic */ KProperty[] N;
    public final r<List<Attachment>> A;
    public final List<OtherThingsToDoAttachment> B;
    public final ReadWriteProperty C;
    public final a<Boolean> D;
    public final Map<String, Uri> E;
    public final Context F;
    public final ProfileRepository G;
    public final SignerRepository H;
    public final AttachmentService I;
    public final ContentResolver J;
    public final AttachmentRepository K;
    public final DecisionRepository L;
    public final CaseTypeRepository M;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5118n = DataBindingViewModel.boundBoolean$default(this, this, 3, false, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5119o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5120p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5121q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;
    public final ReadWriteProperty t;
    public final ReadWriteProperty u;
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public final ReadWriteProperty x;
    public final ReadWriteProperty y;
    public final ReadWriteProperty z;

    static {
        Class<DecisionDetailViewModelImpl> cls = DecisionDetailViewModelImpl.class;
        N = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emptyViewVisible", "getEmptyViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "caseDetailParameter", "getCaseDetailParameter()Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "longName", "getLongName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "documentNumber", "getDocumentNumber()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "provenAbsenceDate", "getProvenAbsenceDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "justification", "getJustification()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "adjudication", "getAdjudication()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionType", "getDecisionType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "signer", "getSigner()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionDate", "getDecisionDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "decisionNeedsToBeSend", "getDecisionNeedsToBeSend()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "printableDocument", "getPrintableDocument()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecisionDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, Context context, ProfileRepository profileRepository, SignerRepository signerRepository, AttachmentService attachmentService, ContentResolver contentResolver, AttachmentRepository attachmentRepository, DecisionRepository decisionRepository, CaseTypeRepository caseTypeRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(signerRepository, "signerRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(contentResolver, "contentResolver");
        Intrinsics.checkParameterIsNotNull(attachmentRepository, "attachmentRepository");
        Intrinsics.checkParameterIsNotNull(decisionRepository, "decisionRepository");
        Intrinsics.checkParameterIsNotNull(caseTypeRepository, "caseTypeRepository");
        this.F = context;
        this.G = profileRepository;
        this.H = signerRepository;
        this.I = attachmentService;
        this.J = contentResolver;
        this.K = attachmentRepository;
        this.L = decisionRepository;
        this.M = caseTypeRepository;
        this.f5119o = DataBindingViewModel.boundBoolean$default(this, this, 65, false, (Function1) null, 6, (Object) null);
        Delegates delegates = Delegates.INSTANCE;
        this.f5120p = new DecisionDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
        this.f5121q = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 63, (String) null, (Function1) null, 6, (Object) null);
        this.s = DataBindingViewModel.boundString$default(this, this, 71, (String) null, (Function1) null, 6, (Object) null);
        this.t = DataBindingViewModel.boundString$default(this, this, 80, (String) null, (Function1) null, 6, (Object) null);
        this.u = DataBindingViewModel.boundString$default(this, this, 1, (String) null, (Function1) null, 6, (Object) null);
        this.v = DataBindingViewModel.boundString$default(this, this, 99, (String) null, (Function1) null, 6, (Object) null);
        this.w = DataBindingViewModel.boundString$default(this, this, 59, (String) null, (Function1) null, 6, (Object) null);
        this.x = DataBindingViewModel.boundString$default(this, this, 17, (String) null, (Function1) null, 6, (Object) null);
        this.y = DataBindingViewModel.boundString$default(this, this, 112, (String) null, (Function1) null, 6, (Object) null);
        this.z = DataBindingViewModel.boundBoolean$default(this, this, 78, false, (Function1) null, 6, (Object) null);
        this.A = new r<>();
        this.B = new ArrayList();
        this.C = DataBindingViewModel.boundString$default(this, this, 29, (String) null, (Function1) null, 6, (Object) null);
        a<Boolean> aVar = new a<>();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create<Boolean>()");
        this.D = aVar;
        this.E = new LinkedHashMap();
        c e = this.D.e(new f<Boolean>(this) {
            public final /* synthetic */ DecisionDetailViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                DecisionDetailViewModelImpl decisionDetailViewModelImpl = this.c;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                decisionDetailViewModelImpl.e(bool.booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e, "progressSubject.subscribe { progressVisible = it }");
        a(e);
    }

    public void U() {
        a((Function1<? super d, Unit>) new DecisionDetailViewModelImpl$addAttachment$1(this));
    }

    public String W() {
        return (String) this.w.getValue(this, N[9]);
    }

    public String Y() {
        return (String) this.x.getValue(this, N[10]);
    }

    public String Z() {
        return (String) this.y.getValue(this, N[11]);
    }

    public CaseDetailParameter Z1() {
        return (CaseDetailParameter) this.f5120p.getValue(this, N[2]);
    }

    /* renamed from: a */
    public void onSelect(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        if (this.E.containsKey(attachment.k())) {
            Uri uri = this.E.get(attachment.k());
            if (uri != null) {
                a((Function1<? super d, Unit>) new DecisionDetailViewModelImpl$openLocalAttachment$$inlined$let$lambda$1(uri, this));
                return;
            }
            return;
        }
        CaseDetailParameter Z1 = Z1();
        Boolean valueOf = Z1 != null ? Boolean.valueOf(Z1.h()) : null;
        if (valueOf == null) {
            Intrinsics.throwNpe();
        }
        ViewModelExtensionsKt.a((AuthenticatedViewModel) this, this.I, (k.b.h0.d<Boolean>) this.D, (r<List<Attachment>>) getItems(), attachment, (Function0<? extends n<File>>) new DecisionDetailViewModelImpl$downloadAttachmentFromServer$1(this, attachment, valueOf.booleanValue() ? "dokumentumok/hatarozatok" : "dokumentumok/kerelmek"));
    }

    public void a(CaseDetailParameter caseDetailParameter) {
        this.f5120p.setValue(this, N[2], caseDetailParameter);
    }

    public List<OtherThingsToDoAttachment> a2() {
        return this.B;
    }

    public final void b(CaseDetailParameter caseDetailParameter) {
        String str;
        String str2;
        if (caseDetailParameter != null) {
            v(caseDetailParameter.i());
            t(caseDetailParameter.g());
            boolean z2 = false;
            boolean z3 = caseDetailParameter.e().k() == null;
            if (caseDetailParameter.e().j() == null) {
                z2 = true;
            }
            if (z3 || z2) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                Calendar k2 = caseDetailParameter.e().k();
                sb.append(k2 != null ? UtilsKt.a(k2) : null);
                sb.append(" - ");
                Calendar j2 = caseDetailParameter.e().j();
                sb.append(j2 != null ? UtilsKt.a(j2) : null);
                str = sb.toString();
            }
            x(str);
            String i2 = caseDetailParameter.e().i();
            if (i2 == null) {
                i2 = "";
            }
            u(i2);
            String d2 = caseDetailParameter.e().d();
            if (d2 == null) {
                d2 = "";
            }
            q(d2);
            Judgement h2 = caseDetailParameter.e().h();
            String string = h2 != null ? this.F.getString(h2.d()) : null;
            if (string == null) {
                string = "";
            }
            s(string);
            Calendar f = caseDetailParameter.e().f();
            if (f == null || (str2 = UtilsKt.a(f)) == null) {
                str2 = "";
            }
            r(str2);
            r items = getItems();
            List<Attachment> e = caseDetailParameter.e().e();
            d(true ^ e.isEmpty());
            items.setValue(e);
            c(caseDetailParameter.f());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.F.getString(caseDetailParameter.h() ? R.string.MenuItem_Cases_Decision_Title : R.string.Rectification_title));
            sb2.append(" - ");
            sb2.append(this.F.getString(R.string.printable_document));
            w(sb2.toString());
            n<R> c = this.G.b().c(new DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$1(caseDetailParameter, this));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository\n      …      }\n                }");
            a(b.a(c, new DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$3(this), (Function0) null, new DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$2(this), 2));
        }
    }

    public void c(boolean z2) {
        this.z.setValue(this, N[12], Boolean.valueOf(z2));
    }

    public void d(boolean z2) {
        this.f5118n.setValue(this, N[0], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.f5121q.getValue(this, N[3])).booleanValue();
    }

    public String d0() {
        CaseDetailParameter Z1 = Z1();
        if (Z1 == null) {
            Intrinsics.throwNpe();
        }
        String string = this.F.getString(Z1.h() ? R.string.MenuItem_Cases_Decision_Title : R.string.Rectification_title);
        if (string != null) {
            return string;
        }
        String string2 = this.F.getString(R.string.Rectification_title);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(\n     …ification_title\n        )");
        return string2;
    }

    public void e() {
    }

    public void e(boolean z2) {
        this.f5121q.setValue(this, N[3], Boolean.valueOf(z2));
    }

    public String e0() {
        return (String) this.t.getValue(this, N[6]);
    }

    public boolean f() {
        return ((Boolean) this.f5119o.getValue(this, N[1])).booleanValue();
    }

    public String f0() {
        return (String) this.v.getValue(this, N[8]);
    }

    public String i() {
        return (String) this.C.getValue(this, N[13]);
    }

    public void k() {
        if (Z1() != null) {
            CaseDetailParameter Z1 = Z1();
            if (Z1 == null) {
                Intrinsics.throwNpe();
            }
            ViewModelExtensionsKt.a(this, this.I, this.D, new DecisionDetailViewModelImpl$viewPrintableDocument$1(this, Z1.e().g()));
        }
    }

    public String m0() {
        return (String) this.u.getValue(this, N[7]);
    }

    public String o() {
        return (String) this.r.getValue(this, N[4]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.v.setValue(this, N[8], str);
    }

    public String r() {
        return (String) this.s.getValue(this, N[5]);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.y.setValue(this, N[11], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.w.setValue(this, N[9], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, N[5], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.u.setValue(this, N[7], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, N[4], str);
    }

    public void w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.C.setValue(this, N[13], str);
    }

    public boolean w0() {
        return ((Boolean) this.z.getValue(this, N[12])).booleanValue();
    }

    public void x() {
        u<R> d2 = this.G.b().c(new DecisionDetailViewModelImpl$send$1(this)).c((k.b.b0.a) new DecisionDetailViewModelImpl$send$2(this)).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "profileRepository\n      …          .firstOrError()");
        a(b.a(d2, (Function1<? super Throwable, Unit>) new DecisionDetailViewModelImpl$send$4(this), new DecisionDetailViewModelImpl$send$3(this)));
    }

    public void x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.t.setValue(this, N[6], str);
    }

    public void y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.x.setValue(this, N[10], str);
    }

    public r<List<Attachment>> getItems() {
        return this.A;
    }

    public void b(Attachment attachment) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        r items = getItems();
        List list = (List) getItems().a();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                if (!Intrinsics.areEqual((Object) ((Attachment) next).k(), (Object) attachment.k())) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        items.setValue(arrayList);
        int i2 = 0;
        Iterator<OtherThingsToDoAttachment> it = a2().iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().a(attachment.k())) {
                break;
            } else {
                i2++;
            }
        }
        a2().remove(i2);
    }
}
