package p289hu.ekreta.ellenorzo.configSettings;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivity_MembersInjector */
public final class NotSupportedAppActivity_MembersInjector implements C4447b<NotSupportedAppActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11910a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f11911b;

    /* renamed from: c */
    public final C5431a<NotSupportedAppViewModel> f11912c;

    /* renamed from: a */
    public void injectMembers(NotSupportedAppActivity notSupportedAppActivity) {
        notSupportedAppActivity.f15496v = (DispatchingAndroidInjector) this.f11910a.get();
        notSupportedAppActivity.f15497w = (DispatchingAndroidInjector) this.f11911b.get();
        notSupportedAppActivity.f11906x = (NotSupportedAppViewModel) this.f11912c.get();
    }

    /* renamed from: a */
    public static void m11433a(NotSupportedAppActivity notSupportedAppActivity, NotSupportedAppViewModel notSupportedAppViewModel) {
        notSupportedAppActivity.f11906x = notSupportedAppViewModel;
    }
}
