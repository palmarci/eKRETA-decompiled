package p289hu.ekreta.ellenorzo.cases.decision;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.exception.MessageThrowable;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$send$1 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$send$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ DecisionDetailViewModelImpl f11419c;

    public DecisionDetailViewModelImpl$send$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.f11419c = decisionDetailViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<Boolean> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        if (this.f11419c.mo11743Q1().isEmpty()) {
            return C5027n.m16896b((Throwable) new MessageThrowable(C4014R.string.attachment_is_mandatory_error_message_text));
        }
        return this.f11419c.mo16365a(Integer.valueOf(C4014R.string.attention), Integer.valueOf(C4014R.string.Send_case_to_web_confirmation_text), Integer.valueOf(C4014R.string.Alert_ButtonOk_Text), Integer.valueOf(C4014R.string.Confirm_Cancel_Text)).mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl$send$1 f11420c;

            {
                this.f11420c = r1;
            }

            /* renamed from: a */
            public final C5027n<Boolean> apply(Integer num) {
                Intrinsics.checkParameterIsNotNull(num, "buttonClickedId");
                if (num.intValue() != -1) {
                    return C5027n.m16898d(Boolean.valueOf(false));
                }
                this.f11420c.f11419c.mo11748d(true);
                CaseTypeRepository access$getCaseTypeRepository$p = this.f11420c.f11419c.f11383L;
                Profile profile = profile;
                Intrinsics.checkExpressionValueIsNotNull(profile, Param.PROFILE);
                return access$getCaseTypeRepository$p.mo11858a(profile).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C40711 f11422c;

                    {
                        this.f11422c = r1;
                    }

                    /* renamed from: a */
                    public final C5027n<Boolean> apply(List<CaseType> list) {
                        Intrinsics.checkParameterIsNotNull(list, "it");
                        for (CaseType caseType : list) {
                            if (Intrinsics.areEqual((Object) caseType.mo11928h().mo11930a(), (Object) StringsKt__StringsKt.substringBefore$default(this.f11422c.f11420c.f11419c.mo11738o(), ' ', (String) null, 2, (Object) null))) {
                                DecisionRepository access$getDecisionRepository$p = this.f11422c.f11420c.f11419c.f11382K;
                                Profile profile = profile;
                                Intrinsics.checkExpressionValueIsNotNull(profile, Param.PROFILE);
                                CaseDetailParameter P1 = this.f11422c.f11420c.f11419c.mo11742P1();
                                if (P1 == null) {
                                    Intrinsics.throwNpe();
                                }
                                return access$getDecisionRepository$p.mo11862a(profile, new DecisionDetailPost(P1.mo11698d(), caseType.mo11928h().mo11930a(), caseType, this.f11422c.f11420c.f11419c.mo11743Q1())).mo17246g(C40731.INSTANCE);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                });
            }
        }).mo17214a(C5041a.m16999a());
    }
}
