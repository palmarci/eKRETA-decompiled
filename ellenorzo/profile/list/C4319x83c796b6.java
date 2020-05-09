package p289hu.ekreta.ellenorzo.profile.list;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.list.ProfileListActivity.ProfileViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListActivity$ProfileViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4319x83c796b6 extends ObservableProperty<Profile> {

    /* renamed from: c */
    public final /* synthetic */ ProfileViewHolder f14606c;

    public C4319x83c796b6(Object obj, Object obj2, ProfileViewHolder profileViewHolder) {
        this.f14606c = profileViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Profile profile, Profile profile2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Profile profile3 = profile2;
        Profile profile4 = profile;
        if (profile3 != null) {
            View view = this.f14606c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.tvStudentName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tvStudentName");
            textView.setText(profile3.mo14069z());
            View view2 = this.f14606c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.tvFullName);
            String str2 = "itemView.tvFullName";
            Intrinsics.checkExpressionValueIsNotNull(textView2, str2);
            textView2.setVisibility(profile3.mo14064v() == SupportedRole.Guardian ? 0 : 8);
            View view3 = this.f14606c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.tvFullName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, str2);
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(profile3.mo14053l());
            sb.append(')');
            textView3.setText(sb.toString());
            View view4 = this.f14606c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str);
            TextView textView4 = (TextView) view4.findViewById(C4014R.C4016id.tvInstitute);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.tvInstitute");
            textView4.setText(profile3.mo14056o());
        }
    }
}
