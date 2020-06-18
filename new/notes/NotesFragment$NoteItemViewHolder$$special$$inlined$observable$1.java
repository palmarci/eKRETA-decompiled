package hu.ekreta.ellenorzo.notes;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.notes.NotesFragment;
import hu.ekreta.ellenorzo.notes.NotesViewModel;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<NotesViewModel.ListItem> {
    public final /* synthetic */ NotesFragment.NoteItemViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, NotesFragment.NoteItemViewHolder noteItemViewHolder) {
        super(obj2);
        this.c = noteItemViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, NotesViewModel.ListItem listItem, NotesViewModel.ListItem listItem2) {
        Note a2;
        int i2;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        NotesViewModel.ListItem listItem3 = listItem2;
        NotesViewModel.ListItem listItem4 = listItem;
        if (!(listItem3 instanceof NotesViewModel.ListItem.Note)) {
            listItem3 = null;
        }
        NotesViewModel.ListItem.Note note = (NotesViewModel.ListItem.Note) listItem3;
        if (note != null && (a2 = note.a()) != null) {
            String n2 = a2.n();
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.titleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.titleLabel");
            textView.setText(n2);
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.icon);
            if (n2.equals("Házi feladat hiány")) {
                i2 = R.drawable.ic_lack_of_homework_40dp;
            } else if (n2.equals("Felszereléshiány")) {
                i2 = R.drawable.ic_lack_of_equipment_40dp;
            } else if (StringsKt__StringsKt.contains((CharSequence) n2, (CharSequence) "mentesség", true)) {
                i2 = R.drawable.ic_felmentes_40dp;
            } else {
                i2 = StringsKt__StringsKt.contains((CharSequence) n2, (CharSequence) "dicséret", true) ? R.drawable.ic_praise_40dp : R.drawable.ic_note_40dp;
            }
            appCompatImageView.setImageResource(i2);
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(R.id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.detailLabel");
            ExtensionsKt.b(textView2, a2.f());
            View view4 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView3 = (TextView) view4.findViewById(R.id.dateLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.dateLabel");
            textView3.setText(UtilsKt.e(a2.j()));
        }
    }
}
