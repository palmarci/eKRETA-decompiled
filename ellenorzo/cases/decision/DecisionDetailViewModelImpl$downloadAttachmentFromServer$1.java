package p289hu.ekreta.ellenorzo.cases.decision;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 extends Lambda implements Function0<C5027n<File>> {

    /* renamed from: c */
    public final /* synthetic */ DecisionDetailViewModelImpl f11415c;

    /* renamed from: e */
    public final /* synthetic */ Attachment f11416e;

    /* renamed from: f */
    public final /* synthetic */ String f11417f;

    public DecisionDetailViewModelImpl$downloadAttachmentFromServer$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl, Attachment attachment, String str) {
        this.f11415c = decisionDetailViewModelImpl;
        this.f11416e = attachment;
        this.f11417f = str;
        super(0);
    }

    public final C5027n<File> invoke() {
        C5027n<File> c = this.f11415c.f11377F.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 f11418c;

            {
                this.f11418c = r1;
            }

            /* renamed from: a */
            public final C5027n<File> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                AttachmentService access$getAttachmentService$p = this.f11418c.f11415c.f11379H;
                DecisionDetailViewModelImpl$downloadAttachmentFromServer$1 decisionDetailViewModelImpl$downloadAttachmentFromServer$1 = this.f11418c;
                return access$getAttachmentService$p.mo11454a(decisionDetailViewModelImpl$downloadAttachmentFromServer$1.f11416e, decisionDetailViewModelImpl$downloadAttachmentFromServer$1.f11417f, profile.mo14042d());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…ccessToken)\n            }");
        return c;
    }
}
