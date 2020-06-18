package hu.ekreta.ellenorzo.attachment;

import h.m.d.d;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import java.io.File;
import k.b.a0.c;
import k.b.b0.f;
import k.b.m;
import k.b.n;
import k.b.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt$downloadAndOpenFile$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ AuthenticatedViewModel c;
    public final /* synthetic */ AttachmentService e;
    public final /* synthetic */ Function0 f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k.b.h0.d f5050g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewModelExtensionsKt$downloadAndOpenFile$1(AuthenticatedViewModel authenticatedViewModel, AttachmentService attachmentService, Function0 function0, k.b.h0.d dVar) {
        super(1);
        this.c = authenticatedViewModel;
        this.e = attachmentService;
        this.f = function0;
        this.f5050g = dVar;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService attachmentService = this.e;
        AuthenticatedViewModel authenticatedViewModel = this.c;
        n a2 = ((n) this.f.invoke()).d((f<? super c>) new f<c>(this) {
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenFile$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                this.c.f5050g.a(true);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                c cVar = (c) obj;
                a();
            }
        }).a(new f<m<File>>(this) {
            public final /* synthetic */ ViewModelExtensionsKt$downloadAndOpenFile$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                this.c.f5050g.a(false);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                m mVar = (m) obj;
                a();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a2, "download()\n            .… progress.onNext(false) }");
        u d2 = authenticatedViewModel.a(a2).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "download()\n            .…          .firstOrError()");
        attachmentService.a(dVar, d2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
