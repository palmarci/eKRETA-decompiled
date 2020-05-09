package p289hu.ekreta.ellenorzo.message;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailActivity_MembersInjector */
public final class MessageDetailActivity_MembersInjector implements C4447b<MessageDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13829a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13830b;

    /* renamed from: c */
    public final C5431a<MessageDetailViewModel> f13831c;

    /* renamed from: a */
    public void injectMembers(MessageDetailActivity messageDetailActivity) {
        messageDetailActivity.f15496v = (DispatchingAndroidInjector) this.f13829a.get();
        messageDetailActivity.f15497w = (DispatchingAndroidInjector) this.f13830b.get();
        messageDetailActivity.f13824x = (MessageDetailViewModel) this.f13831c.get();
    }

    /* renamed from: a */
    public static void m12936a(MessageDetailActivity messageDetailActivity, MessageDetailViewModel messageDetailViewModel) {
        messageDetailActivity.f13824x = messageDetailViewModel;
    }
}
