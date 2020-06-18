package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NoticeBoardItemDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "it", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoticeBoardItemDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NoticeBoardItemRepositoryImpl.kt */
public final class NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public NoticeBoardItemRepositoryImpl$fetchNoticeBoardItems$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final List<NoticeBoardItem> apply(List<NoticeBoardItemDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (NoticeBoardItemDto noticeBoardItemDto : list) {
            arrayList.add(new NoticeBoardItem(noticeBoardItemDto.getUid(), noticeBoardItemDto.getExpireStartTime(), noticeBoardItemDto.getExpireEndTime(), noticeBoardItemDto.getContent(), noticeBoardItemDto.getTitle(), this.c.m(), (Boolean) null, 64, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}
