package hu.ekreta.ellenorzo.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBinding;
import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import i.c.h.a;
import java.util.HashMap;
import k.b.a0.b;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "disposeBag", "Lio/reactivex/disposables/CompositeDisposable;", "viewModel", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "HomeworkCommentViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkDetailActivity.kt */
public final class HomeworkDetailActivity extends a {
    public HomeworkDetailViewModel x;
    public final b y = new b();
    public HashMap z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R/\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity$HomeworkCommentViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "Landroid/view/View$OnClickListener;", "commentView", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity;Landroid/view/View;)V", "getCommentView", "()Landroid/view/View;", "deleteCommentButton", "Landroid/widget/ImageButton;", "homeworkCommentSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "homeworkWebView", "Landroid/webkit/WebView;", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "setModel", "(Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "recordDateTextView", "Landroid/widget/TextView;", "recorderStudentNameTextView", "onClick", "", "v", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: HomeworkDetailActivity.kt */
    public final class HomeworkCommentViewHolder extends MVVMViewHolder<HomeworkComment> implements View.OnClickListener {
        public static final /* synthetic */ KProperty[] E = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HomeworkCommentViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;"))};
        public final k.b.h0.b<HomeworkComment> A;
        public final ReadWriteProperty B = new HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final View C;
        public final /* synthetic */ HomeworkDetailActivity D;
        public final TextView w;
        public final TextView x;
        public final WebView y;
        public final ImageButton z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeworkCommentViewHolder(HomeworkDetailActivity homeworkDetailActivity, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "commentView");
            this.D = homeworkDetailActivity;
            this.C = view;
            View findViewById = this.C.findViewById(R.id.student_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "commentView.findViewById(R.id.student_name)");
            this.w = (TextView) findViewById;
            View findViewById2 = this.C.findViewById(R.id.record_date);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "commentView.findViewById(R.id.record_date)");
            this.x = (TextView) findViewById2;
            View findViewById3 = this.C.findViewById(R.id.homework_text_web_view);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "commentView.findViewById…d.homework_text_web_view)");
            this.y = (WebView) findViewById3;
            View findViewById4 = this.C.findViewById(R.id.deleteButton);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "commentView.findViewById(R.id.deleteButton)");
            this.z = (ImageButton) findViewById4;
            k.b.h0.b<HomeworkComment> bVar = new k.b.h0.b<>();
            Intrinsics.checkExpressionValueIsNotNull(bVar, "PublishSubject.create<HomeworkComment>()");
            this.A = bVar;
            this.z.setOnClickListener(this);
            n<R> k2 = this.A.k(new h<T, q<? extends R>>(this) {
                public final /* synthetic */ HomeworkCommentViewHolder c;

                {
                    this.c = r1;
                }

                /* renamed from: a */
                public final n<Boolean> apply(HomeworkComment homeworkComment) {
                    Intrinsics.checkParameterIsNotNull(homeworkComment, "it");
                    return this.c.D.q().b(homeworkComment);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(k2, "homeworkCommentSubject\n …el.canDeleteComment(it) }");
            ExtensionsKt.a(k.b.f0.b.a(k2, new Function1<Throwable, Unit>(this) {
                public final /* synthetic */ HomeworkCommentViewHolder c;

                {
                    this.c = r1;
                }

                public final void a(Throwable th) {
                    Intrinsics.checkParameterIsNotNull(th, "it");
                    this.c.z.setVisibility(8);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Throwable) obj);
                    return Unit.INSTANCE;
                }
            }, (Function0) null, new Function1<Boolean, Unit>(this) {
                public final /* synthetic */ HomeworkCommentViewHolder c;

                {
                    this.c = r1;
                }

                public final void a(Boolean bool) {
                    ImageButton access$getDeleteCommentButton$p = this.c.z;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "visibility");
                    access$getDeleteCommentButton$p.setVisibility(bool.booleanValue() ? 0 : 8);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Boolean) obj);
                    return Unit.INSTANCE;
                }
            }, 2), homeworkDetailActivity.y);
            Delegates delegates = Delegates.INSTANCE;
        }

        public final View D() {
            return this.C;
        }

        /* renamed from: a */
        public void setModel(HomeworkComment homeworkComment) {
            this.B.setValue(this, E[0], homeworkComment);
        }

        public HomeworkComment getModel() {
            return (HomeworkComment) this.B.getValue(this, E[0]);
        }

        public void onClick(View view) {
            HomeworkComment model = getModel();
            if (model != null) {
                this.D.q().a(model);
            }
        }
    }

    public View c(int i2) {
        if (this.z == null) {
            this.z = new HashMap();
        }
        View view = (View) this.z.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.z.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_homework_detail);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…homework_detail\n        )");
        ActivityHomeworkDetailBinding activityHomeworkDetailBinding = (ActivityHomeworkDetailBinding) a2;
        HomeworkDetailViewModel homeworkDetailViewModel = this.x;
        if (homeworkDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityHomeworkDetailBinding.a(homeworkDetailViewModel);
        HomeworkDetailViewModel homeworkDetailViewModel2 = this.x;
        if (homeworkDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        homeworkDetailViewModel2.a(ExtensionsKt.g(intent));
        RecyclerView recyclerView = (RecyclerView) c(R.id.comments_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "comments_recycler_view");
        HomeworkDetailViewModel homeworkDetailViewModel3 = this.x;
        if (homeworkDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, homeworkDetailViewModel3.getHomeworkComments(), new HomeworkDetailActivity$onCreate$1(this));
        HomeworkDetailViewModel homeworkDetailViewModel4 = this.x;
        if (homeworkDetailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, homeworkDetailViewModel4.getUiCommand());
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.y.b();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        HomeworkDetailViewModel homeworkDetailViewModel = this.x;
        if (homeworkDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        homeworkDetailViewModel.r1();
    }

    public final HomeworkDetailViewModel q() {
        HomeworkDetailViewModel homeworkDetailViewModel = this.x;
        if (homeworkDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return homeworkDetailViewModel;
    }
}
