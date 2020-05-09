package p289hu.ekreta.ellenorzo.message;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl$onSelect$1 */
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl$onSelect$1 extends Lambda implements Function0<C5027n<File>> {

    /* renamed from: c */
    public final /* synthetic */ MessageDetailViewModelImpl f13859c;

    /* renamed from: e */
    public final /* synthetic */ Attachment f13860e;

    public MessageDetailViewModelImpl$onSelect$1(MessageDetailViewModelImpl messageDetailViewModelImpl, Attachment attachment) {
        this.f13859c = messageDetailViewModelImpl;
        this.f13860e = attachment;
        super(0);
    }

    public final C5027n<File> invoke() {
        C5027n<File> c = this.f13859c.f13846z.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ MessageDetailViewModelImpl$onSelect$1 f13861c;

            {
                this.f13861c = r1;
            }

            /* renamed from: a */
            public final C5027n<File> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return this.f13861c.f13859c.f13844x.mo11454a(this.f13861c.f13860e, "dokumentumok/uzenetek", profile.mo14042d());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…ccessToken)\n            }");
        return c;
    }
}
