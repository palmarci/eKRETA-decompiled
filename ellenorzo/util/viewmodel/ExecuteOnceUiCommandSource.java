package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R/\u0010\u0003\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0002\b\t0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "()V", "uiCommand", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "getUiCommand", "()Landroidx/lifecycle/MutableLiveData;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource */
/* compiled from: UiCommand.kt */
public final class ExecuteOnceUiCommandSource implements UiCommandSource {

    /* renamed from: c */
    public final C3824r<Function1<C3737d, Unit>> f15467c = new ExecuteOnceUiCommandSource$uiCommand$1();

    public C3824r<Function1<C3737d, Unit>> getUiCommand() {
        return this.f15467c;
    }
}
