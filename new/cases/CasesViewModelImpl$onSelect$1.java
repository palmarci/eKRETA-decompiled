package hu.ekreta.ellenorzo.cases;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CasesViewModelImpl.kt */
public final class CasesViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ BaseCase c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CasesViewModelImpl$onSelect$1(BaseCase baseCase) {
        super(1);
        this.c = baseCase;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intent a2 = a.a(activity, "$receiver", activity, CaseDetailsActivity.class);
        ExtensionsKt.a(a2, this.c);
        return a2;
    }
}
