package p289hu.ekreta.ellenorzo.homework.comment;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "", "uid", "", "recorderStudentName", "recordDate", "Ljava/util/Calendar;", "text", "recorderStudentId", "deletedByStudent", "", "deletedByTeacher", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDeletedByStudent", "()Z", "getDeletedByTeacher", "getRecordDate", "()Ljava/util/Calendar;", "getRecorderStudentId", "()Ljava/lang/String;", "getRecorderStudentName", "getText", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkComment */
/* compiled from: HomeworkComment.kt */
public final class HomeworkComment {

    /* renamed from: a */
    public final String f13536a;

    /* renamed from: b */
    public final String f13537b;

    /* renamed from: c */
    public final Calendar f13538c;

    /* renamed from: d */
    public final String f13539d;

    /* renamed from: e */
    public final String f13540e;

    /* renamed from: f */
    public final boolean f13541f;

    /* renamed from: g */
    public final boolean f13542g;

    public HomeworkComment(String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        this.f13536a = str;
        this.f13537b = str2;
        this.f13538c = calendar;
        this.f13539d = str3;
        this.f13540e = str4;
        this.f13541f = z;
        this.f13542g = z2;
    }

    public static /* synthetic */ HomeworkComment copy$default(HomeworkComment homeworkComment, String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeworkComment.f13536a;
        }
        if ((i & 2) != 0) {
            str2 = homeworkComment.f13537b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            calendar = homeworkComment.f13538c;
        }
        Calendar calendar2 = calendar;
        if ((i & 8) != 0) {
            str3 = homeworkComment.f13539d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = homeworkComment.f13540e;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = homeworkComment.f13541f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = homeworkComment.f13542g;
        }
        return homeworkComment.mo13032a(str, str5, calendar2, str6, str7, z3, z2);
    }

    /* renamed from: a */
    public final HomeworkComment mo13032a(String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Calendar calendar2 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "text");
        String str8 = str4;
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        HomeworkComment homeworkComment = new HomeworkComment(str5, str6, calendar2, str7, str8, z, z2);
        return homeworkComment;
    }

    /* renamed from: a */
    public final boolean mo13033a() {
        return this.f13541f;
    }

    /* renamed from: b */
    public final boolean mo13034b() {
        return this.f13542g;
    }

    /* renamed from: c */
    public final Calendar mo13035c() {
        return this.f13538c;
    }

    /* renamed from: d */
    public final String mo13036d() {
        return this.f13540e;
    }

    /* renamed from: e */
    public final String mo13037e() {
        return this.f13537b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkComment) {
                HomeworkComment homeworkComment = (HomeworkComment) obj;
                if (Intrinsics.areEqual((Object) this.f13536a, (Object) homeworkComment.f13536a) && Intrinsics.areEqual((Object) this.f13537b, (Object) homeworkComment.f13537b) && Intrinsics.areEqual((Object) this.f13538c, (Object) homeworkComment.f13538c) && Intrinsics.areEqual((Object) this.f13539d, (Object) homeworkComment.f13539d) && Intrinsics.areEqual((Object) this.f13540e, (Object) homeworkComment.f13540e)) {
                    if (this.f13541f == homeworkComment.f13541f) {
                        if (this.f13542g == homeworkComment.f13542g) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo13039f() {
        return this.f13539d;
    }

    /* renamed from: g */
    public final String mo13040g() {
        return this.f13536a;
    }

    public int hashCode() {
        String str = this.f13536a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13537b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.f13538c;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str3 = this.f13539d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13540e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f13541f;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f13542g;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("HomeworkComment(uid=");
        a.append(this.f13536a);
        a.append(", recorderStudentName=");
        a.append(this.f13537b);
        a.append(", recordDate=");
        a.append(this.f13538c);
        a.append(", text=");
        a.append(this.f13539d);
        a.append(", recorderStudentId=");
        a.append(this.f13540e);
        a.append(", deletedByStudent=");
        a.append(this.f13541f);
        a.append(", deletedByTeacher=");
        a.append(this.f13542g);
        a.append(")");
        return a.toString();
    }
}
