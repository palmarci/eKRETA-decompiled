package p289hu.ekreta.ellenorzo.message;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment_MembersInjector */
public final class MessagesFragment_MembersInjector implements C4447b<MessagesFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13928a;

    /* renamed from: b */
    public final C5431a<MessagesViewModel> f13929b;

    /* renamed from: a */
    public void injectMembers(MessagesFragment messagesFragment) {
        messagesFragment.f15499Z = (DispatchingAndroidInjector) this.f13928a.get();
        messagesFragment.f13913a0 = (MessagesViewModel) this.f13929b.get();
    }

    /* renamed from: a */
    public static void m13086a(MessagesFragment messagesFragment, MessagesViewModel messagesViewModel) {
        messagesFragment.f13913a0 = messagesViewModel;
    }
}
