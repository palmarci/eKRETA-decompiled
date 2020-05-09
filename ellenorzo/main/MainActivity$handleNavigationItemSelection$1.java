package p289hu.ekreta.ellenorzo.main;

import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p055a.p105c.p122q.C2121g.C2124c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "onNavigationItemSelected"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainActivity$handleNavigationItemSelection$1 */
/* compiled from: MainActivity.kt */
public final class MainActivity$handleNavigationItemSelection$1 implements C2124c {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f13688a;

    public MainActivity$handleNavigationItemSelection$1(MainActivity mainActivity) {
        this.f13688a = mainActivity;
    }

    /* renamed from: a */
    public final boolean mo4048a(MenuItem menuItem) {
        Object obj;
        boolean z;
        Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
        Iterator it = this.f13688a.f13681A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer b = ((MainMenuItem) obj).mo13170b();
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
            this.f13688a.mo13160q().mo13178a(mainMenuItem);
        } else {
            mainMenuItem = null;
        }
        if (mainMenuItem != null) {
            return true;
        }
        return false;
    }
}
