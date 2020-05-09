package p289hu.ekreta.ellenorzo.subject.certificate.quarterly;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModelImpl$onSelect$1 */
/* compiled from: QuarterlyViewModelImpl.kt */
public final class QuarterlyViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ CertificationListItem f14995c;

    public QuarterlyViewModelImpl$onSelect$1(CertificationListItem certificationListItem) {
        this.f14995c = certificationListItem;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        if (!(this.f14995c instanceof CertificationItem)) {
            return null;
        }
        Intent intent = new Intent(activity, EvaluationDetailsActivity.class);
        ExtensionsKt.m14639a(intent, ((CertificationItem) this.f14995c).mo15822b());
        return intent;
    }
}
