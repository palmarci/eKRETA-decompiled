package hu.ekreta.ellenorzo.cases;

import a.j.a.a.i;
import com.leinardi.android.speeddial.SpeedDialView;
import hu.ekreta.ellenorzo.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "speedActionItem", "Lcom/leinardi/android/speeddial/SpeedDialActionItem;", "kotlin.jvm.PlatformType", "onActionSelected"}, k = 3, mv = {1, 1, 15})
/* compiled from: CasesFragment.kt */
public final class CasesFragment$onViewCreated$2 implements SpeedDialView.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CasesFragment f5104a;

    public CasesFragment$onViewCreated$2(CasesFragment casesFragment) {
        this.f5104a = casesFragment;
    }

    public final boolean a(i iVar) {
        Intrinsics.checkExpressionValueIsNotNull(iVar, "speedActionItem");
        if (iVar.c != R.id.tmgi_certificate) {
            return false;
        }
        return this.f5104a.C0().i0();
    }
}
