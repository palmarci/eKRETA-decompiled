package hu.ekreta.ellenorzo.home;

import a.b.a.a.a;
import android.content.Context;
import android.content.Intent;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity;
import hu.ekreta.ellenorzo.homework.Homework;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import hu.ekreta.ellenorzo.notes.Note;
import hu.ekreta.ellenorzo.notes.NoteDetailsActivity;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailActivity;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem;", "", "()V", "DashboardItem", "SectionHeader", "Lhu/ekreta/ellenorzo/home/ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ListItem.kt */
public abstract class ListItem {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006%&'()*B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000e\u0001\u0006+,-./0¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "Lhu/ekreta/ellenorzo/home/ListItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "obsolete", "", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "getValueDesc", "valueTitle", "getValueTitle", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "AnnouncedTestItem", "EvaluationItem", "HomeworkItem", "NoteItem", "NoticeBoardItem", "OmissionItem", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$EvaluationItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$OmissionItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoteItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$AnnouncedTestItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$HomeworkItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoticeBoardItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ListItem.kt */
    public static abstract class DashboardItem extends ListItem {

        /* renamed from: a  reason: collision with root package name */
        public final Context f5632a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$AnnouncedTestItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ListItem.kt */
        public static final class AnnouncedTestItem extends DashboardItem {
            public final Void b;
            public final Void c;

            /* renamed from: d  reason: collision with root package name */
            public final int f5633d = R.mipmap.menu_announcedtest_24dp;
            public final boolean e;
            public final AnnouncedTest f;

