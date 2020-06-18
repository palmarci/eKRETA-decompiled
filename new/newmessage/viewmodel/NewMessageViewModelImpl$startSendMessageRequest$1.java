package hu.ekreta.ellenorzo.newmessage.viewmodel;

import h.m.d.d;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import k.b.a0.c;
import k.b.b0.a;
import k.b.b0.f;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$startSendMessageRequest$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ NewMessageViewModelImpl c;

    public NewMessageViewModelImpl$startSendMessageRequest$1(NewMessageViewModelImpl newMessageViewModelImpl) {
        this.c = newMessageViewModelImpl;
    }

    /* renamed from: a */
    public final n<Boolean> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        NewMessageViewModelImpl newMessageViewModelImpl = this.c;
        return newMessageViewModelImpl.a(newMessageViewModelImpl.x.a(profile, NewMessageViewModelImpl.access$createMessage(this.c, profile))).d((f<? super c>) new f<c>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$startSendMessageRequest$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                this.c.c.f(true);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                c cVar = (c) obj;
                a();
            }
        }).c((a) new a(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NewMessageViewModelImpl$startSendMessageRequest$1 f5834a;

            {
                this.f5834a = r1;
            }

            public final void run() {
                this.f5834a.c.f(false);
            }
        }).a(k.b.z.a.a.a()).i(new h<Throwable, Boolean>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$startSendMessageRequest$1 c;

            {
                this.c = r1;
            }

            public final boolean a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                final String access$getErrorMessageFromServer = this.c.c.a(th);
                if (access$getErrorMessageFromServer != null) {
                    this.c.c.a((Function1<? super d, Unit>) new Function1<d, Unit>() {
                        public final void a(d dVar) {
                            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                            ExtensionsKt.showAlertDialog$default(dVar, access$getErrorMessageFromServer, (String) null, (Function1) null, 6, (Object) null);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((d) obj);
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    this.c.c.c(false);
                }
                return false;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Boolean.valueOf(a((Throwable) obj));
            }
        }).c(new f<Boolean>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$startSendMessageRequest$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                Intrinsics.checkExpressionValueIsNotNull(bool, "isSuccess");
                if (bool.booleanValue()) {
                    this.c.c.c(true);
                }
            }
        });
    }
}
