package hu.ekreta.ellenorzo.newmessage.viewmodel;

import a.h.c.c0.a;
import a.h.c.c0.b;
import a.h.c.q;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import h.m.d.d;
import h.p.r;
import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import hu.ekreta.ellenorzo.newmessage.model.NewMessage;
import hu.ekreta.ellenorzo.newmessage.model.NewMessageService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import m.h0;
import m.l0.c;
import n.h;
import retrofit2.HttpException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\b\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020&H\u0016J\u0010\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020.H\u0002J\b\u0010M\u001a\u00020\u001bH\u0002J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010S\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J\u0012\u0010T\u001a\u0004\u0018\u0001022\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020\u001bH\u0002J\u0010\u0010Y\u001a\u00020H2\u0006\u0010L\u001a\u00020.H\u0016J\u0010\u0010Z\u001a\u00020H2\u0006\u0010J\u001a\u00020&H\u0016J\u0010\u0010[\u001a\u00020H2\u0006\u0010L\u001a\u00020.H\u0016J\u0010\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u000202H\u0002J\b\u0010^\u001a\u00020HH\u0016J\u0010\u0010_\u001a\u00020H2\u0006\u0010`\u001a\u00020<H\u0016J\b\u0010a\u001a\u00020HH\u0016J\b\u0010b\u001a\u00020HH\u0002J\u000e\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u000202R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R+\u0010)\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301X\u0004¢\u0006\u0002\n\u0000R+\u00105\u001a\u0002042\u0006\u0010\u001a\u001a\u0002048V@VX\u0002¢\u0006\u0012\n\u0004\b:\u0010\"\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010=\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R+\u0010A\u001a\u0002022\u0006\u0010\u001a\u001a\u0002028V@VX\u0002¢\u0006\u0012\n\u0004\bF\u0010\"\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006f"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "newMessageService", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "contentResolver", "Landroid/content/ContentResolver;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;Lhu/ekreta/ellenorzo/attachment/AttachmentService;Landroid/content/ContentResolver;Landroid/content/Context;)V", "<set-?>", "", "addNevAddresseeIsVisible", "getAddNevAddresseeIsVisible", "()Z", "setAddNevAddresseeIsVisible", "(Z)V", "addNevAddresseeIsVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "addressees", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "getAddressees", "()Landroidx/lifecycle/MutableLiveData;", "addresseesIsEmpty", "getAddresseesIsEmpty", "setAddresseesIsEmpty", "addresseesIsEmpty$delegate", "attachments", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "localFiles", "", "", "Landroid/net/Uri;", "", "messageSpanned", "getMessageSpanned", "()Ljava/lang/CharSequence;", "setMessageSpanned", "(Ljava/lang/CharSequence;)V", "messageSpanned$delegate", "originalMessageObject", "Lhu/ekreta/ellenorzo/message/Message;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "subject", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "subject$delegate", "addAttachment", "", "addNewAddressee", "addressee", "addToAttachments", "attachment", "allRequiredFieldHasValue", "createMessage", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "createNewMessage", "createReplyMessage", "getErrorMessageFromServer", "throwable", "", "handleSendMessageResponse", "isSuccess", "onSelect", "removeAddressee", "removeAttachment", "replaceLineBreak", "text", "sendMessage", "setOriginalMessageSubject", "originalMessage", "startAddAddressee", "startSendMessageRequest", "toSpanned", "Landroid/text/Spanned;", "html", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl extends AuthenticatedViewModel implements NewMessageViewModel {
    public static final /* synthetic */ KProperty[] D;
    public final AttachmentService A;
    public final ContentResolver B;
    public final Context C;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5830n = DataBindingViewModel.boundString$default(this, this, 52, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5831o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5832p;

    /* renamed from: q  reason: collision with root package name */
    public final r<List<Attachment>> f5833q;
    public final r<List<Addressee>> r;
    public final ReadWriteProperty s;
    public final ReadWriteProperty t;
    public Message u;
    public final Map<String, Uri> v;
    public final ProfileRepository w;
    public final NewMessageService x;
    public final DateTimeFactory y;
    public final AttachmentRepository z;

    static {
        Class<NewMessageViewModelImpl> cls = NewMessageViewModelImpl.class;
        D = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "messageSpanned", "getMessageSpanned()Ljava/lang/CharSequence;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addresseesIsEmpty", "getAddresseesIsEmpty()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addNevAddresseeIsVisible", "getAddNevAddresseeIsVisible()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewMessageViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, NewMessageService newMessageService, DateTimeFactory dateTimeFactory, AttachmentRepository attachmentRepository, AttachmentService attachmentService, ContentResolver contentResolver, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(newMessageService, "newMessageService");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        Intrinsics.checkParameterIsNotNull(attachmentRepository, "attachmentRepository");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(contentResolver, "contentResolver");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.w = profileRepository;
        this.x = newMessageService;
        this.y = dateTimeFactory;
        this.z = attachmentRepository;
        this.A = attachmentService;
        this.B = contentResolver;
        this.C = context;
        this.f5831o = DataBindingViewModel.boundSpanned$default(this, this, 102, (CharSequence) null, (Function1) null, 6, (Object) null);
        this.f5832p = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.f5833q = new r<>();
        this.r = new r<>();
        this.s = DataBindingViewModel.boundBoolean$default(this, this, 115, false, (Function1) null, 6, (Object) null);
        this.t = DataBindingViewModel.boundBoolean$default(this, this, 95, false, (Function1) null, 6, (Object) null);
        this.v = new LinkedHashMap();
        e(true);
        d(true);
    }

    public static final /* synthetic */ NewMessage access$createMessage(NewMessageViewModelImpl newMessageViewModelImpl, Profile profile) {
        NewMessage newMessage;
        NewMessageViewModelImpl newMessageViewModelImpl2 = newMessageViewModelImpl;
        if (newMessageViewModelImpl2.u == null) {
            Calendar a2 = newMessageViewModelImpl2.y.a();
            String l2 = profile.l();
            String q2 = newMessageViewModelImpl2.q(String.valueOf(newMessageViewModelImpl.A1()));
            String j2 = newMessageViewModelImpl.j();
            List a3 = newMessageViewModelImpl.getAttachments().a();
            if (a3 == null) {
                a3 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list = a3;
            List a4 = newMessageViewModelImpl.P0().a();
            if (a4 == null) {
                a4 = CollectionsKt__CollectionsKt.emptyList();
            }
            newMessage = new NewMessage(0, a2, l2, "", q2, j2, (Long) null, 0, list, a4);
        } else {
            Calendar a5 = newMessageViewModelImpl2.y.a();
            String l3 = profile.l();
            String q3 = newMessageViewModelImpl2.q(String.valueOf(newMessageViewModelImpl.A1()));
            String j3 = newMessageViewModelImpl.j();
            Message message = newMessageViewModelImpl2.u;
            Long valueOf = message != null ? Long.valueOf(message.j()) : null;
            List a6 = newMessageViewModelImpl.getAttachments().a();
            if (a6 == null) {
                a6 = CollectionsKt__CollectionsKt.emptyList();
            }
            newMessage = new NewMessage(0, a5, l3, "", q3, j3, valueOf, 0, a6, CollectionsKt__CollectionsKt.emptyList());
        }
        return newMessage;
    }

    public CharSequence A1() {
        return (CharSequence) this.f5831o.getValue(this, D[1]);
    }

    public boolean H0() {
        return ((Boolean) this.s.getValue(this, D[3])).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if ((A1().length() > 0) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N1() {
        /*
            r9 = this;
            h.p.r r0 = r9.P0()
            java.lang.Object r0 = r0.a()
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r9.j()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0036
            java.lang.CharSequence r0 = r9.A1()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x005c
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r9.w
            k.b.n r0 = r0.b()
            hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$1 r1 = new hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$1
            r1.<init>(r9)
            k.b.n r0 = r0.c(r1)
            java.lang.String r1 = "profileRepository.getAct…          }\n            }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$2 r1 = new hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$startSendMessageRequest$2
            r1.<init>(r9)
            r2 = 0
            r3 = 6
            k.b.a0.c r0 = k.b.f0.b.a(r0, r1, r2, r2, r3)
            r9.a(r0)
            goto L_0x006a
        L_0x005c:
            r2 = 2131689993(0x7f0f0209, float:1.9009017E38)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            r1 = r9
            hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.showAlert$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl.N1():void");
    }

    public r<List<Addressee>> P0() {
        return this.r;
    }

    public void U() {
        a((Function1<? super d, Unit>) new NewMessageViewModelImpl$addAttachment$1(this));
    }

    public final String a(Throwable th) {
        String str;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException == null) {
            return null;
        }
        h0 h0Var = httpException.b().c;
        if (h0Var != null) {
            h l2 = h0Var.l();
            try {
                str = l2.a(c.a(l2, h0Var.a()));
            } finally {
                c.a((Closeable) l2);
            }
        } else {
            str = null;
        }
        try {
            a aVar = new a(new StringReader(str));
            q b = v.b(aVar);
            if (!b.j()) {
                if (aVar.z() != b.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "JsonParser.parseString(jsonString)");
            q qVar = b.e().get("uzenet");
            if (qVar != null) {
                return qVar.h();
            }
            return null;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Throwable) e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        }
    }

    public void a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f5831o.setValue(this, D[1], charSequence);
    }

    public void b(Addressee addressee) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(addressee, "addressee");
        ArrayList arrayList = new ArrayList();
        List a2 = P0().a();
        if (a2 == null) {
            a2 = CollectionsKt__CollectionsKt.emptyList();
        }
        arrayList.addAll(a2);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((Addressee) obj).f(), (Object) addressee.f())) {
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(arrayList).remove(obj);
        P0().setValue(arrayList);
        e(arrayList.isEmpty());
    }

    public final void c(boolean z2) {
        if (z2) {
            DataBindingViewModel.showAlert$default(this, R.string.newMessage_sendMessageSuccess, (Integer) null, new NewMessageViewModelImpl$handleSendMessageResponse$1(this), (Integer) null, (Function1) null, 26, (Object) null);
            return;
        }
        DataBindingViewModel.showAlert$default(this, R.string.newMessage_sendMessageFailed, (Integer) null, (Function1) null, (Integer) null, (Function1) null, 30, (Object) null);
    }

    public void d(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "originalMessage");
        this.u = message;
        d(false);
        a(new Addressee(1L, "", (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, message.k(), true, 252, (DefaultConstructorMarker) null));
        o(this.C.getString(R.string.newMessage_replySubjectPrefix) + ' ' + message.o());
        a((CharSequence) r("<br><br>" + this.C.getString(R.string.newMessage_replyMessagePrefix) + "<br>" + this.C.getString(R.string.newMessage_replyMessageSender) + ' ' + message.k() + "<br>" + this.C.getString(R.string.newMessage_replyMessageSentDate) + ' ' + UtilsKt.c(message.n()) + "<br>" + this.C.getString(R.string.newMessage_replyMessageSentSubject) + ' ' + message.o() + "<br>" + message.p()));
    }

    public void d(boolean z2) {
        this.t.setValue(this, D[4], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.f5832p.getValue(this, D[2])).booleanValue();
    }

    public void e(boolean z2) {
        this.s.setValue(this, D[3], Boolean.valueOf(z2));
    }

    public void f(boolean z2) {
        this.f5832p.setValue(this, D[2], Boolean.valueOf(z2));
    }

    public r<List<Attachment>> getAttachments() {
        return this.f5833q;
    }

    public String j() {
        return (String) this.f5830n.getValue(this, D[0]);
    }

    public void l1() {
        a((Function1<? super d, Unit>) NewMessageViewModelImpl$startAddAddressee$1.INSTANCE);
    }

    public void o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5830n.setValue(this, D[0], str);
    }

    public final String q(String str) {
        return StringsKt__StringsJVMKt.replace$default(str, "\n", "<br>", false, 4, (Object) null);
    }

    public final Spanned r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "html");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned fromHtml = Html.fromHtml(str, 0);
            Intrinsics.checkExpressionValueIsNotNull(fromHtml, "Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        Intrinsics.checkExpressionValueIsNotNull(fromHtml2, "Html.fromHtml(html)");
        return fromHtml2;
    }

    public boolean t1() {
        return ((Boolean) this.t.getValue(this, D[4])).booleanValue();
    }

    public void c(Attachment attachment) {
        List list;
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
        r<List<Attachment>> attachments = getAttachments();
        List a2 = getAttachments().a();
        if (a2 != null) {
            list = new ArrayList();
            for (Object next : a2) {
                if (!Intrinsics.areEqual((Object) ((Attachment) next).k(), (Object) attachment.k())) {
                    list.add(next);
                }
            }
        } else {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        attachments.setValue(list);
    }

    public void a(Attachment attachment) {
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
        Uri uri = this.v.get(attachment.k());
        if (uri != null) {
            a((Function1<? super d, Unit>) new NewMessageViewModelImpl$onSelect$$inlined$let$lambda$1(uri, this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: hu.ekreta.ellenorzo.newmessage.model.Addressee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: hu.ekreta.ellenorzo.newmessage.model.Addressee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: hu.ekreta.ellenorzo.newmessage.model.Addressee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: hu.ekreta.ellenorzo.newmessage.model.Addressee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: hu.ekreta.ellenorzo.newmessage.model.Addressee} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(hu.ekreta.ellenorzo.newmessage.model.Addressee r9) {
        /*
            r8 = this;
            java.lang.String r0 = "addressee"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            h.p.r r0 = r8.P0()
            java.lang.Object r0 = r0.a()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            hu.ekreta.ellenorzo.newmessage.model.Addressee r3 = (hu.ekreta.ellenorzo.newmessage.model.Addressee) r3
            java.lang.Long r3 = r3.f()
            java.lang.Long r4 = r9.f()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0016
            r1 = r2
        L_0x0032:
            hu.ekreta.ellenorzo.newmessage.model.Addressee r1 = (hu.ekreta.ellenorzo.newmessage.model.Addressee) r1
        L_0x0034:
            if (r1 != 0) goto L_0x0046
            h.p.r r0 = r8.P0()
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r9)
            hu.ekreta.ellenorzo.util.ExtensionsKt.a(r0, r9)
            r9 = 0
            r8.e(r9)
            goto L_0x0054
        L_0x0046:
            r1 = 2131689982(0x7f0f01fe, float:1.9008995E38)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r8
            hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.showAlert$default(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl.a(hu.ekreta.ellenorzo.newmessage.model.Addressee):void");
    }
}
