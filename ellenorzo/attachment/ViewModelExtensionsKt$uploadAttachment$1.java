package p289hu.ekreta.ellenorzo.attachment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "throwableObservable", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt$uploadAttachment$1 */
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt$uploadAttachment$1<T, R> implements C4675h<C5027n<Throwable>, C5030q<?>> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedViewModel f11187c;

    public ViewModelExtensionsKt$uploadAttachment$1(AuthenticatedViewModel authenticatedViewModel) {
        this.f11187c = authenticatedViewModel;
    }

    /* renamed from: a */
    public final C5027n<Unit> apply(C5027n<Throwable> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "throwableObservable");
        return nVar.mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ ViewModelExtensionsKt$uploadAttachment$1 f11188c;

            {
                this.f11188c = r1;
            }

            /* renamed from: a */
            public final C5027n<Unit> apply(final Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                return this.f11188c.f11187c.mo16365a(Integer.valueOf(C4014R.string.unknown_error), Integer.valueOf(C4014R.string.Attachment_upload_error), Integer.valueOf(C4014R.string.Try_attachment_upload_again), Integer.valueOf(C4014R.string.Common_Delete_Cancel)).mo17268d(new C4675h<T, C5030q<? extends R>>() {
                    /* renamed from: a */
                    public final C5027n<Unit> apply(Integer num) {
                        Intrinsics.checkParameterIsNotNull(num, "it");
                        if (num.intValue() == -1) {
                            return C5027n.m16898d(Unit.INSTANCE);
                        }
                        return C5027n.m16896b(th);
                    }
                });
            }
        });
    }
}
