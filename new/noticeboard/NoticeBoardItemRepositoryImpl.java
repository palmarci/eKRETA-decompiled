package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "dao", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;)V", "adapter", "hu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl$adapter$1;", "getDao", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchNoticeBoardItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getNoticeBoardItems", "updateNoticeBoardItem", "noticeBoardItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardItemRepositoryImpl.kt */
public final class NoticeBoardItemRepositoryImpl implements NoticeBoardItemRepository {

    /* renamed from: a  reason: collision with root package name */
    public final NoticeBoardItemRepositoryImpl$adapter$1 f5893a = new NoticeBoardItemRepositoryImpl$adapter$1(this);
    public final MobileApiV3 b;
    public final NoticeBoardItemDao c;

    public NoticeBoardItemRepositoryImpl(MobileApiV3 mobileApiV3, NoticeBoardItemDao noticeBoardItemDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(noticeBoardItemDao, "dao");
        this.b = mobileApiV3;
        this.c = noticeBoardItemDao;
    }

    public final NoticeBoardItemDao a() {
        return this.c;
    }

    public n<List<NoticeBoardItem>> t(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.b;
        n<R> c2 = mobileApiV3.getNoticeBoardItems(profile.p() + "/ellenorzo/v3/Sajat/FaliujsagElemek", MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(new NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$1(profile)).c(new NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "mobileApiV3.getNoticeBoa…ile.id, it)\n            }");
        return c2;
    }

    public n<List<NoticeBoardItem>> y(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5893a.a(profile);
    }

    public n<NoticeBoardItem> a(NoticeBoardItem noticeBoardItem) {
        Intrinsics.checkParameterIsNotNull(noticeBoardItem, "noticeBoardItem");
        return this.c.a(noticeBoardItem);
    }
}
