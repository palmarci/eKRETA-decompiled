package p289hu.ekreta.ellenorzo.home;

import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.FormType;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import p289hu.ekreta.ellenorzo.notes.Note;
import p289hu.ekreta.ellenorzo.notes.NoteDetailsActivity;
import p289hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailActivity;
import p289hu.ekreta.ellenorzo.omission.Omission;
import p289hu.ekreta.ellenorzo.omission.OmissionDetailActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem;", "", "()V", "DashboardItem", "SectionHeader", "Lhu/ekreta/ellenorzo/home/ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.ListItem */
/* compiled from: ListItem.kt */
public abstract class ListItem {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006%&'()*B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000e\u0001\u0006+,-./0¨\u00061"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "Lhu/ekreta/ellenorzo/home/ListItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "obsolete", "", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "getValueDesc", "valueTitle", "getValueTitle", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "AnnouncedTestItem", "EvaluationItem", "HomeworkItem", "NoteItem", "NoticeBoardItem", "OmissionItem", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$EvaluationItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$OmissionItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoteItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$AnnouncedTestItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$HomeworkItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoticeBoardItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem */
    /* compiled from: ListItem.kt */
    public static abstract class DashboardItem extends ListItem {

        /* renamed from: a */
        public final Context f13383a;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$AnnouncedTestItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$AnnouncedTestItem */
        /* compiled from: ListItem.kt */
        public static final class AnnouncedTestItem extends DashboardItem {

            /* renamed from: b */
            public final Void f13384b;

            /* renamed from: c */
            public final Void f13385c;

            /* renamed from: d */
            public final int f13386d = C4014R.C4015drawable.szamonkeres_icon;

            /* renamed from: e */
            public final boolean f13387e;

            /* renamed from: f */
            public final AnnouncedTest f13388f;

            /* renamed from: g */
            public final Context f13389g;

            public AnnouncedTestItem(boolean z, AnnouncedTest announcedTest, Context context) {
                Intrinsics.checkParameterIsNotNull(announcedTest, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                super(context, null);
                this.f13387e = z;
                this.f13388f = announcedTest;
                this.f13389g = context;
            }

            public static /* synthetic */ AnnouncedTestItem copy$default(AnnouncedTestItem announcedTestItem, boolean z, AnnouncedTest announcedTest, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = announcedTestItem.mo12863g();
                }
                if ((i & 2) != 0) {
                    announcedTest = announcedTestItem.f13388f;
                }
                if ((i & 4) != 0) {
                    context = announcedTestItem.mo12857a();
                }
                return announcedTestItem.mo12868a(z, announcedTest, context);
            }

            /* renamed from: a */
            public Context mo12857a() {
                return this.f13389g;
            }

