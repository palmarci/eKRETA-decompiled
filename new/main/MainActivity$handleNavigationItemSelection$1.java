package hu.ekreta.ellenorzo.main;

import a.h.a.c.q.g;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "onNavigationItemSelected"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity$handleNavigationItemSelection$1 implements g.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f5730a;

    public MainActivity$handleNavigationItemSelection$1(MainActivity mainActivity) {
        this.f5730a = mainActivity;
    }

    public final boolean a(MenuItem menuItem) {
        Object obj;
        boolean z;
        Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
        Iterator it = this.f5730a.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer b = ((MainMenuItem) obj).b();
            int itemId = menuItem.getItemId();
            if (b != null && b.intValue() == itemId) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        MainMenuItem mainMenuItem = (MainMenuItem) obj;
        if (mainMenuItem != null) {
            this.f5730a.q().a(mainMenuItem);
        } else {
            mainMenuItem = null;
        }
        if (mainMenuItem != null) {
            return true;
        }
        return false;
    }
}
