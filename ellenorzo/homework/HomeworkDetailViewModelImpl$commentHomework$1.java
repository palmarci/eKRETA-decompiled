package p289hu.ekreta.ellenorzo.homework;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$commentHomework$1 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$commentHomework$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkDetailViewModelImpl f13485c;

    public HomeworkDetailViewModelImpl$commentHomework$1(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        this.f13485c = homeworkDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intent a = C0082a.m88a(activity, "$receiver", activity, HomeworkCommentFormActivity.class);
        Homework P1 = this.f13485c.mo12954P1();
        if (P1 == null) {
            Intrinsics.throwNpe();
        }
        ExtensionsKt.m14648a(a, Long.valueOf(Long.parseLong(P1.mo11316d())));
        return a;
    }
}
