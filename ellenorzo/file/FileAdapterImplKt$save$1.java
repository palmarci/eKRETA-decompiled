package p289hu.ekreta.ellenorzo.file;

import java.io.File;
import kotlin.Metadata;
import p300k.p313b.C5029p;
import p364n.C5612w;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "subscribe"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.file.FileAdapterImplKt$save$1 */
/* compiled from: FileAdapterImpl.kt */
public final class FileAdapterImplKt$save$1<T> implements C5029p<T> {

    /* renamed from: a */
    public final /* synthetic */ C5612w f13283a;

    /* renamed from: b */
    public final /* synthetic */ FileAdapter f13284b;

    /* renamed from: c */
    public final /* synthetic */ File f13285c;

    public FileAdapterImplKt$save$1(C5612w wVar, FileAdapter fileAdapter, File file) {
        this.f13283a = wVar;
        this.f13284b = fileAdapter;
        this.f13285c = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        kotlin.p349io.CloseableKt.closeFinally(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        kotlin.p349io.CloseableKt.closeFinally(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12747a(p300k.p313b.C5028o<java.io.File> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "emitter"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            n.w r0 = r5.f13283a
            r1 = 0
            hu.ekreta.ellenorzo.file.FileAdapter r2 = r5.f13284b     // Catch:{ Exception -> 0x002c }
            java.io.File r3 = r5.f13285c     // Catch:{ Exception -> 0x002c }
            n.v r2 = r2.mo12746a(r3)     // Catch:{ Exception -> 0x002c }
            n.g r2 = p364n.C5601o.m18485a(r2)     // Catch:{ Exception -> 0x002c }
            r2.mo21900a(r0)     // Catch:{ all -> 0x0023 }
            kotlin.p349io.CloseableKt.closeFinally(r2, r1)     // Catch:{ Exception -> 0x002c }
            java.io.File r2 = r5.f13285c     // Catch:{ Exception -> 0x002c }
            r6.mo17031a(r2)     // Catch:{ Exception -> 0x002c }
            r6.mo17068a()     // Catch:{ Exception -> 0x002c }
            goto L_0x0030
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r4 = move-exception
            kotlin.p349io.CloseableKt.closeFinally(r2, r3)     // Catch:{ Exception -> 0x002c }
            throw r4     // Catch:{ Exception -> 0x002c }
        L_0x002a:
            r6 = move-exception
            goto L_0x0036
        L_0x002c:
            r2 = move-exception
            r6.mo17021a(r2)     // Catch:{ all -> 0x002a }
        L_0x0030:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002a }
            kotlin.p349io.CloseableKt.closeFinally(r0, r1)
            return
        L_0x0036:
            throw r6     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            kotlin.p349io.CloseableKt.closeFinally(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.file.FileAdapterImplKt$save$1.mo12747a(k.b.o):void");
    }
}
