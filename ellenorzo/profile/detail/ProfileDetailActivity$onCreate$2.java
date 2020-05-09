package p289hu.ekreta.ellenorzo.profile.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity.ViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailActivity$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity$onCreate$2 */
/* compiled from: ProfileDetailActivity.kt */
public final class ProfileDetailActivity$onCreate$2 extends Lambda implements Function2<ViewGroup, Integer, ViewHolder> {
    public static final ProfileDetailActivity$onCreate$2 INSTANCE = new ProfileDetailActivity$onCreate$2();

    public ProfileDetailActivity$onCreate$2() {
        super(2);
    }

    /* renamed from: a */
    public final ViewHolder mo14220a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4014R.layout.item_tutor_details, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…r_details, parent, false)");
        return new ViewHolder(inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo14220a(viewGroup);
    }
}
