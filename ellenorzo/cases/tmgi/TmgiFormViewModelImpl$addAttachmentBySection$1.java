package p289hu.ekreta.ellenorzo.cases.tmgi;

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
import p289hu.ekreta.ellenorzo.attachment.AttachmentType;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl$addAttachmentBySection$1 */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$addAttachmentBySection$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TmgiFormViewModelImpl f11751c;

    /* renamed from: e */
    public final /* synthetic */ AttachmentType f11752e;

    public TmgiFormViewModelImpl$addAttachmentBySection$1(TmgiFormViewModelImpl tmgiFormViewModelImpl, AttachmentType attachmentType) {
        this.f11751c = tmgiFormViewModelImpl;
        this.f11752e = attachmentType;
        super(1);
    }

    /* renamed from: a */
    public final void mo12196a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        TmgiFormViewModelImpl tmgiFormViewModelImpl = this.f11751c;
        C5027n d = tmgiFormViewModelImpl.f11723K.mo11456a(dVar).mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 f11753c;

            {
                this.f11753c = r1;
            }

            /* renamed from: a */
            public final C5027n<Attachment> apply(final Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                return this.f11753c.f11751c.f11720H.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C40871 f11754c;

                    {
                        this.f11754c = r1;
                    }

                    /* renamed from: a */
                    public final C5027n<Attachment> apply(final Profile profile) {
                        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                        this.f11754c.f11753c.f11751c.mo12181e(true);
                        Uri uri = uri;
                        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                        final String a = ExtensionsKt.m14628a(uri, this.f11754c.f11753c.f11751c.f11724L);
                        TmgiFormViewModelImpl tmgiFormViewModelImpl = this.f11754c.f11753c.f11751c;
                        InputStream openInputStream = tmgiFormViewModelImpl.f11724L.openInputStream(uri);
                        return C3984v.m10197a((AuthenticatedViewModel) tmgiFormViewModelImpl, profile, a, openInputStream != null ? ByteStreamsKt.readBytes(openInputStream) : null, this.f11754c.f11753c.f11751c.f11722J).mo17246g(new C4675h<T, R>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C40881 f11756c;

                            {
                                this.f11756c = r1;
                            }

                            /* renamed from: a */
                            public final Attachment apply(String str) {
                                Intrinsics.checkParameterIsNotNull(str, "tempUid");
                                Map access$getLocalFiles$p = this.f11756c.f11754c.f11753c.f11751c.f11726m;
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
        tmgiFormViewModelImpl.mo16413a(C4998b.m16841a(d, (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 f11761c;

            {
                this.f11761c = r1;
            }

            /* renamed from: a */
            public final void mo12201a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                C5620b access$getLogger$p = this.f11761c.f11751c.mo16412M1();
                StringBuilder sb = new StringBuilder();
                sb.append("Error happened during mandatory document upload ");
                sb.append(th);
                access$getLogger$p.mo115b(sb.toString());
                this.f11761c.f11751c.mo12181e(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12201a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0<Unit>) new Function0<Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 f11759c;

            {
                this.f11759c = r1;
            }

            public final void invoke() {
                this.f11759c.f11751c.mo12181e(false);
            }
        }, (Function1<? super T, Unit>) new Function1<Attachment, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 f11760c;

            {
                this.f11760c = r1;
            }

            /* renamed from: a */
            public final void mo12200a(Attachment attachment) {
                TmgiFormViewModelImpl$addAttachmentBySection$1 tmgiFormViewModelImpl$addAttachmentBySection$1 = this.f11760c;
                String str = "attachment";
                if (tmgiFormViewModelImpl$addAttachmentBySection$1.f11752e == AttachmentType.MANDATORY) {
                    TmgiFormViewModelImpl tmgiFormViewModelImpl = tmgiFormViewModelImpl$addAttachmentBySection$1.f11751c;
                    Intrinsics.checkExpressionValueIsNotNull(attachment, str);
                    TmgiFormViewModelImpl.access$addFileNameAndTemporaryIdToMandatoryAttachments(tmgiFormViewModelImpl, attachment);
                    C5620b access$getLogger$p = this.f11760c.f11751c.mo16412M1();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Mandatory document is added with id: ");
                    sb.append(attachment);
                    access$getLogger$p.mo115b(sb.toString());
                } else {
                    TmgiFormViewModelImpl tmgiFormViewModelImpl2 = tmgiFormViewModelImpl$addAttachmentBySection$1.f11751c;
                    Intrinsics.checkExpressionValueIsNotNull(attachment, str);
                    TmgiFormViewModelImpl.access$addFileNameAndTemporaryIdToOptionalAttachments(tmgiFormViewModelImpl2, attachment);
                    C5620b access$getLogger$p2 = this.f11760c.f11751c.mo16412M1();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Optional document is added with id: ");
                    sb2.append(attachment);
                    access$getLogger$p2.mo115b(sb2.toString());
                }
                this.f11760c.f11751c.mo12181e(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12200a((Attachment) obj);
                return Unit.INSTANCE;
            }
        }));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12196a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
