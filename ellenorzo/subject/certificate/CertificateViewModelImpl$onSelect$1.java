package p289hu.ekreta.ellenorzo.subject.certificate;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectParameters;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificateViewModelImpl$onSelect$1 */
/* compiled from: CertificateViewModelImpl.kt */
public final class CertificateViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ CertificationListItem f14937c;

    public CertificateViewModelImpl$onSelect$1(CertificationListItem certificationListItem) {
        this.f14937c = certificationListItem;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Activity activity2 = activity;
        Intrinsics.checkParameterIsNotNull(activity2, "$receiver");
        if (!(this.f14937c instanceof CertificationItem)) {
            return null;
        }
        Intent intent = new Intent(activity2, SubjectDetailActivity.class);
        SubjectParameters subjectParameters = new SubjectParameters(((CertificationItem) this.f14937c).mo15822b().mo12592a(activity2), ((CertificationItem) this.f14937c).mo15822b().mo12586B(), ((CertificationItem) this.f14937c).mo15822b().mo12610t(), ((CertificationItem) this.f14937c).mo15822b().mo12588D(), ((CertificationItem) this.f14937c).mo15822b().mo12618z(), null, null, false, ((CertificationItem) this.f14937c).mo15822b().mo12585A(), ((CertificationItem) this.f14937c).mo15822b().mo12596g(), null, null, 3296, null);
        ExtensionsKt.m14646a(intent, subjectParameters);
        return intent;
    }
}
