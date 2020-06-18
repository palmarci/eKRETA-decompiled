package hu.ekreta.ellenorzo.cases.tmgi;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.exception.MessageThrowable;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$send$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ TmgiFormViewModelImpl c;

    public TmgiFormViewModelImpl$send$1(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        this.c = tmgiFormViewModelImpl;
    }

    /* renamed from: a */
    public final n<Boolean> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        if (this.c.m1() && this.c.c2().isEmpty()) {
            return n.b((Throwable) new MessageThrowable(R.string.Case_tried_to_upload_without_mandatory_attachment));
        }
        return this.c.a(Integer.valueOf(R.string.attention), Integer.valueOf(R.string.Send_case_to_web_confirmation_text), Integer.valueOf(R.string.Alert_ButtonOk_Text), Integer.valueOf(R.string.Confirm_Cancel_Text)).d(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ TmgiFormViewModelImpl$send$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Boolean> apply(Integer num) {
                Intrinsics.checkParameterIsNotNull(num, "it");
                if (num.intValue() != -1) {
                    return n.d(false);
                }
                this.c.c.f(true);
                TmgiRepository access$getTmgiRepository$p = this.c.c.J;
                Profile profile = profile;
                Intrinsics.checkExpressionValueIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                return access$getTmgiRepository$p.a(profile, TmgiFormViewModelImpl.access$createTmgiFormPostWitActualData(this.c.c)).g(AnonymousClass1.INSTANCE);
            }
        });
    }
}
