package p289hu.ekreta.ellenorzo.util.binding;

import android.widget.AutoCompleteTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/binding/AutoCompleteTextViewBindings;", "", "()V", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings */
/* compiled from: AutoCompleteTextViewBindings.kt */
public final class AutoCompleteTextViewBindings {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007J\u0016\u0010\t\u001a\u00020\u0004*\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/binding/AutoCompleteTextViewBindings$Companion;", "", "()V", "setEntries", "", "Landroid/widget/AutoCompleteTextView;", "entries", "", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "setItemSelectedListener", "itemSelectedListener", "Lhu/ekreta/ellenorzo/util/binding/ItemSelectedListener;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings$Companion */
    /* compiled from: AutoCompleteTextViewBindings.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo16304a(AutoCompleteTextView autoCompleteTextView, List<TmgiCaseType> list) {
            Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "$this$setEntries");
            AutoCompleteTextViewExtensions.INSTANCE.mo16306a(autoCompleteTextView, list);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo16303a(AutoCompleteTextView autoCompleteTextView, ItemSelectedListener itemSelectedListener) {
            Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "$this$setItemSelectedListener");
            AutoCompleteTextViewExtensions.INSTANCE.mo16305a(autoCompleteTextView, itemSelectedListener);
        }
    }
}
