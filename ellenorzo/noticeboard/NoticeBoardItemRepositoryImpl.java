package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "dao", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;)V", "adapter", "hu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl$adapter$1;", "getDao", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchNoticeBoardItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getNoticeBoardItems", "updateNoticeBoardItem", "noticeBoardItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepositoryImpl */
/* compiled from: NoticeBoardItemRepositoryImpl.kt */
public final class NoticeBoardItemRepositoryImpl implements NoticeBoardItemRepository {

    /* renamed from: a */
    public final NoticeBoardItemRepositoryImpl$adapter$1 f14160a = new NoticeBoardItemRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f14161b;

    /* renamed from: c */
    public final NoticeBoardItemDao f14162c;

    public NoticeBoardItemRepositoryImpl(MobileApiV3 mobileApiV3, NoticeBoardItemDao noticeBoardItemDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(noticeBoardItemDao, "dao");
        this.f14161b = mobileApiV3;
        this.f14162c = noticeBoardItemDao;
    }

    /* renamed from: a */
    public final NoticeBoardItemDao mo13710a() {
        return this.f14162c;
    }

    /* renamed from: t */
    public C5027n<List<NoticeBoardItem>> mo13708t(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f14161b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/v3/Sajat/FaliujsagElemek");
        C5027n<List<NoticeBoardItem>> c = mobileApiV3.getNoticeBoardItems(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(new NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "mobileApiV3.getNoticeBoa…ile.id, it)\n            }");
        return c;
    }

    /* renamed from: y */
    public C5027n<List<NoticeBoardItem>> mo13709y(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14160a.mo13711a(profile);
    }

    /* renamed from: a */
    public C5027n<NoticeBoardItem> mo13707a(NoticeBoardItem noticeBoardItem) {
        Intrinsics.checkParameterIsNotNull(noticeBoardItem, "noticeBoardItem");
        return this.f14162c.mo16319a(noticeBoardItem);
    }
}
