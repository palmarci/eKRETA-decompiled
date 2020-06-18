package hu.ekreta.ellenorzo.cases.tmgi;

import a.a.a.f;
import android.content.ContentResolver;
import android.net.Uri;
import h.l.k;
import h.l.l;
import h.m.d.d;
import h.p.r;
import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.attachment.AttachmentType;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.cases.subModels.Children;
import hu.ekreta.ellenorzo.cases.subModels.File;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k.b.b0.h;
import k.b.f0.b;
import k.b.n;
import k.b.q;
import k.b.u;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bo\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020DH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020DH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\u001c\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u001fH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J+\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0007\u0010\u0001\u001a\u00020D2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020-H\u0016J\u0013\u0010 \u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020DH\u0016J\u0013\u0010¡\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020DH\u0016J\n\u0010¢\u0001\u001a\u00030\u0001H\u0002J\n\u0010£\u0001\u001a\u00030\u0001H\u0016J\n\u0010¤\u0001\u001a\u00030\u0001H\u0016J\n\u0010¥\u0001\u001a\u00030\u0001H\u0016J\t\u0010s\u001a\u00030\u0001H\u0002JT\u0010¦\u0001\u001a\u00030\u00012H\u0010§\u0001\u001aC\u0012\u0017\u0012\u00150\u0001¢\u0006\u000f\b©\u0001\u0012\n\bª\u0001\u0012\u0005\b\b(\u0001\u0012\u0017\u0012\u00150\u0001¢\u0006\u000f\b©\u0001\u0012\n\bª\u0001\u0012\u0005\b\b(\u0001\u0012\u0005\u0012\u00030\u0001\u0018\u00010¨\u0001j\u0003`«\u0001H\u0002J\u0018\u0010¬\u0001\u001a\u00030\u00012\f\b\u0002\u0010­\u0001\u001a\u0005\u0018\u00010®\u0001H\u0002R+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020(X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00104\u001a\u000205X.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R+\u0010:\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\b=\u0010&\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001a\u0010>\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020@0?X\u0004¢\u0006\u0002\n\u0000R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0BX\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR+\u0010G\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\bJ\u0010&\u001a\u0004\bH\u0010\"\"\u0004\bI\u0010$R \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0BX\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010FR+\u0010M\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\bP\u0010&\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R\u001a\u0010Q\u001a\u00020RX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R+\u0010W\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\bZ\u0010&\u001a\u0004\bX\u0010\"\"\u0004\bY\u0010$R+\u0010[\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\b^\u0010&\u001a\u0004\b\\\u00100\"\u0004\b]\u00102R\u001e\u0010_\u001a\u0004\u0018\u00010`X\u000e¢\u0006\u0010\n\u0002\u0010e\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR \u0010f\u001a\b\u0012\u0004\u0012\u00020h0gX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR+\u0010m\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\bp\u0010&\u001a\u0004\bn\u00100\"\u0004\bo\u00102R+\u0010q\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\bt\u0010&\u001a\u0004\br\u0010\"\"\u0004\bs\u0010$R+\u0010u\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\bx\u0010&\u001a\u0004\bv\u00100\"\u0004\bw\u00102R+\u0010y\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\b|\u0010&\u001a\u0004\bz\u00100\"\u0004\b{\u00102R\u001c\u0010}\u001a\b\u0012\u0004\u0012\u000200~X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010~X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0C0gX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010j\"\u0005\b\u0001\u0010lR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006¯\u0001"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "caseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "tmgiCaseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepository;", "childrenRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "tmgiRepository", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "contentResolver", "Landroid/content/ContentResolver;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Landroid/content/ContentResolver;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;)V", "<set-?>", "", "addMandatoryDocumentSectionEnabled", "getAddMandatoryDocumentSectionEnabled", "()Z", "setAddMandatoryDocumentSectionEnabled", "(Z)V", "addMandatoryDocumentSectionEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "caseType", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "setCaseType", "(Lhu/ekreta/ellenorzo/cases/subModels/CaseType;)V", "", "caseTypeText", "getCaseTypeText", "()Ljava/lang/String;", "setCaseTypeText", "(Ljava/lang/String;)V", "caseTypeText$delegate", "childrenDataToUpload", "Lhu/ekreta/ellenorzo/cases/subModels/Children;", "getChildrenDataToUpload", "()Lhu/ekreta/ellenorzo/cases/subModels/Children;", "setChildrenDataToUpload", "(Lhu/ekreta/ellenorzo/cases/subModels/Children;)V", "endDate", "getEndDate", "setEndDate", "endDate$delegate", "localFiles", "", "Landroid/net/Uri;", "mandatoryAttachments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getMandatoryAttachments", "()Landroidx/lifecycle/MutableLiveData;", "mandatoryDocumentIsAdded", "getMandatoryDocumentIsAdded", "setMandatoryDocumentIsAdded", "mandatoryDocumentIsAdded$delegate", "optionalAttachments", "getOptionalAttachments", "optionalDocumentIsAdded", "getOptionalDocumentIsAdded", "setOptionalDocumentIsAdded", "optionalDocumentIsAdded$delegate", "otherDocumentSectionTitle", "Landroidx/databinding/ObservableInt;", "getOtherDocumentSectionTitle", "()Landroidx/databinding/ObservableInt;", "setOtherDocumentSectionTitle", "(Landroidx/databinding/ObservableInt;)V", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "reasonText", "getReasonText", "setReasonText", "reasonText$delegate", "selectedMandatoryDocumentTypeId", "", "getSelectedMandatoryDocumentTypeId", "()Ljava/lang/Integer;", "setSelectedMandatoryDocumentTypeId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "selectedTmgiType", "Landroidx/databinding/ObservableField;", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "getSelectedTmgiType", "()Landroidx/databinding/ObservableField;", "setSelectedTmgiType", "(Landroidx/databinding/ObservableField;)V", "selectedTmgiTypeName", "getSelectedTmgiTypeName", "setSelectedTmgiTypeName", "selectedTmgiTypeName$delegate", "sendButtonEnabled", "getSendButtonEnabled", "setSendButtonEnabled", "sendButtonEnabled$delegate", "startDate", "getStartDate", "setStartDate", "startDate$delegate", "subtitle", "getSubtitle", "setSubtitle", "subtitle$delegate", "temporaryMandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "getTemporaryMandatoryDocuments", "()Ljava/util/List;", "temporaryOptionalAttachments", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryOptionalAttachments", "tmgiCaseTypes", "getTmgiCaseTypes", "setTmgiCaseTypes", "addAttachmentBySection", "", "attachmentType", "Lhu/ekreta/ellenorzo/attachment/AttachmentType;", "addFileNameAndTemporaryIdToMandatoryAttachments", "attachment", "addFileNameAndTemporaryIdToOptionalAttachments", "addNewMandatoryAttachment", "addNewOptionalAttachment", "callbackToSetEndDate", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "datetime", "Ljava/util/Calendar;", "callbackToSetStartDate", "cancel", "checkStartAndEndDateValidity", "createTmgiFormPostWitActualData", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "filterOutSelectedItem", "item", "value", "onCaseTypeNameChanged", "newValue", "onDelete", "onSelect", "resetActualData", "selectEndDate", "selectStartDate", "send", "showDatePickerDialogWithMaxDateSetToActualDate", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lcom/afollestad/materialdialogs/datetime/DateTimeCallback;", "updateSendEnabled", "ignore", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl extends AuthenticatedViewModel implements TmgiFormViewModel {
    public static final /* synthetic */ KProperty[] O;
    public final ReadWriteProperty A;
    public Children B;
    public final ReadWriteProperty C;
    public CaseType D;
    public final r<List<Attachment>> E;
    public final r<List<Attachment>> F;
    public final List<ApplicationMandatoryDocument> G;
    public final List<OtherThingsToDoAttachment> H;
    public final ProfileRepository I;
    public final TmgiRepository J;
    public final AttachmentRepository K;
    public final AttachmentService L;
    public final ContentResolver M;
    public final DateTimeFactory N;

    /* renamed from: n  reason: collision with root package name */
    public final Map<String, Uri> f5249n = new LinkedHashMap();

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5250o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5251p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5252q;
    public k<List<TmgiCaseType>> r;
    public Integer s;
    public final ReadWriteProperty t;
    public k<TmgiCaseType> u;
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public l x;
    public final ReadWriteProperty y;
    public final ReadWriteProperty z;

    static {
        Class<TmgiFormViewModelImpl> cls = TmgiFormViewModelImpl.class;
        O = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subtitle", "getSubtitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "startDate", "getStartDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "endDate", "getEndDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "sendButtonEnabled", "getSendButtonEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "reasonText", "getReasonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addMandatoryDocumentSectionEnabled", "getAddMandatoryDocumentSectionEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mandatoryDocumentIsAdded", "getMandatoryDocumentIsAdded()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "optionalDocumentIsAdded", "getOptionalDocumentIsAdded()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "caseTypeText", "getCaseTypeText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "selectedTmgiTypeName", "getSelectedTmgiTypeName()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TmgiFormViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, CaseTypeRepository caseTypeRepository, TmgiCaseTypeRepository tmgiCaseTypeRepository, ChildrenRepository childrenRepository, ProfileRepository profileRepository, TmgiRepository tmgiRepository, AttachmentRepository attachmentRepository, AttachmentService attachmentService, ContentResolver contentResolver, DateTimeFactory dateTimeFactory) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        final CaseTypeRepository caseTypeRepository2 = caseTypeRepository;
        final TmgiCaseTypeRepository tmgiCaseTypeRepository2 = tmgiCaseTypeRepository;
        final ChildrenRepository childrenRepository2 = childrenRepository;
        ProfileRepository profileRepository2 = profileRepository;
        TmgiRepository tmgiRepository2 = tmgiRepository;
        AttachmentRepository attachmentRepository2 = attachmentRepository;
        AttachmentService attachmentService2 = attachmentService;
        ContentResolver contentResolver2 = contentResolver;
        DateTimeFactory dateTimeFactory2 = dateTimeFactory;
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(caseTypeRepository2, "caseTypeRepository");
        Intrinsics.checkParameterIsNotNull(tmgiCaseTypeRepository2, "tmgiCaseTypeRepository");
        Intrinsics.checkParameterIsNotNull(childrenRepository2, "childrenRepository");
        Intrinsics.checkParameterIsNotNull(profileRepository2, "profileRepository");
        Intrinsics.checkParameterIsNotNull(tmgiRepository2, "tmgiRepository");
        Intrinsics.checkParameterIsNotNull(attachmentRepository2, "attachmentRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService2, "attachmentService");
        Intrinsics.checkParameterIsNotNull(contentResolver2, "contentResolver");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory2, "dateTimeFactory");
        this.I = profileRepository2;
        this.J = tmgiRepository2;
        this.K = attachmentRepository2;
        this.L = attachmentService2;
        this.M = contentResolver2;
        this.N = dateTimeFactory2;
        this.f5250o = DataBindingViewModel.boundString$default(this, this, 25, (String) null, (Function1) null, 6, (Object) null);
        this.f5251p = DataBindingViewModel.boundString$default(this, this, 32, (String) null, new TmgiFormViewModelImpl$startDate$2(this), 2, (Object) null);
        this.f5252q = DataBindingViewModel.boundString$default(this, this, 5, (String) null, new TmgiFormViewModelImpl$endDate$2(this), 2, (Object) null);
        this.r = new k<>();
        this.t = DataBindingViewModel.boundBoolean$default(this, this, 53, false, (Function1) null, 6, (Object) null);
        this.u = new k<>();
        this.v = DataBindingViewModel.boundString$default(this, this, 69, (String) null, (Function1) null, 6, (Object) null);
        this.w = DataBindingViewModel.boundBoolean$default(this, this, 94, false, (Function1) null, 6, (Object) null);
        this.x = new l(R.string.Documents_section);
        this.y = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.z = DataBindingViewModel.boundBoolean$default(this, this, 72, false, (Function1) null, 6, (Object) null);
        this.A = DataBindingViewModel.boundBoolean$default(this, this, 22, false, (Function1) null, 6, (Object) null);
        this.C = DataBindingViewModel.boundString$default(this, this, 23, (String) null, (Function1) null, 6, (Object) null);
        this.E = new r<>();
        this.F = new r<>();
        DataBindingViewModel.boundString$default(this, this, 73, (String) null, (Function1) null, 6, (Object) null);
        this.G = new ArrayList();
        this.H = new ArrayList();
        n<R> c = this.I.b().c(new h<T, q<? extends R>>() {
            /* renamed from: a */
            public final n<List<TmgiCaseType>> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return tmgiCaseTypeRepository2.a(profile);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…tory.fetchTgmiTypes(it) }");
        a(b.a(c, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                o.b.b access$getLogger$p = this.c.V1();
                access$getLogger$p.d("Error happened during fetching types " + th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<List<? extends TmgiCaseType>, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(List<TmgiCaseType> list) {
                k<List<TmgiCaseType>> T1 = this.c.T1();
                if (list != T1.e) {
                    T1.e = list;
                    T1.U1();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        n<R> c2 = this.I.b().c(new h<T, q<? extends R>>() {
            /* renamed from: a */
            public final n<Children> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return childrenRepository2.a(profile);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…y.fetchChildrenData(it) }");
        a(b.a(c2, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                o.b.b access$getLogger$p = this.c.V1();
                access$getLogger$p.d("Error happened during fetching children's data " + th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<Children, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Children children) {
                TmgiFormViewModelImpl tmgiFormViewModelImpl = this.c;
                Intrinsics.checkExpressionValueIsNotNull(children, "children");
                tmgiFormViewModelImpl.a(children);
                TmgiFormViewModelImpl tmgiFormViewModelImpl2 = this.c;
                tmgiFormViewModelImpl2.s(children.e() + ' ' + children.f() + " (" + children.d() + ')');
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Children) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        n<R> c3 = this.I.b().c(new h<T, q<? extends R>>() {
            /* renamed from: a */
            public final n<List<CaseType>> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return caseTypeRepository2.a(profile);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c3, "profileRepository.getAct…tory.fetchCaseTypes(it) }");
        a(b.a(c3, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                o.b.b access$getLogger$p = this.c.V1();
                access$getLogger$p.d("Error happened during fetching types " + th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<List<? extends CaseType>, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(List<CaseType> list) {
                boolean z;
                TmgiFormViewModelImpl tmgiFormViewModelImpl = this.c;
                Intrinsics.checkExpressionValueIsNotNull(list, "types");
                for (CaseType caseType : list) {
                    if (caseType.h() == CaseType.Code.VERIFICATION_BY_PARENT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        tmgiFormViewModelImpl.a(caseType);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    public static final /* synthetic */ void access$addFileNameAndTemporaryIdToMandatoryAttachments(TmgiFormViewModelImpl tmgiFormViewModelImpl, Attachment attachment) {
        List<ApplicationMandatoryDocument> c2 = tmgiFormViewModelImpl.c2();
        T t2 = tmgiFormViewModelImpl.q1().e;
        if (t2 == null) {
            Intrinsics.throwNpe();
        }
        TmgiCaseType a2 = ((TmgiCaseType) t2).a(tmgiFormViewModelImpl.b2());
        Intrinsics.checkParameterIsNotNull(attachment, "$this$toApplicationMandatoryDocument");
        String i2 = attachment.i();
        String str = null;
        File file = new File((Integer) null, attachment.k(), attachment.e());
        Integer valueOf = a2 != null ? Integer.valueOf(a2.e()) : null;
        String g2 = a2 != null ? a2.g() : null;
        String f = a2 != null ? a2.f() : null;
        if (a2 != null) {
            str = a2.d();
        }
        c2.add(new ApplicationMandatoryDocument((Integer) null, i2, (String) null, file, new ApplicationDocumentType(valueOf, (String) null, g2, f, str, (String) null, (String) null, attachment.e()), attachment.e()));
        tmgiFormViewModelImpl.getMandatoryAttachments().setValue(CollectionsKt__CollectionsJVMKt.listOf(new Attachment(0, attachment.i(), attachment.k(), AttachmentType.MANDATORY, AttachmentDownloadState.DOWNLOADED, attachment.e(), (String) null, (String) null, 192, (DefaultConstructorMarker) null)));
        tmgiFormViewModelImpl.d(true);
    }

    public static final /* synthetic */ void access$addFileNameAndTemporaryIdToOptionalAttachments(TmgiFormViewModelImpl tmgiFormViewModelImpl, Attachment attachment) {
        tmgiFormViewModelImpl.d2().add(v.b(attachment));
        ExtensionsKt.a(tmgiFormViewModelImpl.getOptionalAttachments(), CollectionsKt__CollectionsJVMKt.listOf(new Attachment(0, attachment.i(), attachment.k(), AttachmentType.OPTIONAL, AttachmentDownloadState.DOWNLOADED, attachment.e(), (String) null, (String) null, 192, (DefaultConstructorMarker) null)));
        tmgiFormViewModelImpl.e(true);
    }

    public static final /* synthetic */ TmgiFormPost access$createTmgiFormPostWitActualData(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        String R1 = tmgiFormViewModelImpl.R1();
        String E0 = tmgiFormViewModelImpl.E0();
        String e = tmgiFormViewModelImpl.a2().e();
        String f = tmgiFormViewModelImpl.a2().f();
        String valueOf = String.valueOf(tmgiFormViewModelImpl.a2().d());
        CaseType Z1 = tmgiFormViewModelImpl.Z1();
        T t2 = tmgiFormViewModelImpl.q1().e;
        if (t2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(t2, "selectedTmgiType.get()!!");
        return new TmgiFormPost(R1, E0, e, f, valueOf, Z1, (TmgiCaseType) t2, tmgiFormViewModelImpl.k1(), tmgiFormViewModelImpl.c2(), tmgiFormViewModelImpl.d2());
    }

    public static final /* synthetic */ void access$resetActualData(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        tmgiFormViewModelImpl.r("");
        tmgiFormViewModelImpl.q("");
        tmgiFormViewModelImpl.i("");
        tmgiFormViewModelImpl.q1().c(null);
        tmgiFormViewModelImpl.m("");
        tmgiFormViewModelImpl.d(false);
        tmgiFormViewModelImpl.getMandatoryAttachments().setValue(CollectionsKt__CollectionsKt.emptyList());
        tmgiFormViewModelImpl.c2().clear();
        tmgiFormViewModelImpl.e(false);
        tmgiFormViewModelImpl.getOptionalAttachments().setValue(CollectionsKt__CollectionsKt.emptyList());
        tmgiFormViewModelImpl.d2().clear();
    }

    public void C0() {
        a((Function1<? super d, Unit>) new TmgiFormViewModelImpl$addAttachmentBySection$1(this, AttachmentType.OPTIONAL));
    }

    public String E0() {
        return (String) this.f5252q.getValue(this, O[2]);
    }

    public String I1() {
        return (String) this.C.getValue(this, O[9]);
    }

    public boolean P1() {
        return ((Boolean) this.z.getValue(this, O[7])).booleanValue();
    }

    public boolean R0() {
        return ((Boolean) this.A.getValue(this, O[8])).booleanValue();
    }

    public String R1() {
        return (String) this.f5251p.getValue(this, O[1]);
    }

    public void S1() {
        a((Function1<? super d, Unit>) new TmgiFormViewModelImpl$addAttachmentBySection$1(this, AttachmentType.MANDATORY));
    }

    public k<List<TmgiCaseType>> T1() {
        return this.r;
    }

    public CaseType Z1() {
        CaseType caseType = this.D;
        if (caseType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("caseType");
        }
        return caseType;
    }

    public void a(Integer num) {
        this.s = num;
    }

    public Children a2() {
        Children children = this.B;
        if (children == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childrenDataToUpload");
        }
        return children;
    }

    public void b(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        int i2 = -1;
        int i3 = 0;
        if (attachment.g() == AttachmentType.MANDATORY) {
            getMandatoryAttachments().setValue(a(attachment, (List<Attachment>) (List) getMandatoryAttachments().a()));
            List list = (List) getMandatoryAttachments().a();
            d(list != null ? !list.isEmpty() : false);
            Iterator<ApplicationMandatoryDocument> it = c2().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().a(attachment.k())) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            c2().remove(i2);
            return;
        }
        getOptionalAttachments().setValue(a(attachment, (List<Attachment>) (List) getOptionalAttachments().a()));
        List list2 = (List) getOptionalAttachments().a();
        e(list2 != null ? !list2.isEmpty() : false);
        Iterator<OtherThingsToDoAttachment> it2 = d2().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next().a(attachment.k())) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        d2().remove(i2);
    }

    public Integer b2() {
        return this.s;
    }

    public void c(boolean z2) {
        this.w.setValue(this, O[5], Boolean.valueOf(z2));
    }

    public void c1() {
        a((Function2<? super f, ? super Calendar, Unit>) new TmgiFormViewModelImpl$selectEndDate$1(this));
    }

    public List<ApplicationMandatoryDocument> c2() {
        return this.G;
    }

    public void cancel() {
        a((Function1<? super d, Unit>) TmgiFormViewModelImpl$cancel$1.INSTANCE);
    }

    public void d(boolean z2) {
        this.z.setValue(this, O[7], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.y.getValue(this, O[6])).booleanValue();
    }

    public List<OtherThingsToDoAttachment> d2() {
        return this.H;
    }

    public void e(boolean z2) {
        this.A.setValue(this, O[8], Boolean.valueOf(z2));
    }

    public final void e2() {
        boolean z2 = false;
        boolean z3 = q1().e != null;
        if (!StringsKt__StringsJVMKt.isBlank(R1()) && !StringsKt__StringsJVMKt.isBlank(E0()) && UtilsKt.b(R1()).compareTo(UtilsKt.b(E0())) <= 0) {
            z2 = true;
        }
        g(z3 & z2);
    }

    public void f(boolean z2) {
        this.y.setValue(this, O[6], Boolean.valueOf(z2));
    }

    public final void f2() {
        e2();
    }

    public void g(String str) {
        T t2;
        Intrinsics.checkParameterIsNotNull(str, "newValue");
        List list = (List) T1().e;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (Intrinsics.areEqual((Object) ((TmgiCaseType) t2).g(), (Object) str)) {
                    break;
                }
            }
            T t3 = (TmgiCaseType) t2;
            if (t3 != null) {
                a(t3.h().b());
                k<TmgiCaseType> q1 = q1();
                if (t3 != q1.e) {
                    q1.e = t3;
                    q1.U1();
                }
                e2();
                if (b2() != null) {
                    c(true);
                    l y0 = y0();
                    if (R.string.Other_Documents_section != y0.e) {
                        y0.e = R.string.Other_Documents_section;
                        y0.U1();
                        return;
                    }
                    return;
                }
                l y02 = y0();
                if (R.string.Documents_section != y02.e) {
                    y02.e = R.string.Documents_section;
                    y02.U1();
                }
                c(false);
            }
        }
    }

    public void g(boolean z2) {
        this.t.setValue(this, O[3], Boolean.valueOf(z2));
    }

    public void i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.C.setValue(this, O[9], str);
    }

    public String j1() {
        return (String) this.f5250o.getValue(this, O[0]);
    }

    public String k1() {
        return (String) this.v.getValue(this, O[4]);
    }

    public void m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.v.setValue(this, O[4], str);
    }

    public boolean m1() {
        return ((Boolean) this.w.getValue(this, O[5])).booleanValue();
    }

    public boolean p1() {
        return ((Boolean) this.t.getValue(this, O[3])).booleanValue();
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5252q.setValue(this, O[2], str);
    }

    public k<TmgiCaseType> q1() {
        return this.u;
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5251p.setValue(this, O[1], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5250o.setValue(this, O[0], str);
    }

    public void x() {
        u<R> a2 = this.I.b().a(a.a()).c(new TmgiFormViewModelImpl$send$1(this)).d().c(new TmgiFormViewModelImpl$send$2(this)).a((k.b.b0.f<? super Throwable>) new TmgiFormViewModelImpl$send$3(this)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository\n      …dSchedulers.mainThread())");
        a(b.a(a2, (Function1<? super Throwable, Unit>) new TmgiFormViewModelImpl$send$5(this), new TmgiFormViewModelImpl$send$4(this)));
    }

    public l y0() {
        return this.x;
    }

    public void z0() {
        a((Function2<? super f, ? super Calendar, Unit>) new TmgiFormViewModelImpl$selectStartDate$1(this));
    }

    public void a(Children children) {
        Intrinsics.checkParameterIsNotNull(children, "<set-?>");
        this.B = children;
    }

    public r<List<Attachment>> getMandatoryAttachments() {
        return this.E;
    }

    public r<List<Attachment>> getOptionalAttachments() {
        return this.F;
    }

    public void a(CaseType caseType) {
        Intrinsics.checkParameterIsNotNull(caseType, "<set-?>");
        this.D = caseType;
    }

    public void a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        Uri uri = this.f5249n.get(attachment.k());
        if (uri != null) {
            a((Function1<? super d, Unit>) new TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1(uri, this));
        }
    }

    public final void a(f fVar, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(fVar, "dialog");
        Intrinsics.checkParameterIsNotNull(calendar, "datetime");
        q(UtilsKt.c(calendar));
    }

    public final void a(Function2<? super f, ? super Calendar, Unit> function2) {
        Object clone = this.N.a().clone();
        if (clone != null) {
            Calendar calendar = (Calendar) clone;
            calendar.add(2, 3);
            a((Function1<? super d, Unit>) new TmgiFormViewModelImpl$showDatePickerDialogWithMaxDateSetToActualDate$1(this, calendar, function2));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }

    public final List<Attachment> a(Attachment attachment, List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!Intrinsics.areEqual((Object) ((Attachment) next).k(), (Object) attachment.k())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void b(f fVar, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(fVar, "dialog");
        Intrinsics.checkParameterIsNotNull(calendar, "datetime");
        r(UtilsKt.c(calendar));
    }
}
