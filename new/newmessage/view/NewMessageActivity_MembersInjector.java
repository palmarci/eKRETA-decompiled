package hu.ekreta.ellenorzo.newmessage.view;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import i.b;
import l.a.a;

public final class NewMessageActivity_MembersInjector implements b<NewMessageActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5829a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<NewMessageViewModel> c;

    /* renamed from: a */
    public void injectMembers(NewMessageActivity newMessageActivity) {
        newMessageActivity.v = this.f5829a.get();
        newMessageActivity.w = this.b.get();
        newMessageActivity.x = this.c.get();
    }

    public static void a(NewMessageActivity newMessageActivity, NewMessageViewModel newMessageViewModel) {
        newMessageActivity.x = newMessageViewModel;
    }
}
