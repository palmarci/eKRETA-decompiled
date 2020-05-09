package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$2 */
/* compiled from: NoticeBoardItemRepositoryImpl.kt */
public final class NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ NoticeBoardItemRepositoryImpl f14168c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14169e;

    public NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$2(NoticeBoardItemRepositoryImpl noticeBoardItemRepositoryImpl, Profile profile) {
        this.f14168c = noticeBoardItemRepositoryImpl;
        this.f14169e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<NoticeBoardItem>> apply(List<NoticeBoardItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return this.f14168c.mo13710a().mo13307a(this.f14169e.mo14054m(), list);
    }
}
