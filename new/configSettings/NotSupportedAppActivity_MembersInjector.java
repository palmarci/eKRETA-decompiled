package hu.ekreta.ellenorzo.configSettings;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class NotSupportedAppActivity_MembersInjector implements b<NotSupportedAppActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5302a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<NotSupportedAppViewModel> c;

    /* renamed from: a */
    public void injectMembers(NotSupportedAppActivity notSupportedAppActivity) {
        notSupportedAppActivity.v = this.f5302a.get();
        notSupportedAppActivity.w = this.b.get();
        notSupportedAppActivity.x = this.c.get();
    }

    public static void a(NotSupportedAppActivity notSupportedAppActivity, NotSupportedAppViewModel notSupportedAppViewModel) {
        notSupportedAppActivity.x = notSupportedAppViewModel;
    }
}
