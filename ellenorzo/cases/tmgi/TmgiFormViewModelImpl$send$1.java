package p289hu.ekreta.ellenorzo.cases.tmgi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.exception.MessageThrowable;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl$send$1 */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$send$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ TmgiFormViewModelImpl f11762c;

    public TmgiFormViewModelImpl$send$1(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        this.f11762c = tmgiFormViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<Boolean> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        if (this.f11762c.mo12153f1() && this.f11762c.mo12167S1().isEmpty()) {
            return C5027n.m16896b((Throwable) new MessageThrowable(C4014R.string.Case_tried_to_upload_without_mandatory_attachment));
        }
        return this.f11762c.mo16365a(Integer.valueOf(C4014R.string.attention), Integer.valueOf(C4014R.string.Send_case_to_web_confirmation_text), Integer.valueOf(C4014R.string.Alert_ButtonOk_Text), Integer.valueOf(C4014R.string.Confirm_Cancel_Text)).mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ TmgiFormViewModelImpl$send$1 f11763c;

            {
                this.f11763c = r1;
            }

            /* renamed from: a */
            public final C5027n<Boolean> apply(Integer num) {
                Intrinsics.checkParameterIsNotNull(num, "it");
                if (num.intValue() != -1) {
                    return C5027n.m16898d(Boolean.valueOf(false));
                }
                this.f11763c.f11762c.mo12181e(true);
                TmgiRepository access$getTmgiRepository$p = this.f11763c.f11762c.f11721I;
                Profile profile = profile;
                Intrinsics.checkExpressionValueIsNotNull(profile, Param.PROFILE);
                return access$getTmgiRepository$p.mo12214a(profile, TmgiFormViewModelImpl.access$createTmgiFormPostWitActualData(this.f11763c.f11762c)).mo17246g(C40941.INSTANCE);
            }
        });
    }
}
