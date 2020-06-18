package hu.ekreta.ellenorzo.notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentNotesBinding;
import hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import hu.ekreta.ellenorzo.notes.NotesViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NotesFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/notes/NotesViewModel;)V", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "NoteItemViewHolder", "SectionHeaderViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotesFragment.kt */
public final class NotesFragment extends c implements MainBackNavigationTarget {
    public NotesViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NotesFragment$NoteItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/notes/NotesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NotesFragment.kt */
    public final class NoteItemViewHolder extends MVVMViewHolder<NotesViewModel.ListItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoteItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;"))};
        public final ReadWriteProperty w = new NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ NotesFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoteItemViewHolder(hu.ekreta.ellenorzo.notes.NotesFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r1.x = r2
                r0 = 2131427505(0x7f0b00b1, float:1.8476628E38)
                android.view.View r2 = hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((androidx.fragment.app.Fragment) r2, (android.view.ViewGroup) r3, (int) r0)
                java.lang.String r3 = "inflate(parent, R.layout.note_item)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                android.view.View r2 = r1.c
                hu.ekreta.ellenorzo.notes.NotesFragment$NoteItemViewHolder$1 r3 = new hu.ekreta.ellenorzo.notes.NotesFragment$NoteItemViewHolder$1
                r3.<init>(r1)
                r2.setOnClickListener(r3)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.notes.NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.notes.NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notes.NotesFragment.NoteItemViewHolder.<init>(hu.ekreta.ellenorzo.notes.NotesFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(NotesViewModel.ListItem listItem) {
            this.w.setValue(this, y[0], listItem);
        }

        public NotesViewModel.ListItem getModel() {
            return (NotesViewModel.ListItem) this.w.getValue(this, y[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NotesFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/notes/NotesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NotesFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<NotesViewModel.ListItem> {
        public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;"))};
        public final ReadWriteProperty w = new NotesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SectionHeaderViewHolder(hu.ekreta.ellenorzo.notes.NotesFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r0 = 2131427526(0x7f0b00c6, float:1.847667E38)
                android.view.View r2 = hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((androidx.fragment.app.Fragment) r2, (android.view.ViewGroup) r3, (int) r0)
                java.lang.String r3 = "inflate(parent, R.layout.section_header)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.notes.NotesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.notes.NotesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notes.NotesFragment.SectionHeaderViewHolder.<init>(hu.ekreta.ellenorzo.notes.NotesFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(NotesViewModel.ListItem listItem) {
            this.w.setValue(this, x[0], listItem);
        }

        public NotesViewModel.ListItem getModel() {
            return (NotesViewModel.ListItem) this.w.getValue(this, x[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final NotesViewModel C0() {
        NotesViewModel notesViewModel = this.a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return notesViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentNotesBinding a2 = FragmentNotesBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        NotesViewModel notesViewModel = this.a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(notesViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        NotesViewModel notesViewModel = this.a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, notesViewModel.getUiCommand());
    }

    public int e() {
        return 5;
    }

    public View e(int i2) {
        if (this.b0 == null) {
            this.b0 = new HashMap();
        }
        View view = (View) this.b0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View H = H();
        if (H == null) {
            return null;
        }
        View findViewById = H.findViewById(i2);
        this.b0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }

    public void a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        NotesFragment$onViewCreated$adapter$1 notesFragment$onViewCreated$adapter$1 = new NotesFragment$onViewCreated$adapter$1(this, new NotesFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) e(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        NotesViewModel notesViewModel = this.a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, notesViewModel.getItems(), notesFragment$onViewCreated$adapter$1);
    }
}
