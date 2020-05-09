package p289hu.ekreta.ellenorzo.notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentNotesBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001a"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/notes/NotesViewModel;)V", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "NoteItemViewHolder", "SectionHeaderViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesFragment */
/* compiled from: NotesFragment.kt */
public final class NotesFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public NotesViewModel f14090a0;

    /* renamed from: b0 */
    public HashMap f14091b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesFragment$NoteItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/notes/NotesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notes.NotesFragment$NoteItemViewHolder */
    /* compiled from: NotesFragment.kt */
    public final class NoteItemViewHolder extends MVVMViewHolder<ListItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f14092y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoteItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14093w = new NotesFragment$NoteItemViewHolder$$special$$inlined$observable$1(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ NotesFragment f14094x;

        public NoteItemViewHolder(NotesFragment notesFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f14094x = notesFragment;
            View a = ExtensionsKt.m14878a(notesFragment, viewGroup, C4014R.layout.note_item);
            Intrinsics.checkExpressionValueIsNotNull(a, "inflate(parent, R.layout.note_item)");
            super(a);
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ NoteItemViewHolder f14095c;

                {
                    this.f14095c = r1;
                }

                public final void onClick(View view) {
                    ListItem model = this.f14095c.getModel();
                    if (model != null) {
                        this.f14095c.f14094x.mo13626C0().onSelect(model);
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ListItem listItem) {
            this.f14093w.setValue(this, f14092y[0], listItem);
        }

        public ListItem getModel() {
            return (ListItem) this.f14093w.getValue(this, f14092y[0]);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/notes/NotesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notes.NotesFragment$SectionHeaderViewHolder */
    /* compiled from: NotesFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ListItem> {

        /* renamed from: x */
        public static final /* synthetic */ KProperty[] f14096x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14097w = new C4280xc43bd5b2(null, null, this);

        public SectionHeaderViewHolder(NotesFragment notesFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View a = ExtensionsKt.m14878a(notesFragment, viewGroup, C4014R.layout.section_header);
            Intrinsics.checkExpressionValueIsNotNull(a, "inflate(parent, R.layout.section_header)");
            super(a);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ListItem listItem) {
            this.f14097w.setValue(this, f14096x[0], listItem);
        }

        public ListItem getModel() {
            return (ListItem) this.f14097w.getValue(this, f14096x[0]);
        }
    }

    /* renamed from: B0 */
    public void mo13625B0() {
        HashMap hashMap = this.f14091b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final NotesViewModel mo13626C0() {
        NotesViewModel notesViewModel = this.f14090a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return notesViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentNotesBinding a = FragmentNotesBinding.m11751a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        NotesViewModel notesViewModel = this.f14090a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12400a(notesViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        NotesViewModel notesViewModel = this.f14090a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, notesViewModel.getUiCommand());
    }

    /* renamed from: e */
    public int mo11297e() {
        return 5;
    }

    /* renamed from: e */
    public View mo13627e(int i) {
        if (this.f14091b0 == null) {
            this.f14091b0 = new HashMap();
        }
        View view = (View) this.f14091b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f14091b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo13625B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        NotesFragment$onViewCreated$adapter$1 notesFragment$onViewCreated$adapter$1 = new NotesFragment$onViewCreated$adapter$1(this, new NotesFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) mo13627e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        NotesViewModel notesViewModel = this.f14090a0;
        if (notesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, notesViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) notesFragment$onViewCreated$adapter$1);
    }
}