            /* renamed from: a */
            public final AnnouncedTestItem mo12868a(boolean z, AnnouncedTest announcedTest, Context context) {
                Intrinsics.checkParameterIsNotNull(announcedTest, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new AnnouncedTestItem(z, announcedTest, context);
            }

            /* renamed from: b */
            public Calendar mo12858b() {
                return this.f13388f.mo11321g();
            }

            /* renamed from: c */
            public String mo12859c() {
                return UtilsKt.m14842e(this.f13388f.mo11328m());
            }

            /* renamed from: d */
            public String mo12860d() {
                return this.f13388f.mo11329n();
            }

            /* renamed from: e */
            public Intent mo12861e() {
                Intent intent = new Intent(mo12857a(), AnnouncedTestDetailActivity.class);
                ExtensionsKt.m14636a(intent, this.f13388f);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof AnnouncedTestItem) {
                        AnnouncedTestItem announcedTestItem = (AnnouncedTestItem) obj;
                        if (!(mo12863g() == announcedTestItem.mo12863g()) || !Intrinsics.areEqual((Object) this.f13388f, (Object) announcedTestItem.f13388f) || !Intrinsics.areEqual((Object) mo12857a(), (Object) announcedTestItem.mo12857a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public int mo12862f() {
                return this.f13386d;
            }

            /* renamed from: g */
            public boolean mo12863g() {
                return this.f13387e;
            }

            /* renamed from: h */
            public Boolean mo12866h() {
                return this.f13388f.mo11327l();
            }

            public int hashCode() {
                boolean g = mo12863g();
                if (g) {
                    g = true;
                }
                int i = (g ? 1 : 0) * true;
                AnnouncedTest announcedTest = this.f13388f;
                int i2 = 0;
                int hashCode = (i + (announcedTest != null ? announcedTest.hashCode() : 0)) * 31;
                Context a = mo12857a();
                if (a != null) {
                    i2 = a.hashCode();
                }
                return hashCode + i2;
            }

            /* renamed from: i */
            public String mo12867i() {
                return this.f13388f.mo11325j();
            }

            /* renamed from: j */
            public final AnnouncedTest mo12871j() {
                return this.f13388f;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("AnnouncedTestItem(obsolete=");
                a.append(mo12863g());
                a.append(", model=");
                a.append(this.f13388f);
                a.append(", context=");
                a.append(mo12857a());
                a.append(")");
                return a.toString();
            }

            public Void getValueDesc() {
                return this.f13385c;
            }

            public Void getValueTitle() {
                return this.f13384b;
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J'\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0010H\u0016J\t\u00100\u001a\u00020\u0016HÖ\u0001J\t\u00101\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0016\u0010$\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0012¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$EvaluationItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/evaluation/Evaluation;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "getValueDesc", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$EvaluationItem */
        /* compiled from: ListItem.kt */
        public static final class EvaluationItem extends DashboardItem {

            /* renamed from: b */
            public final int f13390b = C4014R.C4015drawable.rectangle_color_primary;

            /* renamed from: c */
            public final boolean f13391c;

            /* renamed from: d */
            public final Evaluation f13392d;

            /* renamed from: e */
            public final Context f13393e;

            @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
            /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$EvaluationItem$WhenMappings */
            public final /* synthetic */ class WhenMappings {

                /* renamed from: a */
                public static final /* synthetic */ int[] f13394a = new int[FormType.values().length];

                /* renamed from: b */
                public static final /* synthetic */ int[] f13395b = new int[FormType.values().length];

                /* renamed from: c */
                public static final /* synthetic */ int[] f13396c = new int[FormType.values().length];

                static {
                    f13394a[FormType.MARK.ordinal()] = 1;
                    f13394a[FormType.LONG_TEXT.ordinal()] = 2;
                    f13395b[FormType.PERCENT.ordinal()] = 1;
                    f13395b[FormType.MARK.ordinal()] = 2;
                    f13395b[FormType.DILIGENCE_TEXT.ordinal()] = 3;
                    f13395b[FormType.ATTITUDE_TEXT.ordinal()] = 4;
                    f13395b[FormType.LONG_TEXT.ordinal()] = 5;
                    f13396c[FormType.MARK.ordinal()] = 1;
                    f13396c[FormType.ATTITUDE_TEXT.ordinal()] = 2;
                    f13396c[FormType.DILIGENCE_TEXT.ordinal()] = 3;
                    f13396c[FormType.LONG_TEXT.ordinal()] = 4;
                    f13396c[FormType.PERCENT.ordinal()] = 5;
                }
            }

            public EvaluationItem(boolean z, Evaluation evaluation, Context context) {
                Intrinsics.checkParameterIsNotNull(evaluation, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                super(context, null);
                this.f13391c = z;
                this.f13392d = evaluation;
                this.f13393e = context;
            }

            public static /* synthetic */ EvaluationItem copy$default(EvaluationItem evaluationItem, boolean z, Evaluation evaluation, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = evaluationItem.mo12863g();
                }
                if ((i & 2) != 0) {
                    evaluation = evaluationItem.f13392d;
                }
                if ((i & 4) != 0) {
                    context = evaluationItem.mo12857a();
                }
                return evaluationItem.mo12873a(z, evaluation, context);
            }

            /* renamed from: a */
            public Context mo12857a() {
                return this.f13393e;
            }

            /* renamed from: a */
            public final EvaluationItem mo12873a(boolean z, Evaluation evaluation, Context context) {
                Intrinsics.checkParameterIsNotNull(evaluation, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new EvaluationItem(z, evaluation, context);
            }

            /* renamed from: b */
            public Calendar mo12858b() {
                return this.f13392d.mo12595f();
            }

            /* renamed from: c */
            public String mo12859c() {
                return UtilsKt.m14842e(this.f13392d.mo12610t());
            }

            /* renamed from: d */
            public String mo12860d() {
                int i = WhenMappings.f13394a[this.f13392d.mo12600j().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return this.f13392d.mo12618z();
                    }
                    return Intrinsics.stringPlus(this.f13392d.mo12588D(), "<br>");
                } else if (this.f13392d.mo12586B() == Type.EndOfYear || this.f13392d.mo12586B() == Type.HalfYear || this.f13392d.mo12586B().mo12624b()) {
                    return this.f13392d.mo12587C();
                } else {
                    return this.f13392d.mo12605o() ? this.f13392d.mo12618z() : this.f13392d.mo12604n();
                }
            }

            /* renamed from: e */
            public Intent mo12861e() {
                Intent intent = new Intent(mo12857a(), EvaluationDetailsActivity.class);
                ExtensionsKt.m14639a(intent, this.f13392d);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof EvaluationItem) {
                        EvaluationItem evaluationItem = (EvaluationItem) obj;
                        if (!(mo12863g() == evaluationItem.mo12863g()) || !Intrinsics.areEqual((Object) this.f13392d, (Object) evaluationItem.f13392d) || !Intrinsics.areEqual((Object) mo12857a(), (Object) evaluationItem.mo12857a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public int mo12862f() {
                return this.f13390b;
            }

            /* renamed from: g */
            public boolean mo12863g() {
                return this.f13391c;
            }

            public String getValueDesc() {
                int i = WhenMappings.f13396c[this.f13392d.mo12600j().ordinal()];
                if (i == 1) {
                    String D = this.f13392d.mo12588D();
                    if (D != null) {
                        return new Regex("\\(.*\\)$").replace((CharSequence) D, "");
                    }
                    return null;
                } else if (i == 2 || i == 3) {
                    return this.f13392d.mo12588D();
                } else {
                    if (i == 4 || i == 5) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            public String getValueTitle() {
                int i = WhenMappings.f13395b[this.f13392d.mo12600j().ordinal()];
                Character ch = null;
                boolean z = true;
                if (i == 1) {
                    return this.f13392d.mo12588D();
                }
                if (i == 2) {
                    boolean z2 = this.f13392d.mo12607q() != null;
                    Integer q = this.f13392d.mo12607q();
                    if (q == null) {
                        Intrinsics.throwNpe();
                    }
                    if (q.intValue() <= 0) {
                        z = false;
                    }
                    if (z2 && z) {
                        return String.valueOf(this.f13392d.mo12607q().intValue());
                    }
                    return null;
                } else if (i == 3 || i == 4) {
                    String D = this.f13392d.mo12588D();
                    if (D != null) {
                        ch = Character.valueOf(StringsKt___StringsKt.first(D));
                    }
                    return String.valueOf(ch);
                } else if (i == 5) {
                    return "...";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* renamed from: h */
            public Boolean mo12866h() {
                return this.f13392d.mo12609s();
            }

            public int hashCode() {
                boolean g = mo12863g();
                if (g) {
                    g = true;
                }
                int i = (g ? 1 : 0) * true;
                Evaluation evaluation = this.f13392d;
                int i2 = 0;
                int hashCode = (i + (evaluation != null ? evaluation.hashCode() : 0)) * 31;
                Context a = mo12857a();
                if (a != null) {
                    i2 = a.hashCode();
                }
                return hashCode + i2;
            }

            /* renamed from: i */
            public String mo12867i() {
                return this.f13392d.mo12592a(mo12857a());
            }

            /* renamed from: j */
            public final Evaluation mo12876j() {
                return this.f13392d;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("EvaluationItem(obsolete=");
                a.append(mo12863g());
                a.append(", model=");
                a.append(this.f13392d);
                a.append(", context=");
                a.append(mo12857a());
                a.append(")");
                return a.toString();
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$HomeworkItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/homework/Homework;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/homework/Homework;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/homework/Homework;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$HomeworkItem */
        /* compiled from: ListItem.kt */
        public static final class HomeworkItem extends DashboardItem {

            /* renamed from: b */
            public final Void f13397b;

            /* renamed from: c */
            public final Void f13398c;

            /* renamed from: d */
            public final int f13399d = C4014R.C4015drawable.hf_icon;

            /* renamed from: e */
            public final boolean f13400e;

            /* renamed from: f */
            public final Homework f13401f;

            /* renamed from: g */
            public final Context f13402g;

            public HomeworkItem(boolean z, Homework homework, Context context) {
                Intrinsics.checkParameterIsNotNull(homework, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                super(context, null);
                this.f13400e = z;
                this.f13401f = homework;
                this.f13402g = context;
            }

            public static /* synthetic */ HomeworkItem copy$default(HomeworkItem homeworkItem, boolean z, Homework homework, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = homeworkItem.mo12863g();
                }
                if ((i & 2) != 0) {
                    homework = homeworkItem.f13401f;
                }
                if ((i & 4) != 0) {
                    context = homeworkItem.mo12857a();
                }
                return homeworkItem.mo12878a(z, homework, context);
            }

            /* renamed from: a */
            public Context mo12857a() {
                return this.f13402g;
            }

            /* renamed from: a */
            public final HomeworkItem mo12878a(boolean z, Homework homework, Context context) {
                Intrinsics.checkParameterIsNotNull(homework, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new HomeworkItem(z, homework, context);
            }

            /* renamed from: b */
            public Calendar mo12858b() {
                return this.f13401f.mo12907g();
            }

            /* renamed from: c */
            public String mo12859c() {
                return UtilsKt.m14842e(this.f13401f.mo12908h());
            }

            /* renamed from: d */
            public String mo12860d() {
                return this.f13401f.mo12914m();
            }

            /* renamed from: e */
            public Intent mo12861e() {
                Intent intent = new Intent(mo12857a(), HomeworkDetailActivity.class);
                ExtensionsKt.m14640a(intent, this.f13401f);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof HomeworkItem) {
                        HomeworkItem homeworkItem = (HomeworkItem) obj;
                        if (!(mo12863g() == homeworkItem.mo12863g()) || !Intrinsics.areEqual((Object) this.f13401f, (Object) homeworkItem.f13401f) || !Intrinsics.areEqual((Object) mo12857a(), (Object) homeworkItem.mo12857a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public int mo12862f() {
                return this.f13399d;
            }

            /* renamed from: g */
            public boolean mo12863g() {
                return this.f13400e;
            }

            /* renamed from: h */
            public Boolean mo12866h() {
                return this.f13401f.mo12911j();
            }

            public int hashCode() {
                boolean g = mo12863g();
                if (g) {
                    g = true;
                }
                int i = (g ? 1 : 0) * true;
                Homework homework = this.f13401f;
                int i2 = 0;
                int hashCode = (i + (homework != null ? homework.hashCode() : 0)) * 31;
                Context a = mo12857a();
                if (a != null) {
                    i2 = a.hashCode();
                }
                return hashCode + i2;
            }

            /* renamed from: i */
            public String mo12867i() {
                return this.f13401f.mo12904a(mo12857a());
            }

            /* renamed from: j */
            public final Homework mo12881j() {
                return this.f13401f;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("HomeworkItem(obsolete=");
                a.append(mo12863g());
                a.append(", model=");
                a.append(this.f13401f);
                a.append(", context=");
                a.append(mo12857a());
                a.append(")");
                return a.toString();
            }

            public Void getValueDesc() {
                return this.f13398c;
            }

            public Void getValueTitle() {
                return this.f13397b;
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoteItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/notes/Note;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/notes/Note;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/notes/Note;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$NoteItem */
        /* compiled from: ListItem.kt */
        public static final class NoteItem extends DashboardItem {

            /* renamed from: b */
            public final Void f13403b;

            /* renamed from: c */
            public final Void f13404c;

            /* renamed from: d */
            public final boolean f13405d;

            /* renamed from: e */
            public final Note f13406e;

            /* renamed from: f */
            public final Context f13407f;

            public NoteItem(boolean z, Note note, Context context) {
                Intrinsics.checkParameterIsNotNull(note, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                super(context, null);
                this.f13405d = z;
                this.f13406e = note;
                this.f13407f = context;
            }

            public static /* synthetic */ NoteItem copy$default(NoteItem noteItem, boolean z, Note note, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = noteItem.mo12863g();
                }
                if ((i & 2) != 0) {
                    note = noteItem.f13406e;
                }
                if ((i & 4) != 0) {
                    context = noteItem.mo12857a();
                }
                return noteItem.mo12883a(z, note, context);
            }

            /* renamed from: a */
            public Context mo12857a() {
                return this.f13407f;
            }

            /* renamed from: a */
            public final NoteItem mo12883a(boolean z, Note note, Context context) {
                Intrinsics.checkParameterIsNotNull(note, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new NoteItem(z, note, context);
            }

            /* renamed from: b */
            public Calendar mo12858b() {
                return this.f13406e.mo13557g();
            }

            /* renamed from: c */
            public String mo12859c() {
                return UtilsKt.m14842e(this.f13406e.mo13561j());
            }

            /* renamed from: d */
            public String mo12860d() {
                return this.f13406e.mo13556f();
            }

            /* renamed from: e */
            public Intent mo12861e() {
                Intent intent = new Intent(mo12857a(), NoteDetailsActivity.class);
                ExtensionsKt.m14642a(intent, this.f13406e);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NoteItem) {
                        NoteItem noteItem = (NoteItem) obj;
                        if (!(mo12863g() == noteItem.mo12863g()) || !Intrinsics.areEqual((Object) this.f13406e, (Object) noteItem.f13406e) || !Intrinsics.areEqual((Object) mo12857a(), (Object) noteItem.mo12857a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public int mo12862f() {
                String n = this.f13406e.mo13565n();
                if (n.equals("Házi feladat hiány")) {
                    return C4014R.C4015drawable.hf_hiany_icon;
                }
                if (n.equals("Felszereléshiány")) {
                    return C4014R.C4015drawable.felszereles_hiany;
                }
                if (StringsKt__StringsKt.contains((CharSequence) n, (CharSequence) "mentesség", true)) {
                    return C4014R.C4015drawable.felmentes_icon;
                }
                return StringsKt__StringsKt.contains((CharSequence) n, (CharSequence) "dicséret", true) ? C4014R.C4015drawable.dicseret_icon : C4014R.C4015drawable.feljegyzes_icon;
            }

            /* renamed from: g */
            public boolean mo12863g() {
                return this.f13405d;
            }

            /* renamed from: h */
            public Boolean mo12866h() {
                return this.f13406e.mo13560i();
            }

            public int hashCode() {
                boolean g = mo12863g();
                if (g) {
                    g = true;
                }
                int i = (g ? 1 : 0) * true;
                Note note = this.f13406e;
                int i2 = 0;
                int hashCode = (i + (note != null ? note.hashCode() : 0)) * 31;
                Context a = mo12857a();
                if (a != null) {
                    i2 = a.hashCode();
                }
                return hashCode + i2;
            }

            /* renamed from: i */
            public String mo12867i() {
                return this.f13406e.mo13565n();
            }

            /* renamed from: j */
            public final Note mo12886j() {
                return this.f13406e;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("NoteItem(obsolete=");
                a.append(mo12863g());
                a.append(", model=");
                a.append(this.f13406e);
                a.append(", context=");
                a.append(mo12857a());
                a.append(")");
                return a.toString();
            }

            public Void getValueDesc() {
                return this.f13404c;
            }

            public Void getValueTitle() {
                return this.f13403b;
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoticeBoardItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getModel", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$NoticeBoardItem */
        /* compiled from: ListItem.kt */
        public static final class NoticeBoardItem extends DashboardItem {

            /* renamed from: b */
            public final Void f13408b;

            /* renamed from: c */
            public final Void f13409c;

            /* renamed from: d */
            public final int f13410d = C4014R.mipmap.ic_noticeboard_40dp;

            /* renamed from: e */
            public final boolean f13411e;

            /* renamed from: f */
            public final p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem f13412f;

            /* renamed from: g */
            public final Context f13413g;

            public NoticeBoardItem(boolean z, p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem, Context context) {
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                super(context, null);
                this.f13411e = z;
                this.f13412f = noticeBoardItem;
                this.f13413g = context;
            }

            public static /* synthetic */ NoticeBoardItem copy$default(NoticeBoardItem noticeBoardItem, boolean z, p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem2, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = noticeBoardItem.mo12863g();
                }
                if ((i & 2) != 0) {
                    noticeBoardItem2 = noticeBoardItem.f13412f;
                }
                if ((i & 4) != 0) {
                    context = noticeBoardItem.mo12857a();
                }
                return noticeBoardItem.mo12888a(z, noticeBoardItem2, context);
            }

            /* renamed from: a */
            public Context mo12857a() {
                return this.f13413g;
            }

            /* renamed from: a */
            public final NoticeBoardItem mo12888a(boolean z, p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem, Context context) {
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "model");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new NoticeBoardItem(z, noticeBoardItem, context);
            }

            /* renamed from: b */
            public Calendar mo12858b() {
                return this.f13412f.mo13678h();
            }

            /* renamed from: c */
            public String mo12859c() {
                return UtilsKt.m14842e(this.f13412f.mo13678h());
            }

            /* renamed from: d */
            public String mo12860d() {
                return this.f13412f.mo13676f();
            }

            /* renamed from: e */
            public Intent mo12861e() {
                Intent intent = new Intent(mo12857a(), NoticeBoardItemDetailActivity.class);
                ExtensionsKt.m14643a(intent, this.f13412f);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NoticeBoardItem) {
                        NoticeBoardItem noticeBoardItem = (NoticeBoardItem) obj;
                        if (!(mo12863g() == noticeBoardItem.mo12863g()) || !Intrinsics.areEqual((Object) this.f13412f, (Object) noticeBoardItem.f13412f) || !Intrinsics.areEqual((Object) mo12857a(), (Object) noticeBoardItem.mo12857a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public int mo12862f() {
                return this.f13410d;
            }

            /* renamed from: g */
            public boolean mo12863g() {
                return this.f13411e;
            }

            /* renamed from: h */
            public Boolean mo12866h() {
                return this.f13412f.mo13680i();
            }

            public int hashCode() {
                boolean g = mo12863g();
                if (g) {
                    g = true;
                }
                int i = (g ? 1 : 0) * true;
                p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem = this.f13412f;
                int i2 = 0;
                int hashCode = (i + (noticeBoardItem != null ? noticeBoardItem.hashCode() : 0)) * 31;
                Context a = mo12857a();
                if (a != null) {
                    i2 = a.hashCode();
                }
                return hashCode + i2;
            }

            /* renamed from: i */
            public String mo12867i() {
                return this.f13412f.mo13681j();
            }

            /* renamed from: j */
            public final p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem mo12891j() {
                return this.f13412f;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("NoticeBoardItem(obsolete=");
                a.append(mo12863g());
                a.append(", model=");
                a.append(this.f13412f);
                a.append(", context=");
                a.append(mo12857a());
                a.append(")");
                return a.toString();
            }

            public Void getValueDesc() {
                return this.f13409c;
            }

            public Void getValueTitle() {
                return this.f13408b;
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J1\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\t\u00105\u001a\u00020\u0017HÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u0016\u0010$\u001a\u0004\u0018\u00010%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'¨\u00067"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$OmissionItem;", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "obsolete", "", "model", "Lhu/ekreta/ellenorzo/omission/Omission;", "minuteCaption", "", "context", "Landroid/content/Context;", "(ZLhu/ekreta/ellenorzo/omission/Omission;Ljava/lang/String;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "dateString", "getDateString", "()Ljava/lang/String;", "detail", "getDetail", "icon", "", "getIcon", "()I", "getMinuteCaption", "getModel", "()Lhu/ekreta/ellenorzo/omission/Omission;", "getObsolete", "()Z", "readByUser", "getReadByUser", "()Ljava/lang/Boolean;", "uid", "getUid", "valueDesc", "", "getValueDesc", "()Ljava/lang/Void;", "valueTitle", "getValueTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "getDetailIntent", "Landroid/content/Intent;", "getTitle", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$OmissionItem */
        /* compiled from: ListItem.kt */
        public static final class OmissionItem extends DashboardItem {

            /* renamed from: b */
            public final Void f13414b;

            /* renamed from: c */
            public final Void f13415c;

            /* renamed from: d */
            public final boolean f13416d;

            /* renamed from: e */
            public final Omission f13417e;

            /* renamed from: f */
            public final String f13418f;

            /* renamed from: g */
            public final Context f13419g;

            @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
            /* renamed from: hu.ekreta.ellenorzo.home.ListItem$DashboardItem$OmissionItem$WhenMappings */
            public final /* synthetic */ class WhenMappings {

                /* renamed from: a */
                public static final /* synthetic */ int[] f13420a = new int[Omission.Type.values().length];

                /* renamed from: b */
                public static final /* synthetic */ int[] f13421b = new int[Omission.Type.values().length];

                static {
                    f13420a[Omission.Type.Absence.ordinal()] = 1;
                    f13420a[Omission.Type.Lateness.ordinal()] = 2;
                    f13420a[Omission.Type.Na.ordinal()] = 3;
                    f13420a[Omission.Type.Presence.ordinal()] = 4;
                    f13421b[Omission.Type.Lateness.ordinal()] = 1;
                }
            }

            public OmissionItem(boolean z, Omission omission, String str, Context context) {
                Intrinsics.checkParameterIsNotNull(omission, "model");
                Intrinsics.checkParameterIsNotNull(str, "minuteCaption");
                Intrinsics.checkParameterIsNotNull(context, "context");
                super(context, null);
                this.f13416d = z;
                this.f13417e = omission;
                this.f13418f = str;
                this.f13419g = context;
            }

            public static /* synthetic */ OmissionItem copy$default(OmissionItem omissionItem, boolean z, Omission omission, String str, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = omissionItem.mo12863g();
                }
                if ((i & 2) != 0) {
                    omission = omissionItem.f13417e;
                }
                if ((i & 4) != 0) {
                    str = omissionItem.f13418f;
                }
                if ((i & 8) != 0) {
                    context = omissionItem.mo12857a();
                }
                return omissionItem.mo12893a(z, omission, str, context);
            }

            /* renamed from: a */
            public Context mo12857a() {
                return this.f13419g;
            }

            /* renamed from: a */
            public final OmissionItem mo12893a(boolean z, Omission omission, String str, Context context) {
                Intrinsics.checkParameterIsNotNull(omission, "model");
                Intrinsics.checkParameterIsNotNull(str, "minuteCaption");
                Intrinsics.checkParameterIsNotNull(context, "context");
                return new OmissionItem(z, omission, str, context);
            }

            /* renamed from: b */
            public Calendar mo12858b() {
                return this.f13417e.mo13843g();
            }

            /* renamed from: c */
            public String mo12859c() {
                return UtilsKt.m14842e(this.f13417e.mo13855r());
            }

            /* renamed from: d */
            public String mo12860d() {
                return this.f13417e.mo13859u();
            }

            /* renamed from: e */
            public Intent mo12861e() {
                Intent intent = new Intent(mo12857a(), OmissionDetailActivity.class);
                ExtensionsKt.m14644a(intent, this.f13417e);
                return intent;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof OmissionItem) {
                        OmissionItem omissionItem = (OmissionItem) obj;
                        if (!(mo12863g() == omissionItem.mo12863g()) || !Intrinsics.areEqual((Object) this.f13417e, (Object) omissionItem.f13417e) || !Intrinsics.areEqual((Object) this.f13418f, (Object) omissionItem.f13418f) || !Intrinsics.areEqual((Object) mo12857a(), (Object) omissionItem.mo12857a())) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public int mo12862f() {
                int i = WhenMappings.f13420a[this.f13417e.mo13861w().ordinal()];
                if (i == 1) {
                    return C4014R.C4015drawable.hianyzas_icon;
                }
                if (i == 2 || i == 3 || i == 4) {
                    return C4014R.C4015drawable.keses_icon;
                }
                throw new NoWhenBranchMatchedException();
            }

            /* renamed from: g */
            public boolean mo12863g() {
                return this.f13416d;
            }

            /* renamed from: h */
            public Boolean mo12866h() {
                return this.f13417e.mo13854q();
            }

            public int hashCode() {
                boolean g = mo12863g();
                if (g) {
                    g = true;
                }
                int i = (g ? 1 : 0) * true;
                Omission omission = this.f13417e;
                int i2 = 0;
                int hashCode = (i + (omission != null ? omission.hashCode() : 0)) * 31;
                String str = this.f13418f;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                Context a = mo12857a();
                if (a != null) {
                    i2 = a.hashCode();
                }
                return hashCode2 + i2;
            }

            /* renamed from: i */
            public String mo12867i() {
                if (WhenMappings.f13421b[this.f13417e.mo13861w().ordinal()] != 1) {
                    return this.f13417e.mo13861w() == Omission.Type.Absence ? "Hiányzás" : "Késés";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f13417e.mo13863x());
                sb.append(" (");
                sb.append(this.f13417e.mo13844h());
                sb.append(' ');
                sb.append(this.f13418f);
                sb.append(')');
                return sb.toString();
            }

            /* renamed from: j */
            public final Omission mo12896j() {
                return this.f13417e;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("OmissionItem(obsolete=");
                a.append(mo12863g());
                a.append(", model=");
                a.append(this.f13417e);
                a.append(", minuteCaption=");
                a.append(this.f13418f);
                a.append(", context=");
                a.append(mo12857a());
                a.append(")");
                return a.toString();
            }

            public Void getValueDesc() {
                return this.f13415c;
            }

            public Void getValueTitle() {
                return this.f13414b;
            }
        }

        public /* synthetic */ DashboardItem(Context context, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.f13383a = context;
        }

        /* renamed from: a */
        public Context mo12857a() {
            return this.f13383a;
        }

        /* renamed from: b */
        public abstract Calendar mo12858b();

        /* renamed from: c */
        public abstract String mo12859c();

        /* renamed from: d */
        public abstract String mo12860d();

        /* renamed from: e */
        public abstract Intent mo12861e();

        /* renamed from: f */
        public abstract int mo12862f();

        /* renamed from: g */
        public abstract boolean mo12863g();

        public abstract String getValueDesc();

        public abstract String getValueTitle();

        /* renamed from: h */
        public abstract Boolean mo12866h();

        /* renamed from: i */
        public String mo12867i() {
            return "";
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/home/ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.home.ListItem$SectionHeader */
    /* compiled from: ListItem.kt */
    public static final class SectionHeader extends ListItem {

        /* renamed from: a */
        public final String f13422a;

        public SectionHeader(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            super(null);
            this.f13422a = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionHeader.f13422a;
            }
            return sectionHeader.mo12898a(str);
        }

        /* renamed from: a */
        public final SectionHeader mo12898a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            return new SectionHeader(str);
        }

        /* renamed from: a */
        public final String mo12899a() {
            return this.f13422a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13422a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.home.ListItem.SectionHeader) r2).f13422a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.home.ListItem.SectionHeader
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.home.ListItem$SectionHeader r2 = (p289hu.ekreta.ellenorzo.home.ListItem.SectionHeader) r2
                java.lang.String r0 = r1.f13422a
                java.lang.String r2 = r2.f13422a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.home.ListItem.SectionHeader.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f13422a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("SectionHeader(title="), this.f13422a, ")");
        }
    }

    public ListItem() {
    }

    public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
