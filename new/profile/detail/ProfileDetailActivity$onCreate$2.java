package hu.ekreta.ellenorzo.profile.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailActivity$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDetailActivity.kt */
public final class ProfileDetailActivity$onCreate$2 extends Lambda implements Function2<ViewGroup, Integer, ProfileDetailActivity.ViewHolder> {
    public static final ProfileDetailActivity$onCreate$2 INSTANCE = new ProfileDetailActivity$onCreate$2();

    public ProfileDetailActivity$onCreate$2() {
        super(2);
    }

    public final ProfileDetailActivity.ViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tutor_details, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…r_details, parent, false)");
        return new ProfileDetailActivity.ViewHolder(inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
