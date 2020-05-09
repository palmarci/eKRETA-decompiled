package p289hu.ekreta.ellenorzo.notes;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NotesFragment_MembersInjector */
public final class NotesFragment_MembersInjector implements C4447b<NotesFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14104a;

    /* renamed from: b */
    public final C5431a<NotesViewModel> f14105b;

    /* renamed from: a */
    public void injectMembers(NotesFragment notesFragment) {
        notesFragment.f15499Z = (DispatchingAndroidInjector) this.f14104a.get();
        notesFragment.f14090a0 = (NotesViewModel) this.f14105b.get();
    }

    /* renamed from: a */
    public static void m13294a(NotesFragment notesFragment, NotesViewModel notesViewModel) {
        notesFragment.f14090a0 = notesViewModel;
    }
}
