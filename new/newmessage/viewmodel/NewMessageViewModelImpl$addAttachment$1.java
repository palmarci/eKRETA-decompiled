package hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.net.Uri;
import h.m.d.d;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import hu.ekreta.ellenorzo.attachment.AttachmentType;
import hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentPurpose;
import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.io.InputStream;
import java.util.Map;
import k.b.a0.c;
import k.b.b0.f;
import k.b.b0.h;
import k.b.f0.b;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$addAttachment$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ NewMessageViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewMessageViewModelImpl$addAttachment$1(NewMessageViewModelImpl newMessageViewModelImpl) {
        super(1);
        this.c = newMessageViewModelImpl;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        NewMessageViewModelImpl newMessageViewModelImpl = this.c;
        n<R> d2 = newMessageViewModelImpl.A.a(dVar).b((f<? super c>) new f<c>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 c;

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
        }).d(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Attachment> apply(final Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                return this.c.c.w.b().c(new h<T, q<? extends R>>(this) {
                    public final /* synthetic */ AnonymousClass2 c;

                    {
                        this.c = r1;
                    }

                    /* renamed from: a */
                    public final n<Attachment> apply(final Profile profile) {
                        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                        Uri uri = uri;
                        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                        final String a2 = ExtensionsKt.a(uri, this.c.c.c.B);
                        NewMessageViewModelImpl newMessageViewModelImpl = this.c.c.c;
                        InputStream openInputStream = newMessageViewModelImpl.B.openInputStream(uri);
                        return ViewModelExtensionsKt.a((AuthenticatedViewModel) newMessageViewModelImpl, profile, a2, openInputStream != null ? ByteStreamsKt.readBytes(openInputStream) : null, this.c.c.c.z, AttachmentPurpose.MESSAGE).g(new h<T, R>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final Attachment apply(TemporaryFile temporaryFile) {
                                Intrinsics.checkParameterIsNotNull(temporaryFile, "tempFile");
                                Map access$getLocalFiles$p = this.c.c.c.c.v;
                                String a2 = temporaryFile.a();
                                Uri uri = uri;
                                Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                                access$getLocalFiles$p.put(a2, uri);
                                return new Attachment(0, a2, temporaryFile.a(), (AttachmentType) null, (AttachmentDownloadState) null, profile.m(), temporaryFile.c().a(), temporaryFile.b(), 24, (DefaultConstructorMarker) null);
                            }
                        });
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(d2, "attachmentService.choose…      }\n                }");
        newMessageViewModelImpl.a(b.a(d2, (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                o.b.b access$getLogger$p = this.c.c.V1();
                access$getLogger$p.d("Error happened during new message document upload " + th);
                this.c.c.f(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0<Unit>) new Function0<Unit>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            public final void invoke() {
                this.c.c.f(false);
            }
        }, new Function1<Attachment, Unit>(this) {
            public final /* synthetic */ NewMessageViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a(Attachment attachment) {
                NewMessageViewModelImpl newMessageViewModelImpl = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(attachment, "attachment");
                ExtensionsKt.a(newMessageViewModelImpl.getAttachments(), CollectionsKt__CollectionsJVMKt.listOf(new Attachment(0, attachment.i(), attachment.k(), AttachmentType.UNDEFINIED, AttachmentDownloadState.DOWNLOADED, attachment.e(), attachment.h(), attachment.j())));
                o.b.b access$getLogger$p = this.c.c.V1();
                access$getLogger$p.d("Document is added to new message with id: " + attachment);
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
