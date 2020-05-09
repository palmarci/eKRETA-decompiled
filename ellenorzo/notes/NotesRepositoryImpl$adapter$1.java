package p289hu.ekreta.ellenorzo.notes;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.p333d0.C4992a;
import p300k.p313b.p337h0.C5018b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000-\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000e\u001a\u00020\u0005RJ\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo17463d2 = {"hu/ekreta/ellenorzo/notes/NotesRepositoryImpl$adapter$1", "", "notesObservable", "Lio/reactivex/observables/ConnectableObservable;", "", "Lhu/ekreta/ellenorzo/notes/Note;", "kotlin.jvm.PlatformType", "profileNote", "Lio/reactivex/subjects/PublishSubject;", "Lhu/ekreta/ellenorzo/profile/Profile;", "getNotes", "Lio/reactivex/Observable;", "profile", "updateSelectedNote", "note", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$adapter$1 */
/* compiled from: NotesRepositoryImpl.kt */
public final class NotesRepositoryImpl$adapter$1 {

    /* renamed from: a */
    public final C5018b<Profile> f14109a;

    /* renamed from: b */
    public final C4992a<List<Note>> f14110b;

    /* renamed from: c */
    public final /* synthetic */ NotesRepositoryImpl f14111c;

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r1v0, types: [hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NotesRepositoryImpl$adapter$1(p289hu.ekreta.ellenorzo.notes.NotesRepositoryImpl r3) {
        /*
            r2 = this;
            r2.f14111c = r3
            r2.<init>()
            k.b.h0.b r3 = new k.b.h0.b
            r3.<init>()
            java.lang.String r0 = "PublishSubject.create<Profile>()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            r2.f14109a = r3
            k.b.h0.b<hu.ekreta.ellenorzo.profile.Profile> r3 = r2.f14109a
            kotlin.reflect.KProperty1 r0 = p289hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$adapter$1$notesObservable$1.INSTANCE
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$sam$io_reactivex_functions_Function$0 r1 = new hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$sam$io_reactivex_functions_Function$0
            r1.<init>(r0)
            r0 = r1
        L_0x001d:
            k.b.b0.h r0 = (p300k.p313b.p315b0.C4675h) r0
            k.b.n r3 = r3.mo17225b(r0)
            hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$adapter$1$notesObservable$2 r0 = new hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$adapter$1$notesObservable$2
            r0.<init>(r2)
            k.b.n r3 = r3.mo17252k(r0)
            r0 = 1
            k.b.d0.a r3 = r3.mo17219b(r0)
            r3.mo17160l()
            r2.f14110b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.notes.NotesRepositoryImpl$adapter$1.<init>(hu.ekreta.ellenorzo.notes.NotesRepositoryImpl):void");
    }

    /* renamed from: a */
    public final C5027n<List<Note>> mo13642a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        this.f14109a.mo17017a(profile);
        C4992a<List<Note>> aVar = this.f14110b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "notesObservable");
        return aVar;
    }

    /* renamed from: a */
    public final C5027n<Note> mo13641a(Note note) {
        Intrinsics.checkParameterIsNotNull(note, "note");
        return this.f14111c.mo13640a().mo16319a(note);
    }
}
