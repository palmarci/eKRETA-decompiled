package p289hu.ekreta.ellenorzo.home;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.NoteItem;
import p289hu.ekreta.ellenorzo.notes.Note;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoteItem;", "notes", "Lhu/ekreta/ellenorzo/notes/Note;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl$toDashboardItem$2 */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$toDashboardItem$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ HomeViewModelImpl f13360c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13361e;

    public HomeViewModelImpl$toDashboardItem$2(HomeViewModelImpl homeViewModelImpl, Profile profile) {
        this.f13360c = homeViewModelImpl;
        this.f13361e = profile;
    }

    /* renamed from: a */
    public final List<NoteItem> apply(List<Note> list) {
        Intrinsics.checkParameterIsNotNull(list, "notes");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Note note : list) {
            arrayList.add(new NoteItem(note.mo13557g().compareTo(this.f13361e.mo14050i()) < 0, note, this.f13360c.mo12834Q1()));
        }
        return arrayList;
    }
}
