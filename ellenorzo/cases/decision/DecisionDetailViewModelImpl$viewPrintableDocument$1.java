package p289hu.ekreta.ellenorzo.cases.decision;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$viewPrintableDocument$1 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$viewPrintableDocument$1 extends Lambda implements Function0<C5027n<File>> {

    /* renamed from: c */
    public final /* synthetic */ DecisionDetailViewModelImpl f11427c;

    /* renamed from: e */
    public final /* synthetic */ String f11428e;

    public DecisionDetailViewModelImpl$viewPrintableDocument$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl, String str) {
        this.f11427c = decisionDetailViewModelImpl;
        this.f11428e = str;
        super(0);
    }

    public final C5027n<File> invoke() {
        C5027n<File> c = this.f11427c.f11377F.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl$viewPrintableDocument$1 f11429c;

            {
                this.f11429c = r1;
            }

            /* renamed from: a */
            public final C5027n<File> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                AttachmentService access$getAttachmentService$p = this.f11429c.f11427c.f11379H;
                StringBuilder a = C0082a.m111a("dokumentumok/hatarozatok/");
                a.append(this.f11429c.f11428e);
                return access$getAttachmentService$p.mo11455a(a.toString(), C0082a.m106a(C0082a.m111a("hatarozat_"), this.f11429c.f11428e, ".pdf"), profile.mo14042d());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…      )\n                }");
        return c;
    }
}
