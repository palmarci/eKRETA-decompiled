package hu.ekreta.ellenorzo.message;

import android.app.Activity;
import android.content.Intent;
import h.l.j;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.b0.f;
import k.b.f0.b;
import k.b.n;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0002J\u001c\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0002H\u0016J\u0017\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0002\u00101J\b\u00102\u001a\u00020$H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessagesViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "messageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "messagesService", "Lhu/ekreta/ellenorzo/message/MessagesService;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/message/MessageRepository;Lhu/ekreta/ellenorzo/message/MessagesService;)V", "contentVisible", "Landroidx/databinding/ObservableBoolean;", "getContentVisible", "()Landroidx/databinding/ObservableBoolean;", "eAdministrationNotAllowedVisible", "getEAdministrationNotAllowedVisible", "initialProgressBarVisible", "getInitialProgressBarVisible", "messageUpdateFinished", "getMessageUpdateFinished", "selectedTabPosition", "", "getSelectedTabPosition", "()I", "setSelectedTabPosition", "(I)V", "deleteMessage", "", "message", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "observeRemoteData", "onSelect", "item", "setVisibilityStates", "isMessageHandlingAccessible", "", "(Ljava/lang/Boolean;)V", "startNewMessageActivity", "updateMessageItemReadStateToOpposite", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl extends AuthenticatedListViewModel<Message> implements MessagesViewModel {
    public final MessagesService A;
    public final j t = new j(true);
    public final j u = new j(false);
    public final j v = new j(false);
    public final j w = new j();
    public int x;
    public final ProfileRepository y;
    public final MessageRepository z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, MessageRepository messageRepository, MessagesService messagesService) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(messageRepository, "messageRepository");
        Intrinsics.checkParameterIsNotNull(messagesService, "messagesService");
        this.y = profileRepository;
        this.z = messageRepository;
        this.A = messagesService;
        e(true);
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends Message>>>(this) {
            /* renamed from: a */
            public final n<List<Message>> invoke(Profile profile) {
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
        }, new Function1<Profile, n<List<? extends Message>>>(this) {
            /* renamed from: a */
            public final n<List<Message>> invoke(Profile profile) {
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
        }, false, 4, (Object) null);
    }

    public static final /* synthetic */ n access$observeLocalData(MessagesViewModelImpl messagesViewModelImpl, Profile profile) {
        n<R> b = messagesViewModelImpl.z.z(profile).g(MessagesViewModelImpl$observeLocalData$1.INSTANCE).g(new MessagesViewModelImpl$observeLocalData$2(messagesViewModelImpl)).b((f<? super Throwable>) new MessagesViewModelImpl$observeLocalData$3(messagesViewModelImpl));
        Intrinsics.checkExpressionValueIsNotNull(b, "messageRepository\n      …ogger.trace(it.message) }");
        return b;
    }

    public static final /* synthetic */ n access$observeRemoteData(MessagesViewModelImpl messagesViewModelImpl, Profile profile) {
        n<R> c = messagesViewModelImpl.A.a(profile.d()).b((f<? super Throwable>) new MessagesViewModelImpl$observeRemoteData$1(messagesViewModelImpl)).c(new MessagesViewModelImpl$observeRemoteData$2(messagesViewModelImpl)).c(new MessagesViewModelImpl$observeRemoteData$3(messagesViewModelImpl, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "messagesService.fetchCur…          }\n            }");
        return c;
    }

    public static final /* synthetic */ void access$setVisibilityStates(MessagesViewModelImpl messagesViewModelImpl, Boolean bool) {
        messagesViewModelImpl.r0().c(false);
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            messagesViewModelImpl.j0().c(false);
            messagesViewModelImpl.h0().c(true);
            return;
        }
        messagesViewModelImpl.j0().c(true);
        messagesViewModelImpl.h0().c(false);
    }

    public void a(int i2) {
        this.x = i2;
    }

    public int a2() {
        return this.x;
    }

    public void b(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        k0().c(false);
        n<R> a2 = this.y.b().c(new MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1(this, message)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository.getAct…dSchedulers.mainThread())");
        a(b.a(a2, new MessagesViewModelImpl$updateMessageItemReadStateToOpposite$3(this), (Function0) null, new MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2(this), 2));
    }

    /* renamed from: e */
    public void onSelect(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "item");
        b((Function1<? super Activity, ? extends Intent>) new MessagesViewModelImpl$onSelect$1(this, message));
    }

    public j h0() {
        return this.u;
    }

    public j j0() {
        return this.v;
    }

    public j k0() {
        return this.w;
    }

    public j r0() {
        return this.t;
    }

    public void s0() {
        b((Function1<? super Activity, ? extends Intent>) MessagesViewModelImpl$startNewMessageActivity$1.INSTANCE);
    }

    public void a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        k0().c(false);
        n<R> a2 = this.y.b().c(new MessagesViewModelImpl$deleteMessage$1(this, message)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository.getAct…dSchedulers.mainThread())");
        a(b.a(a2, new MessagesViewModelImpl$deleteMessage$3(this), (Function0) null, new MessagesViewModelImpl$deleteMessage$2(this), 2));
    }
}
