package hu.ekreta.ellenorzo.message;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import h.i.f.a;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.databinding.FragmentMessagesBinding;
import hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessagesFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/message/MessagesViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/message/MessagesFragment$createAdapter$1", "()Lhu/ekreta/ellenorzo/message/MessagesFragment$createAdapter$1;", "createTabSelectedListener", "Lhu/ekreta/ellenorzo/message/TabLayoutAdapterToRefreshByTabIndex;", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment extends c implements MainBackNavigationTarget {
    public MessagesViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessagesFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/message/Message;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/message/MessagesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/message/Message;", "setModel", "(Lhu/ekreta/ellenorzo/message/Message;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "createAttachmentIconVisibility", "", "attachmentList", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getColor", "resId", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: MessagesFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<Message> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/message/Message;"))};
        public final ReadWriteProperty w = new MessagesFragment$ViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ MessagesFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ViewHolder(hu.ekreta.ellenorzo.message.MessagesFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r1.x = r2
                r0 = 2131427472(0x7f0b0090, float:1.8476561E38)
                android.view.View r2 = hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((androidx.fragment.app.Fragment) r2, (android.view.ViewGroup) r3, (int) r0)
                java.lang.String r3 = "inflate(parent, R.layout.message_item)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                android.view.View r2 = r1.c
                java.lang.String r3 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                int r0 = hu.ekreta.ellenorzo.R.id.itemLayout
                android.view.View r2 = r2.findViewById(r0)
                androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
                hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$1 r0 = new hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$1
                r0.<init>(r1)
                r2.setOnClickListener(r0)
                android.view.View r2 = r1.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                int r0 = hu.ekreta.ellenorzo.R.id.readStateIcon
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$2 r0 = new hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$2
                r0.<init>(r1)
                r2.setOnClickListener(r0)
                android.view.View r2 = r1.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                int r0 = hu.ekreta.ellenorzo.R.id.right_view
                android.view.View r2 = r2.findViewById(r0)
                android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
                hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$3 r0 = new hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$3
                r0.<init>(r1)
                r2.setOnClickListener(r0)
                android.view.View r2 = r1.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                int r3 = hu.ekreta.ellenorzo.R.id.message_SwipeLayout
                android.view.View r2 = r2.findViewById(r3)
                ru.rambler.libs.swipe_layout.SwipeLayout r2 = (ru.rambler.libs.swipe_layout.SwipeLayout) r2
                r2.a()
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.message.MessagesFragment.ViewHolder.<init>(hu.ekreta.ellenorzo.message.MessagesFragment, android.view.ViewGroup):void");
        }

        public static final /* synthetic */ int access$getColor(ViewHolder viewHolder, int i2) {
            Context n2 = viewHolder.x.n();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            return a.a(n2, i2);
        }

        public final int a(List<Attachment> list) {
            return list == null || list.isEmpty() ? 8 : 0;
        }

        /* renamed from: a */
        public void setModel(Message message) {
            this.w.setValue(this, y[0], message);
        }

        public Message getModel() {
            return (Message) this.w.getValue(this, y[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final MessagesViewModel C0() {
        MessagesViewModel messagesViewModel = this.a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return messagesViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentMessagesBinding a2 = FragmentMessagesBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        MessagesViewModel messagesViewModel = this.a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(messagesViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        MessagesViewModel messagesViewModel = this.a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, messagesViewModel.getUiCommand());
        c(true);
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
        MessagesFragment$createAdapter$1 messagesFragment$createAdapter$1 = new MessagesFragment$createAdapter$1(this, new MessagesFragment$createAdapter$2(this));
        RecyclerView recyclerView = (RecyclerView) e(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        MessagesViewModel messagesViewModel = this.a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, messagesViewModel.getItems(), messagesFragment$createAdapter$1);
        ((TabLayout) e(R.id.message_tab_layout)).a((TabLayout.e) new TabLayoutAdapterToRefreshByTabIndex(new MessagesFragment$createTabSelectedListener$1(this)));
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        Intrinsics.checkParameterIsNotNull(menuInflater, "inflater");
        menuInflater.inflate(R.menu.message_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_contact_class_master);
        Intrinsics.checkExpressionValueIsNotNull(findItem, "menu.findItem(R.id.action_contact_class_master)");
        findItem.setVisible(true);
        super.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_contact_class_master) {
            MessagesViewModel messagesViewModel = this.a0;
            if (messagesViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            messagesViewModel.s0();
        }
        super.a(menuItem);
        return false;
    }
}
