package p289hu.ekreta.ellenorzo.util.binding;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\b\u001a\u00020\u0004*\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/binding/AutoCompleteTextViewExtensions;", "", "()V", "setAutoCompleteTextViewItemSelectedListener", "", "Landroid/widget/AutoCompleteTextView;", "listener", "Lhu/ekreta/ellenorzo/util/binding/ItemSelectedListener;", "setDropDownListElements", "entries", "", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewExtensions */
/* compiled from: AutoCompleteTextViewBindings.kt */
public final class AutoCompleteTextViewExtensions {
    public static final AutoCompleteTextViewExtensions INSTANCE = new AutoCompleteTextViewExtensions();

    /* renamed from: a */
    public final void mo16306a(AutoCompleteTextView autoCompleteTextView, List<TmgiCaseType> list) {
        Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "$this$setDropDownListElements");
        if (list != null) {
            Context context = autoCompleteTextView.getContext();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (TmgiCaseType f : list) {
                arrayList.add(f.mo11921f());
            }
            autoCompleteTextView.setAdapter(new ArrayAdapter(context, 17367050, arrayList));
        }
    }

    /* renamed from: a */
    public final void mo16305a(AutoCompleteTextView autoCompleteTextView, ItemSelectedListener itemSelectedListener) {
        Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "$this$setAutoCompleteTextViewItemSelectedListener");
        if (itemSelectedListener == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemClickListener(new C4430x73738935(itemSelectedListener));
        }
    }
}
