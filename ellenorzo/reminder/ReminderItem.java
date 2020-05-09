package p289hu.ekreta.ellenorzo.reminder;

import android.content.res.Resources;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.reminder.Reminder.Type;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u0001\u0002\u0014\u0015¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "type", "", "subject", "date", "Ljava/util/Calendar;", "icon", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;I)V", "getDate", "()Ljava/util/Calendar;", "getIcon", "()I", "getSubject", "()Ljava/lang/String;", "getType", "viewType", "getViewType", "Companion", "Lhu/ekreta/ellenorzo/reminder/ReminderItemHomework;", "Lhu/ekreta/ellenorzo/reminder/ReminderItemAnnouncedTest;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.ReminderItem */
/* compiled from: ReminderListItem.kt */
public abstract class ReminderItem extends ReminderListItem {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int f14640a = 1;

    /* renamed from: b */
    public final String f14641b;

    /* renamed from: c */
    public final String f14642c;

    /* renamed from: d */
    public final Calendar f14643d;

    /* renamed from: e */
    public final int f14644e;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItem$Companion;", "", "()V", "create", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "model", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "res", "Landroid/content/res/Resources;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.reminder.ReminderItem$Companion */
    /* compiled from: ReminderListItem.kt */
    public static final class Companion {

        @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.reminder.ReminderItem$Companion$WhenMappings */
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a */
            public static final /* synthetic */ int[] f14645a = new int[Type.values().length];

            static {
                f14645a[Type.HOMEWORK.ordinal()] = 1;
                f14645a[Type.ANNOUNCED_TEST.ordinal()] = 2;
            }
        }

        public Companion() {
        }

        /* renamed from: a */
        public final ReminderItem mo14290a(Reminder reminder, Resources resources) {
            Intrinsics.checkParameterIsNotNull(reminder, "model");
            Intrinsics.checkParameterIsNotNull(resources, "res");
            int i = WhenMappings.f14645a[reminder.mo11320f().ordinal()];
            if (i == 1) {
                return new ReminderItemHomework((Homework) reminder, resources);
            }
            if (i == 2) {
                return new ReminderItemAnnouncedTest((AnnouncedTest) reminder);
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ ReminderItem(String str, String str2, Calendar calendar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.f14641b = str;
        this.f14642c = str2;
        this.f14643d = calendar;
        this.f14644e = i;
    }

    /* renamed from: a */
    public int mo14285a() {
        return this.f14640a;
    }

    /* renamed from: b */
    public final Calendar mo14286b() {
        return this.f14643d;
    }

    /* renamed from: c */
    public final int mo14287c() {
        return this.f14644e;
    }

    /* renamed from: d */
    public final String mo14288d() {
        return this.f14642c;
    }

    /* renamed from: e */
    public final String mo14289e() {
        return this.f14641b;
    }
}
