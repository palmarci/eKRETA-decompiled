package p289hu.ekreta.ellenorzo.notes;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.notes.NotesFragment.NoteItemViewHolder;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<ListItem> {

    /* renamed from: c */
    public final /* synthetic */ NoteItemViewHolder f14098c;

    public NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, NoteItemViewHolder noteItemViewHolder) {
        this.f14098c = noteItemViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, ListItem listItem, ListItem listItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ListItem listItem3 = listItem2;
        ListItem listItem4 = listItem;
        if (!(listItem3 instanceof Note)) {
            listItem3 = null;
        }
        Note note = (Note) listItem3;
        if (note != null) {
            Note a = note.mo13646a();
            if (a != null) {
                String n = a.mo13565n();
                View view = this.f14098c.f7113c;
                String str = "itemView";
                Intrinsics.checkExpressionValueIsNotNull(view, str);
                TextView textView = (TextView) view.findViewById(C4014R.C4016id.titleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.titleLabel");
                textView.setText(n);
                View view2 = this.f14098c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view2, str);
                ImageView imageView = (ImageView) view2.findViewById(C4014R.C4016id.icon);
                int i = n.equals("Házi feladat hiány") ? C4014R.C4015drawable.hf_hiany_icon : n.equals("Felszereléshiány") ? C4014R.C4015drawable.felszereles_hiany : StringsKt__StringsKt.contains((CharSequence) n, (CharSequence) "mentesség", true) ? C4014R.C4015drawable.felmentes_icon : StringsKt__StringsKt.contains((CharSequence) n, (CharSequence) "dicséret", true) ? C4014R.C4015drawable.dicseret_icon : C4014R.C4015drawable.feljegyzes_icon;
                imageView.setImageResource(i);
                View view3 = this.f14098c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view3, str);
                TextView textView2 = (TextView) view3.findViewById(C4014R.C4016id.detailLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.detailLabel");
                ExtensionsKt.m14664b(textView2, a.mo13556f());
                View view4 = this.f14098c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view4, str);
                TextView textView3 = (TextView) view4.findViewById(C4014R.C4016id.dateLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.dateLabel");
                textView3.setText(UtilsKt.m14842e(a.mo13561j()));
            }
        }
    }
}
