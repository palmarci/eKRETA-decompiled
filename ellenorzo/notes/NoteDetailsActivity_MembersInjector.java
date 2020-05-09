package p289hu.ekreta.ellenorzo.notes;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NoteDetailsActivity_MembersInjector */
public final class NoteDetailsActivity_MembersInjector implements C4447b<NoteDetailsActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14061a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14062b;

    /* renamed from: c */
    public final C5431a<NoteDetailsViewModel> f14063c;

    /* renamed from: a */
    public void injectMembers(NoteDetailsActivity noteDetailsActivity) {
        noteDetailsActivity.f15496v = (DispatchingAndroidInjector) this.f14061a.get();
        noteDetailsActivity.f15497w = (DispatchingAndroidInjector) this.f14062b.get();
        noteDetailsActivity.f14056x = (NoteDetailsViewModel) this.f14063c.get();
    }

    /* renamed from: a */
    public static void m13226a(NoteDetailsActivity noteDetailsActivity, NoteDetailsViewModel noteDetailsViewModel) {
        noteDetailsActivity.f14056x = noteDetailsViewModel;
    }
}
