package hu.ekreta.ellenorzo.attachment;

import h.m.d.d;
import h.p.r;
import h.w.v;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.io.File;
import java.util.List;
import k.b.a0.c;
import k.b.b0.f;
import k.b.n;
import k.b.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt$downloadAndOpenAttachment$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ AuthenticatedViewModel c;
    public final /* synthetic */ AttachmentService e;
    public final /* synthetic */ Function0 f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f5047g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Attachment f5048h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k.b.h0.d f5049i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewModelExtensionsKt$downloadAndOpenAttachment$1(AuthenticatedViewModel authenticatedViewModel, AttachmentService attachmentService, Function0 function0, r rVar, Attachment attachment, k.b.h0.d dVar) {
        super(1);
        this.c = authenticatedViewModel;
        this.e = attachmentService;
        this.f = function0;
        this.f5047g = rVar;
        this.f5048h = attachment;
        this.f5049i = dVar;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService attachmentService = this.e;
        AuthenticatedViewModel authenticatedViewModel = this.c;
        n c2 = ((n) this.f.invoke()).d((f<? super c>) new f<c>(this) {
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$1 = this.c;
                r rVar = viewModelExtensionsKt$downloadAndOpenAttachment$1.f5047g;
                Attachment copy$default = Attachment.copy$default(viewModelExtensionsKt$downloadAndOpenAttachment$1.f5048h, 0, (String) null, (String) null, (AttachmentType) null, AttachmentDownloadState.DOWNLOAD_IN_PROGRESS, (String) null, (String) null, (String) null, 239, (Object) null);
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$12 = this.c;
                Attachment attachment = viewModelExtensionsKt$downloadAndOpenAttachment$12.f5048h;
                List list = (List) viewModelExtensionsKt$downloadAndOpenAttachment$12.f5047g.a();
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                ExtensionsKt.a(rVar, copy$default, Integer.valueOf(v.a(attachment, (List<Attachment>) list)));
                this.c.f5049i.a(true);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                c cVar = (c) obj;
                a();
            }
        }).b((f<? super Throwable>) new f<Throwable>(this) {
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$1 = this.c;
                r rVar = viewModelExtensionsKt$downloadAndOpenAttachment$1.f5047g;
                Attachment copy$default = Attachment.copy$default(viewModelExtensionsKt$downloadAndOpenAttachment$1.f5048h, 0, (String) null, (String) null, (AttachmentType) null, AttachmentDownloadState.NOT_DOWNLOADED, (String) null, (String) null, (String) null, 239, (Object) null);
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$12 = this.c;
                Attachment attachment = viewModelExtensionsKt$downloadAndOpenAttachment$12.f5048h;
                List list = (List) viewModelExtensionsKt$downloadAndOpenAttachment$12.f5047g.a();
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                ExtensionsKt.a(rVar, copy$default, Integer.valueOf(v.a(attachment, (List<Attachment>) list)));
                this.c.f5049i.a(false);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                a();
            }
        }).c(new f<File>(this) {
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$1 = this.c;
                r rVar = viewModelExtensionsKt$downloadAndOpenAttachment$1.f5047g;
                Attachment copy$default = Attachment.copy$default(viewModelExtensionsKt$downloadAndOpenAttachment$1.f5048h, 0, (String) null, (String) null, (AttachmentType) null, AttachmentDownloadState.DOWNLOADED, (String) null, (String) null, (String) null, 239, (Object) null);
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$12 = this.c;
                Attachment attachment = viewModelExtensionsKt$downloadAndOpenAttachment$12.f5048h;
                List list = (List) viewModelExtensionsKt$downloadAndOpenAttachment$12.f5047g.a();
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                ExtensionsKt.a(rVar, copy$default, Integer.valueOf(v.a(attachment, (List<Attachment>) list)));
                this.c.f5049i.a(false);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                File file = (File) obj;
                a();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c2, "download()\n            .…Next(false)\n            }");
        u d2 = authenticatedViewModel.a(c2).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "download()\n            .…          .firstOrError()");
        attachmentService.a(dVar, d2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
