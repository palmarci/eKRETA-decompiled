package p289hu.ekreta.ellenorzo.newmessage.view;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.newmessage.view.NewMessageActivity_MembersInjector */
public final class NewMessageActivity_MembersInjector implements C4447b<NewMessageActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13984a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13985b;

    /* renamed from: c */
    public final C5431a<NewMessageViewModel> f13986c;

    /* renamed from: a */
    public void injectMembers(NewMessageActivity newMessageActivity) {
        newMessageActivity.f15496v = (DispatchingAndroidInjector) this.f13984a.get();
        newMessageActivity.f15497w = (DispatchingAndroidInjector) this.f13985b.get();
        newMessageActivity.f13982x = (NewMessageViewModel) this.f13986c.get();
    }

    /* renamed from: a */
    public static void m13155a(NewMessageActivity newMessageActivity, NewMessageViewModel newMessageViewModel) {
        newMessageActivity.f13982x = newMessageViewModel;
    }
}
