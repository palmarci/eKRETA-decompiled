package hu.ekreta.ellenorzo.homework;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$commentHomework$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ HomeworkDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailViewModelImpl$commentHomework$1(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        super(1);
        this.c = homeworkDetailViewModelImpl;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intent a2 = a.a(activity, "$receiver", activity, HomeworkCommentFormActivity.class);
        Homework Z1 = this.c.Z1();
        if (Z1 == null) {
            Intrinsics.throwNpe();
        }
        ExtensionsKt.a(a2, Long.valueOf(Long.parseLong(Z1.d())));
        return a2;
    }
}
