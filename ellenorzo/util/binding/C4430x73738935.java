package p289hu.ekreta.ellenorzo.util.binding;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, mo17463d2 = {"<anonymous>", "", "parent", "Landroid/widget/AdapterView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemClick"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewExtensions$setAutoCompleteTextViewItemSelectedListener$1 */
/* compiled from: AutoCompleteTextViewBindings.kt */
public final class C4430x73738935 implements OnItemClickListener {

    /* renamed from: c */
    public final /* synthetic */ ItemSelectedListener f15387c;

    public C4430x73738935(ItemSelectedListener itemSelectedListener) {
        this.f15387c = itemSelectedListener;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f15387c.mo12748a(adapterView.getItemAtPosition(i).toString());
    }
}
