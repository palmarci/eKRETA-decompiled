package p289hu.ekreta.ellenorzo.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3825s;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0007*\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005¢\u0006\u0002\b\u00060\u0003j\u0002`\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "kotlin.jvm.PlatformType", "onChanged"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$observeAndRunUiCommands$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$observeAndRunUiCommands$1<T> implements C3825s<Function1<? super C3737d, ? extends Unit>> {

    /* renamed from: a */
    public final /* synthetic */ Function0 f15345a;

    public ExtensionsKt$observeAndRunUiCommands$1(Function0 function0) {
        this.f15345a = function0;
    }

    /* renamed from: a */
    public final void onChanged(Function1<? super C3737d, Unit> function1) {
        if (function1 != null) {
            Unit unit = (Unit) function1.invoke(this.f15345a.invoke());
        }
    }
}
