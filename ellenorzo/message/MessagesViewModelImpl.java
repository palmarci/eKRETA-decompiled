package p289hu.ekreta.ellenorzo.message;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p211h.p258l.C3707j;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010'\u001a\u00020(H\u0002J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0002H\u0016J\u0017\u0010,\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessagesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "messageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "messagesService", "Lhu/ekreta/ellenorzo/message/MessagesService;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/message/MessageRepository;Lhu/ekreta/ellenorzo/message/MessagesService;)V", "contentVisible", "Landroidx/databinding/ObservableBoolean;", "getContentVisible", "()Landroidx/databinding/ObservableBoolean;", "eAdministrationNotAllowedVisible", "getEAdministrationNotAllowedVisible", "initialProgressBarVisible", "getInitialProgressBarVisible", "messageUpdateFinished", "getMessageUpdateFinished", "selectedTabPosition", "", "getSelectedTabPosition", "()I", "setSelectedTabPosition", "(I)V", "deleteMessage", "", "message", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "observeRemoteData", "onSelect", "item", "setVisibilityStates", "isMessageHandlingAccessible", "", "(Ljava/lang/Boolean;)V", "startClassMasterActivity", "updateMessageItemReadStateToOpposite", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl extends AuthenticatedListViewModel<Message> implements MessagesViewModel {

    /* renamed from: s */
    public final C3707j f13932s = new C3707j(true);

    /* renamed from: t */
    public final C3707j f13933t = new C3707j(false);

    /* renamed from: u */
    public final C3707j f13934u = new C3707j(false);

    /* renamed from: v */
    public final C3707j f13935v = new C3707j();

    /* renamed from: w */
    public int f13936w;

    /* renamed from: x */
    public final ProfileRepository f13937x;

    /* renamed from: y */
    public final MessageRepository f13938y;

    /* renamed from: z */
    public final MessagesService f13939z;

    public MessagesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, MessageRepository messageRepository, MessagesService messagesService) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(messageRepository, "messageRepository");
        Intrinsics.checkParameterIsNotNull(messagesService, "messagesService");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f13937x = profileRepository;
        this.f13938y = messageRepository;
        this.f13939z = messagesService;
        mo11493d(true);
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends Message>>>(this) {
            /* renamed from: a */
            public final C5027n<List<Message>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return MessagesViewModelImpl.access$observeLocalData((MessagesViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(MessagesViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, C5027n<List<? extends Message>>>(this) {
            /* renamed from: a */
            public final C5027n<List<Message>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return MessagesViewModelImpl.access$observeRemoteData((MessagesViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "observeRemoteData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(MessagesViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeRemoteData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, null);
    }

    public static final /* synthetic */ C5027n access$observeLocalData(MessagesViewModelImpl messagesViewModelImpl, Profile profile) {
        C5027n b = messagesViewModelImpl.f13938y.mo13406z(profile).mo17246g(MessagesViewModelImpl$observeLocalData$1.INSTANCE).mo17246g(new MessagesViewModelImpl$observeLocalData$2(messagesViewModelImpl)).mo17224b((C4673f<? super Throwable>) new MessagesViewModelImpl$observeLocalData$3<Object>(messagesViewModelImpl));
        Intrinsics.checkExpressionValueIsNotNull(b, "messageRepository\n      …ogger.trace(it.message) }");
        return b;
    }

    public static final /* synthetic */ C5027n access$observeRemoteData(MessagesViewModelImpl messagesViewModelImpl, Profile profile) {
        C5027n c = messagesViewModelImpl.f13939z.mo13443a(profile.mo14042d()).mo17224b((C4673f<? super Throwable>) new MessagesViewModelImpl$observeRemoteData$1<Object>(messagesViewModelImpl)).mo17233c((C4673f<? super T>) new MessagesViewModelImpl$observeRemoteData$2<Object>(messagesViewModelImpl)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessagesViewModelImpl$observeRemoteData$3<Object,Object>(messagesViewModelImpl, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "messagesService.fetchCur…          }\n            }");
        return c;
    }

    public static final /* synthetic */ void access$setVisibilityStates(MessagesViewModelImpl messagesViewModelImpl, Boolean bool) {
        messagesViewModelImpl.mo13450r0().mo10529b(false);
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.valueOf(true))) {
            messagesViewModelImpl.mo13448j0().mo10529b(false);
            messagesViewModelImpl.mo13447h0().mo10529b(true);
            return;
        }
        messagesViewModelImpl.mo13448j0().mo10529b(true);
        messagesViewModelImpl.mo13447h0().mo10529b(false);
    }

    /* renamed from: Q1 */
    public int mo13452Q1() {
        return this.f13936w;
    }

    /* renamed from: a */
    public void mo13444a(int i) {
        this.f13936w = i;
    }

    /* renamed from: b */
    public void mo13446b(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        mo13449k0().mo10529b(false);
        C5027n a = this.f13937x.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1<Object,Object>(this, message)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository.getAct…dSchedulers.mainThread())");
        mo16413a(C4998b.m16842a(a, (Function1) new MessagesViewModelImpl$updateMessageItemReadStateToOpposite$3(this), (Function0) null, (Function1) new MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2(this), 2));
    }

    /* renamed from: e */
    public void onSelect(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new MessagesViewModelImpl$onSelect$1<Object,Object>(message));
    }

    /* renamed from: h0 */
    public C3707j mo13447h0() {
        return this.f13933t;
    }

    /* renamed from: j0 */
    public C3707j mo13448j0() {
        return this.f13934u;
    }

    /* renamed from: k0 */
    public C3707j mo13449k0() {
        return this.f13935v;
    }

    /* renamed from: r0 */
    public C3707j mo13450r0() {
        return this.f13932s;
    }

    /* renamed from: v0 */
    public void mo13451v0() {
        mo16376b((Function1<? super Activity, ? extends Intent>) MessagesViewModelImpl$startClassMasterActivity$1.INSTANCE);
    }

    /* renamed from: a */
    public void mo13445a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        mo13449k0().mo10529b(false);
        C5027n a = this.f13937x.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessagesViewModelImpl$deleteMessage$1<Object,Object>(this, message)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository.getAct…dSchedulers.mainThread())");
        mo16413a(C4998b.m16842a(a, (Function1) new MessagesViewModelImpl$deleteMessage$3(this), (Function0) null, (Function1) new MessagesViewModelImpl$deleteMessage$2(this), 2));
    }
}
