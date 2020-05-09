package p289hu.ekreta.ellenorzo.util;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p300k.p340c.C5179y;
import p300k.p340c.C5179y.C5180a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "R", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$executeTransaction$1$task$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$executeTransaction$1$task$1 implements C5180a {

    /* renamed from: a */
    public final /* synthetic */ ExtensionsKt$executeTransaction$1 f15338a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f15339b;

    public ExtensionsKt$executeTransaction$1$task$1(ExtensionsKt$executeTransaction$1 extensionsKt$executeTransaction$1, AtomicReference atomicReference) {
        this.f15338a = extensionsKt$executeTransaction$1;
        this.f15339b = atomicReference;
    }

    /* renamed from: a */
    public final void mo16270a(C5179y yVar) {
        AtomicReference atomicReference = this.f15339b;
        Function1 function1 = this.f15338a.f15336b;
        Intrinsics.checkExpressionValueIsNotNull(yVar, "it");
        atomicReference.set(function1.invoke(yVar));
    }
}
