package hu.ekreta.ellenorzo.cases.decision;

import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.profile.Profile;
import java.io.File;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 extends Lambda implements Function0<n<File>> {
    public final /* synthetic */ DecisionDetailViewModelImpl c;
    public final /* synthetic */ Attachment e;
    public final /* synthetic */ String f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecisionDetailViewModelImpl$downloadAttachmentFromServer$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl, Attachment attachment, String str) {
        super(0);
        this.c = decisionDetailViewModelImpl;
        this.e = attachment;
        this.f = str;
    }

    public final n<File> invoke() {
        n<R> c2 = this.c.G.b().c(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<File> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                AttachmentService access$getAttachmentService$p = this.c.c.I;
                DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 decisionDetailViewModelImpl$downloadAttachmentFromServer$1 = this.c;
                return access$getAttachmentService$p.a(decisionDetailViewModelImpl$downloadAttachmentFromServer$1.e, decisionDetailViewModelImpl$downloadAttachmentFromServer$1.f, profile.d());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…ccessToken)\n            }");
        return c2;
    }
}
