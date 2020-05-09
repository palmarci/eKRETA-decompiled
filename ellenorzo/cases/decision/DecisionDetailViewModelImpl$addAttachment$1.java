package p289hu.ekreta.ellenorzo.cases.decision;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p349io.ByteStreamsKt;
import p211h.p262m.p263d.C3737d;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$addAttachment$1 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$addAttachment$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ DecisionDetailViewModelImpl f11406c;

    public DecisionDetailViewModelImpl$addAttachment$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.f11406c = decisionDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo11763a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        C5027n d = this.f11406c.f11379H.mo11456a(dVar).mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl$addAttachment$1 f11407c;

            {
                this.f11407c = r1;
            }

            /* renamed from: a */
            public final C5027n<Attachment> apply(final Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                return this.f11407c.f11406c.f11377F.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C40651 f11408c;

                    {
                        this.f11408c = r1;
                    }

                    /* renamed from: a */
                    public final C5027n<Attachment> apply(final Profile profile) {
                        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                        this.f11408c.f11407c.f11406c.mo11748d(true);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f11408c.f11407c.f11406c.f11376E.getString(C4014R.string.Rectification_title));
                        sb.append('_');
                        Uri uri = uri;
                        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                        sb.append(ExtensionsKt.m14628a(uri, this.f11408c.f11407c.f11406c.f11380I));
                        final String sb2 = sb.toString();
                        DecisionDetailViewModelImpl decisionDetailViewModelImpl = this.f11408c.f11407c.f11406c;
                        InputStream openInputStream = decisionDetailViewModelImpl.f11380I.openInputStream(uri);
                        return C3984v.m10197a((AuthenticatedViewModel) decisionDetailViewModelImpl, profile, sb2, openInputStream != null ? ByteStreamsKt.readBytes(openInputStream) : null, this.f11408c.f11407c.f11406c.f11381J).mo17246g(new C4675h<T, R>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C40661 f11410c;

                            {
                                this.f11410c = r1;
                            }

                            /* renamed from: a */
                            public final Attachment apply(String str) {
                                Intrinsics.checkParameterIsNotNull(str, "tempUid");
                                Map access$getLocalFiles$p = this.f11410c.f11408c.f11407c.f11406c.f11375D;
                                Uri uri = uri;
                                Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                                access$getLocalFiles$p.put(str, uri);
                                Attachment attachment = new Attachment(0, sb2, str, null, null, profile.mo14054m(), 24, null);
                                return attachment;
                            }
                        });
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(d, "attachmentService.choose…          }\n            }");
        C4998b.m16842a(d, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl$addAttachment$1 f11414c;

            {
                this.f11414c = r1;
            }

            /* renamed from: a */
            public final void mo11768a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                this.f11414c.f11406c.mo11748d(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo11768a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<Attachment, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ DecisionDetailViewModelImpl$addAttachment$1 f11413c;

            {
                this.f11413c = r1;
            }

            /* renamed from: a */
            public final void mo11767a(Attachment attachment) {
                ExtensionsKt.m14659a(this.f11413c.f11406c.getItems(), CollectionsKt__CollectionsJVMKt.listOf(attachment));
                this.f11413c.f11406c.mo11747c(true);
                List Q1 = this.f11413c.f11406c.mo11743Q1();
                Intrinsics.checkExpressionValueIsNotNull(attachment, "attachment");
                Q1.add(C3984v.m10269b(attachment));
                this.f11413c.f11406c.mo11748d(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo11767a((Attachment) obj);
                return Unit.INSTANCE;
            }
        }, 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11763a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
