package p289hu.ekreta.ellenorzo.cases.tmgi;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p000a.p001a.p002a.C0006f;
import p211h.p258l.C3709k;
import p211h.p258l.C3710l;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.attachment.AttachmentType;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepository;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType.Code;
import p289hu.ekreta.ellenorzo.cases.subModels.Children;
import p289hu.ekreta.ellenorzo.cases.subModels.File;
import p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020BH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020BH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\u001c\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u001dH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J+\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A2\u0007\u0010\u0001\u001a\u00020B2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020+H\u0016J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020BH\u0016J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020BH\u0016J\n\u0010 \u0001\u001a\u00030\u0001H\u0002J\n\u0010¡\u0001\u001a\u00030\u0001H\u0016J\n\u0010¢\u0001\u001a\u00030\u0001H\u0016J\n\u0010£\u0001\u001a\u00030\u0001H\u0016J\t\u0010q\u001a\u00030\u0001H\u0002JT\u0010¤\u0001\u001a\u00030\u00012H\u0010¥\u0001\u001aC\u0012\u0017\u0012\u00150\u0001¢\u0006\u000f\b§\u0001\u0012\n\b¨\u0001\u0012\u0005\b\b(\u0001\u0012\u0017\u0012\u00150\u0001¢\u0006\u000f\b§\u0001\u0012\n\b¨\u0001\u0012\u0005\b\b(\u0001\u0012\u0005\u0012\u00030\u0001\u0018\u00010¦\u0001j\u0003`©\u0001H\u0002J\u0018\u0010ª\u0001\u001a\u00030\u00012\f\b\u0002\u0010«\u0001\u001a\u0005\u0018\u00010¬\u0001H\u0002R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010,\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010$\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00102\u001a\u000203X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R+\u00108\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\b;\u0010$\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001a\u0010<\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020>0=X\u0004¢\u0006\u0002\n\u0000R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR+\u0010E\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bH\u0010$\u001a\u0004\bF\u0010 \"\u0004\bG\u0010\"R \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010DR+\u0010K\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bN\u0010$\u001a\u0004\bL\u0010 \"\u0004\bM\u0010\"R\u001a\u0010O\u001a\u00020PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010U\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bX\u0010$\u001a\u0004\bV\u0010 \"\u0004\bW\u0010\"R+\u0010Y\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\b\\\u0010$\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R\u001e\u0010]\u001a\u0004\u0018\u00010^X\u000e¢\u0006\u0010\n\u0002\u0010c\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR \u0010d\u001a\b\u0012\u0004\u0012\u00020f0eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR+\u0010k\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\bn\u0010$\u001a\u0004\bl\u0010.\"\u0004\bm\u00100R+\u0010o\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\br\u0010$\u001a\u0004\bp\u0010 \"\u0004\bq\u0010\"R+\u0010s\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\bv\u0010$\u001a\u0004\bt\u0010.\"\u0004\bu\u00100R+\u0010w\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\bz\u0010$\u001a\u0004\bx\u0010.\"\u0004\by\u00100R\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020}0|X\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010R\u001d\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010|X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010R)\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0A0eX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006­\u0001"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "caseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "tmgiCaseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepository;", "childrenRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "tmgiRepository", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "contentResolver", "Landroid/content/ContentResolver;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Landroid/content/ContentResolver;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;)V", "<set-?>", "", "addMandatoryDocumentSectionEnabled", "getAddMandatoryDocumentSectionEnabled", "()Z", "setAddMandatoryDocumentSectionEnabled", "(Z)V", "addMandatoryDocumentSectionEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "caseType", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "setCaseType", "(Lhu/ekreta/ellenorzo/cases/subModels/CaseType;)V", "", "caseTypeText", "getCaseTypeText", "()Ljava/lang/String;", "setCaseTypeText", "(Ljava/lang/String;)V", "caseTypeText$delegate", "childrenDataToUpload", "Lhu/ekreta/ellenorzo/cases/subModels/Children;", "getChildrenDataToUpload", "()Lhu/ekreta/ellenorzo/cases/subModels/Children;", "setChildrenDataToUpload", "(Lhu/ekreta/ellenorzo/cases/subModels/Children;)V", "endDate", "getEndDate", "setEndDate", "endDate$delegate", "localFiles", "", "Landroid/net/Uri;", "mandatoryAttachments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getMandatoryAttachments", "()Landroidx/lifecycle/MutableLiveData;", "mandatoryDocumentIsAdded", "getMandatoryDocumentIsAdded", "setMandatoryDocumentIsAdded", "mandatoryDocumentIsAdded$delegate", "optionalAttachments", "getOptionalAttachments", "optionalDocumentIsAdded", "getOptionalDocumentIsAdded", "setOptionalDocumentIsAdded", "optionalDocumentIsAdded$delegate", "otherDocumentSectionTitle", "Landroidx/databinding/ObservableInt;", "getOtherDocumentSectionTitle", "()Landroidx/databinding/ObservableInt;", "setOtherDocumentSectionTitle", "(Landroidx/databinding/ObservableInt;)V", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "reasonText", "getReasonText", "setReasonText", "reasonText$delegate", "selectedMandatoryDocumentTypeId", "", "getSelectedMandatoryDocumentTypeId", "()Ljava/lang/Integer;", "setSelectedMandatoryDocumentTypeId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "selectedTmgiType", "Landroidx/databinding/ObservableField;", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "getSelectedTmgiType", "()Landroidx/databinding/ObservableField;", "setSelectedTmgiType", "(Landroidx/databinding/ObservableField;)V", "selectedTmgiTypeName", "getSelectedTmgiTypeName", "setSelectedTmgiTypeName", "selectedTmgiTypeName$delegate", "sendButtonEnabled", "getSendButtonEnabled", "setSendButtonEnabled", "sendButtonEnabled$delegate", "startDate", "getStartDate", "setStartDate", "startDate$delegate", "subtitle", "getSubtitle", "setSubtitle", "subtitle$delegate", "temporaryMandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "getTemporaryMandatoryDocuments", "()Ljava/util/List;", "temporaryOptionalAttachmens", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "getTemporaryOptionalAttachmens", "tmgiCaseTypes", "getTmgiCaseTypes", "setTmgiCaseTypes", "addAttachmentBySection", "", "attachmentType", "Lhu/ekreta/ellenorzo/attachment/AttachmentType;", "addFileNameAndTemporaryIdToMandatoryAttachments", "attachment", "addFileNameAndTemporaryIdToOptionalAttachments", "addNewMandatoryAttachment", "addNewOptionalAttachment", "callbackToSetEndDate", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "datetime", "Ljava/util/Calendar;", "callbackToSetStartDate", "cancel", "checkStartAndEndDateValidity", "createTmgiFormPostWitActualData", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "filterOutSelectedItem", "item", "value", "onCaseTypeNameChanged", "newValue", "onDelete", "onSelect", "resetActualData", "selectEndDate", "selectStartDate", "send", "showDatePickerDialogWithMaxDateSetToActualDate", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lcom/afollestad/materialdialogs/datetime/DateTimeCallback;", "updateSendEnabled", "ignore", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl extends AuthenticatedViewModel implements TmgiFormViewModel {

    /* renamed from: N */
    public static final /* synthetic */ KProperty[] f11712N;

    /* renamed from: A */
    public Children f11713A;

    /* renamed from: B */
    public final ReadWriteProperty f11714B;

    /* renamed from: C */
    public CaseType f11715C;

    /* renamed from: D */
    public final C3824r<List<Attachment>> f11716D;

    /* renamed from: E */
    public final C3824r<List<Attachment>> f11717E;

    /* renamed from: F */
    public final List<ApplicationMandatoryDocument> f11718F;

    /* renamed from: G */
    public final List<OtherThingsToDoAttachment> f11719G;

    /* renamed from: H */
    public final ProfileRepository f11720H;

    /* renamed from: I */
    public final TmgiRepository f11721I;

    /* renamed from: J */
    public final AttachmentRepository f11722J;

    /* renamed from: K */
    public final AttachmentService f11723K;

    /* renamed from: L */
    public final ContentResolver f11724L;

    /* renamed from: M */
    public final DateTimeFactory f11725M;

    /* renamed from: m */
    public final Map<String, Uri> f11726m = new LinkedHashMap();

    /* renamed from: n */
    public final ReadWriteProperty f11727n;

    /* renamed from: o */
    public final ReadWriteProperty f11728o;

    /* renamed from: p */
    public final ReadWriteProperty f11729p;

    /* renamed from: q */
    public C3709k<List<TmgiCaseType>> f11730q;

    /* renamed from: r */
    public Integer f11731r;

    /* renamed from: s */
    public final ReadWriteProperty f11732s;

    /* renamed from: t */
    public C3709k<TmgiCaseType> f11733t;

    /* renamed from: u */
    public final ReadWriteProperty f11734u;

    /* renamed from: v */
    public final ReadWriteProperty f11735v;

    /* renamed from: w */
    public C3710l f11736w;

    /* renamed from: x */
    public final ReadWriteProperty f11737x;

    /* renamed from: y */
    public final ReadWriteProperty f11738y;

    /* renamed from: z */
    public final ReadWriteProperty f11739z;

    static {
        Class<TmgiFormViewModelImpl> cls = TmgiFormViewModelImpl.class;
        f11712N = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subtitle", "getSubtitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "startDate", "getStartDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "endDate", "getEndDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "sendButtonEnabled", "getSendButtonEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "reasonText", "getReasonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addMandatoryDocumentSectionEnabled", "getAddMandatoryDocumentSectionEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mandatoryDocumentIsAdded", "getMandatoryDocumentIsAdded()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "optionalDocumentIsAdded", "getOptionalDocumentIsAdded()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "caseTypeText", "getCaseTypeText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "selectedTmgiTypeName", "getSelectedTmgiTypeName()Ljava/lang/String;"))};
    }

    public TmgiFormViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, CaseTypeRepository caseTypeRepository, TmgiCaseTypeRepository tmgiCaseTypeRepository, ChildrenRepository childrenRepository, ProfileRepository profileRepository, TmgiRepository tmgiRepository, AttachmentRepository attachmentRepository, AttachmentService attachmentService, ContentResolver contentResolver, DateTimeFactory dateTimeFactory) {
        final CaseTypeRepository caseTypeRepository2 = caseTypeRepository;
        final TmgiCaseTypeRepository tmgiCaseTypeRepository2 = tmgiCaseTypeRepository;
        final ChildrenRepository childrenRepository2 = childrenRepository;
        ProfileRepository profileRepository2 = profileRepository;
        TmgiRepository tmgiRepository2 = tmgiRepository;
        AttachmentRepository attachmentRepository2 = attachmentRepository;
        AttachmentService attachmentService2 = attachmentService;
        ContentResolver contentResolver2 = contentResolver;
        DateTimeFactory dateTimeFactory2 = dateTimeFactory;
        ObservableImpl observableImpl2 = observableImpl;
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
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
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f11720H = profileRepository2;
        this.f11721I = tmgiRepository2;
        this.f11722J = attachmentRepository2;
        this.f11723K = attachmentService2;
        this.f11724L = contentResolver2;
        this.f11725M = dateTimeFactory2;
        this.f11727n = DataBindingViewModel.boundString$default(this, this, 25, null, null, 6, null);
        this.f11728o = DataBindingViewModel.boundString$default(this, this, 32, null, new TmgiFormViewModelImpl$startDate$2(this), 2, null);
        this.f11729p = DataBindingViewModel.boundString$default(this, this, 5, null, new TmgiFormViewModelImpl$endDate$2(this), 2, null);
        this.f11730q = new C3709k<>();
        this.f11732s = DataBindingViewModel.boundBoolean$default(this, this, 52, false, null, 6, null);
        this.f11733t = new C3709k<>();
        this.f11734u = DataBindingViewModel.boundString$default(this, this, 69, null, null, 6, null);
        this.f11735v = DataBindingViewModel.boundBoolean$default(this, this, 93, false, null, 6, null);
        this.f11736w = new C3710l(C4014R.string.Documents_section);
        this.f11737x = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);
        this.f11738y = DataBindingViewModel.boundBoolean$default(this, this, 72, false, null, 6, null);
        this.f11739z = DataBindingViewModel.boundBoolean$default(this, this, 22, false, null, 6, null);
        this.f11714B = DataBindingViewModel.boundString$default(this, this, 23, null, null, 6, null);
        this.f11716D = new C3824r<>();
        this.f11717E = new C3824r<>();
        DataBindingViewModel.boundString$default(this, this, 73, null, null, 6, null);
        this.f11718F = new ArrayList();
        this.f11719G = new ArrayList();
        C5027n c = this.f11720H.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>() {
            /* renamed from: a */
            public final C5027n<List<TmgiCaseType>> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return tmgiCaseTypeRepository2.mo11867a(profile);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…tory.fetchTgmiTypes(it) }");
        mo16413a(C4998b.m16842a(c, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl f11742c;

            {
                this.f11742c = r1;
            }

            /* renamed from: a */
            public final void mo12188a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                C5620b access$getLogger$p = this.f11742c.mo16412M1();
                StringBuilder sb = new StringBuilder();
                sb.append("Error happened during fetching types ");
                sb.append(th);
                access$getLogger$p.mo115b(sb.toString());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12188a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<List<? extends TmgiCaseType>, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl f11741c;

            {
                this.f11741c = r1;
            }

            /* renamed from: a */
            public final void mo12187a(List<TmgiCaseType> list) {
                C3709k K1 = this.f11741c.mo12144K1();
                if (list != K1.f10171e) {
                    K1.f10171e = list;
                    K1.mo10509L1();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12187a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        C5027n c2 = this.f11720H.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>() {
            /* renamed from: a */
            public final C5027n<Children> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return childrenRepository2.mo11860a(profile);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…y.fetchChildrenData(it) }");
        mo16413a(C4998b.m16842a(c2, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl f11745c;

            {
                this.f11745c = r1;
            }

            /* renamed from: a */
            public final void mo12191a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                C5620b access$getLogger$p = this.f11745c.mo16412M1();
                StringBuilder sb = new StringBuilder();
                sb.append("Error happened during fetching children's data ");
                sb.append(th);
                access$getLogger$p.mo115b(sb.toString());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12191a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<Children, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl f11744c;

            {
                this.f11744c = r1;
            }

            /* renamed from: a */
            public final void mo12190a(Children children) {
                TmgiFormViewModelImpl tmgiFormViewModelImpl = this.f11744c;
                Intrinsics.checkExpressionValueIsNotNull(children, "children");
                tmgiFormViewModelImpl.mo12174a(children);
                TmgiFormViewModelImpl tmgiFormViewModelImpl2 = this.f11744c;
                StringBuilder sb = new StringBuilder();
                sb.append(children.mo11937e());
                sb.append(' ');
                sb.append(children.mo11939f());
                sb.append(" (");
                sb.append(children.mo11935d());
                sb.append(')');
                tmgiFormViewModelImpl2.mo12185t(sb.toString());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12190a((Children) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        C5027n c3 = this.f11720H.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>() {
            /* renamed from: a */
            public final C5027n<List<CaseType>> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return caseTypeRepository2.mo11858a(profile);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c3, "profileRepository.getAct…tory.fetchCaseTypes(it) }");
        mo16413a(C4998b.m16842a(c3, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl f11748c;

            {
                this.f11748c = r1;
            }

            /* renamed from: a */
            public final void mo12194a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                C5620b access$getLogger$p = this.f11748c.mo16412M1();
                StringBuilder sb = new StringBuilder();
                sb.append("Error happened during fetching types ");
                sb.append(th);
                access$getLogger$p.mo115b(sb.toString());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12194a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<List<? extends CaseType>, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl f11747c;

            {
                this.f11747c = r1;
            }

            /* renamed from: a */
            public final void mo12193a(List<CaseType> list) {
                boolean z;
                TmgiFormViewModelImpl tmgiFormViewModelImpl = this.f11747c;
                Intrinsics.checkExpressionValueIsNotNull(list, "types");
                for (CaseType caseType : list) {
                    if (caseType.mo11928h() == Code.VERIFICATION_BY_PARENT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        tmgiFormViewModelImpl.mo12173a(caseType);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12193a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    public static final /* synthetic */ void access$addFileNameAndTemporaryIdToMandatoryAttachments(TmgiFormViewModelImpl tmgiFormViewModelImpl, Attachment attachment) {
        List S1 = tmgiFormViewModelImpl.mo12167S1();
        T t = tmgiFormViewModelImpl.mo12159k1().f10171e;
        if (t == null) {
            Intrinsics.throwNpe();
        }
        TmgiCaseType a = ((TmgiCaseType) t).mo12024a(tmgiFormViewModelImpl.mo12166R1());
        Intrinsics.checkParameterIsNotNull(attachment, "$this$toApplicationMandatoryDocument");
        String h = attachment.mo11435h();
        String str = null;
        File file = new File(null, attachment.mo11438j(), attachment.mo11318e());
        Integer valueOf = a != null ? Integer.valueOf(a.mo11919e()) : null;
        String g = a != null ? a.mo11922g() : null;
        String f = a != null ? a.mo11921f() : null;
        if (a != null) {
            str = a.mo11917d();
        }
        ApplicationDocumentType applicationDocumentType = new ApplicationDocumentType(valueOf, null, g, f, str, null, null, attachment.mo11318e());
        ApplicationMandatoryDocument applicationMandatoryDocument = new ApplicationMandatoryDocument(null, h, null, file, applicationDocumentType, attachment.mo11318e());
        S1.add(applicationMandatoryDocument);
        C3824r mandatoryAttachments = tmgiFormViewModelImpl.getMandatoryAttachments();
        Attachment attachment2 = new Attachment(0, attachment.mo11435h(), attachment.mo11438j(), AttachmentType.MANDATORY, AttachmentDownloadState.DOWNLOADED, attachment.mo11318e());
        mandatoryAttachments.setValue(CollectionsKt__CollectionsJVMKt.listOf(attachment2));
        tmgiFormViewModelImpl.mo12179c(true);
    }

    public static final /* synthetic */ void access$addFileNameAndTemporaryIdToOptionalAttachments(TmgiFormViewModelImpl tmgiFormViewModelImpl, Attachment attachment) {
        tmgiFormViewModelImpl.mo12168T1().add(C3984v.m10269b(attachment));
        C3824r optionalAttachments = tmgiFormViewModelImpl.getOptionalAttachments();
        Attachment attachment2 = new Attachment(0, attachment.mo11435h(), attachment.mo11438j(), AttachmentType.OPTIONAL, AttachmentDownloadState.DOWNLOADED, attachment.mo11318e());
        ExtensionsKt.m14659a(optionalAttachments, CollectionsKt__CollectionsJVMKt.listOf(attachment2));
        tmgiFormViewModelImpl.mo12180d(true);
    }

    public static final /* synthetic */ TmgiFormPost access$createTmgiFormPostWitActualData(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        String I1 = tmgiFormViewModelImpl.mo12142I1();
        String E0 = tmgiFormViewModelImpl.mo12140E0();
        String e = tmgiFormViewModelImpl.mo12165Q1().mo11937e();
        String f = tmgiFormViewModelImpl.mo12165Q1().mo11939f();
        String valueOf = String.valueOf(tmgiFormViewModelImpl.mo12165Q1().mo11935d());
        CaseType P1 = tmgiFormViewModelImpl.mo12164P1();
        T t = tmgiFormViewModelImpl.mo12159k1().f10171e;
        if (t == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(t, "selectedTmgiType.get()!!");
        TmgiFormPost tmgiFormPost = new TmgiFormPost(I1, E0, e, f, valueOf, P1, (TmgiCaseType) t, tmgiFormViewModelImpl.mo12152e1(), tmgiFormViewModelImpl.mo12167S1(), tmgiFormViewModelImpl.mo12168T1());
        return tmgiFormPost;
    }

    public static final /* synthetic */ void access$resetActualData(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        String str = "";
        tmgiFormViewModelImpl.mo12184s(str);
        tmgiFormViewModelImpl.mo12183r(str);
        tmgiFormViewModelImpl.mo12157i(str);
        tmgiFormViewModelImpl.mo12159k1().mo10534a(null);
        tmgiFormViewModelImpl.mo12160m(str);
        tmgiFormViewModelImpl.mo12179c(false);
        tmgiFormViewModelImpl.getMandatoryAttachments().setValue(CollectionsKt__CollectionsKt.emptyList());
        tmgiFormViewModelImpl.mo12167S1().clear();
        tmgiFormViewModelImpl.mo12180d(false);
        tmgiFormViewModelImpl.getOptionalAttachments().setValue(CollectionsKt__CollectionsKt.emptyList());
        tmgiFormViewModelImpl.mo12168T1().clear();
    }

    /* renamed from: A1 */
    public String mo12138A1() {
        return (String) this.f11714B.getValue(this, f11712N[9]);
    }

    /* renamed from: C0 */
    public void mo12139C0() {
        mo16373a((Function1<? super C3737d, Unit>) new TmgiFormViewModelImpl$addAttachmentBySection$1<Object,Unit>(this, AttachmentType.OPTIONAL));
    }

    /* renamed from: E0 */
    public String mo12140E0() {
        return (String) this.f11729p.getValue(this, f11712N[2]);
    }

    /* renamed from: G1 */
    public boolean mo12141G1() {
        return ((Boolean) this.f11738y.getValue(this, f11712N[7])).booleanValue();
    }

    /* renamed from: I1 */
    public String mo12142I1() {
        return (String) this.f11728o.getValue(this, f11712N[1]);
    }

    /* renamed from: J1 */
    public void mo12143J1() {
        mo16373a((Function1<? super C3737d, Unit>) new TmgiFormViewModelImpl$addAttachmentBySection$1<Object,Unit>(this, AttachmentType.MANDATORY));
    }

    /* renamed from: K1 */
    public C3709k<List<TmgiCaseType>> mo12144K1() {
        return this.f11730q;
    }

    /* renamed from: O0 */
    public boolean mo12145O0() {
        return ((Boolean) this.f11739z.getValue(this, f11712N[8])).booleanValue();
    }

    /* renamed from: P1 */
    public CaseType mo12164P1() {
        CaseType caseType = this.f11715C;
        if (caseType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("caseType");
        }
        return caseType;
    }

    /* renamed from: Q1 */
    public Children mo12165Q1() {
        Children children = this.f11713A;
        if (children == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childrenDataToUpload");
        }
        return children;
    }

    /* renamed from: R1 */
    public Integer mo12166R1() {
        return this.f11731r;
    }

    /* renamed from: S1 */
    public List<ApplicationMandatoryDocument> mo12167S1() {
        return this.f11718F;
    }

    /* renamed from: T1 */
    public List<OtherThingsToDoAttachment> mo12168T1() {
        return this.f11719G;
    }

    /* renamed from: U1 */
    public final void mo12169U1() {
        boolean z = false;
        boolean z2 = mo12159k1().f10171e != null;
        if (!StringsKt__StringsJVMKt.isBlank(mo12142I1()) && !StringsKt__StringsJVMKt.isBlank(mo12140E0()) && UtilsKt.m14837b(mo12142I1()).compareTo(UtilsKt.m14837b(mo12140E0())) <= 0) {
            z = true;
        }
        mo12182f(z2 & z);
    }

    /* renamed from: V1 */
    public final void mo12170V1() {
        mo12169U1();
    }

    /* renamed from: Y0 */
    public void mo12146Y0() {
        mo12176a((Function2<? super C0006f, ? super Calendar, Unit>) new TmgiFormViewModelImpl$selectEndDate$1<Object,Object,Unit>(this));
    }

    /* renamed from: a */
    public void mo12175a(Integer num) {
        this.f11731r = num;
    }

    /* renamed from: b */
    public void mo12148b(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        int i = -1;
        int i2 = 0;
        if (attachment.mo11434g() == AttachmentType.MANDATORY) {
            getMandatoryAttachments().setValue(mo12171a(attachment, (List) getMandatoryAttachments().mo6263a()));
            List list = (List) getMandatoryAttachments().mo6263a();
            mo12179c(list != null ? !list.isEmpty() : false);
            Iterator it = mo12167S1().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ApplicationMandatoryDocument) it.next()).mo11904a(attachment.mo11438j())) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            mo12167S1().remove(i);
            return;
        }
        getOptionalAttachments().setValue(mo12171a(attachment, (List) getOptionalAttachments().mo6263a()));
        List list2 = (List) getOptionalAttachments().mo6263a();
        mo12180d(list2 != null ? !list2.isEmpty() : false);
        Iterator it2 = mo12168T1().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((OtherThingsToDoAttachment) it2.next()).mo11988a(attachment.mo11438j())) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        mo12168T1().remove(i);
    }

    /* renamed from: b */
    public void mo12178b(boolean z) {
        this.f11735v.setValue(this, f11712N[5], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo12179c(boolean z) {
        this.f11738y.setValue(this, f11712N[7], Boolean.valueOf(z));
    }

    public void cancel() {
        mo16373a((Function1<? super C3737d, Unit>) TmgiFormViewModelImpl$cancel$1.INSTANCE);
    }

    /* renamed from: d */
    public void mo12180d(boolean z) {
        this.f11739z.setValue(this, f11712N[8], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo12150d() {
        return ((Boolean) this.f11737x.getValue(this, f11712N[6])).booleanValue();
    }

    /* renamed from: d1 */
    public String mo12151d1() {
        return (String) this.f11727n.getValue(this, f11712N[0]);
    }

    /* renamed from: e */
    public void mo12181e(boolean z) {
        this.f11737x.setValue(this, f11712N[6], Boolean.valueOf(z));
    }

    /* renamed from: e1 */
    public String mo12152e1() {
        return (String) this.f11734u.getValue(this, f11712N[4]);
    }

    /* renamed from: f */
    public void mo12182f(boolean z) {
        this.f11732s.setValue(this, f11712N[3], Boolean.valueOf(z));
    }

    /* renamed from: f1 */
    public boolean mo12153f1() {
        return ((Boolean) this.f11735v.getValue(this, f11712N[5])).booleanValue();
    }

    /* renamed from: g */
    public void mo12154g(String str) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "newValue");
        List list = (List) mo12144K1().f10171e;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual((Object) ((TmgiCaseType) t).mo11922g(), (Object) str)) {
                    break;
                }
            }
            T t2 = (TmgiCaseType) t;
            if (t2 != null) {
                mo12175a(t2.mo12025h().mo12030b());
                C3709k k1 = mo12159k1();
                if (t2 != k1.f10171e) {
                    k1.f10171e = t2;
                    k1.mo10509L1();
                }
                mo12169U1();
                if (mo12166R1() != null) {
                    mo12178b(true);
                    C3710l y0 = mo12162y0();
                    if (C4014R.string.Other_Documents_section != y0.f10172e) {
                        y0.f10172e = C4014R.string.Other_Documents_section;
                        y0.mo10509L1();
                        return;
                    }
                    return;
                }
                C3710l y02 = mo12162y0();
                if (C4014R.string.Documents_section != y02.f10172e) {
                    y02.f10172e = C4014R.string.Documents_section;
                    y02.mo10509L1();
                }
                mo12178b(false);
            }
        }
    }

    /* renamed from: i */
    public void mo12157i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11714B.setValue(this, f11712N[9], str);
    }

    /* renamed from: j1 */
    public boolean mo12158j1() {
        return ((Boolean) this.f11732s.getValue(this, f11712N[3])).booleanValue();
    }

    /* renamed from: k1 */
    public C3709k<TmgiCaseType> mo12159k1() {
        return this.f11733t;
    }

    /* renamed from: m */
    public void mo12160m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11734u.setValue(this, f11712N[4], str);
    }

    /* renamed from: r */
    public void mo12183r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11729p.setValue(this, f11712N[2], str);
    }

    /* renamed from: s */
    public void mo12184s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11728o.setValue(this, f11712N[1], str);
    }

    /* renamed from: t */
    public void mo12185t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11727n.setValue(this, f11712N[0], str);
    }

    /* renamed from: x */
    public void mo12161x() {
        C5036u a = this.f11720H.mo14191b().mo17214a(C5041a.m16999a()).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new TmgiFormViewModelImpl$send$1<Object,Object>(this)).mo17239d().mo17267c((C4673f<? super T>) new TmgiFormViewModelImpl$send$2<Object>(this)).mo17258a((C4673f<? super Throwable>) new TmgiFormViewModelImpl$send$3<Object>(this)).mo17260a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository\n      …dSchedulers.mainThread())");
        mo16413a(C4998b.m16843a(a, (Function1<? super Throwable, Unit>) new TmgiFormViewModelImpl$send$5<Object,Unit>(this), (Function1<? super T, Unit>) new TmgiFormViewModelImpl$send$4<Object,Unit>(this)));
    }

    /* renamed from: y0 */
    public C3710l mo12162y0() {
        return this.f11736w;
    }

    /* renamed from: z0 */
    public void mo12163z0() {
        mo12176a((Function2<? super C0006f, ? super Calendar, Unit>) new TmgiFormViewModelImpl$selectStartDate$1<Object,Object,Unit>(this));
    }

    /* renamed from: a */
    public void mo12174a(Children children) {
        Intrinsics.checkParameterIsNotNull(children, "<set-?>");
        this.f11713A = children;
    }

    public C3824r<List<Attachment>> getMandatoryAttachments() {
        return this.f11716D;
    }

    public C3824r<List<Attachment>> getOptionalAttachments() {
        return this.f11717E;
    }

    /* renamed from: a */
    public void mo12173a(CaseType caseType) {
        Intrinsics.checkParameterIsNotNull(caseType, "<set-?>");
        this.f11715C = caseType;
    }

    /* renamed from: a */
    public void mo12147a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        Uri uri = (Uri) this.f11726m.get(attachment.mo11438j());
        if (uri != null) {
            mo16373a((Function1<? super C3737d, Unit>) new TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1<Object,Unit>(uri, this));
        }
    }

    /* renamed from: a */
    public final void mo12172a(C0006f fVar, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(fVar, "dialog");
        Intrinsics.checkParameterIsNotNull(calendar, "datetime");
        mo12183r(UtilsKt.m14839c(calendar));
    }

    /* renamed from: a */
    public final void mo12176a(Function2<? super C0006f, ? super Calendar, Unit> function2) {
        Object clone = this.f11725M.mo16327a().clone();
        if (clone != null) {
            Calendar calendar = (Calendar) clone;
            calendar.add(2, 3);
            mo16373a((Function1<? super C3737d, Unit>) new C4096x6940523a<Object,Unit>(this, calendar, function2));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }

    /* renamed from: a */
    public final List<Attachment> mo12171a(Attachment attachment, List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!Intrinsics.areEqual((Object) ((Attachment) next).mo11438j(), (Object) attachment.mo11438j())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo12177b(C0006f fVar, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(fVar, "dialog");
        Intrinsics.checkParameterIsNotNull(calendar, "datetime");
        mo12184s(UtilsKt.m14839c(calendar));
    }
}
