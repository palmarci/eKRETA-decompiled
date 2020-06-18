package hu.ekreta.ellenorzo.util;

import h.m.d.d;
import h.p.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0007*\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005¢\u0006\u0002\b\u00060\u0003j\u0002`\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$observeAndRunUiCommands$1<T> implements s<Function1<? super d, ? extends Unit>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f6288a;

    public ExtensionsKt$observeAndRunUiCommands$1(Function0 function0) {
        this.f6288a = function0;
    }

    /* renamed from: a */
    public final void onChanged(Function1<? super d, Unit> function1) {
        if (function1 != null) {
            Unit invoke = function1.invoke(this.f6288a.invoke());
        }
    }
}
