package hu.ekreta.ellenorzo.util.viewmodel;

import h.m.d.d;
import h.p.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u00060\u0001J%\u0010\u0007\u001a\u00020\u00042\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006H\u0016J%\u0010\t\u001a\u00020\u00042\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006H\u0016¨\u0006\n"}, d2 = {"hu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource$uiCommand$1", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "postValue", "value", "setValue", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: UiCommand.kt */
public final class ExecuteOnceUiCommandSource$uiCommand$1 extends r<Function1<? super d, ? extends Unit>> {
    /* renamed from: a */
    public void postValue(Function1<? super d, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "value");
        Intrinsics.checkParameterIsNotNull(function1, "command");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        super.postValue(new UiCommandKt$once$1(booleanRef, function1));
    }

    /* renamed from: b */
    public void setValue(Function1<? super d, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "value");
        Intrinsics.checkParameterIsNotNull(function1, "command");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        super.setValue(new UiCommandKt$once$1(booleanRef, function1));
    }
}
