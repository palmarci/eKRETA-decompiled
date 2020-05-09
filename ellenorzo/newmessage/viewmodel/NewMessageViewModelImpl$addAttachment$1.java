package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p349io.ByteStreamsKt;
import p211h.p262m.p263d.C3737d;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$addAttachment$1 */
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$addAttachment$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ NewMessageViewModelImpl f14012c;

    public NewMessageViewModelImpl$addAttachment$1(NewMessageViewModelImpl newMessageViewModelImpl) {
        this.f14012c = newMessageViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13540a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        NewMessageViewModelImpl newMessageViewModelImpl = this.f14012c;
        C5027n d = newMessageViewModelImpl.f13991D.mo11456a(dVar).mo17265b((C4673f<? super C4663c>) new C4673f<C4663c>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 f14013c;

            {
                this.f14013c = r1;
            }

            /* renamed from: a */
            public final void mo13541a() {
                this.f14013c.f14012c.mo13533c(true);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C4663c cVar = (C4663c) obj;
                mo13541a();
            }
        }).mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 f14014c;

            {
                this.f14014c = r1;
            }

            /* renamed from: a */
            public final C5027n<Attachment> apply(final Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                return this.f14014c.f14012c.f14007z.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C42732 f14015c;

                    {
                        this.f14015c = r1;
                    }

                    /* renamed from: a */
                    public final C5027n<Attachment> apply(final Profile profile) {
                        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                        Uri uri = uri;
                        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                        final String a = ExtensionsKt.m14628a(uri, this.f14015c.f14014c.f14012c.f13992E);
                        NewMessageViewModelImpl newMessageViewModelImpl = this.f14015c.f14014c.f14012c;
                        InputStream openInputStream = newMessageViewModelImpl.f13992E.openInputStream(uri);
                        return C3984v.m10197a((AuthenticatedViewModel) newMessageViewModelImpl, profile, a, openInputStream != null ? ByteStreamsKt.readBytes(openInputStream) : null, this.f14015c.f14014c.f14012c.f13990C).mo17246g(new C4675h<T, R>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C42741 f14017c;

                            {
                                this.f14017c = r1;
                            }

                            /* renamed from: a */
                            public final Attachment apply(String str) {
                                Intrinsics.checkParameterIsNotNull(str, "tempUid");
                                Map access$getLocalFiles$p = this.f14017c.f14015c.f14014c.f14012c.f14006y;
                                Uri uri = uri;
                                Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                                access$getLocalFiles$p.put(str, uri);
                                Attachment attachment = new Attachment(0, a, str, null, null, profile.mo14054m(), 24, null);
                                return attachment;
                            }
                        });
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(d, "attachmentService.choose…      }\n                }");
        newMessageViewModelImpl.mo16413a(C4998b.m16841a(d, (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 f14022c;

            {
                this.f14022c = r1;
            }

            /* renamed from: a */
            public final void mo13546a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                C5620b access$getLogger$p = this.f14022c.f14012c.mo16412M1();
                StringBuilder sb = new StringBuilder();
                sb.append("Error happened during new message document upload ");
                sb.append(th);
                access$getLogger$p.mo115b(sb.toString());
                this.f14022c.f14012c.mo13533c(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13546a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0<Unit>) new Function0<Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 f14020c;

            {
                this.f14020c = r1;
            }

            public final void invoke() {
                this.f14020c.f14012c.mo13533c(false);
            }
        }, (Function1<? super T, Unit>) new Function1<Attachment, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 f14021c;

            {
                this.f14021c = r1;
            }

            /* renamed from: a */
            public final void mo13545a(Attachment attachment) {
                NewMessageViewModelImpl newMessageViewModelImpl = this.f14021c.f14012c;
                Intrinsics.checkExpressionValueIsNotNull(attachment, "attachment");
                NewMessageViewModelImpl.access$addToAttachments(newMessageViewModelImpl, attachment);
                C5620b access$getLogger$p = this.f14021c.f14012c.mo16412M1();
                StringBuilder sb = new StringBuilder();
                sb.append("Document is added to new message with id: ");
                sb.append(attachment);
                access$getLogger$p.mo115b(sb.toString());
                this.f14021c.f14012c.mo13533c(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13545a((Attachment) obj);
                return Unit.INSTANCE;
            }
        }));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13540a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
