package p289hu.ekreta.ellenorzo.attachment;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p300k.p313b.C5026m;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p337h0.C5021d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt$downloadAndOpenFile$1 */
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt$downloadAndOpenFile$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedViewModel f11181c;

    /* renamed from: e */
    public final /* synthetic */ AttachmentService f11182e;

    /* renamed from: f */
    public final /* synthetic */ Function0 f11183f;

    /* renamed from: g */
    public final /* synthetic */ C5021d f11184g;

    public ViewModelExtensionsKt$downloadAndOpenFile$1(AuthenticatedViewModel authenticatedViewModel, AttachmentService attachmentService, Function0 function0, C5021d dVar) {
        this.f11181c = authenticatedViewModel;
        this.f11182e = attachmentService;
        this.f11183f = function0;
        this.f11184g = dVar;
        super(1);
    }

    /* renamed from: a */
    public final void mo11482a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService attachmentService = this.f11182e;
        AuthenticatedViewModel authenticatedViewModel = this.f11181c;
        C5027n a = ((C5027n) this.f11183f.invoke()).mo17238d((C4673f<? super C4663c>) new C4673f<C4663c>(this) {

            /* renamed from: c */
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenFile$1 f11185c;

            {
                this.f11185c = r1;
            }

            /* renamed from: a */
            public final void mo11483a() {
                this.f11185c.f11184g.mo17017a(Boolean.valueOf(true));
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C4663c cVar = (C4663c) obj;
                mo11483a();
            }
        }).mo17202a((C4673f<? super C5026m<T>>) new C4673f<C5026m<File>>(this) {

            /* renamed from: c */
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenFile$1 f11186c;

            {
                this.f11186c = r1;
            }

            /* renamed from: a */
            public final void mo11484a() {
                this.f11186c.f11184g.mo17017a(Boolean.valueOf(false));
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C5026m mVar = (C5026m) obj;
                mo11484a();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "download()\n            .… progress.onNext(false) }");
        C5036u d = authenticatedViewModel.mo11505a(a).mo17239d();
        Intrinsics.checkExpressionValueIsNotNull(d, "download()\n            .…          .firstOrError()");
        attachmentService.mo11457a(dVar, d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11482a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
