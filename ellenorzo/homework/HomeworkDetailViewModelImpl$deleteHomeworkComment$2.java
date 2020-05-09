package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.exception.NoContentException;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p322a.C4731b;
import p300k.p313b.p316c0.p321e.p322a.C4732c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$deleteHomeworkComment$2 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$deleteHomeworkComment$2<T, R> implements C4675h<Throwable, C4991d> {
    public static final HomeworkDetailViewModelImpl$deleteHomeworkComment$2 INSTANCE = new HomeworkDetailViewModelImpl$deleteHomeworkComment$2();

    /* renamed from: a */
    public final C4991d apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        if (th instanceof NoContentException) {
            return C4664d.m16035a(C4731b.f16421c);
        }
        C4704b.m16116a(th, "error is null");
        return C4664d.m16035a((C4667b) new C4732c(th));
    }
}