            /* renamed from: g  reason: collision with root package name */
            public final Context f5634g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AnnouncedTestItem(boolean z, AnnouncedTest announcedTest, Context context) {
                super(context, (DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(announcedTest, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.e = z;
                this.f = announcedTest;
                this.f5634g = context;
            }

            public static /* synthetic */ AnnouncedTestItem copy$default(AnnouncedTestItem announcedTestItem, boolean z, AnnouncedTest announcedTest, Context context, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = announcedTestItem.g();
                }
                if ((i2 & 2) != 0) {
                    announcedTest = announcedTestItem.f;
                }
                if ((i2 & 4) != 0) {
                    context = announcedTestItem.a();
                }
                return announcedTestItem.a(z, announcedTest, context);
            }

            public Context a() {
                return this.f5634g;
            }

            public final AnnouncedTestItem a(boolean z, AnnouncedTest announcedTest, Context context) {
                Intrinsics.checkParameterIsNotNull(announcedTest, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new AnnouncedTestItem(z, announcedTest, context);
            }

            public Calendar b() {
                return this.f.g();
            }

            public String c() {
                return UtilsKt.e(this.f.m());
            }

            public String d() {
                return this.f.n();
            }

            public Intent e() {
                Intent intent = new Intent(a(), AnnouncedTestDetailActivity.class);
                ExtensionsKt.a(intent, this.f);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof AnnouncedTestItem) {
                        AnnouncedTestItem announcedTestItem = (AnnouncedTestItem) obj;
                        if (!(g() == announcedTestItem.g()) || !Intrinsics.areEqual((Object) this.f, (Object) announcedTestItem.f) || !Intrinsics.areEqual((Object) a(), (Object) announcedTestItem.a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int f() {
                return this.f5633d;
            }

            public boolean g() {
                return this.e;
            }

            public Boolean h() {
                return this.f.l();
            }

            public int hashCode() {
                boolean g2 = g();
                if (g2) {
                    g2 = true;
                }
                int i2 = (g2 ? 1 : 0) * true;
                AnnouncedTest announcedTest = this.f;
                int i3 = 0;
                int hashCode = (i2 + (announcedTest != null ? announcedTest.hashCode() : 0)) * 31;
                Context a2 = a();
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return hashCode + i3;
            }

            public String i() {
                return this.f.j();
            }

            public final AnnouncedTest j() {
                return this.f;
            }

            public String toString() {
                StringBuilder a2 = a.a("AnnouncedTestItem(obsolete=");
                a2.append(g());
                a2.append(", model=");
                a2.append(this.f);
                a2.append(", context=");
                a2.append(a());
                a2.append(")");
                return a2.toString();
            }

            public Void getValueDesc() {
                return this.c;
            }

            public Void getValueTitle() {
                return this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J'\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0010H\u0016J\t\u00100\u001a\u00020\u0016HÖ\u0001J\t\u00101\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0016\u0010$\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0012¨\u00062"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$EvaluationItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/evaluation/Evaluation;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "getValueDesc", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ListItem.kt */
        public static final class EvaluationItem extends DashboardItem {
            public final int b = R.drawable.rectangle_color_primary;
            public final boolean c;

            /* renamed from: d  reason: collision with root package name */
            public final Evaluation f5635d;
            public final Context e;

            @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
            public final /* synthetic */ class WhenMappings {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f5636a = new int[Evaluation.FormType.values().length];
                public static final /* synthetic */ int[] b = new int[Evaluation.FormType.values().length];
                public static final /* synthetic */ int[] c = new int[Evaluation.FormType.values().length];

                static {
                    f5636a[Evaluation.FormType.MARK.ordinal()] = 1;
                    f5636a[Evaluation.FormType.LONG_TEXT.ordinal()] = 2;
                    b[Evaluation.FormType.PERCENT.ordinal()] = 1;
                    b[Evaluation.FormType.MARK.ordinal()] = 2;
                    b[Evaluation.FormType.DILIGENCE_TEXT.ordinal()] = 3;
                    b[Evaluation.FormType.ATTITUDE_TEXT.ordinal()] = 4;
                    b[Evaluation.FormType.LONG_TEXT.ordinal()] = 5;
                    c[Evaluation.FormType.MARK.ordinal()] = 1;
                    c[Evaluation.FormType.ATTITUDE_TEXT.ordinal()] = 2;
                    c[Evaluation.FormType.DILIGENCE_TEXT.ordinal()] = 3;
                    c[Evaluation.FormType.LONG_TEXT.ordinal()] = 4;
                    c[Evaluation.FormType.PERCENT.ordinal()] = 5;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public EvaluationItem(boolean z, Evaluation evaluation, Context context) {
                super(context, (DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(evaluation, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.c = z;
                this.f5635d = evaluation;
                this.e = context;
            }

            public static /* synthetic */ EvaluationItem copy$default(EvaluationItem evaluationItem, boolean z, Evaluation evaluation, Context context, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = evaluationItem.g();
                }
                if ((i2 & 2) != 0) {
                    evaluation = evaluationItem.f5635d;
                }
                if ((i2 & 4) != 0) {
                    context = evaluationItem.a();
                }
                return evaluationItem.a(z, evaluation, context);
            }

            public Context a() {
                return this.e;
            }

            public final EvaluationItem a(boolean z, Evaluation evaluation, Context context) {
                Intrinsics.checkParameterIsNotNull(evaluation, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new EvaluationItem(z, evaluation, context);
            }

            public Calendar b() {
                return this.f5635d.f();
            }

            public String c() {
                return UtilsKt.e(this.f5635d.t());
            }

            public String d() {
                int i2 = WhenMappings.f5636a[this.f5635d.j().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        return this.f5635d.z();
                    }
                    return Intrinsics.stringPlus(this.f5635d.D(), "<br>");
                } else if (this.f5635d.B() == Evaluation.Type.EndOfYear || this.f5635d.B() == Evaluation.Type.HalfYear || this.f5635d.B().b()) {
                    return this.f5635d.C();
                } else {
                    return this.f5635d.o() ? this.f5635d.z() : this.f5635d.n();
                }
            }

            public Intent e() {
                Intent intent = new Intent(a(), EvaluationDetailsActivity.class);
                ExtensionsKt.a(intent, this.f5635d);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof EvaluationItem) {
                        EvaluationItem evaluationItem = (EvaluationItem) obj;
                        if (!(g() == evaluationItem.g()) || !Intrinsics.areEqual((Object) this.f5635d, (Object) evaluationItem.f5635d) || !Intrinsics.areEqual((Object) a(), (Object) evaluationItem.a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int f() {
                return this.b;
            }

            public boolean g() {
                return this.c;
            }

            public String getValueDesc() {
                int i2 = WhenMappings.c[this.f5635d.j().ordinal()];
                if (i2 == 1) {
                    String D = this.f5635d.D();
                    if (D != null) {
                        return new Regex("\\(.*\\)$").replace((CharSequence) D, "");
                    }
                    return null;
                } else if (i2 == 2 || i2 == 3) {
                    return this.f5635d.D();
                } else {
                    if (i2 == 4 || i2 == 5) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            public String getValueTitle() {
                int i2 = WhenMappings.b[this.f5635d.j().ordinal()];
                Character ch = null;
                boolean z = true;
                if (i2 == 1) {
                    return this.f5635d.D();
                }
                if (i2 == 2) {
                    boolean z2 = this.f5635d.q() != null;
                    Integer q2 = this.f5635d.q();
                    if (q2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (q2.intValue() <= 0) {
                        z = false;
                    }
                    if (z2 && z) {
                        return String.valueOf(this.f5635d.q().intValue());
                    }
                    return null;
                } else if (i2 == 3 || i2 == 4) {
                    String D = this.f5635d.D();
                    if (D != null) {
                        ch = Character.valueOf(StringsKt___StringsKt.first(D));
                    }
                    return String.valueOf(ch);
                } else if (i2 == 5) {
                    return "...";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }

            public Boolean h() {
                return this.f5635d.s();
            }

            public int hashCode() {
                boolean g2 = g();
                if (g2) {
                    g2 = true;
                }
                int i2 = (g2 ? 1 : 0) * true;
                Evaluation evaluation = this.f5635d;
                int i3 = 0;
                int hashCode = (i2 + (evaluation != null ? evaluation.hashCode() : 0)) * 31;
                Context a2 = a();
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return hashCode + i3;
            }

            public String i() {
                return this.f5635d.a(a());
            }

            public final Evaluation j() {
                return this.f5635d;
            }

            public String toString() {
                StringBuilder a2 = a.a("EvaluationItem(obsolete=");
                a2.append(g());
                a2.append(", model=");
                a2.append(this.f5635d);
                a2.append(", context=");
                a2.append(a());
                a2.append(")");
                return a2.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$HomeworkItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/homework/Homework;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/homework/Homework;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/homework/Homework;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ListItem.kt */
        public static final class HomeworkItem extends DashboardItem {
            public final Void b;
            public final Void c;

            /* renamed from: d  reason: collision with root package name */
            public final int f5637d = R.drawable.ic_homework_40dp;
            public final boolean e;
            public final Homework f;

            /* renamed from: g  reason: collision with root package name */
            public final Context f5638g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public HomeworkItem(boolean z, Homework homework, Context context) {
                super(context, (DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(homework, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.e = z;
                this.f = homework;
                this.f5638g = context;
            }

            public static /* synthetic */ HomeworkItem copy$default(HomeworkItem homeworkItem, boolean z, Homework homework, Context context, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = homeworkItem.g();
                }
                if ((i2 & 2) != 0) {
                    homework = homeworkItem.f;
                }
                if ((i2 & 4) != 0) {
                    context = homeworkItem.a();
                }
                return homeworkItem.a(z, homework, context);
            }

            public Context a() {
                return this.f5638g;
            }

            public final HomeworkItem a(boolean z, Homework homework, Context context) {
                Intrinsics.checkParameterIsNotNull(homework, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new HomeworkItem(z, homework, context);
            }

            public Calendar b() {
                return this.f.g();
            }

            public String c() {
                return UtilsKt.e(this.f.h());
            }

            public String d() {
                return this.f.m();
            }

            public Intent e() {
                Intent intent = new Intent(a(), HomeworkDetailActivity.class);
                ExtensionsKt.a(intent, this.f);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof HomeworkItem) {
                        HomeworkItem homeworkItem = (HomeworkItem) obj;
                        if (!(g() == homeworkItem.g()) || !Intrinsics.areEqual((Object) this.f, (Object) homeworkItem.f) || !Intrinsics.areEqual((Object) a(), (Object) homeworkItem.a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int f() {
                return this.f5637d;
            }

            public boolean g() {
                return this.e;
            }

            public Boolean h() {
                return this.f.j();
            }

            public int hashCode() {
                boolean g2 = g();
                if (g2) {
                    g2 = true;
                }
                int i2 = (g2 ? 1 : 0) * true;
                Homework homework = this.f;
                int i3 = 0;
                int hashCode = (i2 + (homework != null ? homework.hashCode() : 0)) * 31;
                Context a2 = a();
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return hashCode + i3;
            }

            public String i() {
                return this.f.a(a());
            }

            public final Homework j() {
                return this.f;
            }

            public String toString() {
                StringBuilder a2 = a.a("HomeworkItem(obsolete=");
                a2.append(g());
                a2.append(", model=");
                a2.append(this.f);
                a2.append(", context=");
                a2.append(a());
                a2.append(")");
                return a2.toString();
            }

            public Void getValueDesc() {
                return this.c;
            }

            public Void getValueTitle() {
                return this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoteItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/notes/Note;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/notes/Note;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/notes/Note;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ListItem.kt */
        public static final class NoteItem extends DashboardItem {
            public final Void b;
            public final Void c;

            /* renamed from: d  reason: collision with root package name */
            public final boolean f5639d;
            public final Note e;
            public final Context f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public NoteItem(boolean z, Note note, Context context) {
                super(context, (DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(note, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.f5639d = z;
                this.e = note;
                this.f = context;
            }

            public static /* synthetic */ NoteItem copy$default(NoteItem noteItem, boolean z, Note note, Context context, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = noteItem.g();
                }
                if ((i2 & 2) != 0) {
                    note = noteItem.e;
                }
                if ((i2 & 4) != 0) {
                    context = noteItem.a();
                }
                return noteItem.a(z, note, context);
            }

            public Context a() {
                return this.f;
            }

            public final NoteItem a(boolean z, Note note, Context context) {
                Intrinsics.checkParameterIsNotNull(note, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new NoteItem(z, note, context);
            }

            public Calendar b() {
                return this.e.g();
            }

            public String c() {
                return UtilsKt.e(this.e.j());
            }

            public String d() {
                return this.e.f();
            }

            public Intent e() {
                Intent intent = new Intent(a(), NoteDetailsActivity.class);
                ExtensionsKt.a(intent, this.e);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NoteItem) {
                        NoteItem noteItem = (NoteItem) obj;
                        if (!(g() == noteItem.g()) || !Intrinsics.areEqual((Object) this.e, (Object) noteItem.e) || !Intrinsics.areEqual((Object) a(), (Object) noteItem.a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int f() {
                String n2 = this.e.n();
                if (n2.equals("Házi feladat hiány")) {
                    return R.drawable.ic_lack_of_homework_40dp;
                }
                if (n2.equals("Felszereléshiány")) {
                    return R.drawable.ic_lack_of_equipment_40dp;
                }
                if (StringsKt__StringsKt.contains((CharSequence) n2, (CharSequence) "mentesség", true)) {
                    return R.drawable.ic_felmentes_40dp;
                }
                return StringsKt__StringsKt.contains((CharSequence) n2, (CharSequence) "dicséret", true) ? R.drawable.ic_praise_40dp : R.drawable.ic_note_40dp;
            }

            public boolean g() {
                return this.f5639d;
            }

            public Boolean h() {
                return this.e.i();
            }

            public int hashCode() {
                boolean g2 = g();
                if (g2) {
                    g2 = true;
                }
                int i2 = (g2 ? 1 : 0) * true;
                Note note = this.e;
                int i3 = 0;
                int hashCode = (i2 + (note != null ? note.hashCode() : 0)) * 31;
                Context a2 = a();
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return hashCode + i3;
            }

            public String i() {
                return this.e.n();
            }

            public final Note j() {
                return this.e;
            }

            public String toString() {
                StringBuilder a2 = a.a("NoteItem(obsolete=");
                a2.append(g());
                a2.append(", model=");
                a2.append(this.e);
                a2.append(", context=");
                a2.append(a());
                a2.append(")");
                return a2.toString();
            }

            public Void getValueDesc() {
                return this.c;
            }

            public Void getValueTitle() {
                return this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoticeBoardItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ListItem.kt */
        public static final class NoticeBoardItem extends DashboardItem {
            public final Void b;
            public final Void c;

            /* renamed from: d  reason: collision with root package name */
            public final int f5640d = R.drawable.ic_noticeboard_40dp;
            public final boolean e;
            public final hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem f;

            /* renamed from: g  reason: collision with root package name */
            public final Context f5641g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public NoticeBoardItem(boolean z, hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem, Context context) {
                super(context, (DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.e = z;
                this.f = noticeBoardItem;
                this.f5641g = context;
            }

            public static /* synthetic */ NoticeBoardItem copy$default(NoticeBoardItem noticeBoardItem, boolean z, hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem2, Context context, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = noticeBoardItem.g();
                }
                if ((i2 & 2) != 0) {
                    noticeBoardItem2 = noticeBoardItem.f;
                }
                if ((i2 & 4) != 0) {
                    context = noticeBoardItem.a();
                }
                return noticeBoardItem.a(z, noticeBoardItem2, context);
            }

            public Context a() {
                return this.f5641g;
            }

            public final NoticeBoardItem a(boolean z, hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem, Context context) {
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new NoticeBoardItem(z, noticeBoardItem, context);
            }

            public Calendar b() {
                return this.f.h();
            }

            public String c() {
                return UtilsKt.e(this.f.h());
            }

            public String d() {
                return this.f.f();
            }

            public Intent e() {
                Intent intent = new Intent(a(), NoticeBoardItemDetailActivity.class);
                ExtensionsKt.a(intent, this.f);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NoticeBoardItem) {
                        NoticeBoardItem noticeBoardItem = (NoticeBoardItem) obj;
                        if (!(g() == noticeBoardItem.g()) || !Intrinsics.areEqual((Object) this.f, (Object) noticeBoardItem.f) || !Intrinsics.areEqual((Object) a(), (Object) noticeBoardItem.a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int f() {
                return this.f5640d;
            }

            public boolean g() {
                return this.e;
            }

            public Boolean h() {
                return this.f.i();
            }

            public int hashCode() {
                boolean g2 = g();
                if (g2) {
                    g2 = true;
                }
                int i2 = (g2 ? 1 : 0) * true;
                hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem = this.f;
                int i3 = 0;
                int hashCode = (i2 + (noticeBoardItem != null ? noticeBoardItem.hashCode() : 0)) * 31;
                Context a2 = a();
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return hashCode + i3;
            }

            public String i() {
                return this.f.j();
            }

            public final hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem j() {
                return this.f;
            }

            public String toString() {
                StringBuilder a2 = a.a("NoticeBoardItem(obsolete=");
                a2.append(g());
                a2.append(", model=");
                a2.append(this.f);
                a2.append(", context=");
                a2.append(a());
                a2.append(")");
                return a2.toString();
            }

            public Void getValueDesc() {
                return this.c;
            }

            public Void getValueTitle() {
                return this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J1\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\t\u00105\u001a\u00020\u0017HÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u0016\u0010$\u001a\u0004\u0018\u00010%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'¨\u00067"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$OmissionItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/omission/Omission;", "minuteCaption", "", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/omission/Omission;Ljava/lang/String;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getMinuteCaption", "getModel", "()Lhu/ekreta/ellenorzo/omission/Omission;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ListItem.kt */
        public static final class OmissionItem extends DashboardItem {
            public final Void b;
            public final Void c;

            /* renamed from: d  reason: collision with root package name */
            public final boolean f5642d;
            public final Omission e;
            public final String f;

            /* renamed from: g  reason: collision with root package name */
            public final Context f5643g;

            @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
            public final /* synthetic */ class WhenMappings {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f5644a = new int[Omission.Type.values().length];
                public static final /* synthetic */ int[] b = new int[Omission.Type.values().length];

                static {
                    f5644a[Omission.Type.Absence.ordinal()] = 1;
                    f5644a[Omission.Type.Lateness.ordinal()] = 2;
                    f5644a[Omission.Type.Na.ordinal()] = 3;
                    f5644a[Omission.Type.Presence.ordinal()] = 4;
                    b[Omission.Type.Lateness.ordinal()] = 1;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OmissionItem(boolean z, Omission omission, String str, Context context) {
                super(context, (DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(omission, "model");
                Intrinsics.checkParameterIsNotNull(str, "minuteCaption");
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.f5642d = z;
                this.e = omission;
                this.f = str;
                this.f5643g = context;
            }

            public static /* synthetic */ OmissionItem copy$default(OmissionItem omissionItem, boolean z, Omission omission, String str, Context context, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = omissionItem.g();
                }
                if ((i2 & 2) != 0) {
                    omission = omissionItem.e;
                }
                if ((i2 & 4) != 0) {
                    str = omissionItem.f;
                }
                if ((i2 & 8) != 0) {
                    context = omissionItem.a();
                }
                return omissionItem.a(z, omission, str, context);
            }

            public Context a() {
                return this.f5643g;
            }

            public final OmissionItem a(boolean z, Omission omission, String str, Context context) {
                Intrinsics.checkParameterIsNotNull(omission, "model");
                Intrinsics.checkParameterIsNotNull(str, "minuteCaption");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new OmissionItem(z, omission, str, context);
            }

            public Calendar b() {
                return this.e.g();
            }

            public String c() {
                return UtilsKt.e(this.e.r());
            }

            public String d() {
                return this.e.u();
            }

            public Intent e() {
                Intent intent = new Intent(a(), OmissionDetailActivity.class);
                ExtensionsKt.a(intent, this.e);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof OmissionItem) {
                        OmissionItem omissionItem = (OmissionItem) obj;
                        if (!(g() == omissionItem.g()) || !Intrinsics.areEqual((Object) this.e, (Object) omissionItem.e) || !Intrinsics.areEqual((Object) this.f, (Object) omissionItem.f) || !Intrinsics.areEqual((Object) a(), (Object) omissionItem.a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int f() {
                int i2 = WhenMappings.f5644a[this.e.w().ordinal()];
                if (i2 == 1) {
                    return R.drawable.ic_absence_40dp;
                }
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    return R.drawable.ic_lateness_40dp;
                }
                throw new NoWhenBranchMatchedException();
            }

            public boolean g() {
                return this.f5642d;
            }

            public Boolean h() {
                return this.e.q();
            }

            public int hashCode() {
                boolean g2 = g();
                if (g2) {
                    g2 = true;
                }
                int i2 = (g2 ? 1 : 0) * true;
                Omission omission = this.e;
                int i3 = 0;
                int hashCode = (i2 + (omission != null ? omission.hashCode() : 0)) * 31;
                String str = this.f;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                Context a2 = a();
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return hashCode2 + i3;
            }

            public String i() {
                if (WhenMappings.b[this.e.w().ordinal()] != 1) {
                    return this.e.w() == Omission.Type.Absence ? "Hiányzás" : "Késés";
                }
                return this.e.x() + " (" + this.e.h() + ' ' + this.f + ')';
            }

            public final Omission j() {
                return this.e;
            }

            public String toString() {
                StringBuilder a2 = a.a("OmissionItem(obsolete=");
                a2.append(g());
                a2.append(", model=");
                a2.append(this.e);
                a2.append(", minuteCaption=");
                a2.append(this.f);
                a2.append(", context=");
                a2.append(a());
                a2.append(")");
                return a2.toString();
            }

            public Void getValueDesc() {
                return this.c;
            }

            public Void getValueTitle() {
                return this.b;
            }
        }

        public /* synthetic */ DashboardItem(Context context, DefaultConstructorMarker defaultConstructorMarker) {
            super((DefaultConstructorMarker) null);
            this.f5632a = context;
        }

        public Context a() {
            return this.f5632a;
        }

        public abstract Calendar b();

        public abstract String c();

        public abstract String d();

        public abstract Intent e();

        public abstract int f();

        public abstract boolean g();

        public abstract String getValueDesc();

        public abstract String getValueTitle();

        public abstract Boolean h();

        public String i() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/home/ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ListItem.kt */
    public static final class SectionHeader extends ListItem {

        /* renamed from: a  reason: collision with root package name */
        public final String f5645a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SectionHeader(String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkParameterIsNotNull(str, "title");
            this.f5645a = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sectionHeader.f5645a;
            }
            return sectionHeader.a(str);
        }

        public final SectionHeader a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            return new SectionHeader(str);
        }

        public final String a() {
            return this.f5645a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SectionHeader) && Intrinsics.areEqual((Object) this.f5645a, (Object) ((SectionHeader) obj).f5645a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f5645a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.a(a.a("SectionHeader(title="), this.f5645a, ")");
        }
    }

    public ListItem() {
    }

    public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
