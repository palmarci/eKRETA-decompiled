package p289hu.ekreta.ellenorzo.notes;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/notes/Note;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$adapter$1$notesObservable$2 */
/* compiled from: NotesRepositoryImpl.kt */
public final class NotesRepositoryImpl$adapter$1$notesObservable$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ NotesRepositoryImpl$adapter$1 f14112c;

    public NotesRepositoryImpl$adapter$1$notesObservable$2(NotesRepositoryImpl$adapter$1 notesRepositoryImpl$adapter$1) {
        this.f14112c = notesRepositoryImpl$adapter$1;
    }

    /* renamed from: a */
    public final C5027n<List<Note>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14112c.f14111c.mo13640a().mo16312a(profile.mo14054m());
    }
}
