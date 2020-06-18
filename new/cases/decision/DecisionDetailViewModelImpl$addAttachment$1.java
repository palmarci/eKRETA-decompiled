package hu.ekreta.ellenorzo.cases.decision;

import android.net.Uri;
import h.m.d.d;
import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import hu.ekreta.ellenorzo.attachment.AttachmentType;
import hu.ekreta.ellenorzo.attachment.ViewModelExtensionsKt;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentPurpose;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import k.b.b0.h;
import k.b.f0.b;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$addAttachment$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ DecisionDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecisionDetailViewModelImpl$addAttachment$1(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        super(1);
        this.c = decisionDetailViewModelImpl;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        n<R> d2 = this.c.I.a(dVar).d(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ DecisionDetailViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Attachment> apply(final Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                return this.c.c.G.b().c(new h<T, q<? extends R>>(this) {
                    public final /* synthetic */ AnonymousClass1 c;

                    {
                        this.c = r1;
                    }

                    /* renamed from: a */
                    public final n<Attachment> apply(final Profile profile) {
                        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                        this.c.c.c.e(true);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.c.c.c.F.getString(R.string.Rectification_title));
                        sb.append('_');
                        Uri uri = uri;
                        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                        sb.append(ExtensionsKt.a(uri, this.c.c.c.J));
                        final String sb2 = sb.toString();
                        DecisionDetailViewModelImpl decisionDetailViewModelImpl = this.c.c.c;
                        InputStream openInputStream = decisionDetailViewModelImpl.J.openInputStream(uri);
                        return ViewModelExtensionsKt.uploadAttachment$default(decisionDetailViewModelImpl, profile, sb2, openInputStream != null ? ByteStreamsKt.readBytes(openInputStream) : null, this.c.c.c.K, (AttachmentPurpose) null, 16, (Object) null).g(new h<T, R>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final Attachment apply(TemporaryFile temporaryFile) {
                                Intrinsics.checkParameterIsNotNull(temporaryFile, "tempFile");
                                Map access$getLocalFiles$p = this.c.c.c.c.E;
                                String a2 = temporaryFile.a();
                                Uri uri = uri;
                                Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
                                access$getLocalFiles$p.put(a2, uri);
                                return new Attachment(0, sb2, temporaryFile.a(), (AttachmentType) null, (AttachmentDownloadState) null, profile.m(), (String) null, (String) null, 216, (DefaultConstructorMarker) null);
                            }
                        });
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(d2, "attachmentService.choose…          }\n            }");
        b.a(d2, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ DecisionDetailViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                this.c.c.e(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<Attachment, Unit>(this) {
            public final /* synthetic */ DecisionDetailViewModelImpl$addAttachment$1 c;

            {
                this.c = r1;
            }

            public final void a(Attachment attachment) {
                ExtensionsKt.a(this.c.c.getItems(), CollectionsKt__CollectionsJVMKt.listOf(attachment));
                this.c.c.d(true);
                List<OtherThingsToDoAttachment> a2 = this.c.c.a2();
                Intrinsics.checkExpressionValueIsNotNull(attachment, "attachment");
                a2.add(v.b(attachment));
                this.c.c.e(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Attachment) obj);
                return Unit.INSTANCE;
            }
        }, 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
