package p289hu.ekreta.ellenorzo.attachment;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p337h0.C5021d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt$downloadAndOpenAttachment$1 */
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt$downloadAndOpenAttachment$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedViewModel f11172c;

    /* renamed from: e */
    public final /* synthetic */ AttachmentService f11173e;

    /* renamed from: f */
    public final /* synthetic */ Function0 f11174f;

    /* renamed from: g */
    public final /* synthetic */ C3824r f11175g;

    /* renamed from: h */
    public final /* synthetic */ Attachment f11176h;

    /* renamed from: i */
    public final /* synthetic */ C5021d f11177i;

    public ViewModelExtensionsKt$downloadAndOpenAttachment$1(AuthenticatedViewModel authenticatedViewModel, AttachmentService attachmentService, Function0 function0, C3824r rVar, Attachment attachment, C5021d dVar) {
        this.f11172c = authenticatedViewModel;
        this.f11173e = attachmentService;
        this.f11174f = function0;
        this.f11175g = rVar;
        this.f11176h = attachment;
        this.f11177i = dVar;
        super(1);
    }

    /* renamed from: a */
    public final void mo11478a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService attachmentService = this.f11173e;
        AuthenticatedViewModel authenticatedViewModel = this.f11172c;
        C5027n c = ((C5027n) this.f11174f.invoke()).mo17238d((C4673f<? super C4663c>) new C4673f<C4663c>(this) {

            /* renamed from: c */
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenAttachment$1 f11178c;

            {
                this.f11178c = r1;
            }

            /* renamed from: a */
            public final void mo11479a() {
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$1 = this.f11178c;
                C3824r rVar = viewModelExtensionsKt$downloadAndOpenAttachment$1.f11175g;
                Attachment copy$default = Attachment.copy$default(viewModelExtensionsKt$downloadAndOpenAttachment$1.f11176h, 0, null, null, null, AttachmentDownloadState.DOWNLOAD_IN_PROGRESS, null, 47, null);
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$12 = this.f11178c;
                Attachment attachment = viewModelExtensionsKt$downloadAndOpenAttachment$12.f11176h;
                List list = (List) viewModelExtensionsKt$downloadAndOpenAttachment$12.f11175g.mo6263a();
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                ExtensionsKt.m14658a(rVar, copy$default, Integer.valueOf(C3984v.m10118a(attachment, list)));
                this.f11178c.f11177i.mo17017a(Boolean.valueOf(true));
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C4663c cVar = (C4663c) obj;
                mo11479a();
            }
        }).mo17224b((C4673f<? super Throwable>) new C4673f<Throwable>(this) {

            /* renamed from: c */
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenAttachment$1 f11179c;

            {
                this.f11179c = r1;
            }

            /* renamed from: a */
            public final void mo11480a() {
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$1 = this.f11179c;
                C3824r rVar = viewModelExtensionsKt$downloadAndOpenAttachment$1.f11175g;
                Attachment copy$default = Attachment.copy$default(viewModelExtensionsKt$downloadAndOpenAttachment$1.f11176h, 0, null, null, null, AttachmentDownloadState.NOT_DOWNLOADED, null, 47, null);
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$12 = this.f11179c;
                Attachment attachment = viewModelExtensionsKt$downloadAndOpenAttachment$12.f11176h;
                List list = (List) viewModelExtensionsKt$downloadAndOpenAttachment$12.f11175g.mo6263a();
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                ExtensionsKt.m14658a(rVar, copy$default, Integer.valueOf(C3984v.m10118a(attachment, list)));
                this.f11179c.f11177i.mo17017a(Boolean.valueOf(false));
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                mo11480a();
            }
        }).mo17233c((C4673f<? super T>) new C4673f<File>(this) {

            /* renamed from: c */
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenAttachment$1 f11180c;

            {
                this.f11180c = r1;
            }

            /* renamed from: a */
            public final void mo11481a() {
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$1 = this.f11180c;
                C3824r rVar = viewModelExtensionsKt$downloadAndOpenAttachment$1.f11175g;
                Attachment copy$default = Attachment.copy$default(viewModelExtensionsKt$downloadAndOpenAttachment$1.f11176h, 0, null, null, null, AttachmentDownloadState.DOWNLOADED, null, 47, null);
                ViewModelExtensionsKt$downloadAndOpenAttachment$1 viewModelExtensionsKt$downloadAndOpenAttachment$12 = this.f11180c;
                Attachment attachment = viewModelExtensionsKt$downloadAndOpenAttachment$12.f11176h;
                List list = (List) viewModelExtensionsKt$downloadAndOpenAttachment$12.f11175g.mo6263a();
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                ExtensionsKt.m14658a(rVar, copy$default, Integer.valueOf(C3984v.m10118a(attachment, list)));
                this.f11180c.f11177i.mo17017a(Boolean.valueOf(false));
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                File file = (File) obj;
                mo11481a();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "download()\n            .…Next(false)\n            }");
        C5036u d = authenticatedViewModel.mo11505a(c).mo17239d();
        Intrinsics.checkExpressionValueIsNotNull(d, "download()\n            .…          .firstOrError()");
        attachmentService.mo11457a(dVar, d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11478a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
