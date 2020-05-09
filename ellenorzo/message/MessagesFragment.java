package p289hu.ekreta.ellenorzo.message;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C3053e;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p238i.p240f.C3545a;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.databinding.FragmentMessagesBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessagesFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/message/MessagesViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/message/MessagesFragment$createAdapter$1", "()Lhu/ekreta/ellenorzo/message/MessagesFragment$createAdapter$1;", "createTabSelectedListener", "Lhu/ekreta/ellenorzo/message/TabLayoutAdapterToRefreshByTabIndex;", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment */
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public MessagesViewModel f13913a0;

    /* renamed from: b0 */
    public HashMap f13914b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessagesFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/message/Message;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/message/MessagesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/message/Message;", "setModel", "(Lhu/ekreta/ellenorzo/message/Message;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "createAttachmentIconVisibility", "", "attachmentList", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getColor", "resId", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder */
    /* compiled from: MessagesFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<Message> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f13915y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/message/Message;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13916w = new MessagesFragment$ViewHolder$$special$$inlined$observable$1(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ MessagesFragment f13917x;

        public ViewHolder(MessagesFragment messagesFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f13917x = messagesFragment;
            View a = ExtensionsKt.m14878a(messagesFragment, viewGroup, C4014R.layout.message_item);
            Intrinsics.checkExpressionValueIsNotNull(a, "inflate(parent, R.layout.message_item)");
            super(a);
            View view = this.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            ((ConstraintLayout) view.findViewById(C4014R.C4016id.itemLayout)).setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ViewHolder f13918c;

                {
                    this.f13918c = r1;
                }

                public final void onClick(View view) {
                    Message model = this.f13918c.getModel();
                    if (model != null) {
                        this.f13918c.f13917x.mo13428C0().onSelect(model);
                    }
                }
            });
            View view2 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            ((ImageView) view2.findViewById(C4014R.C4016id.readStateIcon)).setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ViewHolder f13919c;

                {
                    this.f13919c = r1;
                }

                public final void onClick(View view) {
                    MessagesViewModel C0 = this.f13919c.f13917x.mo13428C0();
                    Message model = this.f13919c.getModel();
                    if (model == null) {
                        Intrinsics.throwNpe();
                    }
                    C0.mo13446b(model);
                }
            });
            View view3 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            ((LinearLayout) view3.findViewById(C4014R.C4016id.right_view)).setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ViewHolder f13920c;

                {
                    this.f13920c = r1;
                }

                public final void onClick(View view) {
                    MessagesViewModel C0 = this.f13920c.f13917x.mo13428C0();
                    Message model = this.f13920c.getModel();
                    if (model == null) {
                        Intrinsics.throwNpe();
                    }
                    C0.mo13445a(model);
                }
            });
            View view4 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str);
            ((SwipeLayout) view4.findViewById(C4014R.C4016id.message_SwipeLayout)).mo22393a();
            Delegates delegates = Delegates.INSTANCE;
        }

        public static final /* synthetic */ int access$getColor(ViewHolder viewHolder, int i) {
            Context n = viewHolder.f13917x.mo6209n();
            if (n == null) {
                Intrinsics.throwNpe();
            }
            return C3545a.m9033a(n, i);
        }

        /* renamed from: a */
        public final int mo13430a(List<Attachment> list) {
            return list == null || list.isEmpty() ? 8 : 0;
        }

        /* renamed from: a */
        public void setModel(Message message) {
            this.f13916w.setValue(this, f13915y[0], message);
        }

        public Message getModel() {
            return (Message) this.f13916w.getValue(this, f13915y[0]);
        }
    }

    /* renamed from: B0 */
    public void mo13427B0() {
        HashMap hashMap = this.f13914b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final MessagesViewModel mo13428C0() {
        MessagesViewModel messagesViewModel = this.f13913a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return messagesViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentMessagesBinding a = FragmentMessagesBinding.m11738a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        MessagesViewModel messagesViewModel = this.f13913a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12395a(messagesViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        MessagesViewModel messagesViewModel = this.f13913a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, messagesViewModel.getUiCommand());
        mo6174c(true);
    }

    /* renamed from: e */
    public int mo11297e() {
        return 5;
    }

    /* renamed from: e */
    public View mo13429e(int i) {
        if (this.f13914b0 == null) {
            this.f13914b0 = new HashMap();
        }
        View view = (View) this.f13914b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f13914b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo13427B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        MessagesFragment$createAdapter$1 messagesFragment$createAdapter$1 = new MessagesFragment$createAdapter$1(this, new MessagesFragment$createAdapter$2(this));
        RecyclerView recyclerView = (RecyclerView) mo13429e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        MessagesViewModel messagesViewModel = this.f13913a0;
        if (messagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, messagesViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) messagesFragment$createAdapter$1);
        ((TabLayout) mo13429e(C4014R.C4016id.message_tab_layout)).mo7987a((C3053e) new TabLayoutAdapterToRefreshByTabIndex(new MessagesFragment$createTabSelectedListener$1(this)));
    }

    /* renamed from: a */
    public void mo6157a(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        Intrinsics.checkParameterIsNotNull(menuInflater, "inflater");
        menuInflater.inflate(C4014R.C4017menu.message_menu, menu);
        MenuItem findItem = menu.findItem(C4014R.C4016id.action_contact_class_master);
        Intrinsics.checkExpressionValueIsNotNull(findItem, "menu.findItem(R.id.action_contact_class_master)");
        findItem.setVisible(true);
        super.mo6157a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo6163a(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() == C4014R.C4016id.action_contact_class_master) {
            MessagesViewModel messagesViewModel = this.f13913a0;
            if (messagesViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            messagesViewModel.mo13451v0();
        }
        super.mo6163a(menuItem);
        return false;
    }
}
