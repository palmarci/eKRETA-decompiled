package p289hu.ekreta.ellenorzo.attachment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJN\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001aR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "label", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "text", "setRecyclerView", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "attachments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "onClick", "Lkotlin/Function1;", "onDelete", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentView */
/* compiled from: AttachmentView.kt */
public final class AttachmentView extends ConstraintLayout {

    /* renamed from: s */
    public String f11157s;

    /* renamed from: t */
    public HashMap f11158t;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentView$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "parent", "Landroid/view/ViewGroup;", "onClick", "Lkotlin/Function1;", "", "onDelete", "(Lhu/ekreta/ellenorzo/attachment/AttachmentView;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "attachmentDownloadStatus", "Landroid/widget/ImageView;", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/attachment/Attachment;", "setModel", "(Lhu/ekreta/ellenorzo/attachment/Attachment;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "viewName", "Landroid/widget/TextView;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder */
    /* compiled from: AttachmentView.kt */
    public final class ViewHolder extends MVVMViewHolder<Attachment> {

        /* renamed from: z */
        public static final /* synthetic */ KProperty[] f11159z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/attachment/Attachment;"))};

        /* renamed from: w */
        public final TextView f11160w;

        /* renamed from: x */
        public final ImageView f11161x;

        /* renamed from: y */
        public final ReadWriteProperty f11162y;

        @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$WhenMappings */
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11167a = new int[AttachmentDownloadState.values().length];

            static {
                f11167a[AttachmentDownloadState.DOWNLOADED.ordinal()] = 1;
                f11167a[AttachmentDownloadState.NOT_DOWNLOADED.ordinal()] = 2;
                f11167a[AttachmentDownloadState.DOWNLOAD_IN_PROGRESS.ordinal()] = 3;
            }
        }

        public ViewHolder(AttachmentView attachmentView, ViewGroup viewGroup, final Function1<? super Attachment, Unit> function1, final Function1<? super Attachment, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(function1, "onClick");
            View inflate = ExtensionsKt.m14625a((View) attachmentView).inflate(C4014R.layout.attachment_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "layoutInflater.inflate(\n…      false\n            )");
            super(inflate);
            View view = this.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.attachment_item_textview);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.attachment_item_textview");
            this.f11160w = textView;
            View view2 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            ImageView imageView = (ImageView) view2.findViewById(C4014R.C4016id.attachment_item_show_download_status);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.attachment_item_show_download_status");
            this.f11161x = imageView;
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ViewHolder f11163c;

                {
                    this.f11163c = r1;
                }

                public final void onClick(View view) {
                    Attachment model = this.f11163c.getModel();
                    if (model != null) {
                        function1.invoke(model);
                    }
                }
            });
            if (function12 != null) {
                View view3 = this.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view3, str);
                ImageView imageView2 = (ImageView) view3.findViewById(C4014R.C4016id.attachment_item_delete_button);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.attachment_item_delete_button");
                imageView2.setVisibility(0);
                View view4 = this.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view4, str);
                ((ImageView) view4.findViewById(C4014R.C4016id.attachment_item_delete_button)).setOnClickListener(new OnClickListener(this) {

                    /* renamed from: c */
                    public final /* synthetic */ ViewHolder f11165c;

                    {
                        this.f11165c = r1;
                    }

                    public final void onClick(View view) {
                        Attachment model = this.f11165c.getModel();
                        if (model != null) {
                            function12.invoke(model);
                        }
                    }
                });
            }
            Delegates delegates = Delegates.INSTANCE;
            this.f11162y = new AttachmentView$ViewHolder$$special$$inlined$observable$1(null, null, this);
        }

        /* renamed from: a */
        public void setModel(Attachment attachment) {
            this.f11162y.setValue(this, f11159z[0], attachment);
        }

        public Attachment getModel() {
            return (Attachment) this.f11162y.getValue(this, f11159z[0]);
        }
    }

    @JvmOverloads
    public AttachmentView(Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AttachmentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static /* synthetic */ void setRecyclerView$default(AttachmentView attachmentView, C3818m mVar, LiveData liveData, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 8) != 0) {
            function12 = null;
        }
        attachmentView.mo11469a(mVar, liveData, function1, function12);
    }

    /* renamed from: a */
    public final void mo11469a(C3818m mVar, LiveData<List<Attachment>> liveData, Function1<? super Attachment, Unit> function1, Function1<? super Attachment, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(mVar, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(liveData, "attachments");
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        RecyclerView recyclerView = (RecyclerView) mo11470c(C4014R.C4016id.attachments_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attachments_recycler_view");
        ExtensionsKt.m14654a(recyclerView, mVar, liveData, (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new AttachmentView$setRecyclerView$1<Object,Object,Object>(this, function1, function12));
    }

    /* renamed from: c */
    public View mo11470c(int i) {
        if (this.f11158t == null) {
            this.f11158t = new HashMap();
        }
        View view = (View) this.f11158t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f11158t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getLabel() {
        return this.f11157s;
    }

    public final void setLabel(String str) {
        this.f11157s = str;
        TextView textView = (TextView) mo11470c(C4014R.C4016id.attachments_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attachments_label");
        textView.setText(this.f11157s);
    }

    @JvmOverloads
    public AttachmentView(Context context, AttributeSet attributeSet, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, C4014R.layout.attachment_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4014R.styleable.AttachmentView, i, 0);
        this.f11157s = obtainStyledAttributes.getString(0);
        TextView textView = (TextView) mo11470c(C4014R.C4016id.attachments_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attachments_label");
        textView.setText(this.f11157s);
        obtainStyledAttributes.recycle();
    }
}
