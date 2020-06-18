package hu.ekreta.ellenorzo.attachment;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "throwableObservable", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt$uploadAttachment$1<T, R> implements h<n<Throwable>, q<?>> {
    public final /* synthetic */ AuthenticatedViewModel c;

    public ViewModelExtensionsKt$uploadAttachment$1(AuthenticatedViewModel authenticatedViewModel) {
        this.c = authenticatedViewModel;
    }

    /* renamed from: a */
    public final n<Unit> apply(n<Throwable> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "throwableObservable");
        return nVar.c((h<? super Throwable, ? extends q<? extends R>>) new h<T, q<? extends R>>(this) {
            public final /* synthetic */ ViewModelExtensionsKt$uploadAttachment$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Unit> apply(final Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                return this.c.c.a(Integer.valueOf(R.string.unknown_error), Integer.valueOf(R.string.Attachment_upload_error), Integer.valueOf(R.string.Try_attachment_upload_again), Integer.valueOf(R.string.Common_Delete_Cancel)).d(new h<T, q<? extends R>>() {
                    /* renamed from: a */
                    public final n<Unit> apply(Integer num) {
                        Intrinsics.checkParameterIsNotNull(num, "it");
                        if (num.intValue() == -1) {
                            return n.d(Unit.INSTANCE);
                        }
                        return n.b(th);
                    }
                });
            }
        });
    }
}
