package p289hu.ekreta.ellenorzo.subject.averages;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.Average;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectParameters;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesViewModelImpl$onSelect$1 */
/* compiled from: AveragesViewModelImpl.kt */
public final class AveragesViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ AveragesListItem f14927c;

    public AveragesViewModelImpl$onSelect$1(AveragesListItem averagesListItem) {
        this.f14927c = averagesListItem;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Activity activity2 = activity;
        Intrinsics.checkParameterIsNotNull(activity2, "$receiver");
        if (!(this.f14927c instanceof Average)) {
            return null;
        }
        Intent intent = new Intent(activity2, SubjectDetailActivity.class);
        SubjectParameters subjectParameters = new SubjectParameters(((Average) this.f14927c).mo15790g(), null, null, null, null, ((Average) this.f14927c).mo15784b(), ((Average) this.f14927c).mo15785c(), ((Average) this.f14927c).mo15791h(), null, ((Average) this.f14927c).mo15786d(), ((Average) this.f14927c).mo15789f(), ((Average) this.f14927c).mo15787e(), 282, null);
        ExtensionsKt.m14646a(intent, subjectParameters);
        return intent;
    }
}
