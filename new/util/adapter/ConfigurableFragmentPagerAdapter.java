package hu.ekreta.ellenorzo.util.adapter;

import androidx.fragment.app.Fragment;
import h.m.d.p;
import h.m.d.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/util/adapter/ConfigurableFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragments", "", "Landroidx/fragment/app/Fragment;", "getFragments", "()Ljava/util/List;", "titles", "", "getTitles", "addPage", "", "title", "fragment", "index", "", "clear", "getCount", "getItem", "position", "getItemId", "", "getItemPosition", "obj", "", "getPageTitle", "", "setPage", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ConfigurableFragmentPagerAdapter.kt */
public class ConfigurableFragmentPagerAdapter extends u {

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f6301g = new ArrayList(4);

    /* renamed from: h  reason: collision with root package name */
    public final List<Fragment> f6302h = new ArrayList(4);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigurableFragmentPagerAdapter(p pVar) {
        super(pVar);
        Intrinsics.checkParameterIsNotNull(pVar, "fm");
    }

    public int a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        int indexOf = CollectionsKt___CollectionsKt.indexOf(this.f6302h, obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -2;
    }

    public Fragment b(int i2) {
        return this.f6302h.get(i2);
    }

    public long c(int i2) {
        return (long) System.identityHashCode(b(i2));
    }

    public final void h() {
        this.f6301g.clear();
        this.f6302h.clear();
    }

    public CharSequence a(int i2) {
        return this.f6301g.get(i2);
    }

    public int b() {
        return this.f6302h.size();
    }

    public final void a(String str, Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f6301g.add(str);
        this.f6302h.add(fragment);
    }
}
