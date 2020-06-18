package hu.ekreta.ellenorzo.file;

import java.io.File;
import k.b.p;
import kotlin.Metadata;
import n.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
/* compiled from: FileAdapterImpl.kt */
public final class FileAdapterImplKt$save$1<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f5593a;
    public final /* synthetic */ FileAdapter b;
    public final /* synthetic */ File c;

    public FileAdapterImplKt$save$1(w wVar, FileAdapter fileAdapter, File file) {
        this.f5593a = wVar;
        this.b = fileAdapter;
        this.c = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(k.b.o<java.io.File> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "emitter"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            n.w r0 = r5.f5593a
            r1 = 0
            hu.ekreta.ellenorzo.file.FileAdapter r2 = r5.b     // Catch:{ Exception -> 0x002c }
            java.io.File r3 = r5.c     // Catch:{ Exception -> 0x002c }
            n.v r2 = r2.a(r3)     // Catch:{ Exception -> 0x002c }
            n.g r2 = n.o.a((n.v) r2)     // Catch:{ Exception -> 0x002c }
            r2.a((n.w) r0)     // Catch:{ all -> 0x0023 }
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ Exception -> 0x002c }
            java.io.File r2 = r5.c     // Catch:{ Exception -> 0x002c }
            r6.a(r2)     // Catch:{ Exception -> 0x002c }
            r6.a()     // Catch:{ Exception -> 0x002c }
            goto L_0x0030
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch:{ Exception -> 0x002c }
            throw r4     // Catch:{ Exception -> 0x002c }
        L_0x002a:
            r6 = move-exception
            goto L_0x0036
        L_0x002c:
            r2 = move-exception
            r6.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x002a }
        L_0x0030:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002a }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L_0x0036:
            throw r6     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.file.FileAdapterImplKt$save$1.a(k.b.o):void");
    }
}
