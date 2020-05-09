package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "fetchNoticeBoardItems", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getNoticeBoardItems", "updateNoticeBoardItem", "noticeBoardItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository */
/* compiled from: NoticeBoardItemRepository.kt */
public interface NoticeBoardItemRepository extends Repository<NoticeBoardItem> {
    /* renamed from: a */
    C5027n<NoticeBoardItem> mo13707a(NoticeBoardItem noticeBoardItem);

    /* renamed from: t */
    C5027n<List<NoticeBoardItem>> mo13708t(Profile profile);

    /* renamed from: y */
    C5027n<List<NoticeBoardItem>> mo13709y(Profile profile);
}
