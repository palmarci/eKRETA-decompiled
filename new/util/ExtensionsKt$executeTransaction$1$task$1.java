package hu.ekreta.ellenorzo.util;

import java.util.concurrent.atomic.AtomicReference;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "R", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$executeTransaction$1$task$1 implements y.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtensionsKt$executeTransaction$1 f6285a;
    public final /* synthetic */ AtomicReference b;

    public ExtensionsKt$executeTransaction$1$task$1(ExtensionsKt$executeTransaction$1 extensionsKt$executeTransaction$1, AtomicReference atomicReference) {
        this.f6285a = extensionsKt$executeTransaction$1;
        this.b = atomicReference;
    }

    public final void a(y yVar) {
        AtomicReference atomicReference = this.b;
        Function1 function1 = this.f6285a.b;
        Intrinsics.checkExpressionValueIsNotNull(yVar, "it");
        atomicReference.set(function1.invoke(yVar));
    }
}
