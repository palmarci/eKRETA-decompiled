package hu.ekreta.ellenorzo.util;

import java.util.concurrent.atomic.AtomicReference;
import k.b.o;
import k.c.y;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "R", "onSuccess"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$executeTransaction$1$task$2 implements y.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f6286a;
    public final /* synthetic */ AtomicReference b;

    public ExtensionsKt$executeTransaction$1$task$2(o oVar, AtomicReference atomicReference) {
        this.f6286a = oVar;
        this.b = atomicReference;
    }

    public final void a() {
        this.f6286a.a(this.b.get());
        this.f6286a.a();
    }
}
