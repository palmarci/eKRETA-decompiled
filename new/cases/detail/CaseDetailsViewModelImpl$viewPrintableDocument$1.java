package hu.ekreta.ellenorzo.cases.detail;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.profile.Profile;
import java.io.File;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$viewPrintableDocument$1 extends Lambda implements Function0<n<File>> {
    public final /* synthetic */ CaseDetailsViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaseDetailsViewModelImpl$viewPrintableDocument$1(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        super(0);
        this.c = caseDetailsViewModelImpl;
    }

    public final n<File> invoke() {
        n<R> c2 = this.c.N.b().c(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ CaseDetailsViewModelImpl$viewPrintableDocument$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<File> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                AttachmentService access$getAttachmentService$p = this.c.c.P;
                StringBuilder a2 = a.a("dokumentumok/kerelmek/");
                BaseCase T = this.c.c.T();
                if (T == null) {
                    Intrinsics.throwNpe();
                }
                a2.append(T.k());
                String sb = a2.toString();
                StringBuilder a3 = a.a("kerelem_");
                BaseCase T2 = this.c.c.T();
                if (T2 == null) {
                    Intrinsics.throwNpe();
                }
                a3.append(T2.k());
                a3.append(".pdf");
                return access$getAttachmentService$p.a(sb, StringsKt__StringsJVMKt.replace$default(a3.toString(), "/", "_", false, 4, (Object) null), profile.d());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…      )\n                }");
        return c2;
    }
}
