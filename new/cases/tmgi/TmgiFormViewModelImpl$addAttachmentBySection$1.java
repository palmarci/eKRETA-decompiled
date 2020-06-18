package hu.ekreta.ellenorzo.cases.tmgi;

import android.net.Uri;
import h.m.d.d;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import hu.ekreta.ellenorzo.attachment.AttachmentType;
import hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentPurpose;
import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.io.InputStream;
import java.util.Map;
import k.b.b0.h;
import k.b.f0.b;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$addAttachmentBySection$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ TmgiFormViewModelImpl c;
    public final /* synthetic */ AttachmentType e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TmgiFormViewModelImpl$addAttachmentBySection$1(TmgiFormViewModelImpl tmgiFormViewModelImpl, AttachmentType attachmentType) {
        super(1);
        this.c = tmgiFormViewModelImpl;
        this.e = attachmentType;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        TmgiFormViewModelImpl tmgiFormViewModelImpl = this.c;
        n<R> d2 = tmgiFormViewModelImpl.L.a(dVar).d(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Attachment> apply(final Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                return this.c.c.I.b().c(new h<T, q<? extends R>>(this) {
                    public final /* synthetic */ AnonymousClass1 c;

                    {
                        this.c = r1;
                    }

                    /* renamed from: a */
                    public final n<Attachment> apply(final Profile profile) {
                        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                        this.c.c.c.f(true);
                        Uri uri = uri;
                        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                        final String a2 = ExtensionsKt.a(uri, this.c.c.c.M);
                        TmgiFormViewModelImpl tmgiFormViewModelImpl = this.c.c.c;
                        InputStream openInputStream = tmgiFormViewModelImpl.M.openInputStream(uri);
                        return ViewModelExtensionsKt.uploadAttachment$default(tmgiFormViewModelImpl, profile, a2, openInputStream != null ? ByteStreamsKt.readBytes(openInputStream) : null, this.c.c.c.K, (AttachmentPurpose) null, 16, (Object) null).g(new h<T, R>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final Attachment apply(TemporaryFile temporaryFile) {
                                String str;
                                Intrinsics.checkParameterIsNotNull(temporaryFile, "tempFile");
                                Map access$getLocalFiles$p = this.c.c.c.c.f5249n;
                                String a2 = temporaryFile.a();
                                if (a2 == null) {
                                    a2 = "";
                                }
                                Uri uri = uri;
                                Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                                access$getLocalFiles$p.put(a2, uri);
                                String str2 = a2;
                                String a3 = temporaryFile.a();
                                if (a3 != null) {
                                    str = a3;
                                } else {
                                    str = "";
                                }
                                return new Attachment(0, str2, str, (AttachmentType) null, (AttachmentDownloadState) null, profile.m(), (String) null, (String) null, 216, (DefaultConstructorMarker) null);
                            }
                        });
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(d2, "attachmentService.choose…      }\n                }");
        tmgiFormViewModelImpl.a(b.a(d2, (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                o.b.b access$getLogger$p = this.c.c.V1();
                access$getLogger$p.d("Error happened during mandatory document upload " + th);
                this.c.c.f(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0<Unit>) new Function0<Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 c;

            {
                this.c = r1;
            }

            public final void invoke() {
                this.c.c.f(false);
            }
        }, new Function1<Attachment, Unit>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl$addAttachmentBySection$1 c;

            {
                this.c = r1;
            }

            public final void a(Attachment attachment) {
                TmgiFormViewModelImpl$addAttachmentBySection$1 tmgiFormViewModelImpl$addAttachmentBySection$1 = this.c;
                if (tmgiFormViewModelImpl$addAttachmentBySection$1.e == AttachmentType.MANDATORY) {
                    TmgiFormViewModelImpl tmgiFormViewModelImpl = tmgiFormViewModelImpl$addAttachmentBySection$1.c;
                    Intrinsics.checkExpressionValueIsNotNull(attachment, "attachment");
                    TmgiFormViewModelImpl.access$addFileNameAndTemporaryIdToMandatoryAttachments(tmgiFormViewModelImpl, attachment);
                    o.b.b access$getLogger$p = this.c.c.V1();
                    access$getLogger$p.d("Mandatory document is added with id: " + attachment);
                } else {
                    TmgiFormViewModelImpl tmgiFormViewModelImpl2 = tmgiFormViewModelImpl$addAttachmentBySection$1.c;
                    Intrinsics.checkExpressionValueIsNotNull(attachment, "attachment");
                    TmgiFormViewModelImpl.access$addFileNameAndTemporaryIdToOptionalAttachments(tmgiFormViewModelImpl2, attachment);
                    o.b.b access$getLogger$p2 = this.c.c.V1();
                    access$getLogger$p2.d("Optional document is added with id: " + attachment);
                }
                this.c.c.f(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Attachment) obj);
                return Unit.INSTANCE;
            }
        }));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
