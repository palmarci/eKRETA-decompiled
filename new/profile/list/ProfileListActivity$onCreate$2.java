package hu.ekreta.ellenorzo.profile.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.profile.list.ProfileListActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity$ProfileViewHolder;", "Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileListActivity.kt */
public final class ProfileListActivity$onCreate$2 extends Lambda implements Function2<ViewGroup, Integer, ProfileListActivity.ProfileViewHolder> {
    public final /* synthetic */ ProfileListActivity c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileListActivity$onCreate$2(ProfileListActivity profileListActivity) {
        super(2);
        this.c = profileListActivity;
    }

    public final ProfileListActivity.ProfileViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        ProfileListActivity profileListActivity = this.c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profile_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…file_item, parent, false)");
        return new ProfileListActivity.ProfileViewHolder(profileListActivity, inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
