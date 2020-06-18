package hu.ekreta.ellenorzo.message;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class MessageDetailActivity_MembersInjector implements b<MessageDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5783a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<MessageDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(MessageDetailActivity messageDetailActivity) {
        messageDetailActivity.v = this.f5783a.get();
        messageDetailActivity.w = this.b.get();
        messageDetailActivity.x = this.c.get();
    }

    public static void a(MessageDetailActivity messageDetailActivity, MessageDetailViewModel messageDetailViewModel) {
        messageDetailActivity.x = messageDetailViewModel;
    }
}
