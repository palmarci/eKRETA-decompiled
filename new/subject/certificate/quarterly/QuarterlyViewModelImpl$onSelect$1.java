package hu.ekreta.ellenorzo.subject.certificate.quarterly;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity;
import hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: QuarterlyViewModelImpl.kt */
public final class QuarterlyViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ CertificationListItem c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuarterlyViewModelImpl$onSelect$1(CertificationListItem certificationListItem) {
        super(1);
        this.c = certificationListItem;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        if (!(this.c instanceof CertificationListItem.CertificationItem)) {
            return null;
        }
        Intent intent = new Intent(activity, EvaluationDetailsActivity.class);
        ExtensionsKt.a(intent, ((CertificationListItem.CertificationItem) this.c).b());
        return intent;
    }
}
