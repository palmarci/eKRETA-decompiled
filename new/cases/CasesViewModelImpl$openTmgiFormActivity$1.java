package hu.ekreta.ellenorzo.cases;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CasesViewModelImpl.kt */
public final class CasesViewModelImpl$openTmgiFormActivity$1 extends Lambda implements Function1<Activity, Intent> {
    public static final CasesViewModelImpl$openTmgiFormActivity$1 INSTANCE = new CasesViewModelImpl$openTmgiFormActivity$1();

    public CasesViewModelImpl$openTmgiFormActivity$1() {
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        return a.a(activity, "$receiver", activity, TmgiFormActivity.class);
    }
}
