package hu.ekreta.ellenorzo.util.view;

import androidx.fragment.app.Fragment;
import h.m.d.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$observeAndRunUiCommands$2 extends Lambda implements Function0<d> {
    public final /* synthetic */ Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionsKt$observeAndRunUiCommands$2(Fragment fragment) {
        super(0);
        this.c = fragment;
    }

    public final d invoke() {
        d h2 = this.c.h();
        if (h2 == null) {
            Intrinsics.throwNpe();
        }
        return h2;
    }
}
