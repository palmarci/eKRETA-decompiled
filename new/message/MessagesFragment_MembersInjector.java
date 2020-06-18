package hu.ekreta.ellenorzo.message;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class MessagesFragment_MembersInjector implements b<MessagesFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5807a;
    public final a<MessagesViewModel> b;

    /* renamed from: a */
    public void injectMembers(MessagesFragment messagesFragment) {
        messagesFragment.Z = this.f5807a.get();
        messagesFragment.a0 = this.b.get();
    }

    public static void a(MessagesFragment messagesFragment, MessagesViewModel messagesViewModel) {
        messagesFragment.a0 = messagesViewModel;
    }
}
