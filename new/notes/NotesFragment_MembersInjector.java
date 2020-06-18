package hu.ekreta.ellenorzo.notes;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class NotesFragment_MembersInjector implements b<NotesFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5873a;
    public final a<NotesViewModel> b;

    /* renamed from: a */
    public void injectMembers(NotesFragment notesFragment) {
        notesFragment.Z = this.f5873a.get();
        notesFragment.a0 = this.b.get();
    }

    public static void a(NotesFragment notesFragment, NotesViewModel notesViewModel) {
        notesFragment.a0 = notesViewModel;
    }
}
