package p289hu.ekreta.ellenorzo.profile.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.profile.list.ProfileListActivity.ProfileViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity$ProfileViewHolder;", "Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListActivity$onCreate$2 */
/* compiled from: ProfileListActivity.kt */
public final class ProfileListActivity$onCreate$2 extends Lambda implements Function2<ViewGroup, Integer, ProfileViewHolder> {

    /* renamed from: c */
    public final /* synthetic */ ProfileListActivity f14607c;

    public ProfileListActivity$onCreate$2(ProfileListActivity profileListActivity) {
        this.f14607c = profileListActivity;
        super(2);
    }

    /* renamed from: a */
    public final ProfileViewHolder mo14252a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        ProfileListActivity profileListActivity = this.f14607c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4014R.layout.profile_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…file_item, parent, false)");
        return new ProfileViewHolder(profileListActivity, inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo14252a(viewGroup);
    }
}
