package hu.ekreta.ellenorzo.subject.certificate;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity;
import hu.ekreta.ellenorzo.subject.detail.SubjectParameters;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CertificateViewModelImpl.kt */
public final class CertificateViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ CertificationListItem c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificateViewModelImpl$onSelect$1(CertificationListItem certificationListItem) {
        super(1);
        this.c = certificationListItem;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Activity activity2 = activity;
        Intrinsics.checkParameterIsNotNull(activity2, "$receiver");
        if (!(this.c instanceof CertificationListItem.CertificationItem)) {
            return null;
        }
        Intent intent = new Intent(activity2, SubjectDetailActivity.class);
        ExtensionsKt.a(intent, new SubjectParameters(((CertificationListItem.CertificationItem) this.c).b().a(activity2), ((CertificationListItem.CertificationItem) this.c).b().B(), ((CertificationListItem.CertificationItem) this.c).b().t(), ((CertificationListItem.CertificationItem) this.c).b().D(), ((CertificationListItem.CertificationItem) this.c).b().z(), (String) null, (String) null, false, ((CertificationListItem.CertificationItem) this.c).b().A(), ((CertificationListItem.CertificationItem) this.c).b().g(), (List) null, (String) null, 3296, (DefaultConstructorMarker) null));
        return intent;
    }
}
