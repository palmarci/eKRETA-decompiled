package hu.ekreta.ellenorzo.attachment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJN\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001aR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "label", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "text", "setRecyclerView", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "attachments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "onClick", "Lkotlin/Function1;", "onDelete", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AttachmentView.kt */
public final class AttachmentView extends ConstraintLayout {
    public String s;
    public HashMap t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentView$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "parent", "Landroid/view/ViewGroup;", "onClick", "Lkotlin/Function1;", "", "onDelete", "(Lhu/ekreta/ellenorzo/attachment/AttachmentView;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "attachmentDownloadStatus", "Landroid/widget/ImageView;", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/attachment/Attachment;", "setModel", "(Lhu/ekreta/ellenorzo/attachment/Attachment;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "viewName", "Landroid/widget/TextView;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AttachmentView.kt */
    public final class ViewHolder extends MVVMViewHolder<Attachment> {
        public static final /* synthetic */ KProperty[] z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/attachment/Attachment;"))};
        public final TextView w;
        public final ImageView x;
        public final ReadWriteProperty y;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5046a = new int[AttachmentDownloadState.values().length];

            static {
                f5046a[AttachmentDownloadState.DOWNLOADED.ordinal()] = 1;
                f5046a[AttachmentDownloadState.NOT_DOWNLOADED.ordinal()] = 2;
                f5046a[AttachmentDownloadState.DOWNLOAD_IN_PROGRESS.ordinal()] = 3;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ViewHolder(hu.ekreta.ellenorzo.attachment.AttachmentView r3, android.view.ViewGroup r4, final kotlin.jvm.functions.Function1<? super hu.ekreta.ellenorzo.attachment.Attachment, kotlin.Unit> r5, final kotlin.jvm.functions.Function1<? super hu.ekreta.ellenorzo.attachment.Attachment, kotlin.Unit> r6) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                java.lang.String r0 = "onClick"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
                android.view.LayoutInflater r3 = hu.ekreta.ellenorzo.util.ExtensionsKt.a((android.view.View) r3)
                r0 = 0
                r1 = 2131427385(0x7f0b0039, float:1.8476385E38)
                android.view.View r3 = r3.inflate(r1, r4, r0)
                java.lang.String r4 = "layoutInflater.inflate(\n…      false\n            )"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r2.<init>(r3)
                android.view.View r3 = r2.c
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                int r1 = hu.ekreta.ellenorzo.R.id.attachment_item_textview
                android.view.View r3 = r3.findViewById(r1)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.String r1 = "itemView.attachment_item_textview"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
                r2.w = r3
                android.view.View r3 = r2.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                int r1 = hu.ekreta.ellenorzo.R.id.attachment_item_show_download_status
                android.view.View r3 = r3.findViewById(r1)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                java.lang.String r1 = "itemView.attachment_item_show_download_status"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
                r2.x = r3
                android.view.View r3 = r2.c
                hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$1 r1 = new hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$1
                r1.<init>(r2, r5)
                r3.setOnClickListener(r1)
                if (r6 == 0) goto L_0x007e
                android.view.View r3 = r2.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                int r5 = hu.ekreta.ellenorzo.R.id.attachment_item_delete_button
                android.view.View r3 = r3.findViewById(r5)
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                java.lang.String r5 = "itemView.attachment_item_delete_button"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
                r3.setVisibility(r0)
                android.view.View r3 = r2.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                int r4 = hu.ekreta.ellenorzo.R.id.attachment_item_delete_button
                android.view.View r3 = r3.findViewById(r4)
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$2 r4 = new hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$2
                r4.<init>(r2, r6)
                r3.setOnClickListener(r4)
            L_0x007e:
                kotlin.properties.Delegates r3 = kotlin.properties.Delegates.INSTANCE
                r3 = 0
                hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$$special$$inlined$observable$1 r4 = new hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$$special$$inlined$observable$1
                r4.<init>(r3, r3, r2)
                r2.y = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.attachment.AttachmentView.ViewHolder.<init>(hu.ekreta.ellenorzo.attachment.AttachmentView, android.view.ViewGroup, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
        }

        /* renamed from: a */
        public void setModel(Attachment attachment) {
            this.y.setValue(this, z[0], attachment);
        }

        public Attachment getModel() {
            return (Attachment) this.y.getValue(this, z[0]);
        }
    }

    @JvmOverloads
    public AttachmentView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public AttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachmentView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public static /* synthetic */ void setRecyclerView$default(AttachmentView attachmentView, m mVar, LiveData liveData, Function1 function1, Function1 function12, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function12 = null;
        }
        attachmentView.a(mVar, liveData, function1, function12);
    }

    public final void a(m mVar, LiveData<List<Attachment>> liveData, Function1<? super Attachment, Unit> function1, Function1<? super Attachment, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(mVar, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(liveData, "attachments");
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        RecyclerView recyclerView = (RecyclerView) c(R.id.attachments_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attachments_recycler_view");
        ExtensionsKt.a(recyclerView, mVar, liveData, new AttachmentView$setRecyclerView$1(this, function1, function12));
    }

    public View c(int i2) {
        if (this.t == null) {
            this.t = new HashMap();
        }
        View view = (View) this.t.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.t.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String getLabel() {
        return this.s;
    }

    public final void setLabel(String str) {
        this.s = str;
        TextView textView = (TextView) c(R.id.attachments_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attachments_label");
        textView.setText(this.s);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AttachmentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View.inflate(context, R.layout.attachment_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AttachmentView, i2, 0);
        this.s = obtainStyledAttributes.getString(0);
        TextView textView = (TextView) c(R.id.attachments_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attachments_label");
        textView.setText(this.s);
        obtainStyledAttributes.recycle();
    }
}
