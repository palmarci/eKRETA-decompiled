package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.attachment.AttachmentType;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import p289hu.ekreta.ellenorzo.classmaster.ClassMaster;
import p289hu.ekreta.ellenorzo.classmaster.ClassMasterRepository;
import p289hu.ekreta.ellenorzo.message.Message;
import p289hu.ekreta.ellenorzo.newmessage.model.Addressee;
import p289hu.ekreta.ellenorzo.newmessage.model.NewMessageService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\b\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u00020SH\u0016J\u0010\u0010U\u001a\u00020S2\u0006\u0010V\u001a\u00020(H\u0002J\b\u0010W\u001a\u00020EH\u0002J\b\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020YH\u0002J\b\u0010[\u001a\u000208H\u0002J\b\u0010\\\u001a\u00020YH\u0002J\u0010\u0010]\u001a\u00020S2\u0006\u0010^\u001a\u00020EH\u0002J\u0010\u0010_\u001a\u00020S2\u0006\u0010V\u001a\u00020(H\u0016J\u0010\u0010`\u001a\u00020S2\u0006\u0010V\u001a\u00020(H\u0016J\u0010\u0010a\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\u001bH\u0002J\b\u0010c\u001a\u00020SH\u0016J\u0010\u0010d\u001a\u00020S2\u0006\u0010e\u001a\u00020>H\u0016J\b\u0010f\u001a\u00020SH\u0002J\u000e\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u001bJ\f\u0010j\u001a\u00020E*\u00020kH\u0002J\u0014\u0010l\u001a\u00020E*\u00020m2\u0006\u0010n\u001a\u00020kH\u0002R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0$0'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020/0.X\u0004¢\u0006\u0002\n\u0000R+\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u0002008V@VX\u0002¢\u0006\u0012\n\u0004\b6\u0010\"\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000208X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000R+\u0010?\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\bB\u0010\"\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u000e\u0010C\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010F\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020E8V@VX\u0002¢\u0006\u0012\n\u0004\bK\u0010\"\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020%0MX\u0004¢\u0006\u0002\n\u0000R+\u0010N\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\bQ\u0010\"\u001a\u0004\bO\u0010\u001e\"\u0004\bP\u0010 ¨\u0006o"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "classMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "newMessageService", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "contentResolver", "Landroid/content/ContentResolver;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Landroid/content/ContentResolver;Landroid/content/Context;)V", "<set-?>", "", "addressee", "getAddressee", "()Ljava/lang/String;", "setAddressee", "(Ljava/lang/String;)V", "addressee$delegate", "Lkotlin/properties/ReadWriteProperty;", "addresseeList", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "attachments", "Landroidx/lifecycle/MutableLiveData;", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "()Landroidx/lifecycle/MutableLiveData;", "classMaster", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "localFiles", "", "Landroid/net/Uri;", "", "messageSpanned", "getMessageSpanned", "()Ljava/lang/CharSequence;", "setMessageSpanned", "(Ljava/lang/CharSequence;)V", "messageSpanned$delegate", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "originalMessageObject", "Lhu/ekreta/ellenorzo/message/Message;", "pageTitle", "getPageTitle", "setPageTitle", "pageTitle$delegate", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "", "progressVisible", "getProgressVisible", "()Z", "setProgressVisible", "(Z)V", "progressVisible$delegate", "selectedAddresseeList", "", "subject", "getSubject", "setSubject", "subject$delegate", "addAddressee", "", "addAttachment", "addToAttachments", "attachment", "allRequiredFieldHasValue", "createMessage", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "createNewMessage", "createOnTouchListener", "createReplyMessage", "handleSendMessageResponse", "isSuccess", "onSelect", "removeAttachment", "replaceLineBreak", "text", "sendMessage", "setOriginalMessageSubject", "originalMessage", "startSendMessageRequest", "toSpanned", "Landroid/text/Spanned;", "html", "isActionUp", "Landroid/view/MotionEvent;", "isClickOnRightIcon", "Landroid/widget/EditText;", "event", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl */
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl extends AuthenticatedViewModel implements NewMessageViewModel {

    /* renamed from: G */
    public static final /* synthetic */ KProperty[] f13987G;

    /* renamed from: A */
    public final NewMessageService f13988A;

    /* renamed from: B */
    public final DateTimeFactory f13989B;

    /* renamed from: C */
    public final AttachmentRepository f13990C;

    /* renamed from: D */
    public final AttachmentService f13991D;

    /* renamed from: E */
    public final ContentResolver f13992E;

    /* renamed from: F */
    public final Context f13993F;

    /* renamed from: m */
    public final ReadWriteProperty f13994m = DataBindingViewModel.boundString$default(this, this, 6, null, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f13995n = DataBindingViewModel.boundString$default(this, this, 86, null, null, 6, null);

    /* renamed from: o */
    public final ReadWriteProperty f13996o = DataBindingViewModel.boundString$default(this, this, 51, null, null, 6, null);

    /* renamed from: p */
    public final ReadWriteProperty f13997p = DataBindingViewModel.boundSpanned$default(this, this, 100, null, null, 6, null);

    /* renamed from: q */
    public final ReadWriteProperty f13998q = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);

    /* renamed from: r */
    public OnTouchListener f13999r = new NewMessageViewModelImpl$createOnTouchListener$1(this);

    /* renamed from: s */
    public final C3824r<List<Attachment>> f14000s = new C3824r<>();

    /* renamed from: t */
    public Profile f14001t;

    /* renamed from: u */
    public ClassMaster f14002u;

    /* renamed from: v */
    public List<Addressee> f14003v = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: w */
    public final List<Addressee> f14004w = new ArrayList();

    /* renamed from: x */
    public Message f14005x;

    /* renamed from: y */
    public final Map<String, Uri> f14006y = new LinkedHashMap();

    /* renamed from: z */
    public final ProfileRepository f14007z;

    static {
        Class<NewMessageViewModelImpl> cls = NewMessageViewModelImpl.class;
        f13987G = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "pageTitle", "getPageTitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addressee", "getAddressee()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageSpanned", "getMessageSpanned()Ljava/lang/CharSequence;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z"))};
    }

    public NewMessageViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, final ClassMasterRepository classMasterRepository, ProfileRepository profileRepository, NewMessageService newMessageService, DateTimeFactory dateTimeFactory, AttachmentRepository attachmentRepository, AttachmentService attachmentService, ContentResolver contentResolver, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(classMasterRepository, "classMasterRepository");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(newMessageService, "newMessageService");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        Intrinsics.checkParameterIsNotNull(attachmentRepository, "attachmentRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(contentResolver, "contentResolver");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f14007z = profileRepository;
        this.f13988A = newMessageService;
        this.f13989B = dateTimeFactory;
        this.f13990C = attachmentRepository;
        this.f13991D = attachmentService;
        this.f13992E = contentResolver;
        this.f13993F = context;
        String string = this.f13993F.getString(C4014R.string.newMessage_title);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.newMessage_title)");
        mo13527n(string);
        C4663c a = this.f14007z.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl f14008c;

            {
                this.f14008c = r1;
            }

            /* renamed from: a */
            public final C5027n<Pair<ClassMaster, List<Addressee>>> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                this.f14008c.f14001t = profile;
                C5027n a = this.f14008c.mo11505a(classMasterRepository.mo12258l(profile));
                NewMessageViewModelImpl newMessageViewModelImpl = this.f14008c;
                return C5027n.m16892a((C5030q<? extends T1>) a, (C5030q<? extends T2>) newMessageViewModelImpl.mo11505a(newMessageViewModelImpl.f13988A.mo13501a(profile.mo14042d())), (C4670c<? super T1, ? super T2, ? extends R>) C42691.INSTANCE);
            }
        }).mo17192a((C4673f<? super T>) new C4673f<Pair<? extends ClassMaster, ? extends List<? extends Addressee>>>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl f14010c;

            {
                this.f14010c = r1;
            }

            /* renamed from: a */
            public final void accept(Pair<ClassMaster, ? extends List<Addressee>> pair) {
                this.f14010c.f14002u = (ClassMaster) pair.getFirst();
                this.f14010c.f14003v = (List) pair.getSecond();
            }
        }, (C4673f<? super Throwable>) new C4673f<Throwable>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl f14011c;

            {
                this.f14011c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                NewMessageViewModelImpl newMessageViewModelImpl = this.f14011c;
                Intrinsics.checkExpressionValueIsNotNull(th, "throwable");
                DataBindingViewModel.showError$default(newMessageViewModelImpl, th, null, null, 6, null);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository.getAct…hrowable) }\n            )");
        mo16413a(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r4 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$addAddressee(p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl r5) {
        /*
            java.util.List<hu.ekreta.ellenorzo.newmessage.model.Addressee> r0 = r5.f14003v
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            r3 = r1
            hu.ekreta.ellenorzo.newmessage.model.Addressee r3 = (p289hu.ekreta.ellenorzo.newmessage.model.Addressee) r3
            java.lang.String r3 = r3.mo13476f()
            hu.ekreta.ellenorzo.classmaster.ClassMaster r4 = r5.f14002u
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = r4.mo12222f()
            if (r4 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r4 = r2
        L_0x0025:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L_0x0006
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            hu.ekreta.ellenorzo.newmessage.model.Addressee r1 = (p289hu.ekreta.ellenorzo.newmessage.model.Addressee) r1
            if (r1 == 0) goto L_0x0046
            java.util.List<hu.ekreta.ellenorzo.newmessage.model.Addressee> r0 = r5.f14004w
            r0.clear()
            java.util.List<hu.ekreta.ellenorzo.newmessage.model.Addressee> r0 = r5.f14004w
            r0.add(r1)
            java.lang.String r0 = r1.mo13476f()
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            r5.mo13526j(r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl.access$addAddressee(hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl):void");
    }

    public static final /* synthetic */ void access$addToAttachments(NewMessageViewModelImpl newMessageViewModelImpl, Attachment attachment) {
        C3824r attachments = newMessageViewModelImpl.getAttachments();
        Attachment attachment2 = new Attachment(0, attachment.mo11435h(), attachment.mo11438j(), AttachmentType.UNDEFINIED, AttachmentDownloadState.DOWNLOADED, attachment.mo11318e());
        ExtensionsKt.m14659a(attachments, CollectionsKt__CollectionsJVMKt.listOf(attachment2));
    }

    public static final /* synthetic */ Profile access$getProfile$p(NewMessageViewModelImpl newMessageViewModelImpl) {
        Profile profile = newMessageViewModelImpl.f14001t;
        if (profile == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Param.PROFILE);
        }
        return profile;
    }

    /* renamed from: A0 */
    public String mo13514A0() {
        return (String) this.f13995n.getValue(this, f13987G[1]);
    }

    /* renamed from: B1 */
    public String mo13515B1() {
        return (String) this.f13994m.getValue(this, f13987G[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ((mo13529s1().length() > 0) != false) goto L_0x002d;
     */
    /* renamed from: E1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13516E1() {
        /*
            r32 = this;
            r6 = r32
            java.util.List<hu.ekreta.ellenorzo.newmessage.model.Addressee> r0 = r6.f14004w
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r32.mo13525j()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x002c
            java.lang.CharSequence r0 = r32.mo13529s1()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0112
            hu.ekreta.ellenorzo.newmessage.model.NewMessageService r0 = r6.f13988A
            hu.ekreta.ellenorzo.profile.Profile r1 = r6.f14001t
            java.lang.String r2 = "profile"
            if (r1 != 0) goto L_0x003a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x003a:
            hu.ekreta.ellenorzo.message.Message r3 = r6.f14005x
            if (r3 != 0) goto L_0x0084
            hu.ekreta.ellenorzo.newmessage.model.NewMessage r3 = new hu.ekreta.ellenorzo.newmessage.model.NewMessage
            hu.ekreta.ellenorzo.util.datetime.DateTimeFactory r4 = r6.f13989B
            java.util.Calendar r10 = r4.mo16327a()
            hu.ekreta.ellenorzo.profile.Profile r4 = r6.f14001t
            if (r4 != 0) goto L_0x004d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x004d:
            java.lang.String r11 = r4.mo14053l()
            java.lang.CharSequence r2 = r32.mo13529s1()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r13 = r6.mo13534r(r2)
            java.lang.String r14 = r32.mo13525j()
            r15 = 0
            r16 = 0
            h.p.r r2 = r32.getAttachments()
            java.lang.Object r2 = r2.mo6263a()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x0075:
            r18 = r2
            java.util.List<hu.ekreta.ellenorzo.newmessage.model.Addressee> r2 = r6.f14004w
            r8 = 0
            java.lang.String r12 = ""
            r7 = r3
            r19 = r2
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r18, r19)
            goto L_0x00d9
        L_0x0084:
            hu.ekreta.ellenorzo.newmessage.model.NewMessage r3 = new hu.ekreta.ellenorzo.newmessage.model.NewMessage
            hu.ekreta.ellenorzo.util.datetime.DateTimeFactory r4 = r6.f13989B
            java.util.Calendar r22 = r4.mo16327a()
            hu.ekreta.ellenorzo.profile.Profile r4 = r6.f14001t
            if (r4 != 0) goto L_0x0093
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0093:
            java.lang.String r23 = r4.mo14053l()
            java.lang.CharSequence r2 = r32.mo13529s1()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r25 = r6.mo13534r(r2)
            java.lang.String r26 = r32.mo13525j()
            hu.ekreta.ellenorzo.message.Message r2 = r6.f14005x
            if (r2 == 0) goto L_0x00b4
            long r4 = r2.mo13283j()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r27 = r2
            r28 = 0
            h.p.r r2 = r32.getAttachments()
            java.lang.Object r2 = r2.mo6263a()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x00ca:
            r30 = r2
            java.util.List r31 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r20 = 0
            java.lang.String r24 = ""
            r19 = r3
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r28, r30, r31)
        L_0x00d9:
            k.b.n r0 = r0.mo13500a(r1, r3)
            k.b.n r0 = r6.mo11505a(r0)
            hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$1 r1 = new hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$1
            r1.<init>(r6)
            k.b.n r0 = r0.mo17238d(r1)
            hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$2 r1 = new hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$2
            r1.<init>(r6)
            k.b.n r0 = r0.mo17232c(r1)
            k.b.t r1 = p300k.p313b.p338z.p339a.C5041a.m16999a()
            k.b.n r0 = r0.mo17214a(r1)
            hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$3 r1 = new hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$3
            r1.<init>(r6)
            hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$4 r2 = new hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$4
            r2.<init>(r6)
            k.b.a0.c r0 = r0.mo17192a(r1, r2)
            java.lang.String r1 = "newMessageService\n      …hrowable) }\n            )"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r6.mo16413a(r0)
            goto L_0x011e
        L_0x0112:
            r1 = 2131689980(0x7f0f01fc, float:1.900899E38)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r32
            p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.showAlert$default(r0, r1, r2, r3, r4, r5)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl.mo13516E1():void");
    }

    /* renamed from: U */
    public void mo13517U() {
        mo16373a((Function1<? super C3737d, Unit>) new NewMessageViewModelImpl$addAttachment$1<Object,Unit>(this));
    }

    /* renamed from: a */
    public void mo13518a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
    }

    /* renamed from: a */
    public void mo13519a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f13997p.setValue(this, f13987G[3], charSequence);
    }

    /* renamed from: a */
    public final boolean mo13530a(MotionEvent motionEvent) {
        return motionEvent.getAction() == 1;
    }

    /* renamed from: b */
    public final void mo13532b(boolean z) {
        if (z) {
            DataBindingViewModel.showAlert$default(this, C4014R.string.newMessage_sendMessageSuccess, null, new NewMessageViewModelImpl$handleSendMessageResponse$1(this), 2, null);
            return;
        }
        DataBindingViewModel.showAlert$default(this, C4014R.string.newMessage_sendMessageFailed, null, null, 6, null);
    }

    /* renamed from: c */
    public void mo13520c(Attachment attachment) {
        List list;
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
        C3824r attachments = getAttachments();
        List list2 = (List) getAttachments().mo6263a();
        if (list2 != null) {
            list = new ArrayList();
            for (Object next : list2) {
                if (!Intrinsics.areEqual((Object) ((Attachment) next).mo11438j(), (Object) attachment.mo11438j())) {
                    list.add(next);
                }
            }
        } else {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        attachments.setValue(list);
    }

    /* renamed from: c */
    public void mo13533c(boolean z) {
        this.f13998q.setValue(this, f13987G[4], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo13521d(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "originalMessage");
        this.f14005x = message;
        String string = this.f13993F.getString(C4014R.string.newMessage_title_reply);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.newMessage_title_reply)");
        mo13527n(string);
        this.f14004w.clear();
        List<Addressee> list = this.f14004w;
        Addressee addressee = new Addressee(Long.valueOf(1), message.mo13284k(), null, null, null, null, null, null);
        list.add(addressee);
        mo13526j(message.mo13284k());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13993F.getString(C4014R.string.newMessage_replySubjectPrefix));
        sb.append(' ');
        sb.append(message.mo13288o());
        mo13528p(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<br><br>");
        sb2.append(this.f13993F.getString(C4014R.string.newMessage_replyMessagePrefix));
        String str = "<br>";
        sb2.append(str);
        sb2.append(this.f13993F.getString(C4014R.string.newMessage_replyMessageSender));
        sb2.append(' ');
        sb2.append(message.mo13284k());
        sb2.append(str);
        sb2.append(this.f13993F.getString(C4014R.string.newMessage_replyMessageSentDate));
        sb2.append(' ');
        sb2.append(UtilsKt.m14839c(message.mo13287n()));
        sb2.append(str);
        sb2.append(this.f13993F.getString(C4014R.string.newMessage_replyMessageSentSubject));
        sb2.append(' ');
        sb2.append(message.mo13288o());
        sb2.append(str);
        sb2.append(message.mo13289p());
        mo13519a((CharSequence) mo13535s(sb2.toString()));
    }

    /* renamed from: d */
    public boolean mo13522d() {
        return ((Boolean) this.f13998q.getValue(this, f13987G[4])).booleanValue();
    }

    public C3824r<List<Attachment>> getAttachments() {
        return this.f14000s;
    }

    /* renamed from: h1 */
    public OnTouchListener mo13524h1() {
        return this.f13999r;
    }

    /* renamed from: j */
    public String mo13525j() {
        return (String) this.f13996o.getValue(this, f13987G[2]);
    }

    /* renamed from: j */
    public void mo13526j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13995n.setValue(this, f13987G[1], str);
    }

    /* renamed from: n */
    public void mo13527n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13994m.setValue(this, f13987G[0], str);
    }

    /* renamed from: p */
    public void mo13528p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13996o.setValue(this, f13987G[2], str);
    }

    /* renamed from: r */
    public final String mo13534r(String str) {
        return StringsKt__StringsJVMKt.replace$default(str, "\n", "<br>", false, 4, (Object) null);
    }

    /* renamed from: s */
    public final Spanned mo13535s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "html");
        if (VERSION.SDK_INT >= 24) {
            Spanned fromHtml = Html.fromHtml(str, 0);
            Intrinsics.checkExpressionValueIsNotNull(fromHtml, "Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        Intrinsics.checkExpressionValueIsNotNull(fromHtml2, "Html.fromHtml(html)");
        return fromHtml2;
    }

    /* renamed from: s1 */
    public CharSequence mo13529s1() {
        return (CharSequence) this.f13997p.getValue(this, f13987G[3]);
    }

    /* renamed from: a */
    public final boolean mo13531a(EditText editText, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        int right = editText.getRight();
        Drawable drawable = editText.getCompoundDrawables()[2];
        Intrinsics.checkExpressionValueIsNotNull(drawable, "compoundDrawables[drawableIndexRight]");
        return rawX >= ((float) (right - drawable.getBounds().width()));
    }
}
