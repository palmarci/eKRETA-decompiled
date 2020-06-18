package hu.ekreta.ellenorzo.message;

import android.app.Activity;
import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.io.File;
import java.util.List;
import k.b.h0.a;
import k.b.h0.d;
import k.b.n;
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
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020(H\u0016J\b\u0010K\u001a\u00020IH\u0016J\u0010\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020/H\u0002R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R+\u0010+\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020 8V@VX\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R/\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u0012\u001a\u0004\u0018\u00010/8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u00106\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b9\u0010\u001a\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018R+\u0010:\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001a\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010\u0018R+\u0010>\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\bA\u0010\u001a\u001a\u0004\b?\u0010\u0016\"\u0004\b@\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020 0CX\u0004¢\u0006\u0002\n\u0000R+\u0010D\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020 8V@VX\u0002¢\u0006\u0012\n\u0004\bG\u0010\u001a\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$¨\u0006N"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "messageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Lhu/ekreta/ellenorzo/message/MessageRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "<set-?>", "", "addresseeNames", "getAddresseeNames", "()Ljava/lang/String;", "setAddresseeNames", "(Ljava/lang/String;)V", "addresseeNames$delegate", "Lkotlin/properties/ReadWriteProperty;", "date", "getDate", "setDate", "date$delegate", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "setEmptyViewVisible", "(Z)V", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "Lhu/ekreta/ellenorzo/message/Message;", "message", "getMessage", "()Lhu/ekreta/ellenorzo/message/Message;", "setMessage", "(Lhu/ekreta/ellenorzo/message/Message;)V", "message$delegate", "messageSenderNameAndType", "getMessageSenderNameAndType", "setMessageSenderNameAndType", "messageSenderNameAndType$delegate", "messageSubject", "getMessageSubject", "setMessageSubject", "messageSubject$delegate", "messageText", "getMessageText", "setMessageText", "messageText$delegate", "progressSubject", "Lio/reactivex/subjects/Subject;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "onSelect", "", "item", "replayMessage", "setMessageValues", "value", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl extends AuthenticatedViewModel implements MessageDetailViewModel {
    public static final /* synthetic */ KProperty[] B;
    public final ProfileRepository A;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5784n = DataBindingViewModel.boundString$default(this, this, 113, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5785o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5786p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5787q;
    public final ReadWriteProperty r;
    public final r<List<Attachment>> s;
    public final ReadWriteProperty t;
    public final ReadWriteProperty u;
    public final d<Boolean> v;
    public boolean w;
    public final ReadWriteProperty x;
    public final AttachmentService y;
    public final MessageRepository z;

    static {
        Class<MessageDetailViewModelImpl> cls = MessageDetailViewModelImpl.class;
        B = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageSenderNameAndType", "getMessageSenderNameAndType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addresseeNames", "getAddresseeNames()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageSubject", "getMessageSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageText", "getMessageText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "message", "getMessage()Lhu/ekreta/ellenorzo/message/Message;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, AttachmentService attachmentService, MessageRepository messageRepository, ProfileRepository profileRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(messageRepository, "messageRepository");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        this.y = attachmentService;
        this.z = messageRepository;
        this.A = profileRepository;
        this.f5785o = DataBindingViewModel.boundString$default(this, this, 111, (String) null, (Function1) null, 6, (Object) null);
        this.f5786p = DataBindingViewModel.boundString$default(this, this, 64, (String) null, (Function1) null, 6, (Object) null);
        this.f5787q = DataBindingViewModel.boundString$default(this, this, 106, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 18, (String) null, (Function1) null, 6, (Object) null);
        this.s = new r<>();
        this.t = DataBindingViewModel.boundBoolean$default(this, this, 3, false, (Function1) null, 6, (Object) null);
        this.u = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        a aVar = new a();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "BehaviorSubject.create()");
        this.v = aVar;
        Delegates delegates = Delegates.INSTANCE;
        this.x = new MessageDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
        a(new MutablePropertyReference0(this) {
            public Object get() {
                return Boolean.valueOf(((MessageDetailViewModelImpl) this.receiver).d());
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
                ((MessageDetailViewModelImpl) this.receiver).d(((Boolean) obj).booleanValue());
            }
        }, this.v);
    }

    public String X() {
        return (String) this.f5785o.getValue(this, B[1]);
    }

    public Message Z1() {
        return (Message) this.x.getValue(this, B[7]);
    }

    /* renamed from: a */
    public void onSelect(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "item");
        ViewModelExtensionsKt.a((AuthenticatedViewModel) this, this.y, this.v, (r<List<Attachment>>) getItems(), attachment, (Function0<? extends n<File>>) new MessageDetailViewModelImpl$onSelect$1(this, attachment));
    }

    public void a0() {
        b((Function1<? super Activity, ? extends Intent>) new MessageDetailViewModelImpl$replayMessage$1(this));
    }

    public void c(Message message) {
        this.x.setValue(this, B[7], message);
    }

    public void c(boolean z2) {
        this.t.setValue(this, B[5], Boolean.valueOf(z2));
    }

    public void d(boolean z2) {
        this.u.setValue(this, B[6], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.u.getValue(this, B[6])).booleanValue();
    }

    public void e() {
    }

    public final void e(Message message) {
        s(message.l());
        q(message.g());
        r(UtilsKt.d(message.n()));
        t(message.o());
        u(message.p());
        r items = getItems();
        List<Attachment> h2 = message.h();
        c(!h2.isEmpty());
        items.setValue(h2);
    }

    public boolean f() {
        return this.w;
    }

    public boolean g() {
        return ((Boolean) this.t.getValue(this, B[5])).booleanValue();
    }

    public String h() {
        return (String) this.f5786p.getValue(this, B[2]);
    }

    public String p0() {
        return (String) this.f5784n.getValue(this, B[0]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5785o.setValue(this, B[1], str);
    }

    public String q0() {
        return (String) this.r.getValue(this, B[4]);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5786p.setValue(this, B[2], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5784n.setValue(this, B[0], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5787q.setValue(this, B[3], str);
    }

    public String t0() {
        return (String) this.f5787q.getValue(this, B[3]);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, B[4], str);
    }

    public r<List<Attachment>> getItems() {
        return this.s;
    }
}
