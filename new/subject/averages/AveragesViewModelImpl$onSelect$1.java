package hu.ekreta.ellenorzo.subject.averages;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.subject.averages.AveragesListItem;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity;
import hu.ekreta.ellenorzo.subject.detail.SubjectParameters;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AveragesViewModelImpl.kt */
public final class AveragesViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ AveragesListItem c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AveragesViewModelImpl$onSelect$1(AveragesListItem averagesListItem) {
        super(1);
        this.c = averagesListItem;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Activity activity2 = activity;
        Intrinsics.checkParameterIsNotNull(activity2, "$receiver");
        if (!(this.c instanceof AveragesListItem.Average)) {
            return null;
        }
        Intent intent = new Intent(activity2, SubjectDetailActivity.class);
        ExtensionsKt.a(intent, new SubjectParameters(((AveragesListItem.Average) this.c).g(), (Evaluation.Type) null, (Calendar) null, (String) null, (String) null, ((AveragesListItem.Average) this.c).b(), ((AveragesListItem.Average) this.c).c(), ((AveragesListItem.Average) this.c).h(), (String) null, ((AveragesListItem.Average) this.c).d(), ((AveragesListItem.Average) this.c).f(), ((AveragesListItem.Average) this.c).e(), 282, (DefaultConstructorMarker) null));
        return intent;
    }
}
