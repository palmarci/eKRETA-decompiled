package hu.ekreta.ellenorzo.cases.decision;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.exception.MessageThrowable;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import java.util.NoSuchElementException;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$send$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ DecisionDetailViewModelImpl c;

    public DecisionDetailViewModelImpl$send$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.c = decisionDetailViewModelImpl;
    }

    /* renamed from: a */
    public final n<Boolean> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        if (this.c.a2().isEmpty()) {
            return n.b((Throwable) new MessageThrowable(R.string.attachment_is_mandatory_error_message_text));
        }
        return this.c.a(Integer.valueOf(R.string.attention), Integer.valueOf(R.string.Send_case_to_web_confirmation_text), Integer.valueOf(R.string.Alert_ButtonOk_Text), Integer.valueOf(R.string.Confirm_Cancel_Text)).d(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ DecisionDetailViewModelImpl$send$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Boolean> apply(Integer num) {
                Intrinsics.checkParameterIsNotNull(num, "buttonClickedId");
                if (num.intValue() != -1) {
                    return n.d(false);
                }
                this.c.c.e(true);
                CaseTypeRepository access$getCaseTypeRepository$p = this.c.c.M;
                Profile profile = profile;
                Intrinsics.checkExpressionValueIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                return access$getCaseTypeRepository$p.a(profile).c(new h<T, q<? extends R>>(this) {
                    public final /* synthetic */ AnonymousClass1 c;

                    {
                        this.c = r1;
                    }

                    /* renamed from: a */
                    public final n<Boolean> apply(List<CaseType> list) {
                        Intrinsics.checkParameterIsNotNull(list, "it");
                        for (CaseType caseType : list) {
                            if (Intrinsics.areEqual((Object) caseType.h().a(), (Object) StringsKt__StringsKt.substringBefore$default(this.c.c.c.o(), ' ', (String) null, 2, (Object) null))) {
                                DecisionRepository access$getDecisionRepository$p = this.c.c.c.L;
                                Profile profile = profile;
                                Intrinsics.checkExpressionValueIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                                CaseDetailParameter Z1 = this.c.c.c.Z1();
                                if (Z1 == null) {
                                    Intrinsics.throwNpe();
                                }
                                return access$getDecisionRepository$p.a(profile, new DecisionDetailPost(Z1.d(), caseType.h().a(), caseType, this.c.c.c.a2())).g(AnonymousClass1.INSTANCE);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                });
            }
        }).a(a.a());
    }
}
