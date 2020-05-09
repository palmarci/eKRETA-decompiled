package p289hu.ekreta.ellenorzo.message;

import android.app.Activity;
import android.content.Intent;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p211h.p271p.C3824r;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.p337h0.C5016a;
import p300k.p313b.p337h0.C5021d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020&H\u0016J\b\u0010I\u001a\u00020GH\u0016J\u0010\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020-H\u0002R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R+\u0010)\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u001e8V@VX\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0010\u001a\u0004\u0018\u00010-8V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0018\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u00104\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R+\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0018\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u0016R+\u0010<\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b?\u0010\u0018\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0AX\u0004¢\u0006\u0002\n\u0000R+\u0010B\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u001e8V@VX\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0018\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"¨\u0006L"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessageDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "messageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Lhu/ekreta/ellenorzo/message/MessageRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "<set-?>", "", "addresseeNames", "getAddresseeNames", "()Ljava/lang/String;", "setAddresseeNames", "(Ljava/lang/String;)V", "addresseeNames$delegate", "Lkotlin/properties/ReadWriteProperty;", "date", "getDate", "setDate", "date$delegate", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "setEmptyViewVisible", "(Z)V", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "Lhu/ekreta/ellenorzo/message/Message;", "message", "getMessage", "()Lhu/ekreta/ellenorzo/message/Message;", "setMessage", "(Lhu/ekreta/ellenorzo/message/Message;)V", "message$delegate", "messageSenderNameAndType", "getMessageSenderNameAndType", "setMessageSenderNameAndType", "messageSenderNameAndType$delegate", "messageSubject", "getMessageSubject", "setMessageSubject", "messageSubject$delegate", "messageText", "getMessageText", "setMessageText", "messageText$delegate", "progressSubject", "Lio/reactivex/subjects/Subject;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "onSelect", "", "item", "replayMessage", "setMessageValues", "value", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl */
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl extends AuthenticatedViewModel implements MessageDetailViewModel {

    /* renamed from: A */
    public static final /* synthetic */ KProperty[] f13832A;

    /* renamed from: m */
    public final ReadWriteProperty f13833m = DataBindingViewModel.boundString$default(this, this, 110, null, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f13834n;

    /* renamed from: o */
    public final ReadWriteProperty f13835o;

    /* renamed from: p */
    public final ReadWriteProperty f13836p;

    /* renamed from: q */
    public final ReadWriteProperty f13837q;

    /* renamed from: r */
    public final C3824r<List<Attachment>> f13838r;

    /* renamed from: s */
    public final ReadWriteProperty f13839s;

    /* renamed from: t */
    public final ReadWriteProperty f13840t;

    /* renamed from: u */
    public final C5021d<Boolean> f13841u;

    /* renamed from: v */
    public boolean f13842v;

    /* renamed from: w */
    public final ReadWriteProperty f13843w;

    /* renamed from: x */
    public final AttachmentService f13844x;

    /* renamed from: y */
    public final MessageRepository f13845y;

    /* renamed from: z */
    public final ProfileRepository f13846z;

    static {
        Class<MessageDetailViewModelImpl> cls = MessageDetailViewModelImpl.class;
        f13832A = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageSenderNameAndType", "getMessageSenderNameAndType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addresseeNames", "getAddresseeNames()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageSubject", "getMessageSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageText", "getMessageText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "message", "getMessage()Lhu/ekreta/ellenorzo/message/Message;"))};
    }

    public MessageDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, AttachmentService attachmentService, MessageRepository messageRepository, ProfileRepository profileRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(messageRepository, "messageRepository");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f13844x = attachmentService;
        this.f13845y = messageRepository;
        this.f13846z = profileRepository;
        this.f13834n = DataBindingViewModel.boundString$default(this, this, 108, null, null, 6, null);
        this.f13835o = DataBindingViewModel.boundString$default(this, this, 64, null, null, 6, null);
        this.f13836p = DataBindingViewModel.boundString$default(this, this, 104, null, null, 6, null);
        this.f13837q = DataBindingViewModel.boundString$default(this, this, 18, null, null, 6, null);
        this.f13838r = new C3824r<>();
        this.f13839s = DataBindingViewModel.boundBoolean$default(this, this, 3, false, null, 6, null);
        this.f13840t = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);
        C5016a aVar = new C5016a();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create()");
        this.f13841u = aVar;
        Delegates delegates = Delegates.INSTANCE;
        this.f13843w = new MessageDetailViewModelImpl$$special$$inlined$observable$1(null, null, this);
        mo16414a((KMutableProperty0<T>) new MutablePropertyReference0(this) {
            public Object get() {
                return Boolean.valueOf(((MessageDetailViewModelImpl) this.receiver).mo11494d());
            }

            public String getName() {
                return "progressVisible";
            }

            public KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(MessageDetailViewModelImpl.class);
            }

            public String getSignature() {
                return "getProgressVisible()Z";
            }

            public void set(Object obj) {
                ((MessageDetailViewModelImpl) this.receiver).mo13328c(((Boolean) obj).booleanValue());
            }
        }, (C5027n<T>) this.f13841u);
    }

    /* renamed from: P1 */
    public Message mo13325P1() {
        return (Message) this.f13843w.getValue(this, f13832A[7]);
    }

    /* renamed from: X */
    public String mo13318X() {
        return (String) this.f13834n.getValue(this, f13832A[1]);
    }

    /* renamed from: a */
    public void onSelect(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        C3984v.m10232a((AuthenticatedViewModel) this, this.f13844x, this.f13841u, getItems(), attachment, (Function0<? extends C5027n<File>>) new MessageDetailViewModelImpl$onSelect$1<Object>(this, attachment));
    }

    /* renamed from: a0 */
    public void mo13319a0() {
        mo16376b((Function1<? super Activity, ? extends Intent>) new MessageDetailViewModelImpl$replayMessage$1<Object,Object>(this));
    }

    /* renamed from: b */
    public void mo13327b(boolean z) {
        this.f13839s.setValue(this, f13832A[5], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo13320c(Message message) {
        this.f13843w.setValue(this, f13832A[7], message);
    }

    /* renamed from: c */
    public void mo13328c(boolean z) {
        this.f13840t.setValue(this, f13832A[6], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo11494d() {
        return ((Boolean) this.f13840t.getValue(this, f13832A[6])).booleanValue();
    }

    /* renamed from: e */
    public void mo11495e() {
    }

    /* renamed from: e */
    public final void mo13329e(Message message) {
        mo13332t(message.mo13285l());
        mo13330r(message.mo13279g());
        mo13331s(UtilsKt.m14841d(message.mo13287n()));
        mo13333u(message.mo13288o());
        mo13334v(message.mo13289p());
        C3824r items = getItems();
        List h = message.mo13280h();
        mo13327b(!h.isEmpty());
        items.setValue(h);
    }

    /* renamed from: f */
    public boolean mo11496f() {
        return this.f13842v;
    }

    /* renamed from: g */
    public boolean mo11497g() {
        return ((Boolean) this.f13839s.getValue(this, f13832A[5])).booleanValue();
    }

    /* renamed from: h */
    public String mo13321h() {
        return (String) this.f13835o.getValue(this, f13832A[2]);
    }

    /* renamed from: p0 */
    public String mo13322p0() {
        return (String) this.f13833m.getValue(this, f13832A[0]);
    }

    /* renamed from: q0 */
    public String mo13323q0() {
        return (String) this.f13837q.getValue(this, f13832A[4]);
    }

    /* renamed from: r */
    public void mo13330r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13834n.setValue(this, f13832A[1], str);
    }

    /* renamed from: s */
    public void mo13331s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13835o.setValue(this, f13832A[2], str);
    }

    /* renamed from: s0 */
    public String mo13324s0() {
        return (String) this.f13836p.getValue(this, f13832A[3]);
    }

    /* renamed from: t */
    public void mo13332t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13833m.setValue(this, f13832A[0], str);
    }

    /* renamed from: u */
    public void mo13333u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13836p.setValue(this, f13832A[3], str);
    }

    /* renamed from: v */
    public void mo13334v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13837q.setValue(this, f13832A[4], str);
    }

    public C3824r<List<Attachment>> getItems() {
        return this.f13838r;
    }
}
