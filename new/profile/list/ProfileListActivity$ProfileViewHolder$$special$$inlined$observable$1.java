package hu.ekreta.ellenorzo.profile.list;

import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.list.ProfileListActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class ProfileListActivity$ProfileViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Profile> {
    public final /* synthetic */ ProfileListActivity.ProfileViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileListActivity$ProfileViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ProfileListActivity.ProfileViewHolder profileViewHolder) {
        super(obj2);
        this.c = profileViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, Profile profile, Profile profile2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Profile profile3 = profile2;
        Profile profile4 = profile;
        if (profile3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.tvStudentName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tvStudentName");
            textView.setText(profile3.z());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.tvFullName);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tvFullName");
            textView2.setVisibility(profile3.v() == SupportedRole.Guardian ? 0 : 8);
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.tvFullName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.tvFullName");
            textView3.setText('(' + profile3.l() + ')');
            View view4 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView4 = (TextView) view4.findViewById(R.id.tvInstitute);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.tvInstitute");
            textView4.setText(profile3.o());
            this.c.a(false);
        }
    }
}
