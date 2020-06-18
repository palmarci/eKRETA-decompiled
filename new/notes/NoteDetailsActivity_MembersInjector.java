package hu.ekreta.ellenorzo.notes;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class NoteDetailsActivity_MembersInjector implements b<NoteDetailsActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5854a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<NoteDetailsViewModel> c;

    /* renamed from: a */
    public void injectMembers(NoteDetailsActivity noteDetailsActivity) {
        noteDetailsActivity.v = this.f5854a.get();
        noteDetailsActivity.w = this.b.get();
        noteDetailsActivity.x = this.c.get();
    }

    public static void a(NoteDetailsActivity noteDetailsActivity, NoteDetailsViewModel noteDetailsViewModel) {
        noteDetailsActivity.x = noteDetailsViewModel;
    }
}
